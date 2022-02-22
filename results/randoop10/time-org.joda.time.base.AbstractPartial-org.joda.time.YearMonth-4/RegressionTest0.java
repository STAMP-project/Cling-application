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
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
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
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
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
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((int) (short) 0, 22, (int) ' ', chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
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
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
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
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withFieldAdded(durationFieldType5, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) 'a', (int) (byte) 1, 10, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
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
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
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
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
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
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(instant2);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.copy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.withChronologyRetainFields(chronology9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = timeOfDay10.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay10.plusHours((-1));
        org.joda.time.Chronology chronology14 = timeOfDay13.getChronology();
        mutablePeriod2.setPeriod((long) (byte) 1, 208L, chronology14);
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
            org.joda.time.Period period39 = new org.joda.time.Period((java.lang.Object) 208L, periodType18, chronology30);
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
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((java.lang.Object) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth5 = yearMonth2.withField(dateTimeFieldType3, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) '#', 22, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.millisOfDay();
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((java.lang.Object) (byte) -1, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
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
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = timeOfDay16.isSupported(dateTimeFieldType17);
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = timeOfDay16.toString("", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("PT0.099S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT0.099S\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.setPeriod((-1), 0, (int) 'a', (int) '4', 7, (int) 'x', (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int5 = localDate1.get(dateTimeFieldType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate1.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.standard();
        java.lang.String str2 = periodType1.getName();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.plusHours((-1));
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.withChronologyRetainFields(chronology21);
        long long24 = chronology17.set((org.joda.time.ReadablePartial) timeOfDay20, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(chronology17);
        org.joda.time.DateTime dateTime26 = dateTime7.toDateTime(chronology17);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 'x', periodType1, chronology17);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = chronology17.getDateTimeMillis(208L, 13, 32, 2022, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Standard" + "'", str2, "Standard");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-86399999L) + "'", long24 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        int int6 = localTime5.size();
        org.joda.time.LocalTime localTime8 = localTime5.minusSeconds(100);
        org.joda.time.LocalTime localTime10 = localTime8.minusMillis(11);
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property5 = localTime4.millisOfDay();
        java.lang.String str7 = localTime4.toString("22");
        org.joda.time.DateTime dateTime8 = localDate2.toDateTime(localTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime4.withSecondOfMinute((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22" + "'", str7, "22");
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Interval interval2 = localDate1.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDate1.getValue(58);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 58");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfYear();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType6 = null;
        boolean boolean7 = periodType5.isSupported(durationFieldType6);
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((java.lang.Object) localDate1, periodType5, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Interval interval2 = localDate1.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDate1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval2);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = mutablePeriod7.getValue(999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology8.getDateTimeMillis((int) '#', (int) (short) 10, 999, (int) (byte) 0, (int) ' ', 13, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        int int6 = localTime5.size();
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localTime5.toString("", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((java.lang.Object) locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        org.joda.time.DateTimeField dateTimeField25 = chronology14.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeField25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.field.RemainderDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.days();
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) 1, periodType5, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-86399999L) + "'", long21 == (-86399999L));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int0 = org.joda.time.YearMonthDay.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        int int6 = localTime5.size();
        org.joda.time.LocalTime localTime8 = localTime5.minusSeconds(100);
        org.joda.time.LocalTime localTime10 = localTime8.minusMillis(11);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localTime10.getValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusMinutes(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeOfDay4.toString("2022-02-22T07:09:18.698Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(0, 13, (int) (byte) 100, (int) 'a', (int) (byte) 10, (int) (byte) 0, 999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(4, (int) (short) 10, (int) '#', chronology3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = timeOfDay4.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime3.withFields((org.joda.time.ReadablePartial) localDateTime7);
        int int10 = dateTime3.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        long long6 = java.util.Date.UTC((int) (byte) 1, (int) 'a', 999, (int) (byte) 0, 100, (int) 'x');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1836080280000L) + "'", long6 == (-1836080280000L));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        // The following exception was thrown during execution in test generation
        try {
            calendar10.clear(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645570800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = dateTime4.minusYears(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime4.withEra(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = calendar10.getActualMinimum(999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645570800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.withHourOfDay(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        int int6 = localTime5.size();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj7, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusYears((int) (short) 0);
        int int13 = localDateTime9.getValue(2);
        int int14 = localDateTime9.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.withField(dateTimeFieldType15, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property18 = localTime5.property(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22 + "'", int13 == 22);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalTime localTime6 = dateTime4.toLocalTime();
        org.joda.time.DateTime dateTime8 = dateTime4.withDayOfWeek(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime4.withYearOfEra((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 22);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime6.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime8 = dateTime6.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfYear((int) '#');
        int int11 = localDateTime10.getHourOfDay();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = timeOfDay1.compareTo((org.joda.time.ReadablePartial) localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        int int4 = mutableDateTime3.getDayOfMonth();
        boolean boolean5 = dateMidnight1.isEqual((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateMidnight.Property property6 = dateMidnight1.era();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj7, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusYears((int) (short) 0);
        int int13 = localDateTime9.getValue(2);
        int int14 = localDateTime9.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime9.withField(dateTimeFieldType15, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight19 = dateMidnight1.withField(dateTimeFieldType15, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22 + "'", int13 == 22);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        org.joda.time.LocalDate.Property property6 = localDate2.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property6.setCopy("PT0S");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0S\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.Period period1 = org.joda.time.Period.years(58);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod5.copy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfCentury();
        org.joda.time.Duration duration10 = mutablePeriod6.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.YearMonth yearMonth11 = yearMonth2.minus((org.joda.time.ReadablePeriod) mutablePeriod6);
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = yearMonth2.compareTo(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(yearMonth11);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        int int3 = mutableDateTime2.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime2, (org.joda.time.ReadableInstant) dateTime7, periodType10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(208L, (long) 100, periodType10, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType15 = periodType10.getFieldType(999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.copy();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.yearOfCentury();
        org.joda.time.Duration duration7 = mutablePeriod3.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = dateMidnight5.toString(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-22T00:00:00.000Z" + "'", str9, "2022-02-22T00:00:00.000Z");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = timeZone0.getDisplayName(locale2);
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Koordinierte Universalzeit" + "'", str3, "Koordinierte Universalzeit");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        int int17 = dateTimeField16.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField16.set((long) (short) 0, "PT0.001S");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0.001S\" for millisOfSecond is not supported");
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
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 999 + "'", int17 == 999);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int int0 = org.joda.time.YearMonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight3 = property2.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = property2.setCopy("2022-02-22T07:09:21.203Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T07:09:21.203Z\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight3);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        int int4 = yearMonth2.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = yearMonth2.getFieldType(1969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weeks();
        boolean boolean5 = localDate3.isSupported(durationFieldType4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate3.withDayOfMonth((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology8.era();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField17.add((long) 1, (long) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.withChronologyRetainFields(chronology4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = timeOfDay5.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.plusHours((-1));
        org.joda.time.Chronology chronology9 = timeOfDay8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) 58, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) mutableDateTime1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMonthOfYear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("yearOfCentury");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"yearOfCentury\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        org.joda.time.DateMidnight.Property property24 = dateMidnight1.weekOfWeekyear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.withChronologyRetainFields(chronology28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = timeOfDay29.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.plusHours((-1));
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) property24, chronology33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateMidnight$Property");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = dateTime4.minusYears(100);
        org.joda.time.DateTime.Property property8 = dateTime4.dayOfMonth();
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTime4.toString("Standard", locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.DateTime dateTime7 = dateTime5.plusYears((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime5.withDate((int) 'u', 22, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        org.joda.time.LocalDate localDate7 = localDate2.minusDays(7);
        org.joda.time.LocalDate localDate9 = localDate2.minusDays(2);
        org.joda.time.DateTime dateTime10 = localDate2.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate2.withWeekOfWeekyear(58);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.plusHours((-1));
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.withChronologyRetainFields(chronology21);
        long long24 = chronology17.set((org.joda.time.ReadablePartial) timeOfDay20, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(chronology17);
        org.joda.time.DateTime dateTime26 = dateTime7.toDateTime(chronology17);
        org.joda.time.DateTimeField dateTimeField27 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField28 = chronology17.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay((int) (short) 0, 58, (int) (short) 1, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-86399999L) + "'", long24 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusMillis((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.withMinuteOfHour(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Interval interval2 = localDate1.toInterval();
        org.joda.time.MutableInterval mutableInterval3 = interval2.toMutableInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, readableDuration6, periodType7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withChronologyRetainFields(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.plusHours((-1));
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.withChronologyRetainFields(chronology22);
        long long25 = chronology18.set((org.joda.time.ReadablePartial) timeOfDay21, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField26 = chronology18.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight5.withChronology(chronology18);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusWeeks((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval30 = interval2.withStart((org.joda.time.ReadableInstant) dateMidnight29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(mutableInterval3);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-86399999L) + "'", long25 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(dateMidnight29);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(4, 999, 6, 69, (int) '4', (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        long long27 = dateTimeField24.add((-1L), (long) 11);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime31.withTimeAtStartOfDay();
        java.lang.Object obj33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(obj33, dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.secondOfMinute();
        org.joda.time.DateTime dateTime37 = dateTime31.withFields((org.joda.time.ReadablePartial) localDateTime35);
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
        org.joda.time.PeriodType periodType57 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType58 = null;
        boolean boolean59 = periodType57.isSupported(durationFieldType58);
        org.joda.time.Period period60 = new org.joda.time.Period((long) (byte) 1, 0L, periodType57);
        int[] intArray63 = chronology47.get((org.joda.time.ReadablePeriod) period60, (long) 2022, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray65 = dateTimeField24.addWrapPartial((org.joda.time.ReadablePartial) localDateTime35, 69, intArray63, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 69");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 347155199999L + "'", long27 == 347155199999L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-86399999L) + "'", long54 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray63), "[0, 0, 0, 0, 0, -1, -990]");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
        org.joda.time.Period period14 = period7.withField(durationFieldType12, 7);
        org.joda.time.Period period16 = period7.minusDays(0);
        org.joda.time.Seconds seconds17 = period7.toStandardSeconds();
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(seconds17);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("DateTimeField[millisOfSecond]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Interval interval2 = localDate1.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate1.withMonthOfYear(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval2);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology8.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = chronology8.getDateTimeMillis(8, (int) 'x', (int) '#', 2, 0, 10, 99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        int int5 = dateTimeField3.getLeapAmount((long) 1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusYears((int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withChronologyRetainFields(chronology6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusHours((-1));
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        long long18 = chronology11.set((org.joda.time.ReadablePartial) timeOfDay14, (long) (byte) -1);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = periodType21.isSupported(durationFieldType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 1, 0L, periodType21);
        int[] intArray27 = chronology11.get((org.joda.time.ReadablePeriod) period24, (long) 2022, (long) ' ');
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((java.lang.Object) dateTime0, chronology11);
        int int29 = dateTime0.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = dateTime0.withHourOfDay((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-86399999L) + "'", long18 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
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
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(chronology20);
        org.joda.time.DateTime dateTime29 = dateTime10.toDateTime(chronology20);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone32);
        org.joda.time.Chronology chronology34 = chronology20.withZone(dateTimeZone32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(4, 2, 99, (int) (short) 1, (int) (byte) -1, (int) '4', dateTimeZone32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-86399999L) + "'", long27 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(chronology34);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.MutableDateTime mutableDateTime9 = property6.set(5);
        mutableDateTime9.setWeekyear(10);
        mutableDateTime9.addWeekyears(1969);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withDayOfMonth((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone33);
        org.joda.time.Chronology chronology35 = chronology21.withZone(dateTimeZone33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((int) (byte) 1, 6, (int) (short) 10, 58, 53, (int) (byte) 1, (int) (short) -1, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology35);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = yearMonth0.withYear(7);
        org.joda.time.YearMonth.Property property3 = yearMonth2.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = yearMonth2.getFieldType(6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.withChronologyRetainFields(chronology11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay12.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay12.plusHours((-1));
        org.joda.time.Chronology chronology16 = timeOfDay15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType7.getField(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((java.lang.Object) property6, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.yearOfCentury();
        org.joda.time.LocalDate localDate5 = localDateTime2.toLocalDate();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.year();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        org.joda.time.MutableDateTime mutableDateTime15 = property12.set(5);
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        int int17 = property12.getMaximumTextLength(locale16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property3.setCopy("Standard", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Standard\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 988L + "'", long4 == 988L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.plusHours((-1));
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.withChronologyRetainFields(chronology21);
        long long24 = chronology17.set((org.joda.time.ReadablePartial) timeOfDay20, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(chronology17);
        org.joda.time.DateTime dateTime26 = dateTime7.toDateTime(chronology17);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone29);
        org.joda.time.Chronology chronology31 = chronology17.withZone(dateTimeZone29);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((int) (byte) 0, 69, (int) (byte) 100, dateTimeZone29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-86399999L) + "'", long24 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology31);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours((int) (short) 10);
        org.joda.time.LocalTime localTime5 = localTime1.minusMinutes((int) '4');
        java.util.Locale locale7 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localTime5.toString("1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
            int int18 = timeOfDay16.getValue((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = yearMonth0.withYear(7);
        org.joda.time.YearMonth.Property property3 = yearMonth2.year();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        boolean boolean6 = dateTimeField4.isLeap((long) 2022);
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("PT0.001S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=pt0.001s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(69, (int) (byte) 1, 10, (int) '4', (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        int int15 = mutablePeriod12.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod12.setValue(54, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 292278993, (long) 999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.clear();
        calendar0.setFirstDayOfWeek((int) (byte) 0);
        java.lang.Object obj4 = calendar0.clone();
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.hours();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime0.setZone(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        int int11 = mutableDateTime10.getDayOfMonth();
        org.joda.time.Instant instant12 = mutableDateTime10.toInstant();
        boolean boolean14 = mutableDateTime10.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int18 = dateTimeZone16.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime10.setZone(dateTimeZone16);
        long long21 = dateTimeZone16.previousTransition((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime0.toMutableDateTime(dateTimeZone16);
        mutableDateTime22.setMillisOfSecond(11);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone27);
        org.joda.time.DateTime dateTime29 = dateTime28.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime29.toMutableDateTime();
        org.joda.time.LocalTime localTime31 = dateTime29.toLocalTime();
        org.joda.time.DateTime dateTime33 = dateTime29.withDayOfWeek(2);
        org.joda.time.DateTime dateTime35 = dateTime29.minusMonths((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval36 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime22, (org.joda.time.ReadableInstant) dateTime35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        calendar10.set(7, (int) (short) 0, 2022);
        java.lang.String str15 = calendar10.getCalendarType();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar10);
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(obj19, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.secondOfMinute();
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.lang.String str25 = localDateTime21.toString("22", locale24);
        java.lang.String str26 = locale24.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap27 = calendar10.getDisplayNames(9, (int) '#', locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-61771769999999,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=12,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=196,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "gregory" + "'", str15, "gregory");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "22" + "'", str25, "22");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fr" + "'", str26, "fr");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property5 = dateTime4.dayOfMonth();
        long long6 = property5.remainder();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 25767315L + "'", long6 == 25767315L);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("-0001-02-23T07:09:19.011", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=-0001-02-23t07:09:19.011");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        int int7 = localDateTime2.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withField(dateTimeFieldType8, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        boolean boolean11 = calendar10.isLenient();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645570800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.minuteOfHour();
        int int9 = property3.compareTo((org.joda.time.ReadablePartial) localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime7.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 642L + "'", long4 == 642L);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("PeriodType[YearMonthDayTime]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[YearMonthDayTime]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withYear((int) 'u');
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = property4.setCopy("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(chronology8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = timeOfDay9.toString("zho", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear((int) '#');
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMonthOfYear(13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withCenturyOfEra((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod9.copy();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.yearOfCentury();
        org.joda.time.Duration duration14 = mutablePeriod10.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight12);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod18 = mutablePeriod17.copy();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.yearOfCentury();
        org.joda.time.Duration duration22 = mutablePeriod18.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight20);
        boolean boolean23 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.Duration duration24 = duration22.toDuration();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight6, (org.joda.time.ReadableDuration) duration22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight27 = dateMidnight6.withMonthOfYear(17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration24);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) 'u');
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone1);
        java.lang.String str5 = localTime4.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "07:09:28.341" + "'", str5, "07:09:28.341");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(0, (int) 'a', 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalTime localTime6 = dateTime4.toLocalTime();
        org.joda.time.DateTime dateTime8 = dateTime4.withDayOfWeek(2);
        org.joda.time.DateTime dateTime10 = dateTime4.minusMonths((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime10.withDate(69, 13, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = yearMonth0.withYear(7);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) -1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.minusYears(1);
        org.joda.time.LocalDate.Property property8 = localDate5.year();
        int int9 = localDate5.getYearOfEra();
        org.joda.time.LocalDate localDate11 = localDate5.minusWeeks(32);
        org.joda.time.LocalDate localDate13 = localDate11.plusYears(999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) yearMonth2, (org.joda.time.ReadablePartial) localDate13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1969 + "'", int9 == 1969);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod6.copy();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withChronologyRetainFields(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.plusHours((-1));
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        mutablePeriod6.setPeriod((long) (byte) 1, 208L, chronology18);
        mutablePeriod2.setPeriod((long) 4, chronology18);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime24 = localTime22.plusHours((int) (short) 10);
        long long26 = chronology18.set((org.joda.time.ReadablePartial) localTime24, (long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int28 = localTime24.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-50399999L) + "'", long26 == (-50399999L));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        org.joda.time.DurationField durationField25 = chronology14.days();
        long long28 = durationField25.getMillis((long) 13, 0L);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1123200000L + "'", long28 == 1123200000L);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = charSet1.add((java.lang.Character) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet1);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfDay();
        org.joda.time.LocalTime localTime10 = property8.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime11 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime5, (org.joda.time.ReadablePartial) localTime11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime5.withMillisOfSecond((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth2 = org.joda.time.YearMonth.parse("DateTimeField[yearOfCentury]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.util.Date date1 = new java.util.Date((long) 6);
        org.joda.time.YearMonth yearMonth2 = org.joda.time.YearMonth.fromDateFields(date1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth5 = yearMonth2.withFieldAdded(durationFieldType3, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weeks' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property9 = timeOfDay7.property(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        calendar10.set(7, (int) (short) 0, 2022);
        java.lang.String str15 = calendar10.getCalendarType();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar10);
        // The following exception was thrown during execution in test generation
        try {
            calendar10.roll(70, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-61771769999999,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=12,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=196,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "gregory" + "'", str15, "gregory");
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone0.getDisplayName(false, 1969);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 1969");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        java.lang.String[] strArray38 = new java.lang.String[] { "PT0.099S", "22", "PeriodType[YearMonthDayTime]", "hi!", "PT0S", "2022-02-22T07:09:21.203Z", "7", "2022-02-22T07:09:21.203Z", "22", "\u5fb7\u56fd", "22", "Standard", "zho", "UTC", "DateTimeField[millisOfSecond]", "zho", "22", "hi!", "-0001-02-23T07:09:19.011", "PeriodType[YearMonthDayTime]", "DateTimeField[yearOfCentury]", "DateTimeField[yearOfCentury]", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.Locale.FilteringMode filteringMode41 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList39, filteringMode41);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean46 = dateTimeZone44.isStandardOffset((long) 'u');
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(dateTimeZone44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight((java.lang.Object) strList42, dateTimeZone44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.ArrayList");
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
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + filteringMode41 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode41.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime0.setZone(dateTimeZone6);
        java.util.TimeZone timeZone10 = dateTimeZone6.toTimeZone();
        int int11 = timeZone10.getRawOffset();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod5.copy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfCentury();
        org.joda.time.Duration duration10 = mutablePeriod6.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.YearMonth yearMonth11 = yearMonth2.minus((org.joda.time.ReadablePeriod) mutablePeriod6);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        boolean boolean16 = periodType14.isSupported(durationFieldType15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 1, 0L, periodType14);
        java.lang.String str18 = period17.toString();
        org.joda.time.YearMonth yearMonth19 = yearMonth11.minus((org.joda.time.ReadablePeriod) period17);
        int int20 = yearMonth19.getYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0.001S" + "'", str18, "PT0.001S");
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        calendar10.set(4, 99);
        // The following exception was thrown during execution in test generation
        try {
            calendar10.clear((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=99,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withWeekyear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localDateTime10.toString(dateTimeFormatter11);
        int int13 = localDateTime10.getWeekOfWeekyear();
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.lang.String str16 = locale15.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localDateTime10.toString("PT0.001S", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-0001-02-23T07:09:29.590" + "'", str12, "-0001-02-23T07:09:29.590");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.withChronologyRetainFields(chronology4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = timeOfDay5.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.plusHours((-1));
        org.joda.time.Chronology chronology9 = timeOfDay8.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) filteringMode0, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale$FilteringMode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withYear((int) 'u');
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        int int5 = localDateTime3.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDateTime3.getFieldType(69);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 69");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (short) -1, chronology18);
        org.joda.time.LocalDate localDate21 = localDate19.minusYears(1);
        org.joda.time.LocalDate.Property property22 = localDate19.year();
        org.joda.time.LocalDate.Property property23 = localDate19.dayOfYear();
        int int24 = localDate19.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int26 = localDate19.get(dateTimeFieldType25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property27 = timeOfDay16.property(dateTimeFieldType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
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
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1969 + "'", int24 == 1969);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 31 + "'", int26 == 31);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        int int9 = dateTime8.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime8.withTime((-1), 292278993, 53, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfDay();
        org.joda.time.LocalTime localTime10 = property8.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime11 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime5, (org.joda.time.ReadablePartial) localTime11);
        org.joda.time.LocalTime localTime15 = localTime5.plusHours((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = localTime15.withMinuteOfHour((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        int int4 = mutableDateTime3.getDayOfMonth();
        boolean boolean5 = dateMidnight1.isEqual((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateMidnight.Property property6 = dateMidnight1.era();
        org.joda.time.DateMidnight dateMidnight7 = property6.withMaximumValue();
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.era();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.withMillis((long) 53);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(obj11, dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minus((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod23 = mutablePeriod22.copy();
        mutablePeriod18.add((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType29 = periodType28.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight26, readableDuration27, periodType28);
        org.joda.time.Period period32 = period30.withSeconds(0);
        boolean boolean33 = mutablePeriod23.equals((java.lang.Object) period30);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight10, (org.joda.time.ReadablePeriod) mutablePeriod23);
        mutablePeriod23.setPeriod(32769, (int) 'u', (int) '4', 54, 1970, 53, (-1), 54);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (short) 10, 17, (int) '4', (int) 'u', 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfDay();
        org.joda.time.LocalTime localTime20 = property18.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime21 = property18.roundHalfFloorCopy();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24, periodType25);
        org.joda.time.Period period29 = period27.withSeconds(0);
        org.joda.time.Period period31 = period29.plusMinutes((int) (byte) 1);
        org.joda.time.Period period33 = period29.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period36 = period29.withField(durationFieldType34, 7);
        org.joda.time.LocalTime localTime38 = localTime21.withPeriodAdded((org.joda.time.ReadablePeriod) period29, (int) (short) 1);
        org.joda.time.Period period40 = period29.withMillis((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay11.minus((org.joda.time.ReadablePeriod) period29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay43 = timeOfDay11.withHourOfDay(31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(timeOfDay41);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("fr");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.monthOfYear();
        org.joda.time.Chronology chronology5 = mutableDateTime3.getChronology();
        mutableDateTime3.setWeekyear(4);
        org.joda.time.Chronology chronology8 = mutableDateTime3.getChronology();
        boolean boolean9 = calendar2.equals((java.lang.Object) mutableDateTime3);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645513770343,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=30,MILLISECOND=343,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth(dateTimeZone2);
        int int4 = yearMonth3.getYear();
        int int5 = yearMonth3.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = org.joda.time.Period.fieldDifference(readablePartial0, (org.joda.time.ReadablePartial) yearMonth3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        int int17 = mutableDateTime16.getDayOfMonth();
        org.joda.time.Instant instant18 = mutableDateTime16.toInstant();
        boolean boolean20 = mutableDateTime16.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int24 = dateTimeZone22.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime16.setZone(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = timeOfDay11.toDateTimeToday(dateTimeZone22);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight28.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime32 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) dateMidnight28);
        java.util.Locale locale34 = java.util.Locale.CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = timeOfDay11.toString("Standard", locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusYears((int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withChronologyRetainFields(chronology6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusHours((-1));
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        long long18 = chronology11.set((org.joda.time.ReadablePartial) timeOfDay14, (long) (byte) -1);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = periodType21.isSupported(durationFieldType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 1, 0L, periodType21);
        int[] intArray27 = chronology11.get((org.joda.time.ReadablePeriod) period24, (long) 2022, (long) ' ');
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((java.lang.Object) dateTime0, chronology11);
        org.joda.time.DurationField durationField29 = chronology11.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = durationField29.add(1969L, (long) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-86399999L) + "'", long18 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.ReadableInterval readableInterval3 = null;
        mutablePeriod2.add(readableInterval3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Duration duration10 = mutablePeriod2.toDurationTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateTime dateTime15 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.year();
        org.joda.time.Chronology chronology18 = mutableDateTime16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.withChronologyRetainFields(chronology28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = timeOfDay29.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.plusHours((-1));
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.withChronologyRetainFields(chronology37);
        long long40 = chronology33.set((org.joda.time.ReadablePartial) timeOfDay36, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(chronology33);
        org.joda.time.DateTime dateTime42 = dateTime23.toDateTime(chronology33);
        mutableDateTime16.setMillis((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearDay();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration10, (org.joda.time.ReadableInstant) mutableDateTime16, periodType44);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime16.setDate(22, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-86399999L) + "'", long40 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(periodType44);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(2023, 0, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2023 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = dateTimeFormatter2.parseLocalDate("1969-12-24");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfYear();
        org.joda.time.LocalDate localDate6 = property4.setCopy((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property4.setCopy((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        java.lang.String str8 = property6.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.standard();
        java.lang.String str2 = periodType1.getName();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone5);
        org.joda.time.DateTime dateTime7 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime7.toMutableDateTime();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.plusHours((-1));
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.withChronologyRetainFields(chronology21);
        long long24 = chronology17.set((org.joda.time.ReadablePartial) timeOfDay20, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(chronology17);
        org.joda.time.DateTime dateTime26 = dateTime7.toDateTime(chronology17);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 'x', periodType1, chronology17);
        org.joda.time.DateTimeField dateTimeField28 = chronology17.monthOfYear();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property31 = localTime30.millisOfDay();
        int[] intArray36 = new int[] { 32, (short) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = dateTimeField28.add((org.joda.time.ReadablePartial) localTime30, 70, intArray36, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Standard" + "'", str2, "Standard");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-86399999L) + "'", long24 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[32, 0, 32]");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(5, 17, 11, 0, (int) (short) 0, 2022, 99, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        java.lang.String str4 = localTime1.toString("22");
        org.joda.time.DateTimeField dateTimeField6 = localTime1.getField(2);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "22" + "'", str4, "22");
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("fr");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.lang.String str5 = locale4.getDisplayScript();
        java.util.Locale.setDefault(locale4);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(locale4);
        int int8 = calendar2.compareTo(calendar7);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645513771261,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=31,MILLISECOND=261,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645513771261,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=31,MILLISECOND=261,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = yearMonth0.minusMonths(6);
        java.lang.String str3 = yearMonth0.toString();
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(obj4, dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusYears((int) (short) 0);
        int int10 = localDateTime6.getValue(2);
        int int11 = localDateTime6.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime6.withField(dateTimeFieldType12, 32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth.Property property15 = yearMonth0.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02" + "'", str3, "2022-02");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        int int17 = dateTimeField16.getMaximumValue();
        long long19 = dateTimeField16.roundHalfEven(324L);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 999 + "'", int17 == 999);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 324L + "'", long19 == 324L);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        int int17 = dateTimeField16.getMaximumValue();
        long long19 = dateTimeField16.roundHalfEven(0L);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 999 + "'", int17 == 999);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime0.setZone(dateTimeZone6);
        mutableDateTime0.setDate((long) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight3 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime9 = dateTime7.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfYear(2);
        int int12 = property2.compareTo((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTime dateTime14 = dateTime9.withMillisOfSecond(999);
        org.joda.time.DateTime dateTime16 = dateTime9.minusYears(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfDay();
        org.joda.time.LocalTime localTime20 = property18.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime21 = property18.roundHalfFloorCopy();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24, periodType25);
        org.joda.time.Period period29 = period27.withSeconds(0);
        org.joda.time.Period period31 = period29.plusMinutes((int) (byte) 1);
        org.joda.time.Period period33 = period29.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period36 = period29.withField(durationFieldType34, 7);
        org.joda.time.LocalTime localTime38 = localTime21.withPeriodAdded((org.joda.time.ReadablePeriod) period29, (int) (short) 1);
        org.joda.time.Period period40 = period29.withMillis((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay11.minus((org.joda.time.ReadablePeriod) period29);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray42 = timeOfDay41.getFieldTypes();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray42);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime2.monthOfYear();
        org.joda.time.Chronology chronology4 = mutableDateTime2.getChronology();
        mutableDateTime2.setWeekyear(4);
        org.joda.time.Chronology chronology7 = mutableDateTime2.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(100L, (-1836080280000L), chronology7);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Interval interval11 = localDate10.toInterval();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Interval interval14 = localDate13.toInterval();
        org.joda.time.MutableInterval mutableInterval15 = interval14.toMutableInterval();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Interval interval18 = localDate17.toInterval();
        boolean boolean19 = interval14.isBefore((org.joda.time.ReadableInterval) interval18);
        org.joda.time.MutableInterval mutableInterval20 = interval18.toMutableInterval();
        boolean boolean21 = interval11.isBefore((org.joda.time.ReadableInterval) mutableInterval20);
        boolean boolean22 = mutablePeriod8.equals((java.lang.Object) mutableInterval20);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod8.setValue((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mutableInterval20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.add(70, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645513771853,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=31,MILLISECOND=853,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.years();
        long long12 = durationField9.subtract((long) 69, 10);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-315619199931L) + "'", long12 == (-315619199931L));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        int int4 = localDate2.getYear();
        java.util.Locale locale6 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDate2.toString("PT0.001S", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1969 + "'", int4 == 1969);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = yearMonth0.withYear(7);
        org.joda.time.YearMonth.Property property3 = yearMonth2.year();
        org.joda.time.YearMonth yearMonth5 = yearMonth2.minusMonths(1970);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.year();
        org.joda.time.Chronology chronology13 = mutableDateTime11.getChronology();
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
        mutableDateTime11.setMillis((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str40 = dateTimeFieldType39.toString();
        int int41 = mutableDateTime11.get(dateTimeFieldType39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth.Property property42 = yearMonth2.property(dateTimeFieldType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(chronology13);
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
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "yearOfCentury" + "'", str40, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 70 + "'", int41 == 70);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth6 = new org.joda.time.YearMonth(dateTimeZone5);
        int int7 = yearMonth6.getYear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, (org.joda.time.ReadablePartial) yearMonth6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType3 = null;
        boolean boolean4 = periodType2.isSupported(durationFieldType3);
        org.joda.time.Period period5 = new org.joda.time.Period((long) (byte) 1, 0L, periodType2);
        java.lang.String str6 = period5.toString();
        org.joda.time.Period period8 = period5.plusMillis(1970);
        int int9 = period5.getYears();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.001S" + "'", str6, "PT0.001S");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType3 = null;
        boolean boolean4 = periodType2.isSupported(durationFieldType3);
        org.joda.time.Period period5 = new org.joda.time.Period((long) (byte) 1, 0L, periodType2);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod9 = mutablePeriod8.copy();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay16.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay16.plusHours((-1));
        org.joda.time.Chronology chronology20 = timeOfDay19.getChronology();
        mutablePeriod8.setPeriod((long) (byte) 1, 208L, chronology20);
        boolean boolean22 = periodType2.equals((java.lang.Object) chronology20);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = chronology20.getDateTimeMillis(8, 3, (int) (short) 100, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(mutablePeriod9);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 2);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours((int) (short) 10);
        org.joda.time.LocalTime localTime5 = localTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = localTime1.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime6.withDate(31, 12, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime();
        int int5 = mutableDateTime4.getDayOfMonth();
        org.joda.time.Instant instant6 = mutableDateTime4.toInstant();
        boolean boolean8 = mutableDateTime4.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int12 = dateTimeZone10.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime4.setZone(dateTimeZone10);
        mutableDateTime4.setMillisOfDay((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean19 = dateTimeZone17.isStandardOffset((long) 'u');
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone17);
        mutableDateTime4.setZone(dateTimeZone17);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime4.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean26 = dateTimeZone24.isStandardOffset((long) 'u');
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone24);
        mutableDateTime4.setZone(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, (org.joda.time.ReadableInstant) mutableDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = periodType18.isSupported(durationFieldType19);
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) 1, 0L, periodType18);
        int[] intArray24 = chronology8.get((org.joda.time.ReadablePeriod) period21, (long) 2022, (long) ' ');
        org.joda.time.DateTimeField dateTimeField25 = chronology8.dayOfWeek();
        java.lang.String str27 = dateTimeField25.getAsText((long) 'x');
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u661f\u671f\u56db" + "'", str27, "\u661f\u671f\u56db");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusYears((int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withChronologyRetainFields(chronology6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusHours((-1));
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        long long18 = chronology11.set((org.joda.time.ReadablePartial) timeOfDay14, (long) (byte) -1);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = periodType21.isSupported(durationFieldType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 1, 0L, periodType21);
        int[] intArray27 = chronology11.get((org.joda.time.ReadablePeriod) period24, (long) 2022, (long) ' ');
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((java.lang.Object) dateTime0, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.withDayOfMonth((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-86399999L) + "'", long18 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 0, -1, -990]");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.Instant instant4 = instant2.plus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        int int6 = mutableDateTime5.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime5, (org.joda.time.ReadableInstant) dateTime10, periodType13);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod18 = mutablePeriod17.copy();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.yearOfCentury();
        org.joda.time.Duration duration22 = mutablePeriod18.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight20);
        mutablePeriod14.setPeriod((org.joda.time.ReadableDuration) duration22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant2, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int28 = dateTimeZone26.getOffset(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((java.lang.Object) duration22, dateTimeZone26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Duration");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.minuteOfHour();
        int int9 = property3.compareTo((org.joda.time.ReadablePartial) localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property3.setCopy("07:09:28.341");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"07:09:28.341\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 211L + "'", long4 == 211L);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.standard();
        java.lang.String str8 = periodType7.getName();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone11);
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTime();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withChronologyRetainFields(chronology18);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = timeOfDay19.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay19.plusHours((-1));
        org.joda.time.Chronology chronology23 = timeOfDay22.getChronology();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay26.withChronologyRetainFields(chronology27);
        long long30 = chronology23.set((org.joda.time.ReadablePartial) timeOfDay26, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(chronology23);
        org.joda.time.DateTime dateTime32 = dateTime13.toDateTime(chronology23);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 'x', periodType7, chronology23);
        org.joda.time.DateTimeField dateTimeField34 = chronology23.hourOfHalfday();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(867L, chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((int) (byte) 100, 11, 0, (int) (byte) -1, (int) (short) -1, chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Standard" + "'", str8, "Standard");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-86399999L) + "'", long30 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeField34);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        int int2 = localDate1.getMonthOfYear();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property5 = localTime4.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        long long8 = dateTimeField6.roundHalfEven((long) 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = dateTimeField6.getType();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate1.get(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 6L + "'", long8 == 6L);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.setCopy((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime4.getValue(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 31");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusMillis((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.plusHours((-1));
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType8.getField(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = timeOfDay7.withField(dateTimeFieldType8, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        int int15 = mutablePeriod12.getMillis();
        mutablePeriod12.add(32769, (-1), 1970, 999, (int) '#', 5, (int) (short) 1, 2023);
        mutablePeriod12.addYears(0);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 99 + "'", int15 == 99);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth4 = org.joda.time.YearMonth.parse("1", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.ReadableInterval readableInterval3 = null;
        mutablePeriod2.add(readableInterval3);
        org.joda.time.format.PeriodFormatter periodFormatter5 = null;
        java.lang.String str6 = mutablePeriod2.toString(periodFormatter5);
        int int8 = mutablePeriod2.getValue(6);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.099S" + "'", str6, "PT0.099S");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime8 = dateTime6.minusYears((int) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.plusHours((-1));
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.withChronologyRetainFields(chronology21);
        long long24 = chronology17.set((org.joda.time.ReadablePartial) timeOfDay20, (long) (byte) -1);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType28 = null;
        boolean boolean29 = periodType27.isSupported(durationFieldType28);
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 1, 0L, periodType27);
        int[] intArray33 = chronology17.get((org.joda.time.ReadablePeriod) period30, (long) 2022, (long) ' ');
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((java.lang.Object) dateTime6, chronology17);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 1, chronology17);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod43 = mutablePeriod42.copy();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.TimeOfDay timeOfDay48 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.withChronologyRetainFields(chronology49);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = timeOfDay50.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay50.plusHours((-1));
        org.joda.time.Chronology chronology54 = timeOfDay53.getChronology();
        mutablePeriod42.setPeriod((long) (byte) 1, 208L, chronology54);
        mutablePeriod38.setPeriod((long) 4, chronology54);
        mutablePeriod35.setPeriod((org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod63 = mutablePeriod62.copy();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.TimeOfDay timeOfDay68 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology67);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.TimeOfDay timeOfDay70 = timeOfDay68.withChronologyRetainFields(chronology69);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray71 = timeOfDay70.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay73 = timeOfDay70.plusHours((-1));
        org.joda.time.Chronology chronology74 = timeOfDay73.getChronology();
        mutablePeriod62.setPeriod((long) (byte) 1, 208L, chronology74);
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime((long) 5, chronology74);
        mutablePeriod38.add((long) 32772, chronology74);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime78 = new org.joda.time.DateTime(17, 22, 1969, (int) 'a', 2022, chronology74);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-86399999L) + "'", long24 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(mutablePeriod63);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertNotNull(timeOfDay70);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray71);
        org.junit.Assert.assertNotNull(timeOfDay73);
        org.junit.Assert.assertNotNull(chronology74);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(obj3, dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusYears((int) (short) 0);
        int int9 = localDateTime5.getValue(2);
        int int10 = localDateTime5.getHourOfDay();
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        java.lang.String str9 = periodType8.getName();
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
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 'x', periodType8, chronology24);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology24);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(365, 13, (int) '4', 70, 100, 32769, 19, chronology24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Standard" + "'", str9, "Standard");
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
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("-0001-02-23T07:09:27.524");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"-0001-02-23T07:09:27.524\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = timeOfDay2.toString(dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.parse("zho", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        int int17 = dateTimeField16.getMaximumValue();
        org.joda.time.YearMonth yearMonth18 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth20 = yearMonth18.minusMonths(6);
        java.lang.String str21 = yearMonth18.toString();
        int[] intArray24 = new int[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = dateTimeField16.addWrapField((org.joda.time.ReadablePartial) yearMonth18, 58, intArray24, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 58");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 999 + "'", int17 == 999);
        org.junit.Assert.assertNotNull(yearMonth18);
        org.junit.Assert.assertNotNull(yearMonth20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022-02" + "'", str21, "2022-02");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[10]");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.Locale locale0 = java.util.Locale.ENGLISH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getFirstDayOfWeek();
        boolean boolean3 = calendar1.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645513774104,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=34,MILLISECOND=104,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((java.lang.Object) property2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime0.setZone(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime();
        int int11 = mutableDateTime10.getDayOfMonth();
        org.joda.time.Instant instant12 = mutableDateTime10.toInstant();
        boolean boolean14 = mutableDateTime10.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int18 = dateTimeZone16.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime10.setZone(dateTimeZone16);
        long long21 = dateTimeZone16.previousTransition((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime0.toMutableDateTime(dateTimeZone16);
        mutableDateTime22.setMillisOfSecond(11);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.ReadableInterval readableInterval28 = null;
        mutablePeriod27.add(readableInterval28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone32);
        org.joda.time.DateTime dateTime34 = dateTime33.withTimeAtStartOfDay();
        org.joda.time.Duration duration35 = mutablePeriod27.toDurationTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone38);
        org.joda.time.DateTime dateTime40 = dateTime39.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime40.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property42 = mutableDateTime41.year();
        org.joda.time.Chronology chronology43 = mutableDateTime41.getChronology();
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone46);
        org.joda.time.DateTime dateTime48 = dateTime47.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime49 = dateTime48.toMutableDateTime();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.TimeOfDay timeOfDay52 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay52.withChronologyRetainFields(chronology53);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray55 = timeOfDay54.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay54.plusHours((-1));
        org.joda.time.Chronology chronology58 = timeOfDay57.getChronology();
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.TimeOfDay timeOfDay61 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology60);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay61.withChronologyRetainFields(chronology62);
        long long65 = chronology58.set((org.joda.time.ReadablePartial) timeOfDay61, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay66 = new org.joda.time.TimeOfDay(chronology58);
        org.joda.time.DateTime dateTime67 = dateTime48.toDateTime(chronology58);
        mutableDateTime41.setMillis((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.PeriodType periodType69 = org.joda.time.PeriodType.yearDay();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration35, (org.joda.time.ReadableInstant) mutableDateTime41, periodType69);
        org.joda.time.PeriodType periodType71 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType72 = periodType71.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime22, (org.joda.time.ReadableInstant) mutableDateTime41, periodType71);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int77 = dateTimeZone75.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime78 = org.joda.time.MutableDateTime.now(dateTimeZone75);
        org.joda.time.MutableDateTime mutableDateTime79 = mutableDateTime22.toMutableDateTime(dateTimeZone75);
        org.joda.time.MutableDateTime mutableDateTime80 = mutableDateTime22.copy();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime80.setHourOfDay(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(duration35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-86399999L) + "'", long65 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime78);
        org.junit.Assert.assertNotNull(mutableDateTime79);
        org.junit.Assert.assertNotNull(mutableDateTime80);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.LocalDateTime localDateTime10 = dateTime5.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfEra((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDateTime10.getValue(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = localDate0.withEra((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        int int4 = mutableDateTime3.getDayOfMonth();
        boolean boolean5 = dateMidnight1.isEqual((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateMidnight.Property property6 = dateMidnight1.era();
        org.joda.time.DateMidnight dateMidnight7 = property6.withMaximumValue();
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.era();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.withMillis((long) 53);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(obj11, dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minus((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod23 = mutablePeriod22.copy();
        mutablePeriod18.add((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType29 = periodType28.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight26, readableDuration27, periodType28);
        org.joda.time.Period period32 = period30.withSeconds(0);
        boolean boolean33 = mutablePeriod23.equals((java.lang.Object) period30);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight10, (org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime();
        int int40 = mutableDateTime39.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone43);
        org.joda.time.DateTime dateTime45 = dateTime44.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType47 = periodType46.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime39, (org.joda.time.ReadableInstant) dateTime44, periodType47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.Period period50 = new org.joda.time.Period(208L, (long) 100, periodType47, chronology49);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.TimeOfDay timeOfDay53 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay53.withChronologyRetainFields(chronology54);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = timeOfDay55.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay58 = timeOfDay55.plusHours((-1));
        org.joda.time.Chronology chronology59 = timeOfDay58.getChronology();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.TimeOfDay timeOfDay62 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology61);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.TimeOfDay timeOfDay64 = timeOfDay62.withChronologyRetainFields(chronology63);
        long long66 = chronology59.set((org.joda.time.ReadablePartial) timeOfDay62, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay67 = new org.joda.time.TimeOfDay(chronology59);
        org.joda.time.Chronology chronology68 = chronology59.withUTC();
        org.joda.time.Period period69 = new org.joda.time.Period(0L, (long) 2023, periodType47, chronology59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period70 = new org.joda.time.Period((java.lang.Object) dateMidnight10, periodType47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateMidnight");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 22 + "'", int40 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray56);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(timeOfDay64);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-86399999L) + "'", long66 == (-86399999L));
        org.junit.Assert.assertNotNull(chronology68);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        int int17 = mutableDateTime16.getDayOfMonth();
        org.joda.time.Instant instant18 = mutableDateTime16.toInstant();
        boolean boolean20 = mutableDateTime16.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int24 = dateTimeZone22.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime16.setZone(dateTimeZone22);
        org.joda.time.DateTime dateTime26 = timeOfDay11.toDateTimeToday(dateTimeZone22);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight28.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime32 = timeOfDay11.toDateTime((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.DateTime.Property property33 = dateTime32.millisOfDay();
        org.joda.time.DateTime dateTime35 = dateTime32.plusMonths((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = dateTime32.withHourOfDay(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod10.copy();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.withChronologyRetainFields(chronology17);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = timeOfDay18.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.plusHours((-1));
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        mutablePeriod10.setPeriod((long) (byte) 1, 208L, chronology22);
        mutablePeriod6.setPeriod((long) 4, chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(5, 365, (int) 'u', 31, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for minuteOfHour must not be larger than 59");
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalTime localTime6 = dateTime4.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime4.withDayOfMonth(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        calendar10.set(4, 99);
        int int14 = calendar10.getWeekYear();
        java.lang.Object obj15 = calendar10.clone();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1703026800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2023,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=353,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2023 + "'", int14 == 2023);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "java.util.GregorianCalendar[time=1703026800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2023,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=353,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "java.util.GregorianCalendar[time=1703026800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2023,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=353,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "java.util.GregorianCalendar[time=1703026800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2023,MONTH=11,WEEK_OF_YEAR=51,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=353,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        org.joda.time.DurationField durationField16 = chronology8.centuries();
        long long19 = durationField16.add((long) 0, (long) 10);
        long long22 = durationField16.subtract((-1836080280000L), 8);
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 31556995200000L + "'", long19 == 31556995200000L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-27081641880000L) + "'", long22 == (-27081641880000L));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withWeekyear((-1));
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        int int12 = localDateTime10.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = localDateTime10.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -594 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        java.lang.String str4 = yearMonth2.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02" + "'", str4, "2022-02");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.time();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) '#', periodType1, chronology2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.add((int) 'u', (int) (byte) -1, 100, 7, 2022, (int) ' ', 10, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        org.joda.time.YearMonth.Property property4 = yearMonth2.year();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        org.joda.time.YearMonth yearMonth7 = property4.addToCopy((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone10);
        org.joda.time.DateTime dateTime12 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime12.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime13.year();
        org.joda.time.Chronology chronology15 = mutableDateTime13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime19.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
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
        org.joda.time.DateTime dateTime39 = dateTime20.toDateTime(chronology30);
        mutableDateTime13.setMillis((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str42 = dateTimeFieldType41.toString();
        int int43 = mutableDateTime13.get(dateTimeFieldType41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth.Property property44 = yearMonth7.property(dateTimeFieldType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(yearMonth7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-86399999L) + "'", long37 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "yearOfCentury" + "'", str42, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 70 + "'", int43 == 70);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime3.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (short) -1, chronology11);
        org.joda.time.LocalDate localDate14 = localDate12.minusYears(1);
        org.joda.time.LocalDate.Property property15 = localDate12.year();
        org.joda.time.LocalDate localDate17 = localDate12.minusDays(7);
        org.joda.time.LocalDate localDate19 = localDate12.minusDays(2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = localDateTime7.isEqual((org.joda.time.ReadablePartial) localDate12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight4 = property2.addWrapFieldToCopy(7);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        calendar10.set(7, (int) (short) 0, 2022);
        java.lang.String str15 = calendar10.getCalendarType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = calendar10.isSet((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=7,MONTH=0,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=2022,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "gregory" + "'", str15, "gregory");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.plusWeeks((int) ' ');
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withMonthOfYear(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        long long27 = dateTimeField24.add((-1L), (long) 11);
        java.lang.String str28 = dateTimeField24.toString();
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime32 = localTime30.plusHours((int) (short) 10);
        org.joda.time.LocalTime localTime34 = localTime32.withMillisOfDay(4);
        int int35 = localTime32.getMillisOfSecond();
        java.util.Locale locale36 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dateTimeField24.getAsText((org.joda.time.ReadablePartial) localTime32, locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 347155199999L + "'", long27 == 347155199999L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "DateTimeField[yearOfCentury]" + "'", str28, "DateTimeField[yearOfCentury]");
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "it_IT");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.monthOfYear();
        int int5 = property2.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property2.setCopy("zho");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zho\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = periodType4.isSupported(durationFieldType5);
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) 1, 0L, periodType4);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod11 = mutablePeriod10.copy();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.withChronologyRetainFields(chronology17);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = timeOfDay18.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.plusHours((-1));
        org.joda.time.Chronology chronology22 = timeOfDay21.getChronology();
        mutablePeriod10.setPeriod((long) (byte) 1, 208L, chronology22);
        boolean boolean24 = periodType4.equals((java.lang.Object) chronology22);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(0L, (long) 58, periodType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getDurationType();
        boolean boolean28 = periodType4.isSupported(durationFieldType27);
        org.joda.time.PeriodType periodType29 = periodType4.withYearsRemoved();
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.copy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) mutablePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.Chronology chronology7 = mutableDateTime5.getChronology();
        int int8 = mutableDateTime5.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.setSecondOfDay(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Property[dayOfWeek]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=property[dayofweek]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear(2);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime7.plusHours(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.withMonthOfYear(19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        java.lang.String str9 = localTime6.toString("22");
        org.joda.time.LocalTime localTime11 = localTime6.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setRounding(dateTimeField13, (-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: -292275054");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "22" + "'", str9, "22");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        int int6 = localDate2.getYearOfEra();
        org.joda.time.LocalDate localDate8 = localDate2.minusWeeks(32);
        org.joda.time.LocalDate localDate10 = localDate8.plusYears(999);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDate10.getFieldTypes();
        int int12 = localDate10.getWeekyear();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1969 + "'", int6 == 1969);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2968 + "'", int12 == 2968);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay(3155695200000L);
        org.junit.Assert.assertNotNull(timeOfDay1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours((int) (short) 10);
        org.joda.time.LocalTime localTime5 = localTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = localTime1.toDateTimeToday();
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfCentury(0);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTimeISO();
        java.util.Date date10 = dateTime6.toDate();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTime6.toString(dateTimeFormatter15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Tue Feb 22 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZone(dateTimeZone3);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime8 = localTime6.plusHours((int) (short) 10);
        org.joda.time.LocalTime localTime10 = localTime6.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime11 = localTime6.toDateTimeToday();
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        org.joda.time.DateTime dateTime14 = dateTime11.plusYears(8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusYears((int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withChronologyRetainFields(chronology6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusHours((-1));
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        long long18 = chronology11.set((org.joda.time.ReadablePartial) timeOfDay14, (long) (byte) -1);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = periodType21.isSupported(durationFieldType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 1, 0L, periodType21);
        int[] intArray27 = chronology11.get((org.joda.time.ReadablePeriod) period24, (long) 2022, (long) ' ');
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((java.lang.Object) dateTime0, chronology11);
        int int29 = dateTime0.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = dateTime0.withSecondOfMinute(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-86399999L) + "'", long18 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate2.withDayOfMonth(53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        int int7 = localDateTime2.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localDateTime2.toString("PT0S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        org.joda.time.Period period20 = period13.withField(durationFieldType18, 7);
        org.joda.time.LocalTime localTime22 = localTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period13, (int) (short) 1);
        org.joda.time.format.PeriodFormatter periodFormatter23 = null;
        java.lang.String str24 = period13.toString(periodFormatter23);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod27.copy();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.yearOfCentury();
        org.joda.time.Duration duration32 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.Period period33 = period13.withFields((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.PeriodType periodType34 = mutablePeriod28.getPeriodType();
        int int35 = mutablePeriod28.getMonths();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0S" + "'", str24, "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfDay();
        org.joda.time.LocalTime localTime20 = property18.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime21 = property18.roundHalfFloorCopy();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24, periodType25);
        org.joda.time.Period period29 = period27.withSeconds(0);
        org.joda.time.Period period31 = period29.plusMinutes((int) (byte) 1);
        org.joda.time.Period period33 = period29.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period36 = period29.withField(durationFieldType34, 7);
        org.joda.time.LocalTime localTime38 = localTime21.withPeriodAdded((org.joda.time.ReadablePeriod) period29, (int) (short) 1);
        org.joda.time.Period period40 = period29.withMillis((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay11.minus((org.joda.time.ReadablePeriod) period29);
        int int42 = timeOfDay11.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType44 = timeOfDay11.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology8.era();
        java.util.Locale locale20 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = dateTimeField17.set((long) 11, "07:09:28.341", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"07:09:28.341\" for era is not supported");
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
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = calendar0.getDisplayName((-292275054), 999, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645513777619,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=37,MILLISECOND=619,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.joda.time.Period period14 = period7.withField(durationFieldType12, 7);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.standard();
        java.lang.String str18 = periodType17.getName();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.withChronologyRetainFields(chronology28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = timeOfDay29.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.plusHours((-1));
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.withChronologyRetainFields(chronology37);
        long long40 = chronology33.set((org.joda.time.ReadablePartial) timeOfDay36, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay41 = new org.joda.time.TimeOfDay(chronology33);
        org.joda.time.DateTime dateTime42 = dateTime23.toDateTime(chronology33);
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 'x', periodType17, chronology33);
        org.joda.time.DateTimeField dateTimeField44 = chronology33.hourOfHalfday();
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(867L, chronology33);
        org.joda.time.DurationField durationField46 = durationFieldType12.getField(chronology33);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone49);
        org.joda.time.DateTime dateTime51 = dateTime50.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime51.toMutableDateTime();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.TimeOfDay timeOfDay55 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology54);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay55.withChronologyRetainFields(chronology56);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray58 = timeOfDay57.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay60 = timeOfDay57.plusHours((-1));
        org.joda.time.Chronology chronology61 = timeOfDay60.getChronology();
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.TimeOfDay timeOfDay64 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology63);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.TimeOfDay timeOfDay66 = timeOfDay64.withChronologyRetainFields(chronology65);
        long long68 = chronology61.set((org.joda.time.ReadablePartial) timeOfDay64, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay69 = new org.joda.time.TimeOfDay(chronology61);
        org.joda.time.DateTime dateTime70 = dateTime51.toDateTime(chronology61);
        org.joda.time.DateTimeZone dateTimeZone73 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime74 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone73);
        org.joda.time.Chronology chronology75 = chronology61.withZone(dateTimeZone73);
        org.joda.time.DurationField durationField76 = chronology61.minutes();
        int int77 = durationField46.compareTo(durationField76);
        long long79 = durationField76.getMillis((long) 32769);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Standard" + "'", str18, "Standard");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-86399999L) + "'", long40 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray58);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(timeOfDay64);
        org.junit.Assert.assertNotNull(timeOfDay66);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + (-86399999L) + "'", long68 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTimeZone73);
        org.junit.Assert.assertNotNull(chronology75);
        org.junit.Assert.assertNotNull(durationField76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 1966140000L + "'", long79 == 1966140000L);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime4.toDateTime(chronology24);
        java.lang.Class<?> wildcardClass26 = dateTime4.getClass();
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
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("java.io.IOException: zho");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.io.IOException: zho\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.lang.String str9 = locale8.getDisplayScript();
        java.util.Locale.setDefault(locale8);
        java.lang.String str11 = locale8.getISO3Language();
        java.lang.String str12 = locale8.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDate5.toString("", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zho" + "'", str11, "zho");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "zh" + "'", str12, "zh");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.Date date1 = new java.util.Date((long) 6);
        org.joda.time.YearMonth yearMonth2 = org.joda.time.YearMonth.fromDateFields(date1);
        java.lang.String str3 = date1.toString();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Thu Jan 01 00:00:00 UTC 1970" + "'", str3, "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        java.lang.Object obj9 = mutablePeriod7.clone();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "PT0.099S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "PT0.099S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "PT0.099S");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType5 = periodType4.withWeeksRemoved();
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3, periodType4);
        org.joda.time.Period period8 = period6.withSeconds(0);
        org.joda.time.Period period10 = period8.plusMinutes((int) (byte) 1);
        org.joda.time.Period period12 = period8.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period15 = period8.withField(durationFieldType13, 7);
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime();
        int int19 = mutableDateTime18.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone22);
        org.joda.time.DateTime dateTime24 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime18, (org.joda.time.ReadableInstant) dateTime23, periodType26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(208L, (long) 100, periodType26, chronology28);
        org.joda.time.Period period30 = period8.withPeriodType(periodType26);
        org.joda.time.Duration duration31 = period8.toStandardDuration();
        boolean boolean32 = periodType0.equals((java.lang.Object) duration31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType34 = periodType0.getFieldType(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 22 + "'", int19 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType3 = periodType2.withYearsRemoved();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod7 = mutablePeriod6.copy();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withChronologyRetainFields(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.plusHours((-1));
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        mutablePeriod6.setPeriod((long) (byte) 1, 208L, chronology18);
        org.joda.time.Period period20 = new org.joda.time.Period(86400000L, 1L, periodType3, chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = period20.withWeeks((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfDay();
        org.joda.time.LocalTime localTime10 = property8.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime11 = property8.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime5, (org.joda.time.ReadablePartial) localTime11);
        org.joda.time.LocalTime localTime15 = localTime5.plusHours((int) '#');
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(obj16, dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.secondOfMinute();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType24 = periodType23.withWeeksRemoved();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight21, readableDuration22, periodType23);
        org.joda.time.Period period27 = period25.withSeconds(0);
        org.joda.time.Period period29 = period27.plusMinutes((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime18.withPeriodAdded((org.joda.time.ReadablePeriod) period27, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = localTime15.compareTo((org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        org.joda.time.DateTimeField dateTimeField25 = chronology14.yearOfCentury();
        int int27 = dateTimeField25.getMaximumValue(99L);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 99 + "'", int27 == 99);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.LocalTime localTime6 = property3.addCopy(69);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = yearMonth0.isEqual((org.joda.time.ReadablePartial) localTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(99, (int) (short) 0, (int) 'a', 86399999, 58, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.withChronologyRetainFields(chronology4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = timeOfDay5.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.plusHours((-1));
        org.joda.time.Chronology chronology9 = timeOfDay8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeField10.add((-431997977L), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        java.util.TimeZone.setDefault(timeZone0);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone26);
        org.joda.time.DateTime dateTime28 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime28.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.year();
        boolean boolean31 = dateMidnight23.isAfter((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long37 = dateTimeZone33.convertLocalToUTC((-1L), false, 10L);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight23.withZoneRetainFields(dateTimeZone33);
        java.lang.String str39 = dateMidnight38.toString();
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
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2022-02-22T00:00:00.000Z" + "'", str39, "2022-02-22T00:00:00.000Z");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Interval interval2 = localDate1.toInterval();
        org.joda.time.MutableInterval mutableInterval3 = interval2.toMutableInterval();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Interval interval6 = localDate5.toInterval();
        boolean boolean7 = interval2.isBefore((org.joda.time.ReadableInterval) interval6);
        org.joda.time.MutableInterval mutableInterval8 = interval6.toMutableInterval();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period10 = interval6.toPeriod(periodType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = period10.withMonths((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(mutableInterval3);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mutableInterval8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.Period period2 = new org.joda.time.Period((long) (byte) 0, 0L);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.Period period4 = period2.withPeriodType(periodType3);
        org.joda.time.Period period6 = period4.minusDays(1969);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = period6.plusMinutes((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withChronologyRetainFields(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.plusHours((-1));
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.withChronologyRetainFields(chronology22);
        long long25 = chronology18.set((org.joda.time.ReadablePartial) timeOfDay21, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology18);
        org.joda.time.DateTime dateTime27 = dateTime8.toDateTime(chronology18);
        org.joda.time.DateTimeField dateTimeField28 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = chronology18.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(6, (int) (short) 1, 54, 2022, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-86399999L) + "'", long25 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        org.joda.time.LocalDate localDate7 = localDate2.minusDays(7);
        org.joda.time.LocalDate localDate9 = localDate2.minusDays(2);
        org.joda.time.DateTime dateTime10 = localDate2.toDateTimeAtMidnight();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str13 = locale12.getDisplayLanguage();
        java.lang.String str15 = locale12.getUnicodeLocaleType("22");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTime10.toString("ISOChronology[UTC]", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u4e2d\u6587" + "'", str13, "\u4e2d\u6587");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(4, (int) (short) 10, (int) '#', chronology3);
        org.joda.time.DurationFieldType durationFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.withFieldAdded(durationFieldType5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfDay();
        org.joda.time.LocalTime localTime20 = property18.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime21 = property18.roundHalfFloorCopy();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24, periodType25);
        org.joda.time.Period period29 = period27.withSeconds(0);
        org.joda.time.Period period31 = period29.plusMinutes((int) (byte) 1);
        org.joda.time.Period period33 = period29.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period36 = period29.withField(durationFieldType34, 7);
        org.joda.time.LocalTime localTime38 = localTime21.withPeriodAdded((org.joda.time.ReadablePeriod) period29, (int) (short) 1);
        org.joda.time.Period period40 = period29.withMillis((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay11.minus((org.joda.time.ReadablePeriod) period29);
        int int42 = period29.getHours();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.plusYears(1969);
        boolean boolean8 = dateMidnight6.isBefore((long) 2022);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime();
        int int10 = mutableDateTime9.getDayOfMonth();
        org.joda.time.Instant instant11 = mutableDateTime9.toInstant();
        boolean boolean13 = mutableDateTime9.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int17 = dateTimeZone15.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime9.setZone(dateTimeZone15);
        java.util.TimeZone timeZone19 = dateTimeZone15.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) 2022, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withChronologyRetainFields(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.plusHours((-1));
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.withChronologyRetainFields(chronology22);
        long long25 = chronology18.set((org.joda.time.ReadablePartial) timeOfDay21, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology18);
        org.joda.time.DateTime dateTime27 = dateTime8.toDateTime(chronology18);
        org.joda.time.DateTimeField dateTimeField28 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField29 = chronology18.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = chronology18.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(2968, 53, (int) (short) 0, 11, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2968 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-86399999L) + "'", long25 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        mutableDateTime0.setDateTime(11, 8, 10, 19, (int) (short) 10, 19, 1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.era();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime();
        int int15 = mutableDateTime14.getDayOfMonth();
        boolean boolean16 = dateMidnight12.isEqual((org.joda.time.ReadableInstant) mutableDateTime14);
        int int17 = mutableDateTime14.getWeekOfWeekyear();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod21 = mutablePeriod20.copy();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.yearOfCentury();
        org.joda.time.Duration duration25 = mutablePeriod21.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight23);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod29 = mutablePeriod28.copy();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight31.yearOfCentury();
        org.joda.time.Duration duration33 = mutablePeriod29.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight31);
        boolean boolean34 = duration25.isShorterThan((org.joda.time.ReadableDuration) duration33);
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime14, (org.joda.time.ReadableDuration) duration33);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod39 = mutablePeriod38.copy();
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(chronology40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.yearOfCentury();
        org.joda.time.Duration duration43 = mutablePeriod39.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight41);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod47 = mutablePeriod46.copy();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(chronology48);
        org.joda.time.DateMidnight.Property property50 = dateMidnight49.yearOfCentury();
        org.joda.time.Duration duration51 = mutablePeriod47.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight49);
        boolean boolean52 = duration43.isEqual((org.joda.time.ReadableDuration) duration51);
        int int53 = duration33.compareTo((org.joda.time.ReadableDuration) duration51);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(chronology54);
        org.joda.time.DateMidnight.Property property56 = dateMidnight55.era();
        org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime();
        int int58 = mutableDateTime57.getDayOfMonth();
        boolean boolean59 = dateMidnight55.isEqual((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.DateMidnight.Property property60 = dateMidnight55.era();
        org.joda.time.DateMidnight dateMidnight61 = property60.withMaximumValue();
        org.joda.time.DateMidnight.Property property62 = dateMidnight61.era();
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight61.withMillis((long) 53);
        java.lang.Object obj65 = null;
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalDateTime localDateTime67 = new org.joda.time.LocalDateTime(obj65, dateTimeZone66);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime67.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime67.minus((org.joda.time.ReadablePeriod) mutablePeriod72);
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod77 = mutablePeriod76.copy();
        mutablePeriod72.add((org.joda.time.ReadablePeriod) mutablePeriod77);
        org.joda.time.Chronology chronology79 = null;
        org.joda.time.DateMidnight dateMidnight80 = new org.joda.time.DateMidnight(chronology79);
        org.joda.time.ReadableDuration readableDuration81 = null;
        org.joda.time.PeriodType periodType82 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType83 = periodType82.withWeeksRemoved();
        org.joda.time.Period period84 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight80, readableDuration81, periodType82);
        org.joda.time.Period period86 = period84.withSeconds(0);
        boolean boolean87 = mutablePeriod77.equals((java.lang.Object) period84);
        org.joda.time.Interval interval88 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight64, (org.joda.time.ReadablePeriod) mutablePeriod77);
        org.joda.time.Interval interval89 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration51, (org.joda.time.ReadableInstant) dateMidnight64);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration51, (int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(mutablePeriod21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(duration33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(mutablePeriod39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(duration51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 22 + "'", int58 == 22);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(dateMidnight61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(localDateTime73);
        org.junit.Assert.assertNotNull(mutablePeriod77);
        org.junit.Assert.assertNotNull(periodType82);
        org.junit.Assert.assertNotNull(periodType83);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight.Property property3 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight1.withCenturyOfEra((int) (byte) 0);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfDay();
        org.joda.time.LocalTime localTime10 = property8.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime11 = property8.roundHalfFloorCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType16 = periodType15.withWeeksRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight13, readableDuration14, periodType15);
        org.joda.time.Period period19 = period17.withSeconds(0);
        org.joda.time.Period period21 = period19.plusMinutes((int) (byte) 1);
        org.joda.time.Period period23 = period19.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period26 = period19.withField(durationFieldType24, 7);
        org.joda.time.LocalTime localTime28 = localTime11.withPeriodAdded((org.joda.time.ReadablePeriod) period19, (int) (short) 1);
        org.joda.time.format.PeriodFormatter periodFormatter29 = null;
        java.lang.String str30 = period19.toString(periodFormatter29);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod34 = mutablePeriod33.copy();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight.Property property37 = dateMidnight36.yearOfCentury();
        org.joda.time.Duration duration38 = mutablePeriod34.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight36);
        org.joda.time.Period period39 = period19.withFields((org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight1.minus((org.joda.time.ReadablePeriod) mutablePeriod34);
        java.lang.String str41 = dateMidnight40.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT0S" + "'", str30, "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str41, "2022-02-21T00:00:00.000Z");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        boolean boolean2 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalTime localTime6 = dateTime4.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localTime6.getValue(54);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 54");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        org.joda.time.DateMidnight.Property property24 = dateMidnight1.weekOfWeekyear();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.withChronologyRetainFields(chronology28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = timeOfDay29.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.plusHours((-1));
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.withChronologyRetainFields(chronology37);
        long long40 = chronology33.set((org.joda.time.ReadablePartial) timeOfDay36, (long) (byte) -1);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType44 = null;
        boolean boolean45 = periodType43.isSupported(durationFieldType44);
        org.joda.time.Period period46 = new org.joda.time.Period((long) (byte) 1, 0L, periodType43);
        int[] intArray49 = chronology33.get((org.joda.time.ReadablePeriod) period46, (long) 2022, (long) ' ');
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight1.plus((org.joda.time.ReadablePeriod) period46);
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone53);
        org.joda.time.DateTime dateTime55 = dateTime54.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime55.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property57 = mutableDateTime56.year();
        org.joda.time.Chronology chronology58 = mutableDateTime56.getChronology();
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone61);
        org.joda.time.DateTime dateTime63 = dateTime62.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime64 = dateTime63.toMutableDateTime();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.TimeOfDay timeOfDay67 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay67.withChronologyRetainFields(chronology68);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray70 = timeOfDay69.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay72 = timeOfDay69.plusHours((-1));
        org.joda.time.Chronology chronology73 = timeOfDay72.getChronology();
        org.joda.time.Chronology chronology75 = null;
        org.joda.time.TimeOfDay timeOfDay76 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology75);
        org.joda.time.Chronology chronology77 = null;
        org.joda.time.TimeOfDay timeOfDay78 = timeOfDay76.withChronologyRetainFields(chronology77);
        long long80 = chronology73.set((org.joda.time.ReadablePartial) timeOfDay76, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay81 = new org.joda.time.TimeOfDay(chronology73);
        org.joda.time.DateTime dateTime82 = dateTime63.toDateTime(chronology73);
        mutableDateTime56.setMillis((org.joda.time.ReadableInstant) dateTime63);
        org.joda.time.DateTimeFieldType dateTimeFieldType84 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.lang.String str85 = dateTimeFieldType84.toString();
        int int86 = mutableDateTime56.get(dateTimeFieldType84);
        org.joda.time.DateMidnight.Property property87 = dateMidnight1.property(dateTimeFieldType84);
        java.util.Locale locale89 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight90 = property87.setCopy("Property[year]", locale89);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[year]\" for yearOfCentury is not supported");
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
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-86399999L) + "'", long40 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray70);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(timeOfDay76);
        org.junit.Assert.assertNotNull(timeOfDay78);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + (-86399999L) + "'", long80 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(dateTimeFieldType84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "yearOfCentury" + "'", str85, "yearOfCentury");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 70 + "'", int86 == 70);
        org.junit.Assert.assertNotNull(property87);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        long long5 = dateTimeField3.roundHalfEven((long) 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = dateTimeField3.getType();
        long long9 = dateTimeField3.addWrapField(672L, (int) 'a');
        long long12 = dateTimeField3.add((long) 2968, 292278993);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 6L + "'", long5 == 6L);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 769L + "'", long9 == 769L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 292281961L + "'", long12 == 292281961L);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(9, 3, (int) (short) 10, 365, (int) '4', 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        org.joda.time.Period period20 = period13.withField(durationFieldType18, 7);
        org.joda.time.LocalTime localTime22 = localTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period13, (int) (short) 1);
        org.joda.time.format.PeriodFormatter periodFormatter23 = null;
        java.lang.String str24 = period13.toString(periodFormatter23);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod27.copy();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.yearOfCentury();
        org.joda.time.Duration duration32 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.Period period33 = period13.withFields((org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.PeriodType periodType34 = mutablePeriod28.getPeriodType();
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime();
        int int36 = mutableDateTime35.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone39);
        org.joda.time.DateTime dateTime41 = dateTime40.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType43 = periodType42.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime35, (org.joda.time.ReadableInstant) dateTime40, periodType43);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod48 = mutablePeriod47.copy();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateMidnight.Property property51 = dateMidnight50.yearOfCentury();
        org.joda.time.Duration duration52 = mutablePeriod48.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight50);
        mutablePeriod44.setPeriod((org.joda.time.ReadableDuration) duration52);
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod57 = mutablePeriod56.copy();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight(chronology58);
        org.joda.time.DateMidnight.Property property60 = dateMidnight59.yearOfCentury();
        org.joda.time.Duration duration61 = mutablePeriod57.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight59);
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod65 = mutablePeriod64.copy();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.DateMidnight dateMidnight67 = new org.joda.time.DateMidnight(chronology66);
        org.joda.time.DateMidnight.Property property68 = dateMidnight67.yearOfCentury();
        org.joda.time.Duration duration69 = mutablePeriod65.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight67);
        boolean boolean70 = duration61.isShorterThan((org.joda.time.ReadableDuration) duration69);
        org.joda.time.Period period71 = duration69.toPeriod();
        boolean boolean72 = duration52.isEqual((org.joda.time.ReadableDuration) duration69);
        org.joda.time.Period period73 = duration52.toPeriod();
        mutablePeriod28.setPeriod((org.joda.time.ReadablePeriod) period73);
        mutablePeriod28.setMinutes((int) 'u');
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT0S" + "'", str24, "PT0S");
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 22 + "'", int36 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(mutablePeriod48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(duration52);
        org.junit.Assert.assertNotNull(mutablePeriod57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(mutablePeriod65);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(duration69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(period73);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.yearOfCentury();
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = property5.addWrapFieldToCopy((int) (short) 10);
        int int8 = property5.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 292278993 + "'", int8 == 292278993);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZone(dateTimeZone3);
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, 1645513774495L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate localDate5 = localDate2.plusDays((int) (byte) 0);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime();
        int int7 = mutableDateTime6.getDayOfMonth();
        org.joda.time.Instant instant8 = mutableDateTime6.toInstant();
        boolean boolean10 = mutableDateTime6.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int14 = dateTimeZone12.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime6.setZone(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime();
        int int17 = mutableDateTime16.getDayOfMonth();
        org.joda.time.Instant instant18 = mutableDateTime16.toInstant();
        boolean boolean20 = mutableDateTime16.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int24 = dateTimeZone22.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime16.setZone(dateTimeZone22);
        long long27 = dateTimeZone22.previousTransition((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime28 = mutableDateTime6.toMutableDateTime(dateTimeZone22);
        mutableDateTime28.setMillisOfSecond(11);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.ReadableInterval readableInterval34 = null;
        mutablePeriod33.add(readableInterval34);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone38);
        org.joda.time.DateTime dateTime40 = dateTime39.withTimeAtStartOfDay();
        org.joda.time.Duration duration41 = mutablePeriod33.toDurationTo((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone44);
        org.joda.time.DateTime dateTime46 = dateTime45.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime47 = dateTime46.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime47.year();
        org.joda.time.Chronology chronology49 = mutableDateTime47.getChronology();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone52);
        org.joda.time.DateTime dateTime54 = dateTime53.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime54.toMutableDateTime();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.TimeOfDay timeOfDay58 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.TimeOfDay timeOfDay60 = timeOfDay58.withChronologyRetainFields(chronology59);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray61 = timeOfDay60.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay63 = timeOfDay60.plusHours((-1));
        org.joda.time.Chronology chronology64 = timeOfDay63.getChronology();
        org.joda.time.Chronology chronology66 = null;
        org.joda.time.TimeOfDay timeOfDay67 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology66);
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.TimeOfDay timeOfDay69 = timeOfDay67.withChronologyRetainFields(chronology68);
        long long71 = chronology64.set((org.joda.time.ReadablePartial) timeOfDay67, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay72 = new org.joda.time.TimeOfDay(chronology64);
        org.joda.time.DateTime dateTime73 = dateTime54.toDateTime(chronology64);
        mutableDateTime47.setMillis((org.joda.time.ReadableInstant) dateTime54);
        org.joda.time.PeriodType periodType75 = org.joda.time.PeriodType.yearDay();
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration41, (org.joda.time.ReadableInstant) mutableDateTime47, periodType75);
        org.joda.time.PeriodType periodType77 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType78 = periodType77.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod79 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime28, (org.joda.time.ReadableInstant) mutableDateTime47, periodType77);
        org.joda.time.DateTimeZone dateTimeZone81 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int83 = dateTimeZone81.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime84 = org.joda.time.MutableDateTime.now(dateTimeZone81);
        org.joda.time.MutableDateTime mutableDateTime85 = mutableDateTime28.toMutableDateTime(dateTimeZone81);
        long long87 = dateTimeZone81.previousTransition(43L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight88 = new org.joda.time.DateMidnight((java.lang.Object) localDate5, dateTimeZone81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(timeOfDay60);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray61);
        org.junit.Assert.assertNotNull(timeOfDay63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(timeOfDay69);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-86399999L) + "'", long71 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(periodType75);
        org.junit.Assert.assertNotNull(periodType77);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(dateTimeZone81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime84);
        org.junit.Assert.assertNotNull(mutableDateTime85);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 43L + "'", long87 == 43L);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        org.joda.time.Period period20 = period13.withField(durationFieldType18, 7);
        org.joda.time.LocalTime localTime22 = localTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period13, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = localTime5.toString("Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("7");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 7 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = yearMonth0.withYear(7);
        org.joda.time.YearMonth.Property property3 = yearMonth2.year();
        int int4 = property3.getMinimumValueOverall();
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
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay16.plusHours(2022);
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod27 = mutablePeriod26.copy();
        org.joda.time.format.PeriodFormatter periodFormatter28 = null;
        java.lang.String str29 = mutablePeriod27.toString(periodFormatter28);
        org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType31 = periodType30.withYearsRemoved();
        org.joda.time.Period period32 = new org.joda.time.Period((java.lang.Object) periodFormatter28, periodType30);
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
        org.joda.time.DateTimeField dateTimeField58 = chronology47.yearOfCentury();
        org.joda.time.Period period59 = new org.joda.time.Period(100L, periodType30, chronology47);
        org.joda.time.TimeOfDay timeOfDay60 = timeOfDay16.withChronologyRetainFields(chronology47);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = property3.compareTo((org.joda.time.ReadablePartial) timeOfDay60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-292275054) + "'", int4 == (-292275054));
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-86399999L) + "'", long20 == (-86399999L));
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(mutablePeriod27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT0.099S" + "'", str29, "PT0.099S");
        org.junit.Assert.assertNotNull(periodType30);
        org.junit.Assert.assertNotNull(periodType31);
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
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(timeOfDay60);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        org.joda.time.LocalDate localDate7 = localDate2.minusDays(7);
        org.joda.time.LocalDate localDate9 = localDate2.minusDays(2);
        org.joda.time.DateTime dateTime10 = localDate2.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate2.withMonthOfYear(2968);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2968 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645513780086,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=40,MILLISECOND=86,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PeriodType[YearMonthDayTime]", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        java.lang.String str4 = localTime1.toString("22");
        org.joda.time.LocalTime localTime6 = localTime1.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localTime1.isSupported(dateTimeFieldType7);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 1, (long) (short) 0);
        org.joda.time.LocalTime localTime12 = localTime1.minus((org.joda.time.ReadablePeriod) period11);
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
        org.joda.time.DurationField durationField38 = chronology27.days();
        org.joda.time.DurationField durationField39 = chronology27.millis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((java.lang.Object) period11, chronology27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "22" + "'", str4, "22");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime12);
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
        org.junit.Assert.assertNotNull(durationField39);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.TimeOfDay timeOfDay6 = dateTime5.toTimeOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.minusMillis(32772);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.clear();
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj2, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears((int) (short) 0);
        int int8 = localDateTime4.getValue(2);
        int int9 = localDateTime4.getHourOfDay();
        boolean boolean10 = calendar0.after((java.lang.Object) localDateTime4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = calendar0.getLeastMaximum(70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 70");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        mutablePeriod12.addMinutes(2);
        mutablePeriod12.setPeriod(480L);
        mutablePeriod12.addSeconds((int) (byte) 10);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(mutablePeriod12);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = property3.roundFloorCopy();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate10 = localDate8.plusWeeks(9);
        int int11 = localDate10.getEra();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDate10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 572L + "'", long4 == 572L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.MutableDateTime mutableDateTime9 = property6.set(5);
        mutableDateTime9.setWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int15 = dateTimeZone13.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime9.setZone(dateTimeZone13);
        int int18 = mutableDateTime9.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.LocalTime localTime5 = property2.addWrapFieldToCopy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime5.withMillisOfSecond(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology8.era();
        long long19 = dateTimeField17.remainder(6L);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = dateTimeField17.add((long) (short) -1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 62135596800006L + "'", long19 == 62135596800006L);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("fr");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = calendar2.getActualMinimum(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32772");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645513780985,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=40,MILLISECOND=985,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = yearMonth0.withYear(7);
        org.joda.time.YearMonth.Property property3 = yearMonth2.year();
        org.joda.time.YearMonth yearMonth5 = yearMonth2.minusMonths(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = yearMonth5.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonth5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = property3.addToCopy(9);
        long long8 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfCentury(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 94L + "'", long4 == 94L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 94L + "'", long8 == 94L);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        int int7 = localDateTime2.getYear();
        org.joda.time.DateTime dateTime8 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTime();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod9.copy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.withChronologyRetainFields(chronology16);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = timeOfDay17.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.plusHours((-1));
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        mutablePeriod9.setPeriod((long) (byte) 1, 208L, chronology21);
        mutablePeriod5.setPeriod((long) 4, chronology21);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime27 = localTime25.plusHours((int) (short) 10);
        long long29 = chronology21.set((org.joda.time.ReadablePartial) localTime27, (long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay((int) (short) 100, 12, 58, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-50399999L) + "'", long29 == (-50399999L));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = property3.addToCopy(9);
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = locale9.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property3.setCopy("java.io.IOException: zho", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.io.IOException: zho\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 356L + "'", long4 == 356L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u5fb7\u56fd" + "'", str10, "\u5fb7\u56fd");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(2022, 9, 70, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(31);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear(2);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.Instant instant10 = instant8.withMillis((long) 5);
        org.joda.time.MutableDateTime mutableDateTime11 = instant10.toMutableDateTimeISO();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime11.monthOfYear();
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.lang.String str15 = locale14.getDisplayScript();
        java.util.Locale.setDefault(locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime17 = property12.set("", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime0.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setTime(2, (int) (byte) -1, (int) (byte) 1, 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("fr");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        boolean boolean3 = timeZone1.observesDaylightTime();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance();
        calendar4.clear();
        org.joda.time.YearMonth yearMonth6 = org.joda.time.YearMonth.fromCalendarFields(calendar4);
        java.util.Date date8 = new java.util.Date(100L);
        calendar4.setTime(date8);
        date8.setMinutes(12);
        boolean boolean12 = timeZone1.inDaylightTime(date8);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645513781840,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=41,MILLISECOND=840,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonth6);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:12:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZone(dateTimeZone3);
        java.lang.Appendable appendable5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.plusWeeks((int) ' ');
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, (org.joda.time.ReadableInstant) dateMidnight12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        int int9 = charSet8.size();
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
        org.joda.time.DurationField durationField35 = chronology24.days();
        boolean boolean36 = charSet8.remove((java.lang.Object) chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(13, (-1), 31, 11, 17, 54, 7, chronology24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
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
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        java.lang.String str11 = locale9.toString();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645570800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "it_IT" + "'", str11, "it_IT");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear((int) '#');
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.millisOfDay();
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology11.get(readablePeriod12, 157L, 31536000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.days();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight10, readableDuration11, periodType12);
        org.joda.time.Period period16 = period14.withSeconds(0);
        org.joda.time.Period period18 = period16.plusMinutes((int) (byte) 1);
        org.joda.time.Period period20 = period16.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period23 = period16.withField(durationFieldType21, 7);
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime();
        int int27 = mutableDateTime26.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone30);
        org.joda.time.DateTime dateTime32 = dateTime31.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType34 = periodType33.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime26, (org.joda.time.ReadableInstant) dateTime31, periodType34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period(208L, (long) 100, periodType34, chronology36);
        org.joda.time.Period period38 = period16.withPeriodType(periodType34);
        org.joda.time.Duration duration39 = period16.toStandardDuration();
        boolean boolean40 = periodType8.equals((java.lang.Object) duration39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period41 = new org.joda.time.Period(22, 100, 58, 1970, (int) (short) 10, 0, (int) 'x', 0, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22 + "'", int27 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(duration39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime3 = property2.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth7 = new org.joda.time.YearMonth(dateTimeZone6);
        int[] intArray13 = new int[] { 999, 'u', 'a', 100 };
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property17 = localTime16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        long long20 = dateTimeField18.roundHalfEven((long) 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = dateTimeField18.getType();
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = locale22.getDisplayScript();
        java.util.Locale.setDefault(locale22);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale22);
        int int26 = dateTimeField18.getMaximumShortTextLength(locale22);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = dateTimeField4.set((org.joda.time.ReadablePartial) yearMonth7, (int) (byte) 10, intArray13, "1969-12-24", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-24\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[999, 117, 97, 100]");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 6L + "'", long20 == 6L);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(calendar25);
// flaky:         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=1645513782159,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=42,MILLISECOND=159,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.util.Date date1 = new java.util.Date((long) 6);
        date1.setMinutes(1);
        java.lang.String str4 = date1.toLocaleString();
        int int5 = date1.getTimezoneOffset();
        date1.setHours((int) (short) -1);
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 23:01:00 UTC 1969");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-1-1 0:01:00" + "'", str4, "1970-1-1 0:01:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (short) -1, chronology26);
        org.joda.time.LocalDate localDate29 = localDate27.minusYears(1);
        int[] intArray36 = new int[] { 12, 365, (byte) 100, 86399999, 'a', 292278993 };
        // The following exception was thrown during execution in test generation
        try {
            chronology14.validate((org.joda.time.ReadablePartial) localDate29, intArray36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must not be larger than 12");
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
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[12, 365, 100, 86399999, 97, 292278993]");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        org.joda.time.DateTimeField dateTimeField24 = chronology14.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = dateTimeField24.add((long) 2023, 1123200000L);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1123201970 for weekyear must be in the range [-292275054,292278993]");
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
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withYear((int) 'u');
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        java.util.Locale locale6 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property4.setCopy("DateTimeField[yearOfCentury]", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[yearOfCentury]\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "it_IT");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        java.lang.String str9 = periodType8.getName();
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
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 'x', periodType8, chronology24);
        org.joda.time.DateTimeField dateTimeField35 = chronology24.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((int) (short) -1, 100, 292278993, 2023, (int) 'u', 2023, (-1), chronology24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2023 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Standard" + "'", str9, "Standard");
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
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours((int) (short) 10);
        org.joda.time.LocalTime localTime5 = localTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = localTime1.toDateTimeToday();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.DateTime dateTime9 = dateTime6.plusYears(8);
        org.joda.time.DateTime dateTime11 = dateTime6.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime13 = dateTime6.plusMillis(11);
        org.joda.time.format.DateTimePrinter dateTimePrinter14 = null;
        org.joda.time.format.DateTimeParser dateTimeParser15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter14, dateTimeParser15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter16.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTime6.toString(dateTimeFormatter17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(32);
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj7, dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime9.minus((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withWeekyear((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDate4.compareTo((org.joda.time.ReadablePartial) localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        int int8 = mutableDateTime7.getDayOfMonth();
        org.joda.time.Instant instant9 = mutableDateTime7.toInstant();
        boolean boolean11 = mutableDateTime7.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int15 = dateTimeZone13.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime7.setZone(dateTimeZone13);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime();
        int int18 = mutableDateTime17.getDayOfMonth();
        org.joda.time.Instant instant19 = mutableDateTime17.toInstant();
        boolean boolean21 = mutableDateTime17.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int25 = dateTimeZone23.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime17.setZone(dateTimeZone23);
        long long28 = dateTimeZone23.previousTransition((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime7.toMutableDateTime(dateTimeZone23);
        mutableDateTime29.setMillisOfSecond(11);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.ReadableInterval readableInterval35 = null;
        mutablePeriod34.add(readableInterval35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone39);
        org.joda.time.DateTime dateTime41 = dateTime40.withTimeAtStartOfDay();
        org.joda.time.Duration duration42 = mutablePeriod34.toDurationTo((org.joda.time.ReadableInstant) dateTime40);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone45);
        org.joda.time.DateTime dateTime47 = dateTime46.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime48 = dateTime47.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime48.year();
        org.joda.time.Chronology chronology50 = mutableDateTime48.getChronology();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone53);
        org.joda.time.DateTime dateTime55 = dateTime54.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime56 = dateTime55.toMutableDateTime();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.TimeOfDay timeOfDay59 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology58);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.TimeOfDay timeOfDay61 = timeOfDay59.withChronologyRetainFields(chronology60);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray62 = timeOfDay61.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay64 = timeOfDay61.plusHours((-1));
        org.joda.time.Chronology chronology65 = timeOfDay64.getChronology();
        org.joda.time.Chronology chronology67 = null;
        org.joda.time.TimeOfDay timeOfDay68 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology67);
        org.joda.time.Chronology chronology69 = null;
        org.joda.time.TimeOfDay timeOfDay70 = timeOfDay68.withChronologyRetainFields(chronology69);
        long long72 = chronology65.set((org.joda.time.ReadablePartial) timeOfDay68, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay73 = new org.joda.time.TimeOfDay(chronology65);
        org.joda.time.DateTime dateTime74 = dateTime55.toDateTime(chronology65);
        mutableDateTime48.setMillis((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.PeriodType periodType76 = org.joda.time.PeriodType.yearDay();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration42, (org.joda.time.ReadableInstant) mutableDateTime48, periodType76);
        org.joda.time.PeriodType periodType78 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType79 = periodType78.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod80 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime29, (org.joda.time.ReadableInstant) mutableDateTime48, periodType78);
        org.joda.time.DateTimeZone dateTimeZone82 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int84 = dateTimeZone82.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime85 = org.joda.time.MutableDateTime.now(dateTimeZone82);
        org.joda.time.MutableDateTime mutableDateTime86 = mutableDateTime29.toMutableDateTime(dateTimeZone82);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime87 = new org.joda.time.DateTime(53, 10, 3, (int) (byte) 0, (int) '#', (int) (short) 100, 22, dateTimeZone82);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(mutableDateTime56);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(timeOfDay61);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray62);
        org.junit.Assert.assertNotNull(timeOfDay64);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(timeOfDay68);
        org.junit.Assert.assertNotNull(timeOfDay70);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-86399999L) + "'", long72 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertNotNull(periodType78);
        org.junit.Assert.assertNotNull(periodType79);
        org.junit.Assert.assertNotNull(dateTimeZone82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime85);
        org.junit.Assert.assertNotNull(mutableDateTime86);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("fr");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromCalendarFields(calendar3);
        boolean boolean5 = locale0.equals((java.lang.Object) calendar3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645513782804,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=42,MILLISECOND=804,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        org.joda.time.DateTimeField dateTimeField17 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField18 = dateTimeField17.getDurationField();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (short) -1, chronology20);
        org.joda.time.LocalDate localDate23 = localDate21.minusYears(1);
        org.joda.time.LocalDate.Property property24 = localDate21.year();
        org.joda.time.LocalDate localDate26 = localDate21.minusDays(7);
        org.joda.time.LocalDate localDate28 = localDate21.minusDays(2);
        org.joda.time.LocalDate localDate30 = localDate21.plusDays(32769);
        org.joda.time.LocalDate localDate32 = localDate30.plusYears(22);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.withChronologyRetainFields(chronology37);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray39 = timeOfDay38.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay38.plusHours((-1));
        org.joda.time.Chronology chronology42 = timeOfDay41.getChronology();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.TimeOfDay timeOfDay45 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology44);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay45.withChronologyRetainFields(chronology46);
        long long49 = chronology42.set((org.joda.time.ReadablePartial) timeOfDay45, (long) (byte) -1);
        org.joda.time.PeriodType periodType52 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType53 = null;
        boolean boolean54 = periodType52.isSupported(durationFieldType53);
        org.joda.time.Period period55 = new org.joda.time.Period((long) (byte) 1, 0L, periodType52);
        int[] intArray58 = chronology42.get((org.joda.time.ReadablePeriod) period55, (long) 2022, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray60 = dateTimeField17.addWrapField((org.joda.time.ReadablePartial) localDate32, 429, intArray58, (-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 429");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-86399999L) + "'", long49 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[0, 0, 0, 0, 0, -1, -990]");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        int int7 = localDateTime2.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.withField(dateTimeFieldType8, 32);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withCenturyOfEra(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withEra(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone26);
        org.joda.time.Chronology chronology28 = chronology14.withZone(dateTimeZone26);
        org.joda.time.DurationField durationField29 = chronology14.minutes();
        long long31 = durationField29.getValueAsLong((long) (byte) 10);
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
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withChronologyRetainFields(chronology6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusHours((-1));
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        long long18 = chronology11.set((org.joda.time.ReadablePartial) timeOfDay14, (long) (byte) -1);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = periodType21.isSupported(durationFieldType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 1, 0L, periodType21);
        int[] intArray27 = chronology11.get((org.joda.time.ReadablePeriod) period24, (long) 2022, (long) ' ');
        org.joda.time.DateTimeField dateTimeField28 = chronology11.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField29 = chronology11.era();
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((int) ' ', 2, 11, chronology11);
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.days();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int35 = dateTimeZone33.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone38);
        org.joda.time.DateTime dateTime40 = dateTime39.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime40.toMutableDateTime();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.TimeOfDay timeOfDay44 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay44.withChronologyRetainFields(chronology45);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = timeOfDay46.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay46.plusHours((-1));
        org.joda.time.Chronology chronology50 = timeOfDay49.getChronology();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.TimeOfDay timeOfDay53 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay53.withChronologyRetainFields(chronology54);
        long long57 = chronology50.set((org.joda.time.ReadablePartial) timeOfDay53, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay(chronology50);
        org.joda.time.DateTime dateTime59 = dateTime40.toDateTime(chronology50);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone62);
        org.joda.time.Chronology chronology64 = chronology50.withZone(dateTimeZone62);
        boolean boolean65 = dateTimeZone33.equals((java.lang.Object) chronology50);
        java.lang.String str66 = chronology50.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period67 = new org.joda.time.Period((java.lang.Object) ' ', periodType31, chronology50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-86399999L) + "'", long18 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-86399999L) + "'", long57 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ISOChronology[UTC]" + "'", str66, "ISOChronology[UTC]");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(69, (-1), 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        int int4 = mutableDateTime3.getDayOfMonth();
        boolean boolean5 = dateMidnight1.isEqual((org.joda.time.ReadableInstant) mutableDateTime3);
        org.joda.time.DateMidnight.Property property6 = dateMidnight1.era();
        org.joda.time.DateMidnight dateMidnight7 = property6.withMaximumValue();
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.era();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.withMillis((long) 53);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(obj11, dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minus((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod23 = mutablePeriod22.copy();
        mutablePeriod18.add((org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType29 = periodType28.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight26, readableDuration27, periodType28);
        org.joda.time.Period period32 = period30.withSeconds(0);
        boolean boolean33 = mutablePeriod23.equals((java.lang.Object) period30);
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight10, (org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.Interval interval35 = interval34.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((java.lang.Object) interval35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Interval");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(mutablePeriod23);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(interval35);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        org.joda.time.DurationField durationField25 = chronology14.days();
        boolean boolean26 = durationField25.isPrecise();
        long long27 = durationField25.getUnitMillis();
        long long30 = durationField25.getMillis((long) 292278993, (long) 2968);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 86400000L + "'", long27 == 86400000L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 25252904995200000L + "'", long30 == 25252904995200000L);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        java.lang.String[] strArray38 = new java.lang.String[] { "PT0.099S", "22", "PeriodType[YearMonthDayTime]", "hi!", "PT0S", "2022-02-22T07:09:21.203Z", "7", "2022-02-22T07:09:21.203Z", "22", "\u5fb7\u56fd", "22", "Standard", "zho", "UTC", "DateTimeField[millisOfSecond]", "zho", "22", "hi!", "-0001-02-23T07:09:19.011", "PeriodType[YearMonthDayTime]", "DateTimeField[yearOfCentury]", "DateTimeField[yearOfCentury]", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.Locale.FilteringMode filteringMode41 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList39, filteringMode41);
        org.joda.time.MutableDateTime mutableDateTime43 = new org.joda.time.MutableDateTime();
        int int44 = mutableDateTime43.getDayOfMonth();
        org.joda.time.Instant instant45 = mutableDateTime43.toInstant();
        boolean boolean47 = mutableDateTime43.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int51 = dateTimeZone49.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime43.setZone(dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime53 = new org.joda.time.MutableDateTime();
        int int54 = mutableDateTime53.getDayOfMonth();
        org.joda.time.Instant instant55 = mutableDateTime53.toInstant();
        boolean boolean57 = mutableDateTime53.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone59 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int61 = dateTimeZone59.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime53.setZone(dateTimeZone59);
        long long64 = dateTimeZone59.previousTransition((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime65 = mutableDateTime43.toMutableDateTime(dateTimeZone59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight((java.lang.Object) strList42, dateTimeZone59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.ArrayList");
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
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + filteringMode41 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode41.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 22 + "'", int44 == 22);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 22 + "'", int54 == 22);
        org.junit.Assert.assertNotNull(instant55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L) + "'", long64 == (-1L));
        org.junit.Assert.assertNotNull(mutableDateTime65);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod5.copy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfCentury();
        org.joda.time.Duration duration10 = mutablePeriod6.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.YearMonth yearMonth11 = yearMonth2.minus((org.joda.time.ReadablePeriod) mutablePeriod6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = mutablePeriod6.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(yearMonth11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.Period period2 = new org.joda.time.Period(62135596800006L, (long) 32772);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours((int) (short) 10);
        org.joda.time.LocalTime localTime5 = localTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = localTime1.toDateTimeToday();
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfCentury(0);
        org.joda.time.DateTime dateTime9 = dateTime6.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withDayOfYear(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        org.joda.time.Period period14 = period7.withField(durationFieldType12, 7);
        org.joda.time.Period period16 = period7.minusDays(0);
        org.joda.time.Period period18 = period16.minusSeconds(99);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone21);
        org.joda.time.DateTime dateTime23 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime25 = dateTime23.toLocalDateTime();
        java.lang.Object obj26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj26, dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime28.minus((org.joda.time.ReadablePeriod) mutablePeriod33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withWeekyear((-1));
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime25, (org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType39 = periodType38.withWeeksRemoved();
        java.lang.String str40 = periodType39.toString();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.ReadableDuration readableDuration43 = null;
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType45 = periodType44.withWeeksRemoved();
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight42, readableDuration43, periodType44);
        org.joda.time.Period period48 = period46.withSeconds(0);
        int int49 = period48.getDays();
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime();
        int int51 = mutableDateTime50.getDayOfMonth();
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.hours();
        mutableDateTime50.add(durationFieldType52, (int) (short) 100);
        int int55 = period48.get(durationFieldType52);
        boolean boolean56 = periodType39.isSupported(durationFieldType52);
        org.joda.time.Period period58 = period37.withField(durationFieldType52, 58);
        boolean boolean59 = period18.isSupported(durationFieldType52);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(periodType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PeriodType[YearMonthDayTime]" + "'", str40, "PeriodType[YearMonthDayTime]");
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 22 + "'", int51 == 22);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = yearMonth0.withYear(7);
        org.joda.time.YearMonth.Property property3 = yearMonth2.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property3.getFieldType();
        java.lang.String str5 = property3.getAsText();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7" + "'", str5, "7");
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("-0001-02-23T07:09:27.524");
        org.junit.Assert.assertNotNull(instant1);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 9, (long) (-1));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime();
        int int8 = mutableDateTime7.getDayOfMonth();
        org.joda.time.Instant instant9 = mutableDateTime7.toInstant();
        boolean boolean11 = mutableDateTime7.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int15 = dateTimeZone13.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime7.setZone(dateTimeZone13);
        int int18 = dateTimeZone13.getOffsetFromLocal((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(54, 4, 4, 0, 69, 12, 86399999, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(117L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime3.monthOfYear();
        int int5 = property2.compareTo((org.joda.time.ReadableInstant) mutableDateTime3);
        java.util.Locale locale9 = new java.util.Locale("zho", "22", "Standard");
        java.lang.String str10 = locale9.getVariant();
        java.lang.String str11 = property2.getAsShortText(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale9.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for 22");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals(locale9.toString(), "zho_22_Standard");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Standard" + "'", str10, "Standard");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean5 = mutableDateTime0.isBefore((org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime4.add((long) 13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime2.minuteOfHour();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight.Property property12 = dateMidnight11.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight11.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.withCenturyOfEra((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod20 = mutablePeriod19.copy();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight.Property property23 = dateMidnight22.yearOfCentury();
        org.joda.time.Duration duration24 = mutablePeriod20.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod28 = mutablePeriod27.copy();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.yearOfCentury();
        org.joda.time.Duration duration32 = mutablePeriod28.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight30);
        boolean boolean33 = duration24.isShorterThan((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration34 = duration32.toDuration();
        org.joda.time.Interval interval35 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight16, (org.joda.time.ReadableDuration) duration32);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime2.plus((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (short) -1, chronology38);
        int int40 = localDate39.getYearOfCentury();
        org.joda.time.LocalDate.Property property41 = localDate39.centuryOfEra();
        org.joda.time.LocalDate localDate42 = property41.getLocalDate();
        org.joda.time.LocalDate.Property property43 = localDate42.dayOfYear();
        org.joda.time.LocalDate localDate44 = property43.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = localDateTime36.isBefore((org.joda.time.ReadablePartial) localDate44);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(mutablePeriod28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 69 + "'", int40 == 69);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localDate44);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 365);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weeks();
        boolean boolean5 = localDate3.isSupported(durationFieldType4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType10 = periodType9.withWeeksRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight7, readableDuration8, periodType9);
        org.joda.time.Period period13 = period11.withSeconds(0);
        org.joda.time.LocalDate localDate14 = localDate3.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Period period15 = period11.toPeriod();
        org.joda.time.Duration duration16 = period11.toStandardDuration();
        org.joda.time.Period period18 = period11.minusMonths(429);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(period18);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffset(0L);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime.Property property5 = dateTime4.dayOfMonth();
        int int6 = dateTime4.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.DurationFieldType durationFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime5.withFieldAdded(durationFieldType6, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        java.lang.String str4 = localTime1.toString("22");
        org.joda.time.LocalTime localTime6 = localTime1.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localTime1.isSupported(dateTimeFieldType7);
        org.joda.time.Period period11 = new org.joda.time.Period((long) 1, (long) (short) 0);
        org.joda.time.LocalTime localTime12 = localTime1.minus((org.joda.time.ReadablePeriod) period11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime12.withMinuteOfHour((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "22" + "'", str4, "22");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone26);
        org.joda.time.DateTime dateTime28 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime28.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime29.year();
        boolean boolean31 = dateMidnight23.isAfter((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight23.plusWeeks((int) (short) 100);
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
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateMidnight33);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withChronologyRetainFields(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.plusHours((-1));
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.withChronologyRetainFields(chronology22);
        long long25 = chronology18.set((org.joda.time.ReadablePartial) timeOfDay21, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology18);
        org.joda.time.DateTime dateTime27 = dateTime8.toDateTime(chronology18);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone30);
        org.joda.time.Chronology chronology32 = chronology18.withZone(dateTimeZone30);
        boolean boolean33 = dateTimeZone1.equals((java.lang.Object) chronology18);
        org.joda.time.DateMidnight dateMidnight34 = org.joda.time.DateMidnight.now(dateTimeZone1);
        int int35 = dateMidnight34.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight37 = dateMidnight34.withEra(429);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 429 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-86399999L) + "'", long25 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withChronologyRetainFields(chronology6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusHours((-1));
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        long long18 = chronology11.set((org.joda.time.ReadablePartial) timeOfDay14, (long) (byte) -1);
        org.joda.time.DurationField durationField19 = chronology11.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(2968, 11, 0, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-86399999L) + "'", long18 == (-86399999L));
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusYears((int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withChronologyRetainFields(chronology6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusHours((-1));
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        long long18 = chronology11.set((org.joda.time.ReadablePartial) timeOfDay14, (long) (byte) -1);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = periodType21.isSupported(durationFieldType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 1, 0L, periodType21);
        int[] intArray27 = chronology11.get((org.joda.time.ReadablePeriod) period24, (long) 2022, (long) ' ');
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((java.lang.Object) dateTime0, chronology11);
        org.joda.time.DateTimeField dateTimeField29 = chronology11.weekyear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType34 = periodType33.withWeeksRemoved();
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight31, readableDuration32, periodType33);
        org.joda.time.Period period37 = period35.withSeconds(0);
        org.joda.time.Period period39 = period37.plusMinutes((int) (byte) 1);
        org.joda.time.Period period41 = period37.plusSeconds(8);
        int int42 = period41.getMonths();
        int[] intArray44 = chronology11.get((org.joda.time.ReadablePeriod) period41, (long) (short) 10);
        org.joda.time.PeriodType periodType45 = period41.getPeriodType();
        org.joda.time.Period period47 = period41.plusHours((int) ' ');
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-86399999L) + "'", long18 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(period47);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        org.joda.time.YearMonth.Property property4 = yearMonth2.year();
        org.joda.time.DurationField durationField5 = property4.getDurationField();
        long long7 = durationField5.getMillis((long) (byte) 100);
        int int10 = durationField5.getValue(672L, (long) 5);
        long long12 = durationField5.getValueAsLong((long) 8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3155695200000L + "'", long7 == 3155695200000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withYear((int) 'u');
        org.joda.time.DateTime.Property property3 = dateTime0.era();
        org.joda.time.DateTime dateTime4 = property3.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property3.getFieldType();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.io.Writer writer3 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate7 = localDate5.plusWeeks(9);
        org.joda.time.DateMidnight dateMidnight8 = localDate5.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer3, (org.joda.time.ReadableInstant) dateMidnight8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight8);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.clear();
        calendar0.setFirstDayOfWeek((int) (byte) 0);
        calendar0.setTimeInMillis((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(31, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) 8);
        java.lang.String str2 = yearMonthDay1.toString();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) -1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.minusYears(1);
        org.joda.time.LocalDate.Property property8 = localDate5.year();
        org.joda.time.LocalDate.Property property9 = localDate5.dayOfYear();
        int int10 = localDate5.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int12 = localDate5.get(dateTimeFieldType11);
        org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay1.withField(dateTimeFieldType11, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType16 = yearMonthDay14.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1969 + "'", int10 == 1969);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
        org.junit.Assert.assertNotNull(yearMonthDay14);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.Period period1 = org.joda.time.Period.days(4);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.Date date1 = new java.util.Date(100L);
        long long2 = date1.getTime();
        int int3 = date1.getSeconds();
        int int4 = date1.getMonth();
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime localTime8 = localTime6.plusHours((int) (short) 10);
        org.joda.time.LocalTime localTime10 = localTime6.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime11 = localTime6.toDateTimeToday();
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfCentury(0);
        org.joda.time.DateTime dateTime14 = dateTime11.toDateTimeISO();
        java.util.Date date15 = dateTime11.toDate();
        int int16 = date1.compareTo(date15);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Tue Feb 22 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        int int3 = charSet2.size();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withChronologyRetainFields(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.plusHours((-1));
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.withChronologyRetainFields(chronology22);
        long long25 = chronology18.set((org.joda.time.ReadablePartial) timeOfDay21, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology18);
        org.joda.time.DateTime dateTime27 = dateTime8.toDateTime(chronology18);
        org.joda.time.DateTimeField dateTimeField28 = chronology18.yearOfCentury();
        org.joda.time.DurationField durationField29 = chronology18.days();
        boolean boolean30 = charSet2.remove((java.lang.Object) chronology18);
        org.joda.time.Period period31 = new org.joda.time.Period((-1L), chronology18);
        org.joda.time.DateTimeField dateTimeField32 = chronology18.weekyear();
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property35 = localTime34.millisOfDay();
        org.joda.time.LocalTime localTime37 = property35.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime38 = property35.roundHalfFloorCopy();
        int int39 = localTime38.size();
        org.joda.time.LocalTime localTime41 = localTime38.minusSeconds(100);
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime45 = dateTime43.minusYears((int) ' ');
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.TimeOfDay timeOfDay48 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.withChronologyRetainFields(chronology49);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = timeOfDay50.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay50.plusHours((-1));
        org.joda.time.Chronology chronology54 = timeOfDay53.getChronology();
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.TimeOfDay timeOfDay57 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology56);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.TimeOfDay timeOfDay59 = timeOfDay57.withChronologyRetainFields(chronology58);
        long long61 = chronology54.set((org.joda.time.ReadablePartial) timeOfDay57, (long) (byte) -1);
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType65 = null;
        boolean boolean66 = periodType64.isSupported(durationFieldType65);
        org.joda.time.Period period67 = new org.joda.time.Period((long) (byte) 1, 0L, periodType64);
        int[] intArray70 = chronology54.get((org.joda.time.ReadablePeriod) period67, (long) 2022, (long) ' ');
        org.joda.time.DateMidnight dateMidnight71 = new org.joda.time.DateMidnight((java.lang.Object) dateTime43, chronology54);
        org.joda.time.DateTimeField dateTimeField72 = chronology54.weekyear();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.DateMidnight dateMidnight74 = new org.joda.time.DateMidnight(chronology73);
        org.joda.time.ReadableDuration readableDuration75 = null;
        org.joda.time.PeriodType periodType76 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType77 = periodType76.withWeeksRemoved();
        org.joda.time.Period period78 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight74, readableDuration75, periodType76);
        org.joda.time.Period period80 = period78.withSeconds(0);
        org.joda.time.Period period82 = period80.plusMinutes((int) (byte) 1);
        org.joda.time.Period period84 = period80.plusSeconds(8);
        int int85 = period84.getMonths();
        int[] intArray87 = chronology54.get((org.joda.time.ReadablePeriod) period84, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray89 = dateTimeField32.addWrapPartial((org.joda.time.ReadablePartial) localTime38, 70, intArray87, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 70");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-86399999L) + "'", long25 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-86399999L) + "'", long61 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertNotNull(periodType76);
        org.junit.Assert.assertNotNull(periodType77);
        org.junit.Assert.assertNotNull(period80);
        org.junit.Assert.assertNotNull(period82);
        org.junit.Assert.assertNotNull(period84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray87), "[0, 0, 0, 0, 0, 0, 10]");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        // The following exception was thrown during execution in test generation
        try {
            calendar10.setWeekDate((int) 'u', 53, 999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 999");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645570800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.copy();
        org.joda.time.format.PeriodFormatter periodFormatter4 = null;
        java.lang.String str5 = mutablePeriod3.toString(periodFormatter4);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType7 = periodType6.withYearsRemoved();
        org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) periodFormatter4, periodType6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) periodType6, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0.099S" + "'", str5, "PT0.099S");
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((java.lang.Object) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        org.joda.time.Chronology chronology17 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.minuteOfHour();
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime24 = dateTime22.minusYears((int) ' ');
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.TimeOfDay timeOfDay27 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay27.withChronologyRetainFields(chronology28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = timeOfDay29.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay29.plusHours((-1));
        org.joda.time.Chronology chronology33 = timeOfDay32.getChronology();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay36.withChronologyRetainFields(chronology37);
        long long40 = chronology33.set((org.joda.time.ReadablePartial) timeOfDay36, (long) (byte) -1);
        org.joda.time.PeriodType periodType43 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType44 = null;
        boolean boolean45 = periodType43.isSupported(durationFieldType44);
        org.joda.time.Period period46 = new org.joda.time.Period((long) (byte) 1, 0L, periodType43);
        int[] intArray49 = chronology33.get((org.joda.time.ReadablePeriod) period46, (long) 2022, (long) ' ');
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight((java.lang.Object) dateTime22, chronology33);
        org.joda.time.DateTimeField dateTimeField51 = chronology33.weekyear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.ReadableDuration readableDuration54 = null;
        org.joda.time.PeriodType periodType55 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType56 = periodType55.withWeeksRemoved();
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight53, readableDuration54, periodType55);
        org.joda.time.Period period59 = period57.withSeconds(0);
        org.joda.time.Period period61 = period59.plusMinutes((int) (byte) 1);
        org.joda.time.Period period63 = period59.plusSeconds(8);
        int int64 = period63.getMonths();
        int[] intArray66 = chronology33.get((org.joda.time.ReadablePeriod) period63, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray68 = dateTimeField18.addWrapField((org.joda.time.ReadablePartial) localTime20, 1969, intArray66, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-86399999L) + "'", long40 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(periodType55);
        org.junit.Assert.assertNotNull(periodType56);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 0, 0, 0, 0, 0, 10]");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(1, 32772, (int) (byte) 1, 70, 11, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("fr");
        int int3 = timeZone1.getOffset((long) 31);
        java.util.Locale locale4 = java.util.Locale.PRC;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1, locale4);
        boolean boolean6 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645513786155,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=46,MILLISECOND=155,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weeks();
        boolean boolean5 = localDate3.isSupported(durationFieldType4);
        org.joda.time.DateTime dateTime6 = localDate3.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate8 = localDate3.plusWeeks(10);
        org.joda.time.LocalDate.Property property9 = localDate3.year();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone13);
        org.joda.time.DateTime dateTime15 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime15.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime16.year();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(obj19, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.secondOfMinute();
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.lang.String str25 = localDateTime21.toString("22", locale24);
        java.lang.String str26 = locale24.getLanguage();
        int int27 = property17.getMaximumShortTextLength(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = localDate3.toString("utc", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: u");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "22" + "'", str25, "22");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fr" + "'", str26, "fr");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = periodType18.isSupported(durationFieldType19);
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) 1, 0L, periodType18);
        int[] intArray24 = chronology8.get((org.joda.time.ReadablePeriod) period21, (long) 2022, (long) ' ');
        org.joda.time.DurationField durationField25 = chronology8.months();
        org.joda.time.DurationFieldType durationFieldType26 = durationField25.getType();
        long long29 = durationField25.subtract(292281961L, (long) (-1));
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 2970681961L + "'", long29 == 2970681961L);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int int0 = org.joda.time.TimeOfDay.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.Date date1 = new java.util.Date((long) 6);
        org.joda.time.YearMonth yearMonth2 = org.joda.time.YearMonth.fromDateFields(date1);
        java.lang.String str3 = date1.toGMTString();
        java.lang.Object obj4 = date1.clone();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str3, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        org.joda.time.Instant instant4 = instant2.plus((long) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime();
        int int6 = mutableDateTime5.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType13 = periodType12.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime5, (org.joda.time.ReadableInstant) dateTime10, periodType13);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod18 = mutablePeriod17.copy();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.yearOfCentury();
        org.joda.time.Duration duration22 = mutablePeriod18.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight20);
        mutablePeriod14.setPeriod((org.joda.time.ReadableDuration) duration22);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) instant2, (org.joda.time.ReadableDuration) duration22);
        java.lang.Object obj25 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone28);
        int int30 = dateTime29.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = dateTime29.toDateTime(dateTimeZone32);
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(obj25, dateTimeZone32);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime35.year();
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.time();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) mutableDateTime35, periodType37);
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(periodType37);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime();
        int int41 = mutableDateTime40.getDayOfMonth();
        org.joda.time.Instant instant42 = mutableDateTime40.toInstant();
        boolean boolean44 = mutableDateTime40.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int48 = dateTimeZone46.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime40.setZone(dateTimeZone46);
        org.joda.time.MutableDateTime mutableDateTime50 = new org.joda.time.MutableDateTime();
        int int51 = mutableDateTime50.getDayOfMonth();
        org.joda.time.Instant instant52 = mutableDateTime50.toInstant();
        boolean boolean54 = mutableDateTime50.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int58 = dateTimeZone56.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime50.setZone(dateTimeZone56);
        long long61 = dateTimeZone56.previousTransition((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime40.toMutableDateTime(dateTimeZone56);
        mutableDateTime62.setMillisOfSecond(11);
        org.joda.time.Chronology chronology65 = null;
        org.joda.time.DateMidnight dateMidnight66 = new org.joda.time.DateMidnight(chronology65);
        org.joda.time.DateMidnight.Property property67 = dateMidnight66.era();
        org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime();
        int int69 = mutableDateTime68.getDayOfMonth();
        boolean boolean70 = dateMidnight66.isEqual((org.joda.time.ReadableInstant) mutableDateTime68);
        org.joda.time.DateMidnight.Property property71 = dateMidnight66.era();
        mutableDateTime62.setTime((org.joda.time.ReadableInstant) dateMidnight66);
        org.joda.time.MutableDateTime mutableDateTime73 = new org.joda.time.MutableDateTime();
        int int74 = mutableDateTime73.getDayOfMonth();
        org.joda.time.Instant instant75 = mutableDateTime73.toInstant();
        boolean boolean77 = mutableDateTime73.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int81 = dateTimeZone79.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime73.setZone(dateTimeZone79);
        long long84 = dateTimeZone79.previousTransition((long) (short) -1);
        mutableDateTime62.setZone(dateTimeZone79);
        java.lang.Object obj86 = null;
        org.joda.time.DateTimeZone dateTimeZone89 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime90 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone89);
        int int91 = dateTime90.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone93 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime94 = new org.joda.time.LocalDateTime(dateTimeZone93);
        org.joda.time.DateTime dateTime95 = dateTime90.toDateTime(dateTimeZone93);
        org.joda.time.MutableDateTime mutableDateTime96 = new org.joda.time.MutableDateTime(obj86, dateTimeZone93);
        org.joda.time.MutableDateTime.Property property97 = mutableDateTime96.year();
        org.joda.time.MutableDateTime.Property property98 = mutableDateTime96.dayOfWeek();
        mutablePeriod39.setPeriod((org.joda.time.ReadableInstant) mutableDateTime62, (org.joda.time.ReadableInstant) mutableDateTime96);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 22 + "'", int41 == 22);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 22 + "'", int51 == 22);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-1L) + "'", long61 == (-1L));
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 22 + "'", int69 == 22);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 22 + "'", int74 == 22);
        org.junit.Assert.assertNotNull(instant75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(dateTimeZone79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + (-1L) + "'", long84 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone93);
        org.junit.Assert.assertNotNull(dateTime95);
        org.junit.Assert.assertNotNull(property97);
        org.junit.Assert.assertNotNull(property98);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) mutableDateTime1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.era();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMillisOfSecond(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        int int9 = mutableDateTime8.getDayOfMonth();
        org.joda.time.Instant instant10 = mutableDateTime8.toInstant();
        int int11 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) instant10);
        org.joda.time.DateTime dateTime12 = localTime5.toDateTimeToday(dateTimeZone7);
        int int13 = dateTime12.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime12.withTime(2000, 1970, 69, 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight4, readableDuration5, periodType6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.plusHours((-1));
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.withChronologyRetainFields(chronology21);
        long long24 = chronology17.set((org.joda.time.ReadablePartial) timeOfDay20, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField25 = chronology17.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight4.withChronology(chronology17);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone29);
        org.joda.time.DateTime dateTime31 = dateTime30.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime32.year();
        boolean boolean34 = dateMidnight26.isAfter((org.joda.time.ReadableInstant) mutableDateTime32);
        int int35 = mutableDateTime32.getCenturyOfEra();
        int int36 = mutableDateTime32.getSecondOfDay();
        org.joda.time.Chronology chronology37 = mutableDateTime32.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight((int) (short) 0, 999, 0, chronology37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-86399999L) + "'", long24 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 19 + "'", int35 == 19);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(chronology37);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        calendar10.set(7, (int) (short) 0, 2022);
        java.lang.String str15 = calendar10.getCalendarType();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar10);
        calendar10.setFirstDayOfWeek(13);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = calendar10.getActualMinimum((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-61771769999999,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=13,minimalDaysInFirstWeek=4,ERA=1,YEAR=12,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=196,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "gregory" + "'", str15, "gregory");
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod6 = mutablePeriod5.copy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.yearOfCentury();
        org.joda.time.Duration duration10 = mutablePeriod6.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight8);
        org.joda.time.YearMonth yearMonth11 = yearMonth2.minus((org.joda.time.ReadablePeriod) mutablePeriod6);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        boolean boolean16 = periodType14.isSupported(durationFieldType15);
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 1, 0L, periodType14);
        java.lang.String str18 = period17.toString();
        org.joda.time.YearMonth yearMonth19 = yearMonth11.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period22 = new org.joda.time.Period((long) 1, (long) (short) 0);
        org.joda.time.YearMonth yearMonth23 = yearMonth11.plus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime();
        int int25 = mutableDateTime24.getDayOfMonth();
        org.joda.time.Instant instant26 = mutableDateTime24.toInstant();
        org.joda.time.MutableDateTime mutableDateTime27 = instant26.toMutableDateTime();
        org.joda.time.Instant instant28 = instant26.toInstant();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone31);
        int int33 = dateTime32.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = dateTime32.toDateTime(dateTimeZone35);
        org.joda.time.DateTime.Property property38 = dateTime32.weekyear();
        org.joda.time.DateTime dateTime40 = property38.setCopy(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str42 = dateTimeFieldType41.getName();
        org.joda.time.DateTime.Property property43 = dateTime40.property(dateTimeFieldType41);
        int int44 = instant28.get(dateTimeFieldType41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth46 = yearMonth11.withField(dateTimeFieldType41, 2023);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(mutablePeriod6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(yearMonth11);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0.001S" + "'", str18, "PT0.001S");
        org.junit.Assert.assertNotNull(yearMonth19);
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 22 + "'", int25 == 22);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "dayOfMonth" + "'", str42, "dayOfMonth");
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 22 + "'", int44 == 22);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime3 = dateTime1.minusYears((int) ' ');
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.withChronologyRetainFields(chronology7);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = timeOfDay8.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay8.plusHours((-1));
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.withChronologyRetainFields(chronology16);
        long long19 = chronology12.set((org.joda.time.ReadablePartial) timeOfDay15, (long) (byte) -1);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = periodType22.isSupported(durationFieldType23);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) 1, 0L, periodType22);
        int[] intArray28 = chronology12.get((org.joda.time.ReadablePeriod) period25, (long) 2022, (long) ' ');
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((java.lang.Object) dateTime1, chronology12);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 1, chronology12);
        org.joda.time.DurationField durationField31 = chronology12.minutes();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-86399999L) + "'", long19 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth(dateTimeZone1);
        int int3 = yearMonth2.getYear();
        org.joda.time.YearMonth.Property property4 = yearMonth2.year();
        org.joda.time.DurationField durationField5 = property4.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNull(durationField5);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfYear();
        org.joda.time.LocalDate localDate8 = property6.addWrapFieldToCopy(365);
        int int9 = localDate8.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDate8.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 100);
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj2, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.minus((org.joda.time.ReadablePeriod) mutablePeriod9);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod14 = mutablePeriod13.copy();
        mutablePeriod9.add((org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType20 = periodType19.withWeeksRemoved();
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight17, readableDuration18, periodType19);
        org.joda.time.Period period23 = period21.withSeconds(0);
        boolean boolean24 = mutablePeriod14.equals((java.lang.Object) period21);
        mutablePeriod14.addMinutes(2);
        mutablePeriod14.setPeriod(480L);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod14);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfWeek(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("UTC");
        double double2 = languageRange1.getWeight();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime();
        int int4 = mutableDateTime3.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone7);
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType11 = periodType10.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime3, (org.joda.time.ReadableInstant) dateTime8, periodType11);
        org.joda.time.LocalDateTime localDateTime13 = dateTime8.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYearOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withDayOfYear(3);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withCenturyOfEra(0);
        boolean boolean20 = languageRange1.equals((java.lang.Object) localDateTime15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDateTime2.toString("DateTimeField[year]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate2.withDayOfMonth((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str3 = dateTimeFieldType2.getName();
        boolean boolean4 = localDateTime1.isSupported(dateTimeFieldType2);
        int int5 = localDateTime1.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMonthOfYear(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645513787649,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=47,MILLISECOND=649,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "dayOfMonth" + "'", str3, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = mutableDateTime0.getChronology();
        mutableDateTime0.setWeekyear(4);
        org.joda.time.Chronology chronology5 = mutableDateTime0.getChronology();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        long long11 = dateTimeField9.roundHalfEven((long) 6);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setRounding(dateTimeField9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 6L + "'", long11 == 6L);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfDay();
        org.joda.time.LocalTime localTime20 = property18.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime21 = property18.roundHalfFloorCopy();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType26 = periodType25.withWeeksRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24, periodType25);
        org.joda.time.Period period29 = period27.withSeconds(0);
        org.joda.time.Period period31 = period29.plusMinutes((int) (byte) 1);
        org.joda.time.Period period33 = period29.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period36 = period29.withField(durationFieldType34, 7);
        org.joda.time.LocalTime localTime38 = localTime21.withPeriodAdded((org.joda.time.ReadablePeriod) period29, (int) (short) 1);
        org.joda.time.Period period40 = period29.withMillis((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay11.minus((org.joda.time.ReadablePeriod) period29);
        int int42 = timeOfDay11.getMinuteOfHour();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-86399999L) + "'", long15 == (-86399999L));
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("UTC");
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
        org.joda.time.DurationField durationField27 = chronology16.days();
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(chronology16);
        org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now(chronology16);
        boolean boolean30 = dateTimeZone1.equals((java.lang.Object) mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
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
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(31, 11, 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        org.joda.time.DateTimeField dateTimeField24 = chronology14.weekyear();
        java.lang.Object obj25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(obj25, dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.minus((org.joda.time.ReadablePeriod) mutablePeriod32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withWeekyear((-1));
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.dayOfMonth();
        int int37 = localDateTime35.getWeekyear();
        int int38 = localDateTime35.getDayOfYear();
        java.lang.Object obj40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(obj40, dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime42.minus((org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.withWeekyear((-1));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter51 = null;
        java.lang.String str52 = localDateTime50.toString(dateTimeFormatter51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime50.plusHours((int) (short) 10);
        int[] intArray55 = localDateTime54.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray57 = dateTimeField24.addWrapPartial((org.joda.time.ReadablePartial) localDateTime35, (int) (short) -1, intArray55, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 54 + "'", int38 == 54);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "-0001-02-23T07:09:47.905" + "'", str52, "-0001-02-23T07:09:47.905");
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(intArray55);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[-1, 2, 23, 61787905]");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("fr");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.setWeekDate(2968, 3, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645513788024,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=48,MILLISECOND=24,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.Character[] charArray1 = new java.lang.Character[] { 'a' };
        java.util.LinkedHashSet<java.lang.Character> charSet2 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet2, charArray1);
        java.lang.Object[] objArray4 = charSet2.toArray();
        java.lang.Object obj7 = null;
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
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType27 = null;
        boolean boolean28 = periodType26.isSupported(durationFieldType27);
        org.joda.time.Period period29 = new org.joda.time.Period((long) (byte) 1, 0L, periodType26);
        int[] intArray32 = chronology16.get((org.joda.time.ReadablePeriod) period29, (long) 2022, (long) ' ');
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(obj7, chronology16);
        org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, 0, chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth35 = new org.joda.time.YearMonth((java.lang.Object) objArray4, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: [Ljava.lang.Object;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[a]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[a]");
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-86399999L) + "'", long23 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 0, 0, -1, -990]");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        java.lang.String str4 = localTime1.toString("22");
        org.joda.time.LocalTime localTime6 = localTime1.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localTime6.toString("T23:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "22" + "'", str4, "22");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = timeOfDay7.toLocalTime();
        org.joda.time.TimeOfDay.Property property9 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property9.getTimeOfDay();
        org.joda.time.YearMonth yearMonth12 = org.joda.time.YearMonth.now();
        java.util.Locale locale14 = java.util.Locale.ENGLISH;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        java.lang.String str16 = yearMonth12.toString("07:09:28.341", locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay17 = property9.setCopy("1 Jan 1970 00:00:00 GMT", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1 Jan 1970 00:00:00 GMT\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(yearMonth12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645513788153,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=48,MILLISECOND=153,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "07:09:28.341" + "'", str16, "07:09:28.341");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime3.toDateTime(dateTimeZone6);
        org.joda.time.DateTime.Property property9 = dateTime3.weekyear();
        org.joda.time.DateTime dateTime11 = property9.setCopy(2);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withZone(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTime11.toString(dateTimeFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(22, (int) (short) 0, (int) (byte) 100, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZone(dateTimeZone3);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        org.joda.time.LocalTime localTime9 = property7.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime11 = property7.addWrapFieldToCopy((int) 'u');
        int int12 = property7.getMinimumValue();
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
        org.joda.time.DateTimeField dateTimeField38 = chronology27.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = chronology27.year();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology42);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.TimeOfDay timeOfDay45 = timeOfDay43.withChronologyRetainFields(chronology44);
        org.joda.time.DateTime dateTime46 = timeOfDay45.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay48 = timeOfDay45.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime49 = timeOfDay48.toDateTimeToday();
        java.util.Locale locale50 = java.util.Locale.ITALY;
        java.util.Calendar calendar51 = dateTime49.toCalendar(locale50);
        java.lang.String str52 = dateTimeField39.getAsShortText(1970, locale50);
        java.lang.String str53 = locale50.getLanguage();
        java.lang.String str54 = property7.getAsShortText(locale50);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter2.withLocale(locale50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime57 = dateTimeFormatter2.parseLocalTime("year");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
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
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar51);
        org.junit.Assert.assertEquals(calendar51.toString(), "java.util.GregorianCalendar[time=1645570800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "1970" + "'", str52, "1970");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "it" + "'", str53, "it");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "1" + "'", str54, "1");
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) 8);
        java.lang.String str2 = yearMonthDay1.toString();
        java.lang.String str3 = yearMonthDay1.toString();
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.plusDays(4);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.plusYears(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay5.withDayOfMonth((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        mutableDateTime0.addHours((int) (short) -1);
        java.lang.Object obj3 = mutableDateTime0.clone();
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "2022-02-22T06:09:48.506Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "2022-02-22T06:09:48.506Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "2022-02-22T06:09:48.506Z");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = periodType18.isSupported(durationFieldType19);
        org.joda.time.Period period21 = new org.joda.time.Period((long) (byte) 1, 0L, periodType18);
        int[] intArray24 = chronology8.get((org.joda.time.ReadablePeriod) period21, (long) 2022, (long) ' ');
        org.joda.time.DurationField durationField25 = chronology8.months();
        org.joda.time.DurationFieldType durationFieldType26 = durationField25.getType();
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime27.monthOfYear();
        org.joda.time.Chronology chronology29 = mutableDateTime27.getChronology();
        mutableDateTime27.setWeekyear(4);
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType37 = null;
        boolean boolean38 = periodType36.isSupported(durationFieldType37);
        org.joda.time.Period period39 = new org.joda.time.Period((long) (byte) 1, 0L, periodType36);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod43 = mutablePeriod42.copy();
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.TimeOfDay timeOfDay48 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology47);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.TimeOfDay timeOfDay50 = timeOfDay48.withChronologyRetainFields(chronology49);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray51 = timeOfDay50.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay50.plusHours((-1));
        org.joda.time.Chronology chronology54 = timeOfDay53.getChronology();
        mutablePeriod42.setPeriod((long) (byte) 1, 208L, chronology54);
        boolean boolean56 = periodType36.equals((java.lang.Object) chronology54);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(0L, (long) 58, periodType36);
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType59 = dateTimeFieldType58.getDurationType();
        boolean boolean60 = periodType36.isSupported(durationFieldType59);
        mutableDateTime27.add(durationFieldType59, 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType64 = dateTimeFieldType63.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray65 = new org.joda.time.DurationFieldType[] { durationFieldType26, durationFieldType59, durationFieldType64 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType66 = org.joda.time.PeriodType.forFields(durationFieldTypeArray65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [weekyears, weekyears]");
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
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray51);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertNotNull(durationFieldType59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertNotNull(durationFieldTypeArray65);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.LocalDateTime localDateTime10 = dateTime5.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfYear(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay18 = timeOfDay11.withField(dateTimeFieldType16, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
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
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((java.lang.Object) (short) 1, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.Object obj2 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withChronologyRetainFields(chronology6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusHours((-1));
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        long long18 = chronology11.set((org.joda.time.ReadablePartial) timeOfDay14, (long) (byte) -1);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = periodType21.isSupported(durationFieldType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 1, 0L, periodType21);
        int[] intArray27 = chronology11.get((org.joda.time.ReadablePeriod) period24, (long) 2022, (long) ' ');
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(obj2, chronology11);
        org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(0, 0, chronology11);
        org.joda.time.TimeOfDay.Property property30 = timeOfDay29.hourOfDay();
        java.util.Locale locale32 = null;
        org.joda.time.TimeOfDay timeOfDay33 = property30.setCopy("22", locale32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay35 = property30.setCopy("T23:00:00.001");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T23:00:00.001\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-86399999L) + "'", long18 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(timeOfDay33);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.minusYears((int) ' ');
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
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType24 = null;
        boolean boolean25 = periodType23.isSupported(durationFieldType24);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (byte) 1, 0L, periodType23);
        int[] intArray29 = chronology13.get((org.joda.time.ReadablePeriod) period26, (long) 2022, (long) ' ');
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((java.lang.Object) dateTime2, chronology13);
        org.joda.time.DateTimeField dateTimeField31 = chronology13.weekyear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType36 = periodType35.withWeeksRemoved();
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight33, readableDuration34, periodType35);
        org.joda.time.Period period39 = period37.withSeconds(0);
        org.joda.time.Period period41 = period39.plusMinutes((int) (byte) 1);
        org.joda.time.Period period43 = period39.plusSeconds(8);
        int int44 = period43.getMonths();
        int[] intArray46 = chronology13.get((org.joda.time.ReadablePeriod) period43, (long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay((int) (byte) 0, 6000000, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6000000 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-86399999L) + "'", long20 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[0, 0, 0, 0, 0, 0, 10]");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T00:00:00.000Z/1970-01-0...\" is malformed at \"70-01-01T00:00:00.000Z/1970-01-0...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = timeOfDay7.toLocalTime();
        org.joda.time.TimeOfDay.Property property9 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property9.getTimeOfDay();
        int int11 = property9.get();
        org.joda.time.TimeOfDay timeOfDay13 = property9.addToCopy(53);
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = property9.compareTo(readablePartial14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(timeOfDay13);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = timeOfDay4.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.plusHours((-1));
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.yearOfCentury();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.withChronologyRetainFields(chronology14);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = timeOfDay15.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay15.plusHours((-1));
        org.joda.time.Chronology chronology19 = timeOfDay18.getChronology();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.withChronologyRetainFields(chronology23);
        long long26 = chronology19.set((org.joda.time.ReadablePartial) timeOfDay22, (long) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime();
        int int28 = mutableDateTime27.getDayOfMonth();
        org.joda.time.Instant instant29 = mutableDateTime27.toInstant();
        boolean boolean31 = mutableDateTime27.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int35 = dateTimeZone33.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime27.setZone(dateTimeZone33);
        org.joda.time.DateTime dateTime37 = timeOfDay22.toDateTimeToday(dateTimeZone33);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight.Property property40 = dateMidnight39.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight39.withDayOfYear((int) '#');
        org.joda.time.DateTime dateTime43 = timeOfDay22.toDateTime((org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.LocalTime localTime44 = timeOfDay22.toLocalTime();
        java.util.Locale locale45 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) localTime44, locale45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-86399999L) + "'", long26 == (-86399999L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 22 + "'", int28 == 22);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_CN");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2022-02-22T07:09:21.203Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-22T07:09:21.203Z\" is malformed at \"22-02-22T07:09:21.203Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withDayOfMonth((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int3 = dateTimeZone1.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime8.toMutableDateTime();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.withChronologyRetainFields(chronology13);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = timeOfDay14.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay14.plusHours((-1));
        org.joda.time.Chronology chronology18 = timeOfDay17.getChronology();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology20);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.withChronologyRetainFields(chronology22);
        long long25 = chronology18.set((org.joda.time.ReadablePartial) timeOfDay21, (long) (byte) -1);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay(chronology18);
        org.joda.time.DateTime dateTime27 = dateTime8.toDateTime(chronology18);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone30);
        org.joda.time.Chronology chronology32 = chronology18.withZone(dateTimeZone30);
        boolean boolean33 = dateTimeZone1.equals((java.lang.Object) chronology18);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate37 = localDate35.plusWeeks(9);
        org.joda.time.LocalDate.Property property38 = localDate35.dayOfYear();
        org.joda.time.LocalDate localDate40 = property38.setCopy((int) (short) 10);
        int int41 = localDate40.getMonthOfYear();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.TimeOfDay timeOfDay44 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay44.withChronologyRetainFields(chronology45);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray47 = timeOfDay46.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay46.plusHours((-1));
        org.joda.time.Chronology chronology50 = timeOfDay49.getChronology();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.TimeOfDay timeOfDay53 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology52);
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.TimeOfDay timeOfDay55 = timeOfDay53.withChronologyRetainFields(chronology54);
        long long57 = chronology50.set((org.joda.time.ReadablePartial) timeOfDay53, (long) (byte) -1);
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType61 = null;
        boolean boolean62 = periodType60.isSupported(durationFieldType61);
        org.joda.time.Period period63 = new org.joda.time.Period((long) (byte) 1, 0L, periodType60);
        int[] intArray66 = chronology50.get((org.joda.time.ReadablePeriod) period63, (long) 2022, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            chronology18.validate((org.joda.time.ReadablePartial) localDate40, intArray66);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-86399999L) + "'", long25 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-86399999L) + "'", long57 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 0, 0, 0, 0, -1, -990]");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.plusYears(1969);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withField(dateTimeFieldType7, 0);
        org.joda.time.Interval interval10 = dateMidnight9.toInterval();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType17 = periodType16.withWeeksRemoved();
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15, periodType16);
        java.lang.Object obj19 = null;
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
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType39 = null;
        boolean boolean40 = periodType38.isSupported(durationFieldType39);
        org.joda.time.Period period41 = new org.joda.time.Period((long) (byte) 1, 0L, periodType38);
        int[] intArray44 = chronology28.get((org.joda.time.ReadablePeriod) period41, (long) 2022, (long) ' ');
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(obj19, chronology28);
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((long) 17, (long) (byte) -1, periodType16, chronology28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval47 = interval10.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) mutablePeriod46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray25);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-86399999L) + "'", long35 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, 0, 0, 0, -1, -990]");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        int int6 = localDate2.getWeekyear();
        org.joda.time.LocalDate localDate8 = localDate2.withCenturyOfEra(5);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.monthOfYear();
        org.joda.time.Chronology chronology3 = mutableDateTime1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) 6, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMinutes(6);
        int int9 = localDateTime6.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.plusYears(1969);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.withYearOfCentury((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        org.joda.time.LocalDate localDate7 = localDate2.minusDays(7);
        java.lang.String str8 = localDate7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField10 = localDate7.getField(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 31");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-24" + "'", str8, "1969-12-24");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.LocalDateTime localDateTime10 = dateTime5.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withDate(70, 429, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 429 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.DateTime dateTime7 = dateTime4.minusYears(100);
        org.joda.time.DateTime.Property property8 = dateTime4.dayOfMonth();
        org.joda.time.DateTime dateTime10 = property8.setCopy("22");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property8.setCopy("2022-02-22T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T00:00:00.000Z\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str3 = dateTimeFieldType2.getName();
        boolean boolean4 = localDateTime1.isSupported(dateTimeFieldType2);
        int int5 = localDateTime1.getDayOfWeek();
        int int6 = localDateTime1.getDayOfWeek();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645513789942,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=49,MILLISECOND=942,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "dayOfMonth" + "'", str3, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.yearOfCentury();
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withZone(dateTimeZone12);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property16 = localTime15.millisOfDay();
        org.joda.time.LocalTime localTime18 = property16.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime20 = property16.addWrapFieldToCopy((int) 'u');
        int int21 = property16.getMinimumValue();
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
        org.joda.time.DateTimeField dateTimeField47 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField48 = chronology36.year();
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.TimeOfDay timeOfDay52 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology51);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay52.withChronologyRetainFields(chronology53);
        org.joda.time.DateTime dateTime55 = timeOfDay54.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay57 = timeOfDay54.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime58 = timeOfDay57.toDateTimeToday();
        java.util.Locale locale59 = java.util.Locale.ITALY;
        java.util.Calendar calendar60 = dateTime58.toCalendar(locale59);
        java.lang.String str61 = dateTimeField48.getAsShortText(1970, locale59);
        java.lang.String str62 = locale59.getLanguage();
        java.lang.String str63 = property16.getAsShortText(locale59);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter11.withLocale(locale59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime65 = property7.setCopy("1970-1-1 0:01:00", locale59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-1-1 0:01:00\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
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
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar60);
        org.junit.Assert.assertEquals(calendar60.toString(), "java.util.GregorianCalendar[time=1645570800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "1970" + "'", str61, "1970");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "it" + "'", str62, "it");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "1" + "'", str63, "1");
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate localDate6 = localDate4.plusMonths(32);
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtMidnight();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZone(dateTimeZone3);
        java.lang.Integer int5 = dateTimeFormatter4.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = dateTimeFormatter4.parseMutableDateTime("Time");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear((int) '#');
        int int9 = localDateTime8.getHourOfDay();
        int int10 = localDateTime8.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withCenturyOfEra((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod10 = mutablePeriod9.copy();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.yearOfCentury();
        org.joda.time.Duration duration14 = mutablePeriod10.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight12);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod18 = mutablePeriod17.copy();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.yearOfCentury();
        org.joda.time.Duration duration22 = mutablePeriod18.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight20);
        boolean boolean23 = duration14.isShorterThan((org.joda.time.ReadableDuration) duration22);
        org.joda.time.Duration duration24 = duration22.toDuration();
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight6, (org.joda.time.ReadableDuration) duration22);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight6.withDayOfYear(2);
        org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime();
        int int29 = mutableDateTime28.getDayOfMonth();
        org.joda.time.Instant instant30 = mutableDateTime28.toInstant();
        org.joda.time.MutableDateTime mutableDateTime31 = instant30.toMutableDateTime();
        org.joda.time.Instant instant32 = instant30.toInstant();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone35);
        int int37 = dateTime36.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = dateTime36.toDateTime(dateTimeZone39);
        org.joda.time.DateTime.Property property42 = dateTime36.weekyear();
        org.joda.time.DateTime dateTime44 = property42.setCopy(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str46 = dateTimeFieldType45.getName();
        org.joda.time.DateTime.Property property47 = dateTime44.property(dateTimeFieldType45);
        int int48 = instant32.get(dateTimeFieldType45);
        org.joda.time.DateMidnight.Property property49 = dateMidnight6.property(dateTimeFieldType45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight51 = property49.setCopy("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Etc/UTC\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(mutablePeriod18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 22 + "'", int29 == 22);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "dayOfMonth" + "'", str46, "dayOfMonth");
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 22 + "'", int48 == 22);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) 2022);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getID();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone0.getDisplayName(true, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Etc/UTC" + "'", str1, "Etc/UTC");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        org.joda.time.Period period20 = period13.withField(durationFieldType18, 7);
        org.joda.time.LocalTime localTime22 = localTime5.withPeriodAdded((org.joda.time.ReadablePeriod) period13, (int) (short) 1);
        org.joda.time.YearMonth yearMonth23 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth25 = yearMonth23.withYear(7);
        org.joda.time.YearMonth.Property property26 = yearMonth25.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = localTime5.get(dateTimeFieldType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNotNull(yearMonth23);
        org.junit.Assert.assertNotNull(yearMonth25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType7 = periodType6.withWeeksRemoved();
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight4, readableDuration5, periodType6);
        org.joda.time.Period period10 = period8.withSeconds(0);
        org.joda.time.Period period12 = period10.plusMinutes((int) (byte) 1);
        org.joda.time.Period period14 = period10.withSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Period period17 = period10.withField(durationFieldType15, 7);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime();
        int int21 = mutableDateTime20.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone24);
        org.joda.time.DateTime dateTime26 = dateTime25.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType28 = periodType27.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime20, (org.joda.time.ReadableInstant) dateTime25, periodType28);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(208L, (long) 100, periodType28, chronology30);
        org.joda.time.Period period32 = period10.withPeriodType(periodType28);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.TimeOfDay timeOfDay35 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology34);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.withChronologyRetainFields(chronology36);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray38 = timeOfDay37.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay37.plusHours((-1));
        org.joda.time.Chronology chronology41 = timeOfDay40.getChronology();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.TimeOfDay timeOfDay44 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.TimeOfDay timeOfDay46 = timeOfDay44.withChronologyRetainFields(chronology45);
        long long48 = chronology41.set((org.joda.time.ReadablePartial) timeOfDay44, (long) (byte) -1);
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType52 = null;
        boolean boolean53 = periodType51.isSupported(durationFieldType52);
        org.joda.time.Period period54 = new org.joda.time.Period((long) (byte) 1, 0L, periodType51);
        int[] intArray57 = chronology41.get((org.joda.time.ReadablePeriod) period54, (long) 2022, (long) ' ');
        org.joda.time.DateTimeField dateTimeField58 = chronology41.yearOfCentury();
        org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) 54, periodType28, chronology41);
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight(100L, chronology41);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 22 + "'", int21 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(timeOfDay44);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-86399999L) + "'", long48 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(dateTimeField58);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str1 = locale0.getDisplayLanguage();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.standard();
        java.lang.String str5 = periodType4.getName();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
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
        org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(chronology20);
        org.joda.time.DateTime dateTime29 = dateTime10.toDateTime(chronology20);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 'x', periodType4, chronology20);
        org.joda.time.DateTimeField dateTimeField31 = chronology20.hourOfHalfday();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(867L, chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay((java.lang.Object) locale0, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587" + "'", str1, "\u4e2d\u6587");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Standard" + "'", str5, "Standard");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-86399999L) + "'", long27 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.LocalTime localTime8 = timeOfDay7.toLocalTime();
        org.joda.time.TimeOfDay.Property property9 = timeOfDay7.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay10 = property9.getTimeOfDay();
        int int11 = property9.get();
        org.joda.time.ReadableInstant readableInstant12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = property9.compareTo(readableInstant12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime0.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime7 = property5.addWrapField(17);
        org.joda.time.MutableDateTime mutableDateTime8 = property5.roundHalfCeiling();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localDateTime2, readablePartial7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int7 = dateTimeZone5.getOffset(0L);
        long long10 = dateTimeZone5.convertLocalToUTC((long) (short) 0, true);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) 8, dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((int) (byte) 0, 0, (int) '#', dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 22);
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
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay1.withChronologyRetainFields(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType20 = timeOfDay18.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-86399999L) + "'", long17 == (-86399999L));
        org.junit.Assert.assertNotNull(timeOfDay18);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        org.joda.time.DateTimeField dateTimeField27 = chronology15.year();
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 5, chronology15);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (short) -1, chronology30);
        org.joda.time.LocalDate localDate33 = localDate31.minusYears(1);
        org.joda.time.LocalDate.Property property34 = localDate31.year();
        org.joda.time.LocalDate.Property property35 = localDate31.dayOfYear();
        int int36 = localDate31.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int38 = localDate31.get(dateTimeFieldType37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property39 = timeOfDay28.property(dateTimeFieldType37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
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
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1969 + "'", int36 == 1969);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 31 + "'", int38 == 31);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime0.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime13 = property11.set("dayOfMonth");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"dayOfMonth\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("2022-02-22T07:09:34.330Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-22T07:09:34.330Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.Date date1 = new java.util.Date(100L);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromDateFields(date1);
        int int3 = localDate2.getYearOfCentury();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        org.joda.time.DateTimeField dateTimeField25 = chronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology14.year();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.withChronologyRetainFields(chronology31);
        org.joda.time.DateTime dateTime33 = timeOfDay32.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay32.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = timeOfDay35.toDateTimeToday();
        java.util.Locale locale37 = java.util.Locale.ITALY;
        java.util.Calendar calendar38 = dateTime36.toCalendar(locale37);
        java.lang.String str39 = dateTimeField26.getAsShortText(1970, locale37);
        java.lang.String str40 = locale37.getLanguage();
        java.lang.String str41 = locale37.getISO3Language();
        java.lang.Object obj42 = locale37.clone();
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
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=1645570800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970" + "'", str39, "1970");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "it" + "'", str40, "it");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ita" + "'", str41, "ita");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "it_IT");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "it_IT");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "it_IT");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.withDayOfYear((int) '#');
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.plusYears(1969);
        boolean boolean8 = dateMidnight6.isBefore((long) 2022);
        int int9 = dateMidnight6.getWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3991 + "'", int9 == 3991);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType6 = periodType5.withWeeksRemoved();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4, periodType5);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = timeOfDay11.withChronologyRetainFields(chronology12);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray14 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay13.plusHours((-1));
        org.joda.time.Chronology chronology17 = timeOfDay16.getChronology();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.withChronologyRetainFields(chronology21);
        long long24 = chronology17.set((org.joda.time.ReadablePartial) timeOfDay20, (long) (byte) -1);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType28 = null;
        boolean boolean29 = periodType27.isSupported(durationFieldType28);
        org.joda.time.Period period30 = new org.joda.time.Period((long) (byte) 1, 0L, periodType27);
        int[] intArray33 = chronology17.get((org.joda.time.ReadablePeriod) period30, (long) 2022, (long) ' ');
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(obj8, chronology17);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 17, (long) (byte) -1, periodType5, chronology17);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        long long41 = dateTimeZone37.convertLocalToUTC((-1L), false, 10L);
        org.joda.time.Chronology chronology42 = chronology17.withZone(dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime44 = new org.joda.time.MutableDateTime();
        int int45 = mutableDateTime44.getDayOfMonth();
        org.joda.time.Instant instant46 = mutableDateTime44.toInstant();
        boolean boolean48 = mutableDateTime44.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int52 = dateTimeZone50.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime44.setZone(dateTimeZone50);
        int int55 = dateTimeZone50.getOffsetFromLocal((long) (-1));
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) 429, dateTimeZone50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight((java.lang.Object) dateTimeZone37, dateTimeZone50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-86399999L) + "'", long24 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 22 + "'", int45 == 22);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.minusYears((int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withChronologyRetainFields(chronology6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.plusHours((-1));
        org.joda.time.Chronology chronology11 = timeOfDay10.getChronology();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withChronologyRetainFields(chronology15);
        long long18 = chronology11.set((org.joda.time.ReadablePartial) timeOfDay14, (long) (byte) -1);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = periodType21.isSupported(durationFieldType22);
        org.joda.time.Period period24 = new org.joda.time.Period((long) (byte) 1, 0L, periodType21);
        int[] intArray27 = chronology11.get((org.joda.time.ReadablePeriod) period24, (long) 2022, (long) ' ');
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((java.lang.Object) dateTime0, chronology11);
        org.joda.time.DateTimeField dateTimeField29 = chronology11.weekyear();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType34 = periodType33.withWeeksRemoved();
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight31, readableDuration32, periodType33);
        org.joda.time.Period period37 = period35.withSeconds(0);
        org.joda.time.Period period39 = period37.plusMinutes((int) (byte) 1);
        org.joda.time.Period period41 = period37.plusSeconds(8);
        int int42 = period41.getMonths();
        int[] intArray44 = chronology11.get((org.joda.time.ReadablePeriod) period41, (long) (short) 10);
        org.joda.time.PeriodType periodType45 = period41.getPeriodType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType47 = periodType45.getFieldType(70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 70");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-86399999L) + "'", long18 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[0, 0, 0, 0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = yearMonth0.withYear(7);
        org.joda.time.YearMonth.Property property3 = yearMonth2.year();
        org.joda.time.YearMonth yearMonth5 = property3.addToCopy((int) (byte) 100);
        int int6 = property3.getMaximumValue();
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 292278993 + "'", int6 == 292278993);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.parse("-0001-02-23T07:09:33.536");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"-0001-02-23T07:09:33.536\" is malformed at \"T07:09:33.536\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime2 = dateTime0.withYear((int) 'u');
        org.joda.time.DateTime dateTime4 = dateTime2.plusMonths((int) ' ');
        boolean boolean5 = dateTime2.isAfterNow();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.lang.String str16 = locale13.getUnicodeLocaleType("22");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap17 = calendar10.getDisplayNames(9, 8, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645570800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u4e2d\u6587" + "'", str14, "\u4e2d\u6587");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone4);
        org.joda.time.DateTime dateTime6 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType8 = periodType7.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime0, (org.joda.time.ReadableInstant) dateTime5, periodType8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime0.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime13 = property11.set(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.TimeOfDay timeOfDay9 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusHours((-1));
        org.joda.time.Chronology chronology15 = timeOfDay14.getChronology();
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(chronology15);
        long long21 = chronology15.getDateTimeMillis(12, 10, 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((int) 'u', 429, 54, 3991, (int) (byte) 100, (int) (byte) 0, (int) (byte) -1, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3991 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-61764076799990L) + "'", long21 == (-61764076799990L));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withWeekyear((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDayOfWeek((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.MutableDateTime mutableDateTime9 = property6.set(5);
        mutableDateTime9.setWeekyear(10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int15 = dateTimeZone13.getOffset(0L);
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(dateTimeZone13);
        mutableDateTime9.setZone(dateTimeZone13);
        mutableDateTime9.setHourOfDay((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.LocalDate.Property property5 = localDate2.year();
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property7 = localDate2.yearOfCentury();
        org.joda.time.LocalDate.Property property8 = localDate2.era();
        int int9 = property8.getMinimumValue();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.LocalTime localTime6 = dateTime4.toLocalTime();
        org.joda.time.DateTime dateTime8 = dateTime4.withDayOfWeek(2);
        org.joda.time.DateTime dateTime10 = dateTime4.minusMonths((int) (byte) 1);
        org.joda.time.DateTime.Property property11 = dateTime4.yearOfEra();
        org.joda.time.DateTime dateTime13 = dateTime4.withDayOfYear(99);
        int int14 = dateTime4.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
        org.joda.time.YearMonth yearMonth2 = yearMonth0.withYear(7);
        org.joda.time.YearMonth.Property property3 = yearMonth2.year();
        org.joda.time.YearMonth yearMonth5 = property3.setCopy(2);
        int int6 = property3.get();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        int int9 = property3.getMaximumShortTextLength(locale7);
        java.lang.String str10 = locale7.toString();
        org.junit.Assert.assertNotNull(yearMonth0);
        org.junit.Assert.assertNotNull(yearMonth2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonth5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fr_FR" + "'", str10, "fr_FR");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.clear();
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj2, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears((int) (short) 0);
        int int8 = localDateTime4.getValue(2);
        int int9 = localDateTime4.getHourOfDay();
        boolean boolean10 = calendar0.after((java.lang.Object) localDateTime4);
        int int11 = calendar0.getWeekYear();
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getDayOfYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight8 = property7.withMinimumValue();
        java.lang.String str9 = property7.toString();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime11.getZone();
        java.util.Locale locale15 = new java.util.Locale("hours", "ISOChronology[UTC]");
        java.util.Calendar calendar16 = dateTime11.toCalendar(locale15);
        java.lang.String str17 = property7.getAsShortText(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localDate2.toString("UTC", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 365 + "'", int3 == 365);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[dayOfWeek]" + "'", str9, "Property[dayOfWeek]");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals(locale15.toString(), "hours_ISOCHRONOLOGY[UTC]");
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Tue" + "'", str17, "Tue");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        int int4 = dateTime3.getDayOfMonth();
        int int5 = dateTime3.getYear();
        org.joda.time.DateTime dateTime7 = dateTime3.plus(86399999L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) -1, chronology9);
        org.joda.time.LocalDate localDate12 = localDate10.minusYears(1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int16 = dateTimeZone14.getOffset(0L);
        java.lang.String str17 = dateTimeZone14.toString();
        org.joda.time.DateTime dateTime18 = localDate10.toDateTimeAtStartOfDay(dateTimeZone14);
        org.joda.time.DateTime dateTime19 = dateTime3.withZone(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dateTime19.get(dateTimeFieldType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        java.lang.Object obj3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay6.withChronologyRetainFields(chronology7);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = timeOfDay8.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay11 = timeOfDay8.plusHours((-1));
        org.joda.time.Chronology chronology12 = timeOfDay11.getChronology();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay15.withChronologyRetainFields(chronology16);
        long long19 = chronology12.set((org.joda.time.ReadablePartial) timeOfDay15, (long) (byte) -1);
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.DurationFieldType durationFieldType23 = null;
        boolean boolean24 = periodType22.isSupported(durationFieldType23);
        org.joda.time.Period period25 = new org.joda.time.Period((long) (byte) 1, 0L, periodType22);
        int[] intArray28 = chronology12.get((org.joda.time.ReadablePeriod) period25, (long) 2022, (long) ' ');
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(obj3, chronology12);
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay(0, 0, chronology12);
        org.joda.time.DateTimeZone dateTimeZone31 = chronology12.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight((java.lang.Object) filteringMode0, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale$FilteringMode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-86399999L) + "'", long19 == (-86399999L));
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0, 0, 0, -1, -990]");
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime5 = dateTime3.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear(2);
        org.joda.time.Instant instant8 = dateTime7.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime7.withField(dateTimeFieldType9, 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 1);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property2.addNoWrapToCopy(11);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime();
        int int9 = mutableDateTime8.getDayOfMonth();
        org.joda.time.Instant instant10 = mutableDateTime8.toInstant();
        int int11 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) instant10);
        org.joda.time.DateTime dateTime12 = localTime5.toDateTimeToday(dateTimeZone7);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localTime5.toString("1 Jan 1970 00:00:00 GMT", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.util.Locale locale2 = new java.util.Locale("zh", "Tue");
        org.junit.Assert.assertEquals(locale2.toString(), "zh_TUE");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        org.joda.time.DateTimeField dateTimeField25 = chronology14.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField26 = chronology14.year();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology29);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay30.withChronologyRetainFields(chronology31);
        org.joda.time.DateTime dateTime33 = timeOfDay32.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay32.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = timeOfDay35.toDateTimeToday();
        java.util.Locale locale37 = java.util.Locale.ITALY;
        java.util.Calendar calendar38 = dateTime36.toCalendar(locale37);
        java.lang.String str39 = dateTimeField26.getAsShortText(1970, locale37);
        long long42 = dateTimeField26.getDifferenceAsLong(0L, (long) '4');
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
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=1645570800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1970" + "'", str39, "1970");
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(obj5, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.DateTime dateTime9 = dateTime3.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime9.withWeekOfWeekyear(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(2000, 958, 2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 958 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) 8);
        java.lang.String str2 = yearMonthDay1.toString();
        java.lang.String str3 = yearMonthDay1.toString();
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.plusDays(4);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.plusYears(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = yearMonthDay5.getFieldType(69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 69");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01" + "'", str3, "1970-01-01");
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        calendar0.set((int) (short) 100, 70, (int) (short) 1, 1970, 0);
        java.util.Locale locale12 = new java.util.Locale("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.Integer> strMap13 = calendar0.getDisplayNames(0, 0, locale12);
        int int14 = calendar0.getWeeksInWeekYear();
        calendar0.set(2000, 0, 2, 70, 7);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2000,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=2,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=70,MINUTE=7,SECOND=54,MILLISECOND=59,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int8 = dateTimeZone6.getOffset(0L);
        java.lang.String str9 = dateTimeZone6.toString();
        org.joda.time.DateTime dateTime10 = localDate2.toDateTimeAtStartOfDay(dateTimeZone6);
        int int12 = localDate2.getValue(0);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1969 + "'", int12 == 1969);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 0);
        int int6 = localDateTime2.getValue(2);
        int int7 = localDateTime2.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withYear(999);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withSecondOfMinute(10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.hourOfDay();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 22 + "'", int6 == 22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withOffsetParsed();
        org.joda.time.Chronology chronology7 = dateTimeFormatter6.getChronology();
        boolean boolean8 = dateTimeFormatter6.isOffsetParsed();
        org.joda.time.Chronology chronology9 = dateTimeFormatter6.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter6.withPivotYear((java.lang.Integer) 24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.parse("PT0S", dateTimeFormatter11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = timeOfDay7.toDateTimeToday(dateTimeZone8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property11 = timeOfDay7.property(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.Throwable throwable2 = null;
        java.io.IOException iOException3 = new java.io.IOException("zho", throwable2);
        java.io.IOException iOException4 = new java.io.IOException((java.lang.Throwable) iOException3);
        java.io.IOException iOException5 = new java.io.IOException("17", (java.lang.Throwable) iOException3);
        java.lang.String str6 = iOException5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "java.io.IOException: 17" + "'", str6, "java.io.IOException: 17");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod3 = mutablePeriod2.copy();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(chronology4);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.yearOfCentury();
        org.joda.time.Duration duration7 = mutablePeriod3.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight5);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight5.withMillis(25767315L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight11 = dateMidnight5.withMonthOfYear(85);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 85 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(dateMidnight9);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        calendar0.clear();
        java.lang.Object obj3 = calendar0.clone();
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withChronologyRetainFields(chronology3);
        org.joda.time.DateTime dateTime5 = timeOfDay4.toDateTimeToday();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.minusHours((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay7.toDateTimeToday();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.util.Calendar calendar10 = dateTime8.toCalendar(locale9);
        calendar10.set(7, (int) (short) 0, 2022);
        java.lang.String str15 = calendar10.getCalendarType();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar10);
        java.util.TimeZone timeZone17 = calendar10.getTimeZone();
        int int18 = timeZone17.getDSTSavings();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=-61771769999999,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=12,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=14,DAY_OF_YEAR=196,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "gregory" + "'", str15, "gregory");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.yearOfCentury();
        org.joda.time.DateMidnight.Property property3 = dateMidnight1.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime();
        int int5 = mutableDateTime4.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType12 = periodType11.withWeeksRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) mutableDateTime4, (org.joda.time.ReadableInstant) dateTime9, periodType12);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod17 = mutablePeriod16.copy();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.yearOfCentury();
        org.joda.time.Duration duration21 = mutablePeriod17.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight19);
        mutablePeriod13.setPeriod((org.joda.time.ReadableDuration) duration21);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod26 = mutablePeriod25.copy();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.yearOfCentury();
        org.joda.time.Duration duration30 = mutablePeriod26.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 1, 100L);
        org.joda.time.MutablePeriod mutablePeriod34 = mutablePeriod33.copy();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight.Property property37 = dateMidnight36.yearOfCentury();
        org.joda.time.Duration duration38 = mutablePeriod34.toDurationFrom((org.joda.time.ReadableInstant) dateMidnight36);
        boolean boolean39 = duration30.isShorterThan((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Period period40 = duration38.toPeriod();
        boolean boolean41 = duration21.isEqual((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Period period42 = duration21.toPeriod();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight1.withDurationAdded((org.joda.time.ReadableDuration) duration21, 0);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.minusDays(13);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.withWeekyear(2000);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(mutablePeriod34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertNotNull(dateMidnight48);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(69, (int) ' ', (int) ' ', 22, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone2);
        org.joda.time.DateTime dateTime4 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.year();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        long long9 = dateTimeField7.roundHalfFloor((long) 'x');
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromCalendarFields(calendar12);
        calendar12.set((int) (short) 100, 70, (int) (short) 1, 1970, 0);
        java.util.Locale locale24 = new java.util.Locale("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.Integer> strMap25 = calendar12.getDisplayNames(0, 0, locale24);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = dateTimeField7.set(763L, "\u4e2d\u6587", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=70,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=1970,MINUTE=0,SECOND=55,MILLISECOND=101,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertEquals(locale24.toString(), "hi!_HI!");
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.Interval interval2 = localDate1.toInterval();
        java.lang.String str3 = interval2.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone6);
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        boolean boolean9 = interval2.isBefore((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.MutableInterval mutableInterval10 = interval2.toMutableInterval();
        org.joda.time.Chronology chronology11 = mutableInterval10.getChronology();
        org.joda.time.Chronology chronology12 = mutableInterval10.getChronology();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(chronology12);
        int int14 = localDate13.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate13.withEra(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z" + "'", str3, "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(mutableInterval10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) -1, chronology1);
        int int3 = localDate2.getYearOfCentury();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.LocalDate localDate5 = property4.getLocalDate();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withZone(dateTimeZone9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        boolean boolean12 = dateTimeFormatter10.isParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDate5.toString(dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.Period period1 = org.joda.time.Period.minutes((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1970");
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 1, dateTimeZone5);
        int int7 = dateTime6.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = dateTime6.toDateTime(dateTimeZone9);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(obj2, dateTimeZone9);
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.year();
        boolean boolean14 = calendar0.after((java.lang.Object) property13);
        int int15 = property13.getMaximumValueOverall();
        org.joda.time.MutableDateTime mutableDateTime16 = property13.roundHalfFloor();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645513795470,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=55,MILLISECOND=470,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertNotNull(mutableDateTime16);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) mutableDateTime1);
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.era();
        int int4 = mutableDateTime1.getHourOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(obj0, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        long long4 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime5 = property3.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime7 = property3.addToCopy(9);
        long long8 = property3.remainder();
        org.joda.time.LocalDateTime localDateTime9 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusSeconds(17);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusHours((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField15 = localDateTime13.getField(86399999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 86399999");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 568L + "'", long4 == 568L);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 568L + "'", long8 == 568L);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        int int1 = mutableDateTime0.getDayOfMonth();
        org.joda.time.Instant instant2 = mutableDateTime0.toInstant();
        boolean boolean4 = mutableDateTime0.isBefore((long) 2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        int int8 = dateTimeZone6.getOffsetFromLocal((long) (byte) 1);
        mutableDateTime0.setZone(dateTimeZone6);
        mutableDateTime0.setMillisOfDay((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean15 = dateTimeZone13.isStandardOffset((long) 'u');
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone13);
        mutableDateTime0.setZone(dateTimeZone13);
        mutableDateTime0.setHourOfDay((int) (byte) 1);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType24 = periodType23.withWeeksRemoved();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight21, readableDuration22, periodType23);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.withChronologyRetainFields(chronology29);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray31 = timeOfDay30.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay30.plusHours((-1));
        org.joda.time.Chronology chronology34 = timeOfDay33.getChronology();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.TimeOfDay timeOfDay37 = org.joda.time.TimeOfDay.fromMillisOfDay(1L, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.withChronologyRetainFields(chronology38);
        long long41 = chronology34.set((org.joda.time.ReadablePartial) timeOfDay37, (long) (byte) -1);
        org.joda.time.DateTimeField dateTimeField42 = chronology34.millisOfSecond();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight21.withChronology(chronology34);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight43.minusWeeks((int) (byte) 0);
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) dateMidnight43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight48 = dateMidnight43.withDayOfWeek(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-86399999L) + "'", long41 == (-86399999L));
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(dateMidnight45);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        calendar0.setTimeZone(timeZone1);
        calendar0.setTimeInMillis((-52L));
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-52,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=948,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645513799229,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=9,SECOND=59,MILLISECOND=229,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 10);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(9);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.weeks();
        boolean boolean5 = localDate3.isSupported(durationFieldType4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDate3.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }
}
