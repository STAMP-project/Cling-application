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
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeField dateTimeField2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = mutableDateTime0.get(dateTimeField2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeField must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDateTime2.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime2.withTime(10, (int) (byte) 10, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = localDateTime2.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((int) (short) 0, 21, (int) ' ', chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.withField(dateTimeFieldType5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.util.Locale locale2 = new java.util.Locale("hi!", "hi!");
        boolean boolean4 = locale2.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!_HI!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withFieldAdded(durationFieldType5, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) 'a', (int) (byte) 1, 10, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.withFieldAdded(durationFieldType5, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.era();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.set(dateTimeFieldType2, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(13);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate1.withWeekOfWeekyear((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay((int) (byte) 10, (int) 'a', chronology2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime4.withDate((int) (short) -1, 13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusYears((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeOfDay4.compareTo((org.joda.time.ReadablePartial) localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withDayOfWeek(10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology8.getDateTimeMillis((long) ' ', 10, (int) (byte) 0, 13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withHourOfDay((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        int int0 = org.joda.time.YearMonthDay.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
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
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
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
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology8.getDateTimeMillis(5, 5, (int) (short) 100, 11, 9, (int) '4', 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean5 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.standard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((java.lang.Object) boolean5, periodType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = period5.withWeeks(100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean5 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setHourOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str9 = dateTimeFieldType8.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay11 = timeOfDay4.withField(dateTimeFieldType8, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "dayOfMonth" + "'", str9, "dayOfMonth");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.withChronologyRetainFields(chronology8);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = timeOfDay9.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.plusHours((-1));
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.withChronologyRetainFields(chronology17);
        long long20 = chronology13.set((org.joda.time.ReadablePartial) timeOfDay16, (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval21 = new org.joda.time.Interval((java.lang.Object) dateTime4, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-86399999L) + "'", long20 == (-86399999L));
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth2 = org.joda.time.YearMonth.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(100, (int) (short) 0, 4, 0, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.copy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        mutablePeriod2.setPeriod((long) (byte) 1, 845L, chronology14);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = periodType18.isSupported(durationFieldType19);
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) 1, 0L, periodType18);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.withChronologyRetainFields(chronology25);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = timeOfDay26.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay26.plusHours((-1));
        org.joda.time.Chronology chronology30 = timeOfDay29.getChronology();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.TimeOfDay timeOfDay33 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology32);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.withChronologyRetainFields(chronology34);
        long long37 = chronology30.set((org.joda.time.ReadablePartial) timeOfDay33, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) 845L, periodType18, chronology30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-86399999L) + "'", long37 == (-86399999L));
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((java.lang.Object) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.Character[] charArray4 = new java.lang.Character[] { '4', 'x', '#', ' ' };
        java.util.LinkedHashSet<java.lang.Character> charSet5 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet5, charArray4);
        java.util.Collection<java.util.Locale> localeCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = charSet5.containsAll(localeCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod11.copy();
        mutablePeriod7.add((org.joda.time.ReadablePeriod) mutablePeriod12);
        int int14 = mutablePeriod12.getYears();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth5 = yearMonth2.withField(dateTimeFieldType3, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) '#', (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("22", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withDayOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateTime0.toString("dayOfMonth", locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        int int0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.lang.Character[] charArray5 = new java.lang.Character[] { 'x', ' ', 'x', 'u', ' ' };
        java.util.LinkedHashSet<java.lang.Character> charSet6 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet6, charArray5);
        java.util.Collection<java.util.Locale> localeCollection8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = charSet6.removeAll(localeCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.parse("22", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Period period7 = period5.withSeconds(0);
        org.joda.time.Period period9 = period7.plusMinutes((int) (byte) 1);
        org.joda.time.Period period11 = period7.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period14 = period7.withField(durationFieldType12, 14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period7.minusWeeks((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.withChronologyRetainFields(chronology5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = timeOfDay6.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay6.plusHours((-1));
        org.joda.time.Chronology chronology10 = timeOfDay9.getChronology();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.withChronologyRetainFields(chronology14);
        long long17 = chronology10.set((org.joda.time.ReadablePartial) timeOfDay13, (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) locale0, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-86399999L) + "'", long17 == (-86399999L));
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("PT0.099S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT0.099S\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        int int9 = dateTime8.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime14.toMutableDateTime();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withChronologyRetainFields(chronology19);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = timeOfDay20.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.plusHours((-1));
        org.joda.time.Chronology chronology24 = timeOfDay23.getChronology();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.withChronologyRetainFields(chronology28);
        long long31 = chronology24.set((org.joda.time.ReadablePartial) timeOfDay27, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(chronology24);
        org.joda.time.DateTime dateTime33 = dateTime14.toDateTime(chronology24);
        org.joda.time.DateTimeField dateTimeField34 = chronology24.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight((java.lang.Object) int9, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-86399999L) + "'", long31 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = timeOfDay4.getValue(1969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("\u4e2d\u6587", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((java.lang.Object) chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "zh_CN");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "zh_CN");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "zh_CN");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.DateTime dateTime23 = dateTime4.toDateTime(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime4.withMonthOfYear((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-86399999L) + "'", long21 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
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
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear((int) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withSecondOfMinute((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (byte) 0, 11, 58, 20, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.Period period1 = org.joda.time.Period.hours(1969);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("PT0.099S", (double) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=11.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.Instant instant4 = instant2.plus((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period5 = new org.joda.time.Period((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusSeconds(11);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        boolean boolean10 = periodType8.isSupported(durationFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) localDateTime5, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 744L + "'", long4 == 744L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("\u610f\u5927\u5229");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod9.copy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.withChronologyRetainFields(chronology16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay17.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.plusHours((-1));
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        mutablePeriod9.setPeriod((long) (byte) 1, 845L, chronology21);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(41L, chronology21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(0, (int) 'x', (int) (short) -1, (int) (short) 0, (int) (byte) 100, (int) (short) -1, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((int) (byte) -1, 58, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField22 = chronology14.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight1.withChronology(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-86399999L) + "'", long21 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateMidnight23);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("PT0.099S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=pt0.099s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        java.lang.Class<?> wildcardClass2 = dateTimeFieldType0.getClass();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int5 = localDate1.get(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusDays((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localDate1.toString("fra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateMidnight3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = dateMidnight3.withDayOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(21, 4, (int) (byte) 100, (int) (short) -1, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property10 = timeOfDay7.property(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int5 = localDate1.get(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusDays((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean11 = dateTimeZone9.isStandardOffset((long) 'u');
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDate1.compareTo((org.joda.time.ReadablePartial) localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        calendar1.setTimeInMillis(845L);
        int int4 = calendar0.compareTo(calendar1);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454841587,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=21,MILLISECOND=587,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property2.setCopy("\u610f\u5927\u5229");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"???\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.junit.Assert.assertNotNull(instant0);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime10 = dateTime3.plusMonths((int) ' ');
        boolean boolean12 = dateTime3.isAfter(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withWeekOfWeekyear(58);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Period period7 = period5.withSeconds(0);
        org.joda.time.Period period9 = period7.plusMinutes((int) (byte) 1);
        org.joda.time.Period period11 = period7.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period14 = period7.withField(durationFieldType12, 14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period7.plusWeeks((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("PT0.099S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT0.099S\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        boolean boolean10 = localDateTime8.equals((java.lang.Object) 14);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusDays(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withMonthOfYear((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDate4.getValue(47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 47");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll((int) 'x', 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454842934,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=22,MILLISECOND=934,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj7, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.minus((org.joda.time.ReadablePeriod) mutablePeriod14);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localTime5.compareTo((org.joda.time.ReadablePartial) localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("PT0.099S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int5 = dateTimeZone3.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime0.toMutableDateTime(dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setDayOfMonth(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        int int0 = org.joda.time.TimeOfDay.MILLIS_OF_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate2.withDayOfMonth((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = yearMonth2.getFieldTypes();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str7 = locale6.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = yearMonth2.toString("Standard", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u4e2d\u6587" + "'", str7, "\u4e2d\u6587");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.year();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getDisplayScript();
        java.util.Locale.setDefault(locale14);
        java.lang.String str17 = locale14.getISO3Language();
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale14.getDisplayScript(locale18);
        int int20 = dateTimeField13.getMaximumShortTextLength(locale18);
        mutableDateTime0.setRounding(dateTimeField13);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone24);
        org.joda.time.DateTime dateTime26 = dateTime25.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.withChronologyRetainFields(chronology31);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray33 = timeOfDay32.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay32.plusHours((-1));
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.TimeOfDay timeOfDay39 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay39.withChronologyRetainFields(chronology40);
        long long43 = chronology36.set((org.joda.time.ReadablePartial) timeOfDay39, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(chronology36);
        org.joda.time.DateTime dateTime45 = dateTime26.toDateTime(chronology36);
        org.joda.time.DateTimeField dateTimeField46 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField47 = chronology36.millisOfDay();
        mutableDateTime0.setRounding(dateTimeField47);
        mutableDateTime0.setDate(0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zho" + "'", str17, "zho");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-86399999L) + "'", long43 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate1.withDayOfWeek(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusMinutes(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay10 = timeOfDay4.withFieldAdded(durationFieldType8, 86399999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'days' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay0.withFieldAdded(durationFieldType5, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = property2.addToCopy(3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = yearMonthDay0.getValue(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        long long3 = calendar0.getTimeInMillis();
        int int5 = calendar0.get(11);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 845L + "'", long3 == 845L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime3.withFields((org.joda.time.ReadablePartial) localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime3.withHourOfDay((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean3 = calendar0.isSet((int) (short) 10);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454844418,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=24,MILLISECOND=418,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        int int11 = dateTime10.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((int) (byte) 1, (int) 'a', (int) (byte) 100, 13, 1970, (int) (byte) 0, 11, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.minusHours((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int5 = period3.getValue((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight.Property property3 = dateMidnight1.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = dateMidnight1.withYearOfCentury(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.YearMonth yearMonth4 = yearMonth2.minusMonths((int) (byte) 100);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate8 = localDate6.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int10 = localDate6.get(dateTimeFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth12 = yearMonth2.withField(dateTimeFieldType9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Locale locale3 = java.util.Locale.PRC;
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Locale.setDefault(locale3);
        java.lang.String str6 = locale3.getISO3Language();
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale3.getDisplayScript(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = calendar0.getDisplayName((int) (byte) 1, 69, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454845446,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=25,MILLISECOND=446,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "zho" + "'", str6, "zho");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate6 = property4.getLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withMonthOfYear(14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.minuteOfHour();
        java.util.Locale locale10 = java.util.Locale.ROOT;
        org.joda.time.LocalDateTime localDateTime11 = property8.setCopy("58", locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = timeZone1.getDisplayName(true, (int) (short) 10, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(58);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        int int6 = localTime5.size();
        org.joda.time.LocalTime localTime8 = localTime5.minusSeconds(100);
        org.joda.time.LocalTime localTime10 = localTime8.minusMillis(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = localTime8.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay11.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay18 = property16.addToCopy(23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = property16.setCopy("PT0.099S");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0.099S\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay18);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.DateTime dateTime23 = dateTime4.toDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField24 = chronology14.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology14.centuries();
        org.joda.time.DateTimeField dateTimeField26 = chronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology14.clockhourOfHalfday();
        java.lang.Object obj28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(obj28, dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.secondOfMinute();
        long long32 = property31.remainder();
        org.joda.time.LocalDateTime localDateTime33 = property31.getLocalDateTime();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.withChronologyRetainFields(chronology38);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = timeOfDay39.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay39.plusHours((-1));
        org.joda.time.Chronology chronology43 = timeOfDay42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.centuryOfEra();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.PeriodType periodType48 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType49 = periodType48.withWeeksRemoved();
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight46, readableDuration47, periodType48);
        org.joda.time.Period period52 = period50.withSeconds(0);
        org.joda.time.Period period54 = period52.plusMinutes((int) (byte) 1);
        org.joda.time.Period period56 = period52.withSeconds((int) (byte) 10);
        org.joda.time.Period period58 = period56.withMillis((int) 'x');
        int[] intArray61 = chronology43.get((org.joda.time.ReadablePeriod) period58, (long) 2022, (long) 6);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray63 = dateTimeField27.addWrapField((org.joda.time.ReadablePartial) localDateTime33, (int) (short) -1, intArray61, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-86399999L) + "'", long21 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(property31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 142L + "'", long32 == 142L);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(periodType48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[0, 0, 0, 0, 0, -2, -16]");
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField16 = chronology8.millisOfSecond();
        java.lang.String str17 = dateTimeField16.getName();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "millisOfSecond" + "'", str17, "millisOfSecond");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getISO3Language();
        java.lang.Object obj4 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "zh_CN");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getHourOfDay();
        java.util.Date date2 = mutableDateTime0.toDate();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property5 = localTime4.millisOfDay();
        org.joda.time.LocalTime localTime7 = property5.addNoWrapToCopy(11);
        java.lang.String str8 = property5.getAsShortText();
        org.joda.time.LocalTime localTime9 = property5.roundFloorCopy();
        boolean boolean10 = date2.equals((java.lang.Object) property5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 14:47:26 UTC 2022");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.LocalDate localDate6 = localDate3.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDate.Property property7 = localDate3.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate3.withDayOfWeek(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        java.lang.String str2 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4" + "'", str2, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.DateTime.Property property6 = dateTime4.year();
        org.joda.time.DateTime dateTime8 = property6.setCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = property6.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) property6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.centuries();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.DateTime dateTime23 = dateTime4.toDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField24 = chronology14.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology14.centuries();
        java.lang.String str26 = durationField25.getName();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-86399999L) + "'", long21 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "centuries" + "'", str26, "centuries");
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        long long3 = calendar0.getTimeInMillis();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime();
        int int5 = mutableDateTime4.getDayOfMonth();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate9 = localDate7.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int11 = localDate7.get(dateTimeFieldType10);
        mutableDateTime4.set(dateTimeFieldType10, 2);
        boolean boolean14 = calendar0.equals((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 845L + "'", long3 == 845L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        java.lang.String str4 = localTime1.toString("22");
        org.joda.time.LocalTime localTime6 = localTime1.withMillisOfSecond((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime1.withMillisOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "22" + "'", str4, "22");
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(20, 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.copy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        mutablePeriod2.setPeriod((long) (byte) 1, 845L, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.dayOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.withChronologyRetainFields(chronology20);
        org.joda.time.DateTime dateTime22 = timeOfDay21.toDateTimeToday();
        org.joda.time.Period period25 = org.joda.time.Period.hours((int) (byte) 10);
        int[] intArray26 = period25.getValues();
        java.util.Locale locale28 = java.util.Locale.FRANCE;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = dateTimeField16.set((org.joda.time.ReadablePartial) timeOfDay21, 12, intArray26, "21", locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 10, 0, 0, 0]");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr_FR");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.LocalDate localDate6 = localDate3.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDate.Property property7 = localDate3.centuryOfEra();
        org.joda.time.LocalDate localDate9 = property7.setCopy(58);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property7.setCopy("2022-02-21T14:47:24.813");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:47:24.813\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight.Property property3 = dateMidnight1.dayOfWeek();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str6 = locale5.getDisplayLanguage();
        java.lang.String str8 = locale5.getUnicodeLocaleType("22");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight9 = property3.setCopy("22", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"22\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u4e2d\u6587" + "'", str6, "\u4e2d\u6587");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate6 = property4.getLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((java.lang.Object) localDate6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        boolean boolean10 = localDateTime8.equals((java.lang.Object) 14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withWeekOfWeekyear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = calendar0.getMinimum((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454847450,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=27,MILLISECOND=450,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.withChronologyRetainFields(chronology17);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = timeOfDay18.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.plusHours((-1));
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.withChronologyRetainFields(chronology26);
        long long29 = chronology22.set((org.joda.time.ReadablePartial) timeOfDay25, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(chronology22);
        org.joda.time.DateTime dateTime31 = dateTime12.toDateTime(chronology22);
        org.joda.time.DateTimeField dateTimeField32 = chronology22.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((long) 1, chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((int) (byte) 0, 1969, (int) 'x', 23, (-1), 1970, (int) (short) 10, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-86399999L) + "'", long29 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.DateTime dateTime23 = dateTime4.toDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField24 = chronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = chronology14.millisOfDay();
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 21);
        int[] intArray29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = dateTimeField25.set((org.joda.time.ReadablePartial) timeOfDay27, 12, intArray29, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-86399999L) + "'", long21 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(timeOfDay27);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        int int4 = dateTime3.getDayOfMonth();
        int int5 = dateTime3.getMinuteOfHour();
        int int6 = dateTime3.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(obj3, dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.secondOfMinute();
        long long7 = property6.remainder();
        org.joda.time.LocalDateTime localDateTime8 = property6.roundHalfFloorCopy();
        java.util.Calendar.Builder builder9 = new java.util.Calendar.Builder();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableDuration13, (org.joda.time.ReadableInstant) mutableDateTime14);
        int[] intArray17 = chronology12.get((org.joda.time.ReadablePeriod) mutablePeriod15, (long) 100);
        java.util.Calendar.Builder builder18 = builder9.setFields(intArray17);
        // The following exception was thrown during execution in test generation
        try {
            chronology2.validate((org.joda.time.ReadablePartial) localDateTime8, intArray17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 910L + "'", long7 == 910L);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.withChronologyRetainFields(chronology8);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = timeOfDay9.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay9.plusHours((-1));
        org.joda.time.Chronology chronology13 = timeOfDay12.getChronology();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.withChronologyRetainFields(chronology17);
        long long20 = chronology13.set((org.joda.time.ReadablePartial) timeOfDay16, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField21 = chronology13.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) 11, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-86399999L) + "'", long20 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = dateTimeFormatter2.parseLocalTime("\u610f\u5927\u5229");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(2022, 11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(9);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.year();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        long long15 = dateTimeField12.add((long) 21, (long) ' ');
        org.joda.time.DurationField durationField16 = dateTimeField12.getRangeDurationField();
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        java.lang.String str20 = dateTimeField12.getAsText(21, locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = localDate1.toString("zho", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1009843200021L + "'", long15 == 1009843200021L);
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "21" + "'", str20, "21");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = dateTimeFormatter2.parseMutableDateTime("12 Nov 1900 10:21:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay2.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay2.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.getLocalDateTime();
        boolean boolean7 = property3.equals((java.lang.Object) 1.0f);
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category8, locale9);
        int int11 = property3.getMaximumTextLength(locale9);
        int int12 = property3.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 603L + "'", long4 == 603L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType0.getField(chronology3);
        int int7 = dateTimeField5.getLeapAmount((long) 887);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime3.withFields((org.joda.time.ReadablePartial) localDateTime7);
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj10, dateTimeZone11);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod15.copy();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.yearOfCentury();
        org.joda.time.Duration duration20 = mutablePeriod16.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod24 = mutablePeriod23.copy();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight.Property property27 = dateMidnight26.yearOfCentury();
        org.joda.time.Duration duration28 = mutablePeriod24.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight26);
        boolean boolean29 = duration20.isEqual((org.joda.time.ReadableDuration) duration28);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime12.minus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime7.plus((org.joda.time.ReadableDuration) duration28);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.TimeOfDay timeOfDay34 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.withChronologyRetainFields(chronology35);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray37 = timeOfDay36.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay36.plusHours((-1));
        org.joda.time.Chronology chronology40 = timeOfDay39.getChronology();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.withChronologyRetainFields(chronology44);
        long long47 = chronology40.set((org.joda.time.ReadablePartial) timeOfDay43, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay48 = new org.joda.time.TimeOfDay(chronology40);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = localDateTime31.isEqual((org.joda.time.ReadablePartial) timeOfDay48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(mutablePeriod24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-86399999L) + "'", long47 == (-86399999L));
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withSecondOfMinute((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.withHourOfDay(887);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 887 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        mutablePeriod7.setHours((int) (byte) 0);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod14 = mutablePeriod13.copy();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.yearOfCentury();
        org.joda.time.Duration duration18 = mutablePeriod14.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType23 = periodType22.withWeeksRemoved();
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, readableDuration21, periodType22);
        org.joda.time.Period period26 = period24.withSeconds(0);
        org.joda.time.Period period28 = period26.plusMinutes((int) (byte) 1);
        org.joda.time.Period period30 = period26.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period33 = period26.withField(durationFieldType31, 14);
        mutablePeriod14.set(durationFieldType31, 5);
        mutablePeriod7.add(durationFieldType31, 1);
        int int39 = mutablePeriod7.getValue((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod7.setValue(818, 887);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 818");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property5 = localTime4.millisOfDay();
        org.joda.time.LocalTime localTime7 = localTime4.minusSeconds(1969);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = localDate2.isBefore((org.joda.time.ReadablePartial) localTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        java.lang.String str5 = property2.getAsShortText();
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime6.withSecondOfMinute(818);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 818 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withDayOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.plusHours((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int5 = period3.getValue(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.getLocalDateTime();
        boolean boolean7 = property3.equals((java.lang.Object) 1.0f);
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category8, locale9);
        int int11 = property3.getMaximumTextLength(locale9);
        org.joda.time.DateTimeField dateTimeField12 = property3.getField();
        java.util.Locale locale15 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeField12.set(603L, "\u4e2d\u6587\u4e2d\u56fd)", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?? (??)\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 288L + "'", long4 == 288L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        java.lang.Integer int5 = dateTimeFormatter3.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.parse("hi!", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        java.util.Date date7 = dateTime4.toDate();
        java.lang.String str8 = date7.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Thu Jan 01 00:00:00 UTC 1970" + "'", str8, "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("centuries", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        java.lang.String str4 = localTime1.toString("22");
        org.joda.time.LocalTime localTime6 = localTime1.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalTime localTime8 = localTime6.plusMillis((int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.plusDays(2022);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay11.withMonthOfYear(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int15 = yearMonthDay11.get(dateTimeFieldType14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property16 = localTime6.property(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "22" + "'", str4, "22");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(53, (int) 'u', 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusWeeks(14);
        java.lang.Class<?> wildcardClass8 = localDateTime5.getClass();
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 529L + "'", long4 == 529L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime5.withMonthOfYear(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = new org.joda.time.Period((java.lang.Object) property2, chronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withChronologyRetainFields(chronology6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusHours((-1));
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.centuryOfEra();
        org.joda.time.DurationField durationField14 = chronology11.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) yearMonthDay2, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.YearMonthDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period7 = period5.plusHours((int) '#');
        org.joda.time.Period period8 = period5.toPeriod();
        org.joda.time.YearMonth yearMonth9 = yearMonth2.plus((org.joda.time.ReadablePeriod) period5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = yearMonth2.getValue(15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(yearMonth9);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.year();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getDisplayScript();
        java.util.Locale.setDefault(locale14);
        java.lang.String str17 = locale14.getISO3Language();
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale14.getDisplayScript(locale18);
        int int20 = dateTimeField13.getMaximumShortTextLength(locale18);
        mutableDateTime0.setRounding(dateTimeField13);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone24);
        org.joda.time.DateTime dateTime26 = dateTime25.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime26.toMutableDateTime();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.withChronologyRetainFields(chronology31);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray33 = timeOfDay32.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay32.plusHours((-1));
        org.joda.time.Chronology chronology36 = timeOfDay35.getChronology();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.TimeOfDay timeOfDay39 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay39.withChronologyRetainFields(chronology40);
        long long43 = chronology36.set((org.joda.time.ReadablePartial) timeOfDay39, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay44 = new org.joda.time.TimeOfDay(chronology36);
        org.joda.time.DateTime dateTime45 = dateTime26.toDateTime(chronology36);
        org.joda.time.DateTimeField dateTimeField46 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField47 = chronology36.millisOfDay();
        mutableDateTime0.setRounding(dateTimeField47);
        int int50 = dateTimeField47.get(0L);
        long long52 = dateTimeField47.roundFloor((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zho" + "'", str17, "zho");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-86399999L) + "'", long43 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 100L + "'", long52 == 100L);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = calendar0.getMinimum((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645454850125,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=30,MILLISECOND=125,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight.Property property3 = dateMidnight1.weekOfWeekyear();
        java.util.Locale locale5 = java.util.Locale.CHINA;
        java.util.Locale locale6 = locale5.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = property3.setCopy("Thu Jan 01 00:00:00 UTC 1970", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Thu Jan 01 00:00:00 UTC 1970\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = yearMonth2.toLocalDate((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime7 = dateTime5.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfYear((int) '#');
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.centuryOfEra();
        boolean boolean11 = dateTimeZone0.isLocalDateTimeGap(localDateTime7);
        int int12 = localDateTime7.size();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.minusSeconds(1969);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localTime1.toString("Standard");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        java.util.TimeZone timeZone3 = null;
        calendar0.setTimeZone(timeZone3);
        int int6 = calendar0.getGreatestMinimum(9);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar0.setTimeZone(timeZone8);
        int int10 = timeZone8.getDSTSavings();
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth(dateTimeZone2);
        org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.now(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth7 = new org.joda.time.YearMonth(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = mutableDateTime4.toMutableDateTime(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) filteringMode0, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale$FilteringMode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = dateTimeFormatter2.parseLocalTime("fra");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType4.getField(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(17, 1970, 0, 7, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        java.util.TimeZone timeZone3 = null;
        calendar0.setTimeZone(timeZone3);
        int int6 = calendar0.getGreatestMinimum(9);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar0.setTimeZone(timeZone8);
        java.lang.Object obj10 = timeZone8.clone();
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod10.copy();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.withChronologyRetainFields(chronology17);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = timeOfDay18.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.plusHours((-1));
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        mutablePeriod10.setPeriod((long) (byte) 1, 845L, chronology22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 1, chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(20, 2, 7, (int) (byte) -1, 1900, 2, (int) 'u', chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        java.util.Date date7 = dateTime4.toDate();
        java.lang.Object obj8 = date7.clone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) 'u');
        int int6 = localDate5.getYearOfEra();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 117 + "'", int6 == 117);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.parse("PT0.099S", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        java.io.Writer writer5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        int int7 = mutableDateTime6.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime6, (org.joda.time.ReadableInstant) dateTime11, periodType14);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod19 = mutablePeriod18.copy();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.yearOfCentury();
        org.joda.time.Duration duration23 = mutablePeriod19.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod27 = mutablePeriod26.copy();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight.Property property30 = dateMidnight29.yearOfCentury();
        org.joda.time.Duration duration31 = mutablePeriod27.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight29);
        boolean boolean32 = duration23.isEqual((org.joda.time.ReadableDuration) duration31);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod36 = mutablePeriod35.copy();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology37);
        org.joda.time.DateMidnight.Property property39 = dateMidnight38.yearOfCentury();
        org.joda.time.Duration duration40 = mutablePeriod36.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight38);
        boolean boolean41 = duration31.isShorterThan((org.joda.time.ReadableDuration) duration40);
        org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime();
        int int43 = mutableDateTime42.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone46);
        org.joda.time.DateTime dateTime48 = dateTime47.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType50 = periodType49.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime42, (org.joda.time.ReadableInstant) dateTime47, periodType50);
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod55 = mutablePeriod54.copy();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(chronology56);
        org.joda.time.DateMidnight.Property property58 = dateMidnight57.yearOfCentury();
        org.joda.time.Duration duration59 = mutablePeriod55.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight57);
        mutablePeriod51.setPeriod((org.joda.time.ReadableDuration) duration59);
        int int61 = duration31.compareTo((org.joda.time.ReadableDuration) duration59);
        mutableDateTime6.add((org.joda.time.ReadableDuration) duration31, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer5, (org.joda.time.ReadableInstant) mutableDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(mutablePeriod36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 21 + "'", int43 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(mutablePeriod55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(duration59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.Chronology chronology5 = dateTimeFormatter3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.parse("", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(chronology5);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(86399999, 1970, 2, 0, 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate6 = property4.addWrapFieldToCopy(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withYearOfCentury(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod5.copy();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.plusHours((-1));
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        mutablePeriod5.setPeriod((long) (byte) 1, 845L, chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.dayOfYear();
        org.joda.time.DurationField durationField20 = chronology17.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(17, 1970, 117, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay2.year();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.withChronologyRetainFields(chronology7);
        org.joda.time.TimeOfDay.Property property9 = timeOfDay8.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = property3.compareTo((org.joda.time.ReadablePartial) timeOfDay8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.withChronologyRetainFields(chronology16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay17.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.plusHours((-1));
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.withChronologyRetainFields(chronology25);
        long long28 = chronology21.set((org.joda.time.ReadablePartial) timeOfDay24, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.DateTime dateTime30 = dateTime11.toDateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField31 = chronology21.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(0, 0, 14, (int) 'u', 20, 1900, 53251426, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-86399999L) + "'", long28 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate.Property property2 = localDate1.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = property2.setCopy((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        java.util.Locale locale12 = java.util.Locale.CHINA;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.lang.String str14 = dateTimeZone9.getName((long) (-1), locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((int) (short) 0, 0, (int) 'u', (int) (short) 10, 13, 117, 887, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Period period7 = period5.withSeconds(0);
        org.joda.time.Period period9 = period5.withYears(0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = period5.getValue(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval6 = interval4.withEndMillis((-62166787199340L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        boolean boolean10 = localDateTime8.equals((java.lang.Object) 14);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusDays(10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withFieldAdded(durationFieldType13, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime8.withDayOfWeek(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod11.copy();
        mutablePeriod7.add((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType18 = periodType17.withWeeksRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight15, readableDuration16, periodType17);
        org.joda.time.Period period21 = period19.withSeconds(0);
        boolean boolean22 = mutablePeriod12.equals((java.lang.Object) period19);
        org.joda.time.Duration duration23 = period19.toStandardDuration();
        org.joda.time.Period period25 = period19.plusYears((int) ' ');
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateMidnight3);
        org.joda.time.Period period10 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period12 = period10.withPeriodType(periodType11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime17.toMutableDateTime();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.withChronologyRetainFields(chronology22);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray24 = timeOfDay23.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay23.plusHours((-1));
        org.joda.time.Chronology chronology27 = timeOfDay26.getChronology();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.withChronologyRetainFields(chronology31);
        long long34 = chronology27.set((org.joda.time.ReadablePartial) timeOfDay30, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay35 = new org.joda.time.TimeOfDay(chronology27);
        org.joda.time.DateTime dateTime36 = dateTime17.toDateTime(chronology27);
        org.joda.time.DateTimeField dateTimeField37 = chronology27.yearOfCentury();
        org.joda.time.DurationField durationField38 = chronology27.centuries();
        org.joda.time.DateTimeField dateTimeField39 = chronology27.dayOfYear();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 'a', (long) 7, periodType11, chronology27);
        org.joda.time.PeriodType periodType41 = periodType11.withHoursRemoved();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone45);
        org.joda.time.DateTime dateTime47 = dateTime46.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime47.toMutableDateTime();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.TimeOfDay timeOfDay51 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay51.withChronologyRetainFields(chronology52);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray54 = timeOfDay53.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay53.plusHours((-1));
        org.joda.time.Chronology chronology57 = timeOfDay56.getChronology();
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.TimeOfDay timeOfDay60 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology59);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.TimeOfDay timeOfDay62 = timeOfDay60.withChronologyRetainFields(chronology61);
        long long64 = chronology57.set((org.joda.time.ReadablePartial) timeOfDay60, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay(chronology57);
        org.joda.time.DateTime dateTime66 = dateTime47.toDateTime(chronology57);
        org.joda.time.DateTimeField dateTimeField67 = chronology57.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((long) 1, chronology57);
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime72 = localTime70.plusHours((int) (short) 10);
        org.joda.time.LocalTime localTime74 = localTime70.minusMinutes((int) '4');
        long long76 = chronology57.set((org.joda.time.ReadablePartial) localTime74, 0L);
        org.joda.time.Chronology chronology77 = localTime74.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((java.lang.Object) dateMidnight3, periodType41, chronology77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateMidnight");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-86399999L) + "'", long34 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-86399999L) + "'", long64 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertNotNull(localTime72);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 83280001L + "'", long76 == 83280001L);
        org.junit.Assert.assertNotNull(chronology77);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        long long3 = calendar0.getTimeInMillis();
        int int5 = calendar0.getActualMinimum(3);
        java.util.Locale locale8 = java.util.Locale.CHINA;
        java.util.Locale locale9 = locale8.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = calendar0.getDisplayName(1975, 58, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 845L + "'", long3 == 845L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean5 = dateTimeFormatter4.isPrinter();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = dateTimeFormatter4.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime11, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4", 47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int1 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int4 = timeZone1.getOffset(0L);
        java.time.ZoneId zoneId5 = timeZone1.toZoneId();
        java.lang.String str6 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4" + "'", str6, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval(86400000L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.withMillis(2);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.time.Instant instant0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = java.util.Date.from(instant0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds((int) (short) 10);
        int int13 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime10);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance();
        calendar14.add(11, (int) ' ');
        java.util.Date date23 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date23.setMonth(0);
        calendar14.setTime(date23);
        boolean boolean27 = dateTime4.equals((java.lang.Object) calendar14);
        // The following exception was thrown during execution in test generation
        try {
            calendar14.setWeekDate((int) (short) 0, 15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-93706740000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1967,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=12,DAY_OF_YEAR=12,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 12 10:21:00 UTC 1967");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.YearMonthDay yearMonthDay5 = property3.addToCopy(0);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfDay();
        org.joda.time.LocalTime localTime11 = property9.addNoWrapToCopy(11);
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.lang.String str13 = locale12.getDisplayScript();
        java.lang.String str14 = property9.getAsShortText(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay15 = property3.setCopy("\u4e2d\u6587\u4e2d\u56fd)", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?? (??)\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        java.lang.Integer int4 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = dateTimeFormatter5.parseLocalDate("2022-02-21T14:47:24.813");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int5 = localDate1.get(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate1.plusDays((int) (byte) 0);
        int int8 = localDate1.getDayOfMonth();
        java.lang.String str9 = localDate1.toString();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970-01-01" + "'", str9, "1970-01-01");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.DateTime.Property property6 = dateTime4.year();
        org.joda.time.DateTime dateTime7 = property6.roundFloorCopy();
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime7.withCenturyOfEra(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDateTime6.getFieldType(0);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 410L + "'", long4 == 410L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds((int) (short) 10);
        int int13 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime10);
        int int14 = dateTime10.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime10.withSecondOfMinute((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minusWeeks(47);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withDate(1975, (int) 'x', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(11, (int) ' ');
        java.util.Date date9 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date9.setMonth(0);
        calendar0.setTime(date9);
        calendar0.set(1, 53251426);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = calendar0.get(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1680390527998860000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=53251426,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=12,DAY_OF_YEAR=12,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 12 10:21:00 GMT 1967");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        int int6 = mutableDateTime5.getDayOfMonth();
        org.joda.time.Instant instant7 = mutableDateTime5.toInstant();
        org.joda.time.Instant instant9 = instant7.plus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime10 = instant9.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime10, "1", 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = property2.addToCopy(1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone1.getDisplayName(false, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = locale0.stripExtensions();
        boolean boolean3 = locale1.equals((java.lang.Object) 845L);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusHours((-1));
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withChronologyRetainFields(chronology19);
        long long22 = chronology15.set((org.joda.time.ReadablePartial) timeOfDay18, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology15);
        org.joda.time.DateTime dateTime24 = dateTime5.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField25 = chronology15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 1, chronology15);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.hourOfDay();
        java.util.Locale locale29 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime30 = property27.set("millisOfSecond", locale29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"millisOfSecond\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-86399999L) + "'", long22 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight6 = org.joda.time.DateMidnight.parse("centuries", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth6 = org.joda.time.YearMonth.parse("", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay11.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay18 = property16.addWrapFieldToCopy(14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = property16.setCopy("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay18);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusMinutes(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.withHourOfDay((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        long long3 = calendar0.getTimeInMillis();
        int int5 = calendar0.getActualMinimum(3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar0.getGreatestMinimum((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 845L + "'", long3 == 845L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period7 = period5.plusHours((int) '#');
        org.joda.time.Period period8 = period5.toPeriod();
        org.joda.time.YearMonth yearMonth9 = yearMonth2.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears(887);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate15 = localDate13.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int17 = localDate13.get(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth19 = yearMonth9.withField(dateTimeFieldType16, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        int int3 = yearMonthDay0.getDayOfMonth();
        int int4 = yearMonthDay0.getDayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod7.copy();
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod8.toString(periodFormatter9);
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay0.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod8, (-1));
        org.joda.time.YearMonthDay.Property property13 = yearMonthDay12.year();
        java.lang.String str14 = property13.getName();
        java.util.Locale locale16 = java.util.Locale.CHINA;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay17 = property13.setCopy("", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0.099S" + "'", str10, "PT0.099S");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "year" + "'", str14, "year");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTime4.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((java.lang.Object) 4, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        long long3 = calendar0.getTimeInMillis();
        int int5 = calendar0.getActualMinimum(3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar0.getActualMinimum(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 845L + "'", long3 == 845L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(117, 22, 5, 0, (int) (byte) 100, 818, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = property5.setCopy("Thu Jan 01 00:00:00 UTC 1970");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Thu Jan 01 00:00:00 UTC 1970\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod11.copy();
        mutablePeriod7.add((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType18 = periodType17.withWeeksRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight15, readableDuration16, periodType17);
        org.joda.time.Period period21 = period19.withSeconds(0);
        boolean boolean22 = mutablePeriod12.equals((java.lang.Object) period19);
        org.joda.time.Duration duration23 = period19.toStandardDuration();
        org.joda.time.Period period25 = period19.withMinutes(0);
        int int26 = period25.getWeeks();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth(dateTimeZone2);
        int int4 = yearMonth3.getYear();
        org.joda.time.Period period6 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period8 = period6.plusHours((int) '#');
        org.joda.time.Period period9 = period6.toPeriod();
        org.joda.time.YearMonth yearMonth10 = yearMonth3.plus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = yearMonth3.getFieldType(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property13 = localTime0.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(yearMonth10);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100, (int) (short) 100, 117, (int) 'u', 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(0, 1900, (int) (short) 100, 0, (int) (byte) 0, 69, 8, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        java.lang.Integer int4 = dateTimeFormatter2.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dateTimeFormatter2.parseMillis("DateTimeField[clockhourOfHalfday]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableDuration5, (org.joda.time.ReadableInstant) mutableDateTime6);
        int[] intArray9 = chronology4.get((org.joda.time.ReadablePeriod) mutablePeriod7, (long) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(3, (int) (short) 100, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 0, 0, 0, 0, 100]");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField16 = chronology8.millisOfSecond();
        int int19 = dateTimeField16.getDifference(818L, 0L);
        java.lang.Class<?> wildcardClass20 = dateTimeField16.getClass();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 818 + "'", int19 == 818);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod12.copy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.yearOfCentury();
        org.joda.time.Duration duration17 = mutablePeriod13.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight15);
        mutablePeriod9.setPeriod((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay((java.lang.Object) duration17, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Duration");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(duration17);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.Period period1 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period3 = period1.plusHours((int) '#');
        org.joda.time.Hours hours4 = period3.toStandardHours();
        org.joda.time.Period period5 = period3.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = period3.getFieldType(47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 47");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(hours4);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.LocalDate localDate5 = yearMonthDay0.toLocalDate();
        org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtMidnight();
        org.joda.time.DateMidnight dateMidnight7 = dateTime6.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.withDayOfWeek((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight7);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.withChronologyRetainFields(chronology11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay12.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.plusHours((-1));
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.withChronologyRetainFields(chronology20);
        long long23 = chronology16.set((org.joda.time.ReadablePartial) timeOfDay19, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(chronology16);
        org.joda.time.DateTime dateTime25 = dateTime6.toDateTime(chronology16);
        org.joda.time.DateTimeField dateTimeField26 = chronology16.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay27 = new org.joda.time.TimeOfDay(53251426, 7, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53251426 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-86399999L) + "'", long23 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.millisOfDay();
        int int6 = mutableDateTime0.getMinuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 887 + "'", int6 == 887);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMinutes((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.dayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.util.Locale locale0 = java.util.Locale.getDefault();
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
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = dateTimeFormatter2.parseLocalTime("fra");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay.Property property9 = timeOfDay4.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((java.lang.Object) property9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.TimeOfDay$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property5 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(23);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getRangeDurationType();
        org.joda.time.DateTime.Property property10 = dateTime4.property(dateTimeFieldType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property10.setCopy("DateTimeField[clockhourOfHalfday]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[clockhourOfHalfday]\" for clockhourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int5 = dateTimeZone3.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime6 = mutableDateTime0.toMutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        int int8 = mutableDateTime7.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType15 = periodType14.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime7, (org.joda.time.ReadableInstant) dateTime12, periodType15);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod20 = mutablePeriod19.copy();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.yearOfCentury();
        org.joda.time.Duration duration24 = mutablePeriod20.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight22);
        mutablePeriod16.setPeriod((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableDuration) duration24);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod30 = mutablePeriod29.copy();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.withChronologyRetainFields(chronology36);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray38 = timeOfDay37.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay37.plusHours((-1));
        org.joda.time.Chronology chronology41 = timeOfDay40.getChronology();
        mutablePeriod29.setPeriod((long) (byte) 1, 845L, chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((java.lang.Object) mutableDateTime0, chronology41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.MutableDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int5 = localDate1.get(dateTimeFieldType4);
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType4.getRangeDurationType();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.withChronologyRetainFields(chronology16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay17.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.plusHours((-1));
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.withChronologyRetainFields(chronology25);
        long long28 = chronology21.set((org.joda.time.ReadablePartial) timeOfDay24, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.DateTime dateTime30 = dateTime11.toDateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField31 = chronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField32 = chronology21.yearOfCentury();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType37 = periodType36.withWeeksRemoved();
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight34, readableDuration35, periodType36);
        org.joda.time.Period period40 = period38.withSeconds(0);
        org.joda.time.Period period42 = period40.plusMinutes((int) (byte) 1);
        org.joda.time.Period period44 = period40.withSeconds((int) (byte) 10);
        org.joda.time.Period period45 = period40.toPeriod();
        org.joda.time.Period period47 = period40.plusHours(58);
        org.joda.time.Period period49 = period47.plusHours(69);
        int[] intArray52 = chronology21.get((org.joda.time.ReadablePeriod) period47, 3155695200000L, (long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime((java.lang.Object) durationFieldType6, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-86399999L) + "'", long28 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[-99, -11, -30, -5, -59, -59, -900]");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        int int3 = yearMonthDay0.getDayOfMonth();
        int int4 = yearMonthDay0.getDayOfMonth();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = yearMonthDay0.getFieldTypes();
        int int6 = yearMonthDay0.size();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfDay();
        org.joda.time.LocalTime localTime11 = property9.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime12 = property9.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = yearMonthDay0.isBefore((org.joda.time.ReadablePartial) localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(2022, 7, 5, 4);
        java.util.Calendar.Builder builder6 = new java.util.Calendar.Builder();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) mutableDateTime11);
        int[] intArray14 = chronology9.get((org.joda.time.ReadablePeriod) mutablePeriod12, (long) 100);
        java.util.Calendar.Builder builder15 = builder6.setFields(intArray14);
        java.util.Calendar.Builder builder16 = builder0.setFields(intArray14);
        java.util.Calendar.Builder builder18 = builder0.setLenient(true);
        java.util.Calendar.Builder builder21 = builder0.set((int) (short) 0, 9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder23 = builder0.setCalendarType("millisOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: millisOfDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone.setDefault(timeZone1);
        boolean boolean4 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-292275054), 9, 1900, 17, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1900 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.lang.Character[] charArray6 = new java.lang.Character[] { '#', 'x', '#', 'u', ' ', '#' };
        java.util.LinkedHashSet<java.lang.Character> charSet7 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet7, charArray6);
        java.lang.Object[] objArray9 = charSet7.toArray();
        java.util.Locale locale10 = java.util.Locale.getDefault();
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.lang.String str12 = locale11.getDisplayScript();
        java.util.Locale.setDefault(locale11);
        java.lang.String str14 = locale11.getISO3Language();
        java.util.Locale locale15 = java.util.Locale.ENGLISH;
        java.lang.String str16 = locale11.getDisplayScript(locale15);
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.lang.String str19 = locale18.getDisplayCountry();
        java.util.Locale locale20 = java.util.Locale.ITALY;
        java.lang.String str21 = locale20.getDisplayCountry();
        java.util.Locale locale22 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale23 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.lang.String str25 = locale24.getDisplayScript();
        java.util.Locale.setDefault(locale24);
        java.lang.String str27 = locale24.getISO3Language();
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.util.Locale locale29 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str30 = locale29.getDisplayLanguage();
        java.lang.String str32 = locale29.getUnicodeLocaleType("22");
        java.util.Locale locale35 = new java.util.Locale("hi!", "hi!");
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone38);
        org.joda.time.DateTime dateTime40 = dateTime39.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime40.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.year();
        org.joda.time.DateTimeField dateTimeField43 = property42.getField();
        java.util.Locale locale44 = java.util.Locale.PRC;
        java.lang.String str45 = locale44.getDisplayScript();
        java.util.Locale.setDefault(locale44);
        java.lang.String str47 = locale44.getISO3Language();
        java.util.Locale locale48 = java.util.Locale.ENGLISH;
        java.lang.String str49 = locale44.getDisplayScript(locale48);
        int int50 = dateTimeField43.getMaximumShortTextLength(locale48);
        java.util.Locale.Category category51 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.util.Locale.setDefault(category51, locale52);
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property56 = localTime55.millisOfDay();
        org.joda.time.LocalTime localTime58 = property56.addNoWrapToCopy(11);
        java.util.Locale locale59 = java.util.Locale.PRC;
        java.lang.String str60 = locale59.getDisplayScript();
        java.lang.String str61 = property56.getAsShortText(locale59);
        java.util.Locale locale64 = new java.util.Locale("hi!", "hi!");
        java.util.Locale locale65 = java.util.Locale.PRC;
        java.lang.String str66 = locale65.getDisplayScript();
        java.util.Locale.setDefault(locale65);
        java.lang.String str68 = locale65.getISO3Language();
        java.util.Locale locale69 = java.util.Locale.FRANCE;
        java.lang.String str70 = locale69.getISO3Language();
        java.util.Locale locale73 = new java.util.Locale("hi!", "hi!");
        java.util.Locale locale74 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale75 = java.util.Locale.PRC;
        java.lang.String str76 = locale75.getDisplayScript();
        java.util.Locale.setDefault(locale75);
        java.lang.String str78 = locale75.getISO3Language();
        java.util.Locale locale79 = java.util.Locale.PRC;
        java.lang.String str80 = locale79.getDisplayScript();
        java.util.Locale.setDefault(locale79);
        java.lang.String str82 = locale79.getISO3Language();
        java.util.Locale locale83 = java.util.Locale.ENGLISH;
        java.lang.String str84 = locale79.getDisplayScript(locale83);
        java.util.Locale locale85 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str86 = locale85.getDisplayLanguage();
        java.lang.String str88 = locale85.getUnicodeLocaleType("22");
        java.util.Locale[] localeArray89 = new java.util.Locale[] { locale10, locale11, locale17, locale18, locale20, locale22, locale23, locale24, locale28, locale29, locale35, locale48, locale52, locale59, locale64, locale65, locale69, locale73, locale74, locale75, locale79, locale85 };
        java.util.ArrayList<java.util.Locale> localeList90 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList90, localeArray89);
        java.util.stream.Stream<java.util.Locale> localeStream92 = localeList90.parallelStream();
        boolean boolean93 = charSet7.retainAll((java.util.Collection<java.util.Locale>) localeList90);
        java.util.Spliterator<java.lang.Character> charSpliterator94 = charSet7.spliterator();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[#, x, u,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[#, x, u,  ]");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "zho" + "'", str14, "zho");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u610f\u5927\u5229" + "'", str19, "\u610f\u5927\u5229");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u610f\u5927\u5229" + "'", str21, "\u610f\u5927\u5229");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zho" + "'", str27, "zho");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u4e2d\u6587" + "'", str30, "\u4e2d\u6587");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals(locale35.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "zho" + "'", str47, "zho");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 9 + "'", int50 == 9);
        org.junit.Assert.assertTrue("'" + category51 + "' != '" + java.util.Locale.Category.FORMAT + "'", category51.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1" + "'", str61, "1");
        org.junit.Assert.assertEquals(locale64.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "zho" + "'", str68, "zho");
        org.junit.Assert.assertNotNull(locale69);
        org.junit.Assert.assertEquals(locale69.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "fra" + "'", str70, "fra");
        org.junit.Assert.assertEquals(locale73.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "zho" + "'", str78, "zho");
        org.junit.Assert.assertNotNull(locale79);
        org.junit.Assert.assertEquals(locale79.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "zho" + "'", str82, "zho");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "en");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "\u4e2d\u6587" + "'", str86, "\u4e2d\u6587");
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNotNull(localeArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(localeStream92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(charSpliterator94);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = dateTimeFormatter2.parseMutableDateTime("1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter4.print(558L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        int int3 = yearMonthDay0.getDayOfMonth();
        int int4 = yearMonthDay0.getDayOfMonth();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod8 = mutablePeriod7.copy();
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = mutablePeriod8.toString(periodFormatter9);
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay0.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod8, (-1));
        org.joda.time.YearMonthDay.Property property13 = yearMonthDay12.year();
        java.lang.String str14 = property13.getName();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((java.lang.Object) str14, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"year\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0.099S" + "'", str10, "PT0.099S");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "year" + "'", str14, "year");
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("12 Nov 1900 10:21:00 GMT", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=12nov190010:21:00gmt");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.adjustOffset((long) ' ', true);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(obj4, dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.secondOfMinute();
        long long8 = property7.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property7.getLocalDateTime();
        boolean boolean11 = property7.equals((java.lang.Object) 1.0f);
        org.joda.time.LocalDateTime localDateTime13 = property7.setCopy((int) (short) 1);
        boolean boolean14 = dateTimeZone0.isLocalDateTimeGap(localDateTime13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withMillisOfSecond(2);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone19);
        org.joda.time.DateTime dateTime21 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime21.toMutableDateTime();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.TimeOfDay timeOfDay25 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay25.withChronologyRetainFields(chronology26);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray28 = timeOfDay27.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay27.plusHours((-1));
        org.joda.time.Chronology chronology31 = timeOfDay30.getChronology();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.TimeOfDay timeOfDay34 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology33);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay34.withChronologyRetainFields(chronology35);
        long long38 = chronology31.set((org.joda.time.ReadablePartial) timeOfDay34, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(chronology31);
        org.joda.time.DateTime dateTime40 = dateTime21.toDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField41 = chronology31.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField42 = chronology31.weekOfWeekyear();
        long long46 = chronology31.add(0L, (long) 12, 117);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((java.lang.Object) 2, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 460L + "'", long8 == 460L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-86399999L) + "'", long38 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1404L + "'", long46 == 1404L);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight1.withDurationAdded((long) 17, 1);
        org.joda.time.DateMidnight.Property property6 = dateMidnight1.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight8 = property6.setCopy("DurationField[centuries]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DurationField[centuries]\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) mutableDateTime1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.set(dateTimeFieldType3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.year();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.lang.String str14 = locale13.getDisplayScript();
        java.util.Locale.setDefault(locale13);
        java.lang.String str16 = locale13.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale13.getDisplayScript(locale17);
        int int19 = dateTimeField12.getMaximumShortTextLength(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter4.withLocale(locale17);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.withChronologyRetainFields(chronology24);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = timeOfDay25.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay25.plusHours((-1));
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.TimeOfDay timeOfDay32 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay32.withChronologyRetainFields(chronology33);
        long long36 = chronology29.set((org.joda.time.ReadablePartial) timeOfDay32, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(chronology29);
        org.joda.time.DurationField durationField38 = chronology29.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay((java.lang.Object) locale17, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-86399999L) + "'", long36 == (-86399999L));
        org.junit.Assert.assertNotNull(durationField38);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        int int6 = property3.getMaximumShortTextLength(locale5);
        org.joda.time.LocalDateTime localDateTime8 = property3.addWrapFieldToCopy(6);
        int int9 = localDateTime8.getEra();
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 811L + "'", long4 == 811L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(1, 3, 6, 0, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = dateTimeFormatter2.parseLocalDateTime("fra");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3, periodType4);
        org.joda.time.Period period8 = period6.withSeconds(0);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime14 = dateTime12.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        org.joda.time.DateTime dateTime20 = timeOfDay19.toDateTimeToday();
        boolean boolean21 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime20.getWeekyear();
        org.joda.time.DateTime dateTime24 = dateTime20.plusHours(4);
        org.joda.time.Duration duration25 = period6.toDurationFrom((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod29 = mutablePeriod28.copy();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight31.yearOfCentury();
        org.joda.time.Duration duration33 = mutablePeriod29.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight31);
        boolean boolean34 = duration25.isEqual((org.joda.time.ReadableDuration) duration33);
        org.joda.time.DateTime dateTime35 = dateTime0.minus((org.joda.time.ReadableDuration) duration33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = dateTime0.withTime(2022, 4, 21, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.roundFloorCopy();
        int int8 = localTime7.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("PT10S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: PT10S");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.String str1 = iOException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.IOException" + "'", str1, "java.io.IOException");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        timeZone1.setID("Standard");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.era();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.year();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.lang.String str16 = locale15.getDisplayScript();
        java.util.Locale.setDefault(locale15);
        java.lang.String str18 = locale15.getISO3Language();
        java.util.Locale locale19 = java.util.Locale.ENGLISH;
        java.lang.String str20 = locale15.getDisplayScript(locale19);
        int int21 = dateTimeField14.getMaximumShortTextLength(locale19);
        java.lang.String str22 = property6.getAsText(locale19);
        java.lang.String str23 = timeZone1.getDisplayName(locale19);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AD" + "'", str22, "AD");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GMT+00:00" + "'", str23, "GMT+00:00");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.Instant instant4 = instant2.plus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        int int7 = mutableDateTime6.getDayOfMonth();
        org.joda.time.Instant instant8 = mutableDateTime6.toInstant();
        org.joda.time.Instant instant10 = instant8.plus((long) (byte) 100);
        org.joda.time.Instant instant12 = instant8.withMillis((long) 13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval13 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime5, (org.joda.time.ReadableInstant) instant12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant12);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Period period7 = period5.withSeconds(0);
        org.joda.time.Period period9 = period7.plusMinutes((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType11 = period7.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.addWrapField(6);
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property6.add((long) 1);
        org.joda.time.MutableDateTime mutableDateTime12 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime13 = property6.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime18.toMutableDateTime();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.withChronologyRetainFields(chronology23);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = timeOfDay24.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay24.plusHours((-1));
        org.joda.time.Chronology chronology28 = timeOfDay27.getChronology();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.TimeOfDay timeOfDay31 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology30);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay31.withChronologyRetainFields(chronology32);
        long long35 = chronology28.set((org.joda.time.ReadablePartial) timeOfDay31, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay(chronology28);
        org.joda.time.DateTime dateTime37 = dateTime18.toDateTime(chronology28);
        org.joda.time.DateTimeField dateTimeField38 = chronology28.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = dateTimeField38.getType();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime13.setRounding(dateTimeField38, 86399999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 86399999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-86399999L) + "'", long35 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        timeZone1.setID("Standard");
        boolean boolean4 = timeZone1.observesDaylightTime();
        boolean boolean5 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusYears((int) ' ');
        org.joda.time.DateTime.Property property3 = dateTime0.dayOfMonth();
        java.lang.String str4 = property3.getAsText();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "21" + "'", str4, "21");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.addWrapField(6);
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property6.add((long) 1);
        org.joda.time.MutableDateTime mutableDateTime12 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime13 = property6.roundHalfCeiling();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime13.setDayOfYear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale5 = new java.util.Locale("hi!", "hi!");
        java.util.Locale locale6 = java.util.Locale.FRANCE;
        java.util.Locale locale9 = new java.util.Locale("hi!", "hi!");
        java.util.Locale[] localeArray10 = new java.util.Locale[] { locale5, locale6, locale9 };
        java.util.ArrayList<java.util.Locale> localeList11 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList11, localeArray10);
        java.util.Locale.FilteringMode filteringMode13 = null;
        java.util.List<java.util.Locale> localeList14 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList11, filteringMode13);
        java.lang.String[] strArray25 = new java.lang.String[] { "1", "12 Nov 1900 10:21:00 GMT", "PeriodType[Standard]", "", "", "1967-11-12 10:21:00", "2022-02-21T00:00:00.000Z", "PeriodType[Standard]", "\u4e2d\u6587", "PeriodType[Standard]" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        java.util.List<java.lang.String> strList28 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList26);
        java.util.Locale.LanguageRange[] languageRangeArray29 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList30 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList30, languageRangeArray29);
        java.util.Locale locale34 = new java.util.Locale("hi!", "hi!");
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.util.Locale locale38 = new java.util.Locale("hi!", "hi!");
        java.util.Locale[] localeArray39 = new java.util.Locale[] { locale34, locale35, locale38 };
        java.util.ArrayList<java.util.Locale> localeList40 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList40, localeArray39);
        java.util.Locale.FilteringMode filteringMode42 = null;
        java.util.List<java.util.Locale> localeList43 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList30, (java.util.Collection<java.util.Locale>) localeList40, filteringMode42);
        java.util.Locale.FilteringMode filteringMode44 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList43, filteringMode44);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone48);
        org.joda.time.DateTime dateTime50 = dateTime49.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime51 = dateTime49.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone52 = dateTime49.getZone();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay55.withChronologyRetainFields(chronology56);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray58 = timeOfDay57.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay60 = timeOfDay57.plusHours((-1));
        org.joda.time.Chronology chronology61 = timeOfDay60.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField63 = chronology61.centuryOfEra();
        org.joda.time.DurationField durationField64 = chronology61.weekyears();
        org.joda.time.DateTime dateTime65 = dateTime49.toDateTime(chronology61);
        org.joda.time.DateTimeField dateTimeField66 = chronology61.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval67 = new org.joda.time.Interval((java.lang.Object) localeList43, chronology61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.util.ArrayList");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals(locale5.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(localeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localeList14);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(languageRangeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals(locale34.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale38.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(localeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(localeList43);
        org.junit.Assert.assertTrue("'" + filteringMode44 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode44.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray58);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTimeField66);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withChronologyRetainFields(chronology6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusHours((-1));
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.centuryOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType17 = periodType16.withWeeksRemoved();
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15, periodType16);
        org.joda.time.Period period20 = period18.withSeconds(0);
        org.joda.time.Period period22 = period20.plusMinutes((int) (byte) 1);
        org.joda.time.Period period24 = period20.withSeconds((int) (byte) 10);
        org.joda.time.Period period26 = period24.withMillis((int) 'x');
        int[] intArray29 = chronology11.get((org.joda.time.ReadablePeriod) period26, (long) 2022, (long) 6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(2027, (int) 'a', (-292275054), chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0, 0, -2, -16]");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(21, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate(13, (int) 'u', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 601L + "'", long4 == 601L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period7 = period5.plusHours((int) '#');
        org.joda.time.Period period8 = period5.toPeriod();
        org.joda.time.YearMonth yearMonth9 = yearMonth2.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears(887);
        org.joda.time.YearMonth.Property property12 = yearMonth9.monthOfYear();
        int int13 = property12.getMinimumValueOverall();
        org.joda.time.DateTimeField dateTimeField14 = property12.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth16 = property12.setCopy(2032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2032 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Period period7 = period5.withSeconds(0);
        org.joda.time.Period period9 = period7.plusMinutes((int) (byte) 1);
        org.joda.time.Period period11 = period7.withMillis((int) (short) 1);
        int int12 = period11.size();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod16 = mutablePeriod15.copy();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.yearOfCentury();
        org.joda.time.Duration duration20 = mutablePeriod16.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight18);
        mutablePeriod16.setPeriod((-1), 0, (int) 'a', (int) '4', 14, (int) 'x', (int) (short) 0, (int) (byte) -1);
        int int30 = mutablePeriod16.getDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period31 = period11.minus((org.joda.time.ReadablePeriod) mutablePeriod16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime3 = property2.withMaximumValue();
        int int4 = property2.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property2.setCopy("\u4e2d\u6587\u4e2d\u56fd)");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?? (??)\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 86399999 + "'", int4 == 86399999);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.getDisplayScript();
        java.util.Locale.setDefault(locale0);
        java.lang.String str3 = locale0.getISO3Language();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getDisplayCountry(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zho" + "'", str3, "zho");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours((int) (short) 10);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfSecond();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.plusDays(2022);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.withMonthOfYear(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = yearMonthDay4.getFieldType(9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        java.util.TimeZone timeZone3 = null;
        calendar0.setTimeZone(timeZone3);
        int int5 = calendar0.getMinimalDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=null,firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.year();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getDisplayScript();
        java.util.Locale.setDefault(locale14);
        java.lang.String str17 = locale14.getISO3Language();
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale14.getDisplayScript(locale18);
        int int20 = dateTimeField13.getMaximumShortTextLength(locale18);
        mutableDateTime0.setRounding(dateTimeField13);
        long long24 = dateTimeField13.addWrapField(953L, 1969);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zho" + "'", str17, "zho");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 62135596800953L + "'", long24 == 62135596800953L);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        java.util.TimeZone timeZone3 = null;
        calendar0.setTimeZone(timeZone3);
        int int6 = calendar0.getGreatestMinimum(9);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar0.setTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.year();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.lang.String str21 = locale20.getDisplayScript();
        java.util.Locale.setDefault(locale20);
        java.lang.String str23 = locale20.getISO3Language();
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.lang.String str25 = locale20.getDisplayScript(locale24);
        int int26 = dateTimeField19.getMaximumShortTextLength(locale24);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime31.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime32.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property34 = mutableDateTime33.year();
        org.joda.time.DateTimeField dateTimeField35 = property34.getField();
        java.util.Locale locale36 = java.util.Locale.PRC;
        java.lang.String str37 = locale36.getDisplayScript();
        java.util.Locale.setDefault(locale36);
        java.lang.String str39 = locale36.getISO3Language();
        java.util.Locale locale40 = java.util.Locale.ENGLISH;
        java.lang.String str41 = locale36.getDisplayScript(locale40);
        int int42 = dateTimeField35.getMaximumShortTextLength(locale40);
        java.util.Locale locale43 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str44 = locale40.getDisplayScript(locale43);
        java.lang.String str45 = dateTimeField19.getAsShortText((int) 'u', locale40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = timeZone8.getDisplayName(true, 272, locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 272");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "zho" + "'", str23, "zho");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 9 + "'", int26 == 9);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "zho" + "'", str39, "zho");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "117" + "'", str45, "117");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableDuration4, (org.joda.time.ReadableInstant) mutableDateTime5);
        int[] intArray8 = chronology3.get((org.joda.time.ReadablePeriod) mutablePeriod6, (long) 100);
        java.util.Calendar.Builder builder9 = builder0.setFields(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder11 = builder0.setInstant(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        boolean boolean6 = dateTime5.isBeforeNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime5.withTime((int) ' ', (int) '#', 53, 1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.Object obj2 = locale0.clone();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        int int4 = mutableDateTime3.getDayOfMonth();
        org.joda.time.Instant instant5 = mutableDateTime3.toInstant();
        boolean boolean7 = mutableDateTime3.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int11 = dateTimeZone9.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime3.setZone(dateTimeZone9);
        mutableDateTime3.setMillisOfDay((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        mutableDateTime3.setZone(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((java.lang.Object) locale0, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "fr_FR");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfYear();
        java.lang.String str3 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52" + "'", str3, "52");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.YearMonthDay yearMonthDay5 = property3.addToCopy(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType6.getField(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = yearMonthDay5.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime3 = property2.withMaximumValue();
        int int4 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime5 = property2.getLocalTime();
        org.joda.time.LocalTime localTime6 = property2.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 86399999 + "'", int4 == 86399999);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.DateTime.Property property6 = dateTime4.year();
        org.joda.time.DateTime dateTime8 = property6.setCopy((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = property6.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime dateTime12 = dateTime9.withField(dateTimeFieldType10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear(272);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 272 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.roundFloorCopy();
        org.joda.time.LocalTime localTime8 = property6.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = property6.setCopy(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property6.setCopy("1967-11-12 10:21:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1967-11-12 10:21:00\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay4.getFieldTypes();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay11 = timeOfDay4.withFieldAdded(durationFieldType9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weeks' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(durationFieldType9);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("fra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: fra");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        org.joda.time.LocalDate localDate6 = property5.withMaximumValue();
        org.joda.time.LocalDate localDate8 = property5.addToCopy((int) 'u');
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateTime dateTime15 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.withChronologyRetainFields(chronology20);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = timeOfDay21.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay21.plusHours((-1));
        org.joda.time.Chronology chronology25 = timeOfDay24.getChronology();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.withChronologyRetainFields(chronology29);
        long long32 = chronology25.set((org.joda.time.ReadablePartial) timeOfDay28, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(chronology25);
        org.joda.time.DateTime dateTime34 = dateTime15.toDateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField35 = chronology25.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) 1, chronology25);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(chronology25);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.TimeOfDay timeOfDay40 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology39);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay40.withChronologyRetainFields(chronology41);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray43 = timeOfDay42.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay42.plusHours((-1));
        org.joda.time.Chronology chronology46 = timeOfDay45.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.centuryOfEra();
        org.joda.time.DurationField durationField49 = chronology46.weekyears();
        org.joda.time.DateTimeField dateTimeField50 = chronology46.dayOfMonth();
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay37.withChronologyRetainFields(chronology46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) timeOfDay37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-86399999L) + "'", long32 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(timeOfDay51);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        boolean boolean1 = locale0.hasExtensions();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusHours((-1));
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withChronologyRetainFields(chronology19);
        long long22 = chronology15.set((org.joda.time.ReadablePartial) timeOfDay18, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology15);
        org.joda.time.DateTime dateTime24 = dateTime5.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField25 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology15.millisOfDay();
        org.joda.time.DurationField durationField27 = chronology15.centuries();
        org.joda.time.DurationField durationField28 = durationFieldType0.getField(chronology15);
        org.joda.time.Chronology chronology29 = chronology15.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long34 = chronology29.getDateTimeMillis(12, (int) (byte) 0, 19, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-86399999L) + "'", long22 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        long long3 = calendar0.getTimeInMillis();
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = calendar0.getDisplayName(23, 818, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 845L + "'", long3 == 845L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"0\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        java.lang.Integer int4 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        java.lang.StringBuffer stringBuffer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer6, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.Period period1 = org.joda.time.Period.months(2027);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setWeekDate(1975, 2023, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("1970-01-01", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod6.copy();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withChronologyRetainFields(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.plusHours((-1));
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        mutablePeriod6.setPeriod((long) (byte) 1, 845L, chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.dayOfYear();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay3.withChronologyRetainFields(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(21, 13, (int) (short) -1, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(timeOfDay21);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(2022, 7, 5, 4);
        java.util.Calendar.Builder builder6 = new java.util.Calendar.Builder();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) mutableDateTime11);
        int[] intArray14 = chronology9.get((org.joda.time.ReadablePeriod) mutablePeriod12, (long) 100);
        java.util.Calendar.Builder builder15 = builder6.setFields(intArray14);
        java.util.Calendar.Builder builder16 = builder0.setFields(intArray14);
        java.util.Calendar.Builder builder18 = builder0.setLenient(true);
        java.util.Calendar.Builder builder21 = builder0.set((int) (short) 0, 9);
        java.lang.Object obj22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(obj22, dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime24.minus((org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withWeekyear((int) '4');
        java.util.Date date33 = localDateTime30.toDate();
        date33.setHours((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder36 = builder21.setInstant(date33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(date33);
// flaky:         org.junit.Assert.assertEquals(date33.toString(), "Mon Feb 21 01:47:41 GMT 2022");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear((int) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime6.getValue((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -292275054");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval4 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology5 = interval4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval7 = interval4.withEndMillis(9L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTime dateTime11 = timeOfDay10.toDateTimeToday();
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime.Property property13 = dateTime11.minuteOfDay();
        int int14 = dateTime11.getEra();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        int int0 = org.joda.time.YearMonth.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.parse("millisOfDay", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateMidnight3);
        int int6 = dateMidnight3.getMinuteOfHour();
        org.joda.time.Instant instant7 = dateMidnight3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setDayOfWeek((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.minus(readableDuration2);
        org.joda.time.LocalDate localDate4 = dateTime3.toLocalDate();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime7.minus((org.joda.time.ReadablePeriod) mutablePeriod12);
        boolean boolean15 = localDateTime13.equals((java.lang.Object) 14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.plusDays(10);
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDate4.compareTo((org.joda.time.ReadablePartial) localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property4 = yearMonthDay2.property(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.hourOfDay();
        int int6 = property5.get();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addNoWrapToCopy((int) (short) 10);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType16 = periodType14.getFieldType(0);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone20);
        org.joda.time.DateTime dateTime22 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime22.toMutableDateTime();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.withChronologyRetainFields(chronology27);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray29 = timeOfDay28.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.plusHours((-1));
        org.joda.time.Chronology chronology32 = timeOfDay31.getChronology();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.withChronologyRetainFields(chronology36);
        long long39 = chronology32.set((org.joda.time.ReadablePartial) timeOfDay35, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay40 = new org.joda.time.TimeOfDay(chronology32);
        org.joda.time.DateTime dateTime41 = dateTime22.toDateTime(chronology32);
        org.joda.time.DateTimeField dateTimeField42 = chronology32.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField43 = chronology32.millisOfDay();
        org.joda.time.DurationField durationField44 = chronology32.centuries();
        org.joda.time.DurationField durationField45 = durationFieldType17.getField(chronology32);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((-86399999L), 311L, periodType14, chronology32);
        org.joda.time.Period period47 = new org.joda.time.Period(0L, (long) 14, chronology32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((java.lang.Object) property5, chronology32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.TimeOfDay$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-86399999L) + "'", long39 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationField45);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("14:47:32.840");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        java.io.Writer writer4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withFieldAdded(durationFieldType9, 2);
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj12, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.secondOfMinute();
        long long16 = property15.remainder();
        org.joda.time.LocalDateTime localDateTime17 = property15.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds(11);
        int int20 = localDateTime11.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime11.withMillisOfDay(15);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, (org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 877L + "'", long16 == 877L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        int int0 = org.joda.time.TimeOfDay.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("YearDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.plusDays(2022);
        org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.withMonthOfYear(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int6 = yearMonthDay2.get(dateTimeFieldType5);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime7.monthOfYear();
        mutableDateTime7.setSecondOfMinute(0);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        int int12 = mutableDateTime11.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType19 = periodType18.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime11, (org.joda.time.ReadableInstant) dateTime16, periodType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.era();
        int int22 = mutableDateTime11.get(dateTimeFieldType21);
        int int23 = mutableDateTime7.get(dateTimeFieldType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property24 = yearMonthDay2.property(dateTimeFieldType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int4 = timeZone1.getOffset(0L);
        java.lang.String str5 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4" + "'", str5, "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(52, 47, 58, 8, 53, 86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMillis((int) (byte) 10);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.dayOfYear();
        org.joda.time.DateMidnight dateMidnight14 = property13.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.property(dateTimeFieldType15);
        org.joda.time.DateTime.Property property17 = dateTime10.property(dateTimeFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime10.withTime((int) (short) 1, 12, (int) (short) 0, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(9, (int) '4', 1975, 1975);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1975 for secondOfMinute must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Period period7 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period9 = period7.plusHours((int) '#');
        org.joda.time.Period period10 = period5.minus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period5.toPeriod();
        int int12 = period5.size();
        org.joda.time.Days days13 = period5.toStandardDays();
        int int14 = period5.getHours();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((java.lang.Object) 59L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime10 = dateTime8.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds((int) (short) 10);
        int int13 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime10);
        java.util.Calendar calendar14 = java.util.Calendar.getInstance();
        calendar14.add(11, (int) ' ');
        java.util.Date date23 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date23.setMonth(0);
        calendar14.setTime(date23);
        boolean boolean27 = dateTime4.equals((java.lang.Object) calendar14);
        boolean boolean28 = dateTime4.isAfterNow();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-93706740000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1967,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=12,DAY_OF_YEAR=12,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 12 10:21:00 GMT 1967");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 5, (long) (byte) 10);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        mutablePeriod2.setPeriod((long) 47, chronology6);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = yearMonthDay9.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval();
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        boolean boolean16 = interval13.isAfter((long) 53);
        org.joda.time.Chronology chronology17 = interval13.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((java.lang.Object) 47, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) 'x', 0, 3, (int) (byte) 10, (int) (byte) 100, 272, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.TimeOfDay.Property property8 = timeOfDay4.millisOfSecond();
        org.joda.time.DurationField durationField9 = property8.getDurationField();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.era();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime18.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.year();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = locale22.getDisplayScript();
        java.util.Locale.setDefault(locale22);
        java.lang.String str25 = locale22.getISO3Language();
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = locale22.getDisplayScript(locale26);
        int int28 = dateTimeField21.getMaximumShortTextLength(locale26);
        java.lang.String str29 = property13.getAsText(locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay30 = property8.setCopy("dayOfMonth", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"dayOfMonth\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zho" + "'", str25, "zho");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AD" + "'", str29, "AD");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period7 = period5.plusHours((int) '#');
        org.joda.time.Period period8 = period5.toPeriod();
        org.joda.time.YearMonth yearMonth9 = yearMonth2.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears(887);
        int int12 = yearMonth11.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth14 = yearMonth11.withMonthOfYear(13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = yearMonth2.toLocalDate(2023);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2023 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getDisplayScript();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        java.io.IOException iOException1 = new java.io.IOException("zho");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: zho" + "'", str2, "java.io.IOException: zho");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.DateTime dateTime7 = dateTime5.plusYears((int) 'u');
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        int int9 = mutableDateTime8.getDayOfMonth();
        org.joda.time.Instant instant10 = mutableDateTime8.toInstant();
        boolean boolean12 = mutableDateTime8.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone16);
        org.joda.time.DateTime dateTime18 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime18.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.year();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = locale22.getDisplayScript();
        java.util.Locale.setDefault(locale22);
        java.lang.String str25 = locale22.getISO3Language();
        java.util.Locale locale26 = java.util.Locale.ENGLISH;
        java.lang.String str27 = locale22.getDisplayScript(locale26);
        int int28 = dateTimeField21.getMaximumShortTextLength(locale26);
        mutableDateTime8.setRounding(dateTimeField21);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone32);
        org.joda.time.DateTime dateTime34 = dateTime33.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime34.toMutableDateTime();
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology37);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.withChronologyRetainFields(chronology39);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray41 = timeOfDay40.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay40.plusHours((-1));
        org.joda.time.Chronology chronology44 = timeOfDay43.getChronology();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.TimeOfDay timeOfDay47 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology46);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay47.withChronologyRetainFields(chronology48);
        long long51 = chronology44.set((org.joda.time.ReadablePartial) timeOfDay47, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay52 = new org.joda.time.TimeOfDay(chronology44);
        org.joda.time.DateTime dateTime53 = dateTime34.toDateTime(chronology44);
        org.joda.time.DateTimeField dateTimeField54 = chronology44.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField55 = chronology44.millisOfDay();
        mutableDateTime8.setRounding(dateTimeField55);
        int int57 = dateTimeField55.getMinimumValue();
        int int58 = dateTime5.get(dateTimeField55);
        org.joda.time.DateTime dateTime59 = dateTime5.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime61 = dateTime5.withWeekOfWeekyear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "zho" + "'", str25, "zho");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-86399999L) + "'", long51 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertNotNull(dateTime59);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((int) (short) 100, (int) (short) 0, (int) (byte) 10, 818, 3, (int) (short) 1, 23, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 818 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property6.setCopy("zho");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zho\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime3 = property2.withMaximumValue();
        int int4 = property2.getMaximumValue();
        org.joda.time.DurationField durationField5 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 86399999 + "'", int4 == 86399999);
        org.junit.Assert.assertNull(durationField5);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        int int11 = dateTime10.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(dateTimeZone13);
        org.joda.time.DateTime.Property property16 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime17 = property16.roundHalfEvenCopy();
        boolean boolean18 = localDateTime2.equals((java.lang.Object) property16);
        int int19 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime2.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property22 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime2.plusYears(15);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean27 = dateTimeZone26.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((java.lang.Object) 15, dateTimeZone26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getDisplayScript();
        java.util.Locale.setDefault(locale8);
        java.lang.String str11 = locale8.getISO3Language();
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        java.lang.String str13 = locale8.getDisplayScript(locale12);
        int int14 = dateTimeField7.getMaximumShortTextLength(locale12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.year();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.lang.String str25 = locale24.getDisplayScript();
        java.util.Locale.setDefault(locale24);
        java.lang.String str27 = locale24.getISO3Language();
        java.util.Locale locale28 = java.util.Locale.ENGLISH;
        java.lang.String str29 = locale24.getDisplayScript(locale28);
        int int30 = dateTimeField23.getMaximumShortTextLength(locale28);
        java.util.Locale locale31 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str32 = locale28.getDisplayScript(locale31);
        java.lang.String str33 = dateTimeField7.getAsShortText((int) 'u', locale28);
        long long35 = dateTimeField7.roundHalfFloor(0L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zho" + "'", str11, "zho");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zho" + "'", str27, "zho");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "117" + "'", str33, "117");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        boolean boolean2 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean5 = dateTimeFormatter4.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dateTimeFormatter4.parseMillis("14:47:40.693");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight7, readableDuration8, periodType9);
        org.joda.time.Period period13 = period11.withSeconds(0);
        org.joda.time.Period period15 = period13.plusMinutes((int) (byte) 1);
        org.joda.time.Period period17 = period13.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period20 = period13.withField(durationFieldType18, 14);
        org.joda.time.LocalTime localTime22 = localTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period13, (int) (short) 1);
        org.joda.time.LocalTime localTime24 = localTime22.withSecondOfMinute(10);
        int int25 = localTime22.size();
        int int26 = localTime22.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime28 = localTime22.withMillisOfSecond(2027);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2027 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        java.util.TimeZone.setDefault(timeZone1);
        int int4 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusHours((-1));
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withChronologyRetainFields(chronology19);
        long long22 = chronology15.set((org.joda.time.ReadablePartial) timeOfDay18, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology15);
        org.joda.time.DateTime dateTime24 = dateTime5.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField25 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology15.yearOfCentury();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType31 = periodType30.withWeeksRemoved();
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight28, readableDuration29, periodType30);
        org.joda.time.Period period34 = period32.withSeconds(0);
        org.joda.time.Period period36 = period34.plusMinutes((int) (byte) 1);
        org.joda.time.Period period38 = period34.withSeconds((int) (byte) 10);
        org.joda.time.Period period39 = period34.toPeriod();
        org.joda.time.Period period41 = period34.plusHours(58);
        org.joda.time.Period period43 = period41.plusHours(69);
        int[] intArray46 = chronology15.get((org.joda.time.ReadablePeriod) period41, 3155695200000L, (long) (byte) 100);
        long long50 = chronology15.add((long) 1975, 837L, 1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval51 = new org.joda.time.Interval((java.lang.Object) "fra", chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: fra");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-86399999L) + "'", long22 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[-99, -11, -30, -5, -59, -59, -900]");
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1650865L + "'", long50 == 1650865L);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime9.getZone();
        java.lang.String str11 = dateTimeZone10.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(818, 86399999, (int) ' ', (-1), 7, (int) (short) 100, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.addHours(4);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setMinuteOfDay(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField16 = chronology8.millisOfSecond();
        org.joda.time.DurationField durationField17 = chronology8.years();
        long long18 = durationField17.getUnitMillis();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 31556952000L + "'", long18 == 31556952000L);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.Period period1 = org.joda.time.Period.hours(9);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.YearMonth yearMonth0 = new org.joda.time.YearMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth2 = yearMonth0.withMonthOfYear(2023);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2023 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) -1, 1970, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekOfWeekyear(184);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 184 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 449L + "'", long4 == 449L);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        int int4 = calendar0.get(0);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("21");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '21' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay((int) (byte) -1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        int int6 = localTime5.size();
        org.joda.time.LocalTime localTime8 = localTime5.minusSeconds(100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalTime localTime11 = localTime5.withFieldAdded(durationFieldType9, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localTime11.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.LocalDate localDate6 = localDate3.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        boolean boolean8 = localDate6.isSupported(durationFieldType7);
        org.joda.time.LocalDate.Property property9 = localDate6.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod13 = mutablePeriod12.copy();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withChronologyRetainFields(chronology19);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = timeOfDay20.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay20.plusHours((-1));
        org.joda.time.Chronology chronology24 = timeOfDay23.getChronology();
        mutablePeriod12.setPeriod((long) (byte) 1, 845L, chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.dayOfYear();
        org.joda.time.DurationField durationField27 = chronology24.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) property9, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate7 = property4.setCopy(22);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int12 = dateTimeZone10.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(dateTimeZone10);
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.lang.String str16 = locale15.getDisplayScript();
        java.lang.String str17 = dateTimeZone10.getName(845L, locale15);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property20 = localTime19.millisOfDay();
        org.joda.time.LocalTime localTime22 = property20.addNoWrapToCopy(11);
        java.lang.String str23 = property20.getAsShortText();
        java.util.Locale locale24 = java.util.Locale.PRC;
        java.lang.String str25 = property20.getAsText(locale24);
        java.lang.String str26 = locale15.getDisplayScript(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = localDate7.toString("zho", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1" + "'", str25, "1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Appendable appendable5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9, periodType10);
        org.joda.time.Period period14 = period12.withSeconds(0);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone17);
        org.joda.time.DateTime dateTime19 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime20 = dateTime18.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.withChronologyRetainFields(chronology24);
        org.joda.time.DateTime dateTime26 = timeOfDay25.toDateTimeToday();
        boolean boolean27 = dateTime20.isEqual((org.joda.time.ReadableInstant) dateTime26);
        int int28 = dateTime26.getWeekyear();
        org.joda.time.DateTime dateTime30 = dateTime26.plusHours(4);
        org.joda.time.Duration duration31 = period12.toDurationFrom((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod35 = mutablePeriod34.copy();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(chronology36);
        org.joda.time.DateMidnight.Property property38 = dateMidnight37.yearOfCentury();
        org.joda.time.Duration duration39 = mutablePeriod35.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight37);
        boolean boolean40 = duration31.isEqual((org.joda.time.ReadableDuration) duration39);
        org.joda.time.DateTime dateTime41 = dateTime6.minus((org.joda.time.ReadableDuration) duration39);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, (org.joda.time.ReadableInstant) dateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2022 + "'", int28 == 2022);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(mutablePeriod35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property3.getFieldType();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.hourOfDay();
        int int13 = property12.get();
        int int14 = property12.get();
        org.joda.time.TimeOfDay timeOfDay15 = property12.getTimeOfDay();
        org.joda.time.LocalTime localTime16 = timeOfDay15.toLocalTime();
        java.util.Calendar.Builder builder18 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder23 = builder18.setTimeOfDay(2022, 7, 5, 4);
        java.util.Calendar.Builder builder24 = new java.util.Calendar.Builder();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(readableDuration28, (org.joda.time.ReadableInstant) mutableDateTime29);
        int[] intArray32 = chronology27.get((org.joda.time.ReadablePeriod) mutablePeriod30, (long) 100);
        java.util.Calendar.Builder builder33 = builder24.setFields(intArray32);
        java.util.Calendar.Builder builder34 = builder18.setFields(intArray32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = dateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) localTime16, 11, intArray32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        boolean boolean5 = dateTimeFormatter4.isPrinter();
        java.io.Writer writer6 = null;
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer6, (org.joda.time.ReadableInstant) instant7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("14:47:32.840");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"14:47:32.840\" is malformed at \":47:32.840\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.LocalDate localDate6 = localDate3.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        int int8 = period5.get(durationFieldType7);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        long long12 = dateTimeZone9.adjustOffset((long) ' ', true);
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime();
        int int14 = mutableDateTime13.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone17);
        org.joda.time.DateTime dateTime19 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType21 = periodType20.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime13, (org.joda.time.ReadableInstant) dateTime18, periodType21);
        int int23 = dateTimeZone9.getOffset((org.joda.time.ReadableInstant) dateTime18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((java.lang.Object) durationFieldType7, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusMinutes((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDateTime10.getValue(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 20");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay3.plusDays(2022);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.withMonthOfYear(4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateMidnight dateMidnight9 = yearMonthDay7.toDateMidnight(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        int int11 = mutableDateTime10.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType18 = periodType17.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime10, (org.joda.time.ReadableInstant) dateTime15, periodType18);
        int int20 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) dateTime15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(11, 184, 2022, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 184 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTime();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.withChronologyRetainFields(chronology16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay17.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.plusHours((-1));
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.withChronologyRetainFields(chronology25);
        long long28 = chronology21.set((org.joda.time.ReadablePartial) timeOfDay24, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(chronology21);
        org.joda.time.DateTime dateTime30 = dateTime11.toDateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField31 = chronology21.yearOfCentury();
        org.joda.time.DurationField durationField32 = chronology21.centuries();
        org.joda.time.DateTimeField dateTimeField33 = chronology21.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(53251426, (int) (short) 1, (int) (byte) 10, 887, 1969, 45, 12, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 887 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-86399999L) + "'", long28 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight1, readableDuration2, periodType3);
        org.joda.time.Period period7 = period5.withSeconds(0);
        org.joda.time.Period period9 = period7.plusMinutes((int) (byte) 1);
        org.joda.time.Period period11 = period7.withSeconds((int) (byte) 10);
        org.joda.time.Period period12 = period7.toPeriod();
        org.joda.time.Period period14 = period7.plusHours(58);
        org.joda.time.Period period16 = period14.plusHours(69);
        org.joda.time.Period period18 = period14.minusSeconds((int) (byte) -1);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType20 = periodType19.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) period18, periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay.Property property9 = timeOfDay4.hourOfDay();
        int int10 = property9.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = property9.setCopy("DateTimeField[clockhourOfHalfday]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[clockhourOfHalfday]\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 23 + "'", int10 == 23);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((java.lang.Object) (-125999990L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minusWeeks(47);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(2022);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minusHours(272);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField14 = localDateTime8.getField(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.addWrapField(6);
        org.joda.time.MutableDateTime mutableDateTime9 = property6.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime11 = property6.add((long) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.year();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.addWrapField(6);
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        org.joda.time.MutableDateTime mutableDateTime23 = property18.set("1", locale22);
        org.joda.time.MutableDateTime mutableDateTime25 = property18.set(23);
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period32 = period30.withPeriodType(periodType31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone35);
        org.joda.time.DateTime dateTime37 = dateTime36.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime37.toMutableDateTime();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.TimeOfDay timeOfDay41 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology40);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.TimeOfDay timeOfDay43 = timeOfDay41.withChronologyRetainFields(chronology42);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray44 = timeOfDay43.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay43.plusHours((-1));
        org.joda.time.Chronology chronology47 = timeOfDay46.getChronology();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.TimeOfDay timeOfDay50 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay50.withChronologyRetainFields(chronology51);
        long long54 = chronology47.set((org.joda.time.ReadablePartial) timeOfDay50, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay55 = new org.joda.time.TimeOfDay(chronology47);
        org.joda.time.DateTime dateTime56 = dateTime37.toDateTime(chronology47);
        org.joda.time.DateTimeField dateTimeField57 = chronology47.yearOfCentury();
        org.joda.time.DurationField durationField58 = chronology47.centuries();
        org.joda.time.DateTimeField dateTimeField59 = chronology47.dayOfYear();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 'a', (long) 7, periodType31, chronology47);
        org.joda.time.PeriodType periodType61 = periodType31.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime11, (org.joda.time.ReadableInstant) mutableDateTime25, periodType31);
        java.lang.String str63 = mutableDateTime25.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-86399999L) + "'", long54 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(periodType61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "0023-01-01T00:00:00.000Z" + "'", str63, "0023-01-01T00:00:00.000Z");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusYears((int) ' ');
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime0.toMutableDateTime();
        mutableDateTime3.setMillisOfSecond(2);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setDayOfMonth(2023);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2023 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setDayOfMonth((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        java.util.Locale locale5 = java.util.Locale.ROOT;
        org.joda.time.LocalDateTime localDateTime6 = property3.setCopy("58", locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = localDateTime6.getField((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.Period period7 = period5.plusHours((int) '#');
        org.joda.time.Period period8 = period5.toPeriod();
        org.joda.time.YearMonth yearMonth9 = yearMonth2.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.YearMonth yearMonth11 = yearMonth9.minusYears(887);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate15 = localDate13.plusWeeks(9);
        org.joda.time.Period period17 = new org.joda.time.Period((long) '4');
        org.joda.time.LocalDate localDate18 = localDate15.plus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean20 = localDate15.isSupported(dateTimeFieldType19);
        int int21 = localDate15.getDayOfWeek();
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.seconds();
        boolean boolean23 = localDate15.isSupported(durationFieldType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth25 = yearMonth9.withFieldAdded(durationFieldType22, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'seconds' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(yearMonth9);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.getLocalDateTime();
        boolean boolean7 = property3.equals((java.lang.Object) 1.0f);
        org.joda.time.LocalDateTime localDateTime9 = property3.setCopy((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears((int) 'u');
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay16.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay16.plusHours((-1));
        org.joda.time.Chronology chronology20 = timeOfDay19.getChronology();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.withChronologyRetainFields(chronology24);
        long long27 = chronology20.set((org.joda.time.ReadablePartial) timeOfDay23, (long) (byte) -1);
        org.joda.time.TimeOfDay.Property property28 = timeOfDay23.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay23.withMillisOfSecond(17);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = localDateTime11.compareTo((org.joda.time.ReadablePartial) timeOfDay30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 851L + "'", long4 == 851L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-86399999L) + "'", long27 == (-86399999L));
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(timeOfDay30);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = dateTimeFormatter2.parseLocalDate("YearDay");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight3 = property2.roundHalfEvenCopy();
        int int4 = dateMidnight3.getDayOfWeek();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int5 = localDate1.get(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate1.withDayOfYear((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withFieldAdded(durationFieldType4, 2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.dayOfYear();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight8.withDurationAdded((long) 17, 1);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight8.plus((long) 1);
        org.joda.time.YearMonthDay yearMonthDay15 = dateMidnight14.toYearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = localDateTime2.isBefore((org.joda.time.ReadablePartial) yearMonthDay15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(yearMonthDay15);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        java.time.ZoneId zoneId2 = timeZone1.toZoneId();
        int int4 = timeZone1.getOffset(0L);
        java.time.ZoneId zoneId5 = timeZone1.toZoneId();
        boolean boolean6 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        int int0 = org.joda.time.YearMonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, (long) 818);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod4 = mutablePeriod3.copy();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.yearOfCentury();
        org.joda.time.Duration duration8 = mutablePeriod4.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight6);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod12 = mutablePeriod11.copy();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.yearOfCentury();
        org.joda.time.Duration duration16 = mutablePeriod12.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight14);
        boolean boolean17 = duration8.isEqual((org.joda.time.ReadableDuration) duration16);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod21 = mutablePeriod20.copy();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.yearOfCentury();
        org.joda.time.Duration duration25 = mutablePeriod21.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight23);
        boolean boolean26 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration25);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod30 = mutablePeriod29.copy();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.yearOfCentury();
        org.joda.time.Duration duration34 = mutablePeriod30.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod41 = mutablePeriod40.copy();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.TimeOfDay timeOfDay46 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.withChronologyRetainFields(chronology47);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray49 = timeOfDay48.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay48.plusHours((-1));
        org.joda.time.Chronology chronology52 = timeOfDay51.getChronology();
        mutablePeriod40.setPeriod((long) (byte) 1, 845L, chronology52);
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(41L, chronology52);
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) '4', periodType36, chronology52);
        org.joda.time.Period period56 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration16, (org.joda.time.ReadableInstant) dateMidnight32, periodType36);
        org.joda.time.Period period57 = new org.joda.time.Period((long) 184, periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(mutablePeriod30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(mutablePeriod41);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(chronology52);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        java.lang.Appendable appendable4 = null;
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        long long9 = property8.remainder();
        org.joda.time.LocalDateTime localDateTime10 = property8.getLocalDateTime();
        boolean boolean12 = property8.equals((java.lang.Object) 1.0f);
        org.joda.time.LocalDateTime localDateTime14 = property8.setCopy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable4, (org.joda.time.ReadablePartial) localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 516L + "'", long9 == 516L);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(4, 86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.minus((long) 4);
        org.joda.time.DateTime dateTime7 = dateTime3.plusMinutes(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime3.withDayOfMonth((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(969, 52, (int) 'a', 47, 2023, 58, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.minusYears(2022);
        int int6 = localDateTime2.getCenturyOfEra();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        int int3 = localDateTime2.getCenturyOfEra();
        int int4 = localDateTime2.getCenturyOfEra();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusYears((int) (short) 0);
        int int11 = localDateTime7.getValue(2);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone14);
        int int16 = dateTime15.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime15.toDateTime(dateTimeZone18);
        org.joda.time.DateTime.Property property21 = dateTime15.weekyear();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        boolean boolean23 = localDateTime7.equals((java.lang.Object) property21);
        int int24 = localDateTime7.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime7.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusHours(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.property(dateTimeFieldType29);
        int int31 = localDateTime2.indexOf(dateTimeFieldType29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = localDateTime2.withHourOfDay((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay(2022, 7, 5, 4);
        java.util.Calendar.Builder builder6 = new java.util.Calendar.Builder();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableDuration10, (org.joda.time.ReadableInstant) mutableDateTime11);
        int[] intArray14 = chronology9.get((org.joda.time.ReadablePeriod) mutablePeriod12, (long) 100);
        java.util.Calendar.Builder builder15 = builder6.setFields(intArray14);
        java.util.Calendar.Builder builder16 = builder0.setFields(intArray14);
        java.util.Calendar.Builder builder18 = builder0.setLenient(true);
        java.util.Calendar.Builder builder23 = builder0.setTimeOfDay(11, (int) (short) 1, (int) (short) 1, (int) '#');
        java.util.Calendar.Builder builder27 = builder0.setDate(13, 14, 22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder30 = builder27.set(184, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 0, 0, 0, 0, 0, 0, 100]");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        long long15 = chronology8.set((org.joda.time.ReadablePartial) timeOfDay11, (long) (byte) -1);
        org.joda.time.TimeOfDay.Property property16 = timeOfDay11.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay18 = property16.addWrapFieldToCopy(14);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property21 = localTime20.millisOfDay();
        org.joda.time.Chronology chronology22 = localTime20.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((java.lang.Object) property16, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.TimeOfDay$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.year();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getDisplayScript();
        java.util.Locale.setDefault(locale14);
        java.lang.String str17 = locale14.getISO3Language();
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale14.getDisplayScript(locale18);
        int int20 = dateTimeField13.getMaximumShortTextLength(locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter5.withLocale(locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.parse("\u671d\u9c9c\u6587\u97e9\u56fd)", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "zho" + "'", str17, "zho");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) ' ', 4, (int) (short) 1, 1969, 17, 1975);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTime(dateTimeZone6);
        org.joda.time.DateTime.Property property9 = dateTime3.weekyear();
        org.joda.time.DateTime dateTime10 = property9.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone14);
        org.joda.time.DateTime dateTime16 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime16.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.year();
        org.joda.time.DateTimeField dateTimeField19 = property18.getField();
        long long22 = dateTimeField19.add((long) 21, (long) ' ');
        org.joda.time.DurationField durationField23 = dateTimeField19.getRangeDurationField();
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.lang.String str27 = dateTimeField19.getAsText(21, locale25);
        java.lang.String str28 = locale25.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = property9.setCopy("\u4e2d\u56fd\u8a9e", locale25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"???\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1009843200021L + "'", long22 == 1009843200021L);
        org.junit.Assert.assertNull(durationField23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "21" + "'", str27, "21");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "FRA" + "'", str28, "FRA");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        java.io.Writer writer5 = null;
        org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.parse("22");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int11 = dateTimeZone9.getOffset(0L);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean16 = dateTimeZone15.isFixed();
        org.joda.time.DateTime dateTime17 = dateTime12.toDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime7.withZone(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime19 = dateTime7.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, (org.joda.time.ReadablePartial) localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone3);
        org.joda.time.DateTime dateTime5 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusHours((-1));
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.withChronologyRetainFields(chronology19);
        long long22 = chronology15.set((org.joda.time.ReadablePartial) timeOfDay18, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology15);
        org.joda.time.DateTime dateTime24 = dateTime5.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField25 = chronology15.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) 1, chronology15);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime26.hourOfDay();
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime30 = property27.set("\u683c\u6797\u5a01\u6cbb\u65f6\u95f4", locale29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??????\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-86399999L) + "'", long22 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        java.util.Locale locale5 = java.util.Locale.ENGLISH;
        int int6 = property3.getMaximumShortTextLength(locale5);
        java.util.Locale locale9 = new java.util.Locale("hi!", "hi!");
        java.lang.String str10 = locale9.getCountry();
        java.lang.String str11 = locale5.getDisplayVariant(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((java.lang.Object) locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 478L + "'", long4 == 478L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!_HI!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!" + "'", str10, "HI!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = property3.setCopy("PT35H0.052S");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT35H0.052S\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(2027, 2922789, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2027 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        java.lang.String str4 = localTime1.toString("22");
        org.joda.time.LocalTime localTime6 = localTime1.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localTime1.toDateTimeToday(dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime1.plusMillis((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property12 = localTime1.property(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "22" + "'", str4, "22");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime10.year();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.lang.String str14 = locale13.getDisplayScript();
        java.util.Locale.setDefault(locale13);
        java.lang.String str16 = locale13.getISO3Language();
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale13.getDisplayScript(locale17);
        int int19 = dateTimeField12.getMaximumShortTextLength(locale17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter4.withLocale(locale17);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period28 = period26.withPeriodType(periodType27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone31);
        org.joda.time.DateTime dateTime33 = dateTime32.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime33.toMutableDateTime();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.withChronologyRetainFields(chronology38);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = timeOfDay39.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay42 = timeOfDay39.plusHours((-1));
        org.joda.time.Chronology chronology43 = timeOfDay42.getChronology();
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.TimeOfDay timeOfDay46 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology45);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay46.withChronologyRetainFields(chronology47);
        long long50 = chronology43.set((org.joda.time.ReadablePartial) timeOfDay46, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay51 = new org.joda.time.TimeOfDay(chronology43);
        org.joda.time.DateTime dateTime52 = dateTime33.toDateTime(chronology43);
        org.joda.time.DateTimeField dateTimeField53 = chronology43.yearOfCentury();
        org.joda.time.DurationField durationField54 = chronology43.centuries();
        org.joda.time.DateTimeField dateTimeField55 = chronology43.dayOfYear();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 'a', (long) 7, periodType27, chronology43);
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime((long) '4', chronology43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter58 = dateTimeFormatter4.withChronology(chronology43);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.TimeOfDay timeOfDay61 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology60);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay61.withChronologyRetainFields(chronology62);
        org.joda.time.DateTime dateTime64 = timeOfDay63.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay66 = timeOfDay63.minusHours((int) (byte) 1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray67 = timeOfDay63.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = dateTimeFormatter4.print((org.joda.time.ReadablePartial) timeOfDay63);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zho" + "'", str16, "zho");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray40);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-86399999L) + "'", long50 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeFormatter58);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray67);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getHourOfDay();
        java.util.Date date2 = mutableDateTime0.toDate();
        int int3 = date2.getMinutes();
        date2.setDate((int) (short) 0);
        boolean boolean7 = date2.equals((java.lang.Object) "months");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Jan 31 14:47:48 GMT 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47 + "'", int3 == 47);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime3 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime5 = localTime3.plusHours(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime5.withField(dateTimeFieldType6, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate6 = property4.roundCeilingCopy();
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.copy();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.yearOfCentury();
        org.joda.time.Duration duration7 = mutablePeriod3.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight5);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        int int9 = mutableDateTime8.getDayOfMonth();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate13 = localDate11.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int15 = localDate11.get(dateTimeFieldType14);
        mutableDateTime8.set(dateTimeFieldType14, 2);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.minutes();
        mutableDateTime8.add(durationFieldType18, (int) '4');
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight5.withFieldAdded(durationFieldType18, 17);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight5.minusWeeks(58);
        int int25 = dateMidnight24.getSecondOfMinute();
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 21 + "'", int9 == 21);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        java.lang.Integer int4 = dateTimeFormatter2.getPivotYear();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dateTimeFormatter5.parseMillis("22");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.DurationFieldType durationFieldType13 = periodType11.getFieldType(0);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone17);
        org.joda.time.DateTime dateTime19 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime20 = dateTime19.toMutableDateTime();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay23.withChronologyRetainFields(chronology24);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = timeOfDay25.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay25.plusHours((-1));
        org.joda.time.Chronology chronology29 = timeOfDay28.getChronology();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.TimeOfDay timeOfDay32 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.TimeOfDay timeOfDay34 = timeOfDay32.withChronologyRetainFields(chronology33);
        long long36 = chronology29.set((org.joda.time.ReadablePartial) timeOfDay32, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(chronology29);
        org.joda.time.DateTime dateTime38 = dateTime19.toDateTime(chronology29);
        org.joda.time.DateTimeField dateTimeField39 = chronology29.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField40 = chronology29.millisOfDay();
        org.joda.time.DurationField durationField41 = chronology29.centuries();
        org.joda.time.DurationField durationField42 = durationFieldType14.getField(chronology29);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((-86399999L), 311L, periodType11, chronology29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod(19, (int) (short) 0, 6, (int) ' ', 0, 20, 887, 20, periodType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-86399999L) + "'", long36 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(durationField42);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate6 = property4.addWrapFieldToCopy(9);
        org.joda.time.LocalDate localDate8 = localDate6.withCenturyOfEra(818);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = yearMonthDay9.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval();
        org.joda.time.Period period14 = interval13.toPeriod();
        org.joda.time.LocalDate localDate15 = localDate6.minus((org.joda.time.ReadablePeriod) period14);
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(obj16, dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.minuteOfHour();
        int int20 = localDateTime18.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.minus(readableDuration23);
        boolean boolean25 = localDateTime18.equals((java.lang.Object) dateTime24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime18.yearOfEra();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime18.plusMinutes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = localDate15.isAfter((org.joda.time.ReadablePartial) localDateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20 + "'", int20 == 20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay.Property property9 = timeOfDay4.hourOfDay();
        org.joda.time.TimeOfDay.Property property10 = timeOfDay4.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = timeOfDay4.withHourOfDay((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(11, (int) ' ');
        java.util.Date date9 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date9.setMonth(0);
        calendar0.setTime(date9);
        org.joda.time.YearMonthDay yearMonthDay13 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calendar0.get(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1970");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-93706740000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1967,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=12,DAY_OF_YEAR=12,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 12 10:21:00 GMT 1967");
        org.junit.Assert.assertNotNull(yearMonthDay13);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        long long21 = chronology14.set((org.joda.time.ReadablePartial) timeOfDay17, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(chronology14);
        org.joda.time.DateTime dateTime23 = dateTime4.toDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField24 = chronology14.millisOfDay();
        long long26 = dateTimeField24.remainder(448L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-86399999L) + "'", long21 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setTime(5, (int) (short) 100, 887, 47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate localDate5 = localDate2.withYearOfEra((int) 'u');
        org.joda.time.LocalDate.Property property6 = localDate2.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) property6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        long long6 = java.util.Date.UTC(22, 13, 2, 5, 1900, 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1480331900000L) + "'", long6 == (-1480331900000L));
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.setTimeInMillis(845L);
        java.util.TimeZone timeZone3 = null;
        calendar0.setTimeZone(timeZone3);
        int int6 = calendar0.getGreatestMinimum(9);
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone("\u610f\u5927\u5229");
        calendar0.setTimeZone(timeZone8);
        boolean boolean10 = calendar0.isWeekDateSupported();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = calendar0.getActualMaximum(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withWeekyear((int) '4');
        java.util.Date date11 = localDateTime8.toDate();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        org.joda.time.DateTime dateTime17 = timeOfDay16.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay16.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime20 = timeOfDay19.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localDateTime8.compareTo((org.joda.time.ReadablePartial) timeOfDay19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Feb 21 14:47:49 GMT 2022");
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period4 = period2.withPeriodType(periodType3);
        org.joda.time.Period period6 = period2.withDays((int) (short) 100);
        int int7 = period2.size();
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period2.toString(periodFormatter8);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0S" + "'", str9, "PT0S");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight3 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.year();
        org.joda.time.DateTimeField dateTimeField11 = property10.getField();
        long long14 = dateTimeField11.add((long) 21, (long) ' ');
        org.joda.time.DurationField durationField15 = dateTimeField11.getRangeDurationField();
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet18 = locale17.getExtensionKeys();
        java.lang.String str19 = dateTimeField11.getAsText(21, locale17);
        java.lang.String str20 = locale17.getLanguage();
        int int21 = property2.getMaximumTextLength(locale17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight23 = property2.setCopy("2022-02-21T14:47:24.813");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:47:24.813\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1009843200021L + "'", long14 == 1009843200021L);
        org.junit.Assert.assertNull(durationField15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "21" + "'", str19, "21");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "fr" + "'", str20, "fr");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(11, 58, (int) (short) 100, 999, 9, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property5 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(23);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getRangeDurationType();
        org.joda.time.DateTime.Property property10 = dateTime4.property(dateTimeFieldType8);
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField12 = property10.getField();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.minusMonths((int) (byte) 10);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.YearMonthDay yearMonthDay5 = property3.addToCopy(0);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy((int) 'u');
        java.lang.String str8 = property3.getAsShortText();
        java.lang.String str9 = property3.getName();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        java.lang.String str12 = locale11.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay13 = property3.setCopy("2022-02-21T14:47:45.908", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:47:45.908\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022" + "'", str8, "2022");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "year" + "'", str9, "year");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u610f\u5927\u5229" + "'", str12, "\u610f\u5927\u5229");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(11, (int) ' ');
        java.util.Date date9 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date9.setMonth(0);
        calendar0.setTime(date9);
        calendar0.clear();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        int int15 = mutableDateTime14.getDayOfMonth();
        org.joda.time.Instant instant16 = mutableDateTime14.toInstant();
        org.joda.time.MutableDateTime mutableDateTime17 = instant16.toMutableDateTime();
        boolean boolean18 = calendar0.equals((java.lang.Object) mutableDateTime17);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 12 10:21:00 GMT 1967");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.Object obj1 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(11, (int) ' ');
        java.util.Date date9 = new java.util.Date(58, 52, 2022, (int) (byte) 10, 21);
        date9.setMonth(0);
        calendar0.setTime(date9);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.parse("22");
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate18 = localDate16.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int20 = localDate16.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime14.withFields((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay22.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime25 = yearMonthDay22.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval26 = yearMonthDay22.toInterval();
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime14.withChronology(chronology27);
        boolean boolean29 = calendar0.equals((java.lang.Object) dateTime28);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-93706740000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1967,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=12,DAY_OF_YEAR=12,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 12 10:21:00 GMT 1967");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay6 = timeOfDay2.withSecondOfMinute(1975);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1975 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone6 = dateTime3.getZone();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusHours((-1));
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.centuryOfEra();
        org.joda.time.DurationField durationField18 = chronology15.weekyears();
        org.joda.time.DateTime dateTime19 = dateTime3.toDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField20 = chronology15.secondOfDay();
        org.joda.time.DurationField durationField21 = chronology15.millis();
        boolean boolean22 = durationField21.isPrecise();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.roundFloorCopy();
        org.joda.time.LocalTime localTime9 = property6.addCopy((int) '#');
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay();
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay10.minusMonths((int) (byte) 10);
        int int13 = yearMonthDay10.getDayOfMonth();
        java.lang.String str15 = yearMonthDay10.toString("\u610f\u5927\u5229");
        int int16 = yearMonthDay10.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        int int18 = mutableDateTime17.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int22 = dateTimeZone20.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime17.toMutableDateTime(dateTimeZone20);
        int int25 = dateTimeZone20.getOffsetFromLocal(1650865L);
        org.joda.time.DateMidnight dateMidnight26 = yearMonthDay10.toDateMidnight(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) '#', dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u610f\u5927\u5229" + "'", str15, "\u610f\u5927\u5229");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateMidnight26);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj2, dateTimeZone3);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval6 = new org.joda.time.Interval(311L, (long) 10, chronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.Period period5 = new org.joda.time.Period((long) '4');
        org.joda.time.LocalDate localDate6 = localDate3.plus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean8 = localDate3.isSupported(dateTimeFieldType7);
        int int9 = localDate3.getDayOfWeek();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        boolean boolean11 = localDate3.isSupported(durationFieldType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate3.withDayOfWeek(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        org.joda.time.LocalDate localDate6 = property5.withMaximumValue();
        org.joda.time.LocalDate localDate8 = property5.addToCopy((int) 'u');
        org.joda.time.LocalDate.Property property9 = localDate8.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int13 = dateTimeZone11.getOffset(0L);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime.Property property15 = dateTime14.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean18 = dateTimeZone17.isFixed();
        org.joda.time.DateTime dateTime19 = dateTime14.toDateTime(dateTimeZone17);
        boolean boolean20 = localDate8.equals((java.lang.Object) dateTimeZone17);
        org.joda.time.LocalDate.Property property21 = localDate8.yearOfEra();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.withChronologyRetainFields(chronology25);
        org.joda.time.DateTime dateTime27 = timeOfDay26.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay26.minusHours((int) (byte) 1);
        int int30 = timeOfDay26.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.TimeOfDay.Property property32 = timeOfDay26.property(dateTimeFieldType31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = localDate8.withField(dateTimeFieldType31, 887);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1900, 69, 1, 7, 4, 100, 14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.YearMonth yearMonth4 = org.joda.time.YearMonth.now(dateTimeZone1);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusYears((int) (short) 0);
        int int11 = localDateTime7.getValue(2);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone14);
        int int16 = dateTime15.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime15.toDateTime(dateTimeZone18);
        org.joda.time.DateTime.Property property21 = dateTime15.weekyear();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        boolean boolean23 = localDateTime7.equals((java.lang.Object) property21);
        int int24 = localDateTime7.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime7.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusHours(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.property(dateTimeFieldType29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth32 = yearMonth4.withField(dateTimeFieldType29, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(yearMonth4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = timeOfDay1.toString("12 Nov 1900 10:21:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: N");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property5 = dateTime4.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.DateTime dateTime9 = dateTime4.toDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes((int) '#');
        int int12 = dateTime9.getWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTime dateTime11 = timeOfDay10.toDateTimeToday();
        boolean boolean12 = dateTime5.isEqual((org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime11.getWeekyear();
        org.joda.time.DateTime dateTime15 = dateTime11.plusHours(4);
        org.joda.time.Period period18 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period20 = period18.withPeriodType(periodType19);
        org.joda.time.Period period22 = period18.withDays((int) (short) 100);
        org.joda.time.DateTime dateTime23 = dateTime11.minus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period25 = period18.withMillis(117);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.withChronologyRetainFields(chronology11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay12.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.plusHours((-1));
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.withChronologyRetainFields(chronology20);
        long long23 = chronology16.set((org.joda.time.ReadablePartial) timeOfDay19, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(chronology16);
        org.joda.time.DateTime dateTime25 = dateTime6.toDateTime(chronology16);
        org.joda.time.DateTimeField dateTimeField26 = chronology16.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = chronology16.weekOfWeekyear();
        long long31 = chronology16.add(0L, (long) 12, 117);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval32 = new org.joda.time.Interval((long) 19, 0L, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-86399999L) + "'", long23 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1404L + "'", long31 == 1404L);
    }
}
