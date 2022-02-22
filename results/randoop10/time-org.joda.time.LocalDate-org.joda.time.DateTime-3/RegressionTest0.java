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
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.years();
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) 100.0f, periodType1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = org.joda.time.YearMonthDay.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
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
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((int) 'a', 0, 0, (int) (byte) 100, (int) ' ', (int) (byte) -1, 2, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("2022-02-21T00:00:00.000Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = mutableDateTime1.get(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str2, "2022-02-21T00:00:00.000Z");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(0, (int) '#', (-1), chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType4);
        int int6 = mutablePeriod5.getMonths();
        org.joda.time.Interval interval7 = new org.joda.time.Interval(readableInstant1, (org.joda.time.ReadablePeriod) mutablePeriod5);
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) 100, chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime.Property property11 = dateTime9.property(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.util.Date date6 = new java.util.Date(4, (int) (byte) 100, (int) (short) 0, (int) (short) 0, (int) '4', 2);
        java.util.Date date13 = new java.util.Date(4, (int) (byte) 100, (int) (short) 0, (int) (short) 0, (int) '4', 2);
        int int14 = date6.compareTo(date13);
        org.junit.Assert.assertEquals(date6.toString(), "Tue Apr 30 00:52:02 UTC 1912");
        org.junit.Assert.assertEquals(date13.toString(), "Tue Apr 30 00:52:02 UTC 1912");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = localDate5.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDate localDate9 = localDate5.withWeekyear((int) (short) 100);
        int[] intArray13 = new int[] { (short) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = dateTimeField4.addWrapField((org.joda.time.ReadablePartial) localDate9, (int) '4', intArray13, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100]");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = localTime0.withHourOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMonthOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.months();
        mutablePeriod4.set(durationFieldType5, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime0.withFieldAdded(durationFieldType5, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'months' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.util.TimeZone timeZone0 = null;
        java.util.TimeZone.setDefault(timeZone0);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime3.plusSeconds(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTime6.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.dayOfYear();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property4.getAsShortText(locale5);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "52" + "'", str6, "52");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(10L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = mutablePeriod1.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = timeOfDay0.toDateTime((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.withHourOfDay(10);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.plusMillis((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeOfDay7.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
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
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = org.joda.time.TimeOfDay.MILLIS_OF_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.util.Locale locale0 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("2022-02-21T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2022-02-21T00:00:00.000Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime5 = dateTime3.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime6 = timeOfDay1.toDateTime((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay1.withHourOfDay(10);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.plusMillis((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean12 = timeOfDay8.isSupported(dateTimeFieldType11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property13 = localTime0.property(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (short) 0, (int) (byte) 0, 2, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.withDayOfYear((int) (byte) 1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) dateTime2, periodType5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfYear((int) (byte) 1);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableDuration7, (org.joda.time.ReadableInstant) dateTime9, periodType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((java.lang.Object) dateTime2, periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology1 = dateMidnight0.getChronology();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.withDayOfMonth(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateMidnight3);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        mutableDateTime1.setMonthOfYear(1);
        int int5 = mutableDateTime1.getMinuteOfDay();
        mutableDateTime1.setMillis((long) 1);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDate8.isSupported(dateTimeFieldType9);
        org.joda.time.LocalDate.Property property11 = localDate8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField12, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 2022");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str2, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        boolean boolean6 = durationField5.isPrecise();
        long long9 = durationField5.add((long) (byte) 1, 0L);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType4);
        int int6 = mutablePeriod5.getMonths();
        org.joda.time.Interval interval7 = new org.joda.time.Interval(readableInstant1, (org.joda.time.ReadablePeriod) mutablePeriod5);
        org.joda.time.Chronology chronology8 = interval7.getChronology();
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((java.lang.Object) 4, chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022-02-21T00:00:00.001Z");
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 4, chronology10);
        org.joda.time.DateTime dateTime12 = yearMonthDay8.toDateTime(timeOfDay11);
        java.util.Date date18 = new java.util.Date(5, (int) ' ', 0, (int) (short) 100, (int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay19 = org.joda.time.YearMonthDay.fromDateFields(date18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay11, (org.joda.time.ReadablePartial) yearMonthDay19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals(date18.toString(), "Wed Sep 04 03:59:00 UTC 1907");
        org.junit.Assert.assertNotNull(yearMonthDay19);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(5, 3, (int) (short) 1, 100, 0, (int) (short) -1, (int) ' ', (int) '4', periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
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
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(0, 1, 0, 2, (int) (byte) 1, 0, (-1), (int) (byte) 1, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((java.lang.Object) "PT0.034S");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = mutablePeriod1.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("AD");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        mutablePeriod11.set(durationFieldType12, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) 100, chronology23);
        boolean boolean25 = durationFieldType12.isSupported(chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period27 = period7.withFieldAdded(durationFieldType12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(8, (int) (byte) 1, (int) (byte) -1, (int) (byte) 1, (int) (byte) 1, (int) (byte) 100, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) ' ', chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = mutablePeriod2.getFieldType(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.LocalDate localDate7 = property3.setCopy(2022);
        java.util.Locale locale9 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property3.setCopy("", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = calendar1.getDisplayName((int) (short) 100, 0, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455229212,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=49,MILLISECOND=212,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        int int9 = mutablePeriod8.getMonths();
        org.joda.time.Interval interval10 = new org.joda.time.Interval(readableInstant4, (org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(chronology11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType16);
        int int18 = mutablePeriod17.getMonths();
        org.joda.time.Interval interval19 = new org.joda.time.Interval(readableInstant13, (org.joda.time.ReadablePeriod) mutablePeriod17);
        int[] intArray22 = chronology11.get((org.joda.time.ReadablePeriod) mutablePeriod17, 1L, (long) 4);
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType2, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = period23.withMonths((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 0, 0, 3]");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        java.lang.Class<?> wildcardClass6 = property5.getClass();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.add(4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar1.getActualMinimum((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455229538,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=49,MILLISECOND=538,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withEra((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455229607,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=49,MILLISECOND=607,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) -1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withMillis((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime7 = dateMidnight4.toMutableDateTime();
        boolean boolean9 = dateMidnight4.isEqual((long) 2);
        int int10 = dateMidnight3.compareTo((org.joda.time.ReadableInstant) dateMidnight4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight12 = dateMidnight3.withEra(5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType6);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) mutablePeriod7, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.util.Locale locale0 = java.util.Locale.CHINA;
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
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        java.lang.String str8 = mutableDateTime1.toString();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.millisOfSecond();
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime13 = property9.set("hi!", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022-02-21T00:00:00.001Z" + "'", str8, "2022-02-21T00:00:00.001Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1645455230456,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=50,MILLISECOND=456,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay((int) (short) 100, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime3.withDayOfWeek(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("PT0.034S", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=pt0.034s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.util.Date date5 = new java.util.Date(5, (int) ' ', 0, (int) (short) 100, (int) (byte) -1);
        java.util.Date date11 = new java.util.Date(5, (int) ' ', 0, (int) (short) 100, (int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay12 = org.joda.time.YearMonthDay.fromDateFields(date11);
        int int13 = date5.compareTo(date11);
        org.junit.Assert.assertEquals(date5.toString(), "Wed Sep 04 03:59:00 UTC 1907");
        org.junit.Assert.assertEquals(date11.toString(), "Wed Sep 04 03:59:00 UTC 1907");
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMillis((int) (short) 1);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now();
        int int6 = localTime5.size();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455231086,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=51,MILLISECOND=86,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.Weeks weeks8 = period7.toStandardWeeks();
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = period7.toString(periodFormatter9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = period7.plusHours((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0Y" + "'", str10, "P0Y");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = org.joda.time.MutableDateTime.parse("months", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        mutablePeriod8.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        java.lang.String str14 = mutablePeriod8.toString();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Interval interval17 = interval15.withDurationAfterStart(readableDuration16);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        mutableDateTime19.add((long) 1);
        org.joda.time.DateTime dateTime22 = mutableDateTime19.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.years();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime19, readableDuration23, periodType24);
        java.lang.String str26 = mutableDateTime19.toString();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime19.millisOfSecond();
        boolean boolean28 = interval15.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        boolean boolean29 = interval15.isBeforeNow();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0.034S" + "'", str14, "PT0.034S");
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022-02-21T00:00:00.001Z" + "'", str26, "2022-02-21T00:00:00.001Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        int int9 = mutablePeriod8.getMonths();
        org.joda.time.Interval interval10 = new org.joda.time.Interval(readableInstant4, (org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(chronology11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType16);
        int int18 = mutablePeriod17.getMonths();
        org.joda.time.Interval interval19 = new org.joda.time.Interval(readableInstant13, (org.joda.time.ReadablePeriod) mutablePeriod17);
        int[] intArray22 = chronology11.get((org.joda.time.ReadablePeriod) mutablePeriod17, 1L, (long) 4);
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType2, chronology11);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) chronology11, periodType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(periodType24);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        int int1 = localTime0.size();
        org.joda.time.LocalTime.Property property2 = localTime0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = localTime0.toDateTimeToday(dateTimeZone3);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.months();
        mutablePeriod8.set(durationFieldType9, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime0.withFieldAdded(durationFieldType9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'months' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(durationFieldType9);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("PeriodType[Years]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: PeriodType[Years] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = property4.set("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = localDate0.get(dateTimeFieldType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        java.util.Date date9 = new java.util.Date(5, (int) ' ', 0, (int) (short) 100, (int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay10 = org.joda.time.YearMonthDay.fromDateFields(date9);
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTime dateTime14 = yearMonthDay10.toDateTime(timeOfDay11, dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime2, (org.joda.time.ReadablePartial) timeOfDay11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455232714,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=52,MILLISECOND=714,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Sep 04 03:59:00 UTC 1907");
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period3 = period1.minusYears(8);
        org.joda.time.Period period5 = period1.withSeconds(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = period5.getFieldType(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.util.Date date5 = new java.util.Date(5, (int) ' ', 0, (int) (short) 100, (int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromDateFields(date5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = yearMonthDay6.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Wed Sep 04 03:59:00 UTC 1907");
        org.junit.Assert.assertNotNull(yearMonthDay6);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("PeriodType[Years]", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=periodtype[years]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.withCenturyOfEra((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight2);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime4.withDayOfWeek(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (short) -1, 20, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.months();
        mutablePeriod4.set(durationFieldType5, (int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 100, chronology16);
        boolean boolean18 = durationFieldType5.isSupported(chronology16);
        boolean boolean19 = durationFieldType0.isSupported(chronology16);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType23);
        int int25 = mutablePeriod24.getMonths();
        org.joda.time.Interval interval26 = new org.joda.time.Interval(readableInstant20, (org.joda.time.ReadablePeriod) mutablePeriod24);
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(chronology27);
        org.joda.time.DurationField durationField29 = chronology27.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((java.lang.Object) durationFieldType0, chronology27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField29);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = dateTimeFormatter2.parseLocalTime("1969-01-01T23:59:59.999Z/1969-01-02T00:00:00.033Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        java.lang.String str16 = locale13.getDisplayVariant(locale14);
        java.lang.String str17 = timeZone10.getDisplayName(false, (int) (short) 1, locale13);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=128,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645455234128,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=54,MILLISECOND=128,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u534f\u8c03\u4e16\u754c\u65f6\u95f4" + "'", str17, "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) (byte) 0);
        long long2 = duration1.getStandardDays();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfMonth((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455234226,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=54,MILLISECOND=226,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod13, 1L, (long) 4);
        org.joda.time.DurationField durationField19 = chronology7.eras();
        java.lang.String str20 = durationField19.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = durationField19.getValueAsLong((-31449600001L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "eras" + "'", str20, "eras");
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property8 = localDate7.dayOfYear();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.Interval interval11 = localDate7.toInterval(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(53633250, (int) (short) -1, (int) (short) 10, (int) (short) -1, 10, (int) (short) 0, (int) (short) 1, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        int int1 = localTime0.size();
        org.joda.time.LocalTime.Property property2 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property2.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime5 = property2.roundCeilingCopy();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withDayOfMonth(8);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        org.joda.time.DateTime dateTime16 = dateTime13.plusSeconds(10);
        org.joda.time.DateTime dateTime18 = dateTime13.minus((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property20 = dateTime18.property(dateTimeFieldType19);
        int int21 = dateMidnight6.get(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property22 = localTime5.property(dateTimeFieldType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.now();
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        int int7 = mutableDateTime6.getYearOfEra();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        mutablePeriod11.set(durationFieldType12, (int) 'a');
        mutablePeriod11.addHours((int) (byte) -1);
        mutablePeriod11.addYears(2022);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.LocalTime localTime20 = localTime3.plus((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds(100);
        org.joda.time.LocalTime.Property property23 = localTime22.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime25 = property23.addNoWrapToCopy(22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime5 = dateMidnight4.toMutableDateTime();
        mutableDateTime5.add((long) 1);
        org.joda.time.DateTime dateTime8 = mutableDateTime5.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime5, readableDuration9, periodType10);
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType15);
        int int17 = mutablePeriod16.getMonths();
        org.joda.time.Interval interval18 = new org.joda.time.Interval(readableInstant12, (org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(chronology19);
        org.joda.time.DurationField durationField21 = chronology19.weeks();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology19);
        mutableDateTime5.setChronology(chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((int) '4', 8, 1, (int) (byte) -1, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter27.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTimeFormatter27.parseDateTime("\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(dateTimeParser28);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter27.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime30 = dateTimeFormatter27.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(dateTimeParser28);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        long long6 = java.util.Date.UTC(12, 31, 5, 12, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1748517800000L) + "'", long6 == (-1748517800000L));
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        java.util.Locale locale7 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = property5.setCopy("PeriodType[Years]", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PeriodType[Years]\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = timeOfDay0.getFieldTypes();
        org.joda.time.Chronology chronology2 = timeOfDay0.getChronology();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime4 = dateMidnight3.toMutableDateTime();
        mutableDateTime4.add((long) 1);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.months();
        mutableDateTime4.add(durationFieldType7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay11 = timeOfDay0.withFieldAdded(durationFieldType7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'months' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        mutableDateTime1.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfYear();
        int int8 = property7.getMaximumValue();
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime10 = dateMidnight9.toMutableDateTime();
        mutableDateTime10.add((long) 1);
        org.joda.time.DateTime dateTime13 = mutableDateTime10.toDateTimeISO();
        mutableDateTime10.addDays((int) (short) 10);
        long long16 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime10);
        boolean boolean17 = property7.isLeap();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35417L + "'", long16 == 35417L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfMonth(301);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 301 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455235712,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=55,MILLISECOND=712,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale11);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromCalendarFields(calendar12);
        calendar12.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone21 = calendar12.getTimeZone();
        int int22 = calendar1.compareTo(calendar12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=849,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=849,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("52");
        java.lang.Object obj2 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime5.withTime(21, (int) ' ', (int) (byte) -1, 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.era();
        java.lang.String str2 = property1.getAsText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = property1.setCopy((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AD" + "'", str2, "AD");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1, (int) (byte) 100, 21, 0, 8, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "it_IT");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "it_IT");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "it_IT");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "P0Y");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setLanguageTag("2022-02-21T00:00:00.001Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.Weeks weeks8 = period7.toStandardWeeks();
        org.joda.time.format.PeriodFormatter periodFormatter9 = null;
        java.lang.String str10 = period7.toString(periodFormatter9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = period7.minusWeeks((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0Y" + "'", str10, "P0Y");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        mutableDateTime1.setMonthOfYear(1);
        mutableDateTime1.addWeekyears(4);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime1.toMutableDateTime(dateTimeZone8);
        org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str2, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(instant11);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        int int11 = yearMonthDay8.size();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology13 = dateMidnight12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((java.lang.Object) yearMonthDay8, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.YearMonthDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType6);
        int int8 = mutablePeriod7.getMonths();
        org.joda.time.Interval interval9 = new org.joda.time.Interval(readableInstant3, (org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.Chronology chronology10 = interval9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((int) (short) 10, 11, 365, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(521, 3, 301);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 301 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        int int1 = localTime0.size();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = localTime0.withFieldAdded(durationFieldType2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        java.util.Locale locale12 = java.util.Locale.TAIWAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = yearMonthDay10.toString("PeriodType[Years]", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.Days days8 = period7.toStandardDays();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.months();
        mutablePeriod12.set(durationFieldType13, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = period7.withField(durationFieldType13, 521);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(durationFieldType13);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(1L, dateTimeZone3);
        boolean boolean5 = calendar1.before((java.lang.Object) localDate4);
        boolean boolean6 = calendar1.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455237784,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=57,MILLISECOND=784,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter27.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime30 = dateTimeFormatter27.parseMutableDateTime("\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(dateTimeParser28);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusHours((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withSecondOfMinute(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455238041,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=58,MILLISECOND=41,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        int int22 = mutablePeriod21.getMonths();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableInstant17, (org.joda.time.ReadablePeriod) mutablePeriod21);
        int[] intArray26 = chronology15.get((org.joda.time.ReadablePeriod) mutablePeriod21, 1L, (long) 4);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType6, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter3.withChronology(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.parse("52", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology4 = dateMidnight3.getChronology();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withDayOfMonth(8);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime10 = dateTime8.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfMonth();
        org.joda.time.DateTime dateTime13 = dateTime10.plusSeconds(10);
        org.joda.time.DateTime dateTime15 = dateTime10.minus((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property17 = dateTime15.property(dateTimeFieldType16);
        int int18 = dateMidnight3.get(dateTimeFieldType16);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime1.property(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime21 = property19.set("\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??????\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str2, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.withYearOfCentury(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMaximumValue();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property12 = dateTime11.dayOfMonth();
        org.joda.time.DateTime dateTime14 = dateTime11.plusSeconds(10);
        org.joda.time.DateTime.Property property15 = dateTime14.year();
        org.joda.time.DateTime dateTime16 = property15.roundHalfCeilingCopy();
        java.util.Locale locale17 = java.util.Locale.CHINA;
        java.util.Locale locale18 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar19 = java.util.Calendar.getInstance(locale18);
        java.lang.String str20 = locale17.getDisplayVariant(locale18);
        int int21 = property15.getMaximumTextLength(locale18);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDate22.isSupported(dateTimeFieldType23);
        org.joda.time.LocalDate.Property property25 = localDate22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        org.joda.time.DurationField durationField27 = dateTimeField26.getRangeDurationField();
        java.util.Locale locale29 = java.util.Locale.PRC;
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(locale29);
        java.lang.String str31 = dateTimeField26.getAsShortText((long) (short) -1, locale29);
        java.lang.String str32 = locale18.getDisplayLanguage(locale29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = property4.setCopy("1969", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455238390,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=58,MILLISECOND=390,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1645455238391,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=58,MILLISECOND=391,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNull(durationField27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar30);
// flaky:         org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=1645455238391,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=58,MILLISECOND=391,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1969" + "'", str31, "1969");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u65e5\u6587" + "'", str32, "\u65e5\u6587");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.lang.Object obj0 = null;
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType4 = periodType3.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType8);
        int int10 = mutablePeriod9.getMonths();
        org.joda.time.Interval interval11 = new org.joda.time.Interval(readableInstant5, (org.joda.time.ReadablePeriod) mutablePeriod9);
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(chronology12);
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType17);
        int int19 = mutablePeriod18.getMonths();
        org.joda.time.Interval interval20 = new org.joda.time.Interval(readableInstant14, (org.joda.time.ReadablePeriod) mutablePeriod18);
        int[] intArray23 = chronology12.get((org.joda.time.ReadablePeriod) mutablePeriod18, 1L, (long) 4);
        org.joda.time.Period period24 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType3, chronology12);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(obj0, chronology12);
        org.joda.time.DateTimeField dateTimeField26 = chronology12.yearOfEra();
        long long28 = dateTimeField26.roundHalfCeiling((long) 32772);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = mutableDateTime1.isSupported(dateTimeFieldType5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.hourOfDay();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekyearOfCentury();
        long long18 = dateTimeField16.roundHalfFloor((long) 1);
        mutableDateTime1.setRounding(dateTimeField16, (int) (byte) 0);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime24 = dateMidnight23.toMutableDateTime();
        mutableDateTime24.add((long) 1);
        org.joda.time.DateTime dateTime27 = mutableDateTime24.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.years();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime24, readableDuration28, periodType29);
        org.joda.time.Weeks weeks31 = period30.toStandardWeeks();
        org.joda.time.Period period33 = period30.minusYears(12);
        int[] intArray34 = period33.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = dateTimeField16.addWrapPartial(readablePartial21, 100, intArray34, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(weeks31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-12]");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        int int0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withCenturyOfEra(365);
        int int6 = localDateTime5.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int8 = localDateTime5.get(dateTimeFieldType7);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime11 = localTime9.plusMillis((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = localDateTime5.isAfter((org.joda.time.ReadablePartial) localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455238861,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=58,MILLISECOND=861,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 861 + "'", int6 == 861);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.DurationField durationField5 = dateTimeField4.getRangeDurationField();
        int int6 = dateTimeField4.getMaximumValue();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 292278993 + "'", int6 == 292278993);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusMillis((int) (short) 1);
        int int10 = localDateTime9.getMillisOfDay();
        int[] intArray15 = new int[] { 23, 53637206, 0 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = dateTimeField4.addWrapPartial((org.joda.time.ReadablePartial) localDateTime9, 6, intArray15, 312);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455239053,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=59,MILLISECOND=53,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53639052 + "'", int10 == 53639052);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[23, 53637206, 0]");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTime dateTime9 = dateTime3.plusYears((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration10 = new org.joda.time.Duration((java.lang.Object) dateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.add(4, 0);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.setWeekDate(312, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455239244,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=59,MILLISECOND=244,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod13, 1L, (long) 4);
        org.joda.time.DurationField durationField19 = chronology7.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = durationField19.subtract((long) (byte) 10, (long) 22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        long long6 = java.util.Date.UTC(31, 365, 31, 2022, (int) (byte) 10, 53636377);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-207442223000L) + "'", long6 == (-207442223000L));
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime2 = localTime0.plusMillis((int) '4');
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.DateTime dateTime10 = dateTime7.plusSeconds(10);
        org.joda.time.DateTime.Property property11 = dateTime10.year();
        org.joda.time.DateTime dateTime12 = property11.roundHalfCeilingCopy();
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        java.lang.String str16 = locale13.getDisplayVariant(locale14);
        int int17 = property11.getMaximumTextLength(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localTime0.toString("PeriodType[Years]", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645455239546,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=59,MILLISECOND=546,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withCenturyOfEra(365);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property6.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455239572,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=59,MILLISECOND=572,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(1L, dateTimeZone1);
        long long4 = dateTimeZone1.convertUTCToLocal((long) (byte) 0);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) (byte) 0, dateTimeZone7);
        long long10 = dateTimeZone7.previousTransition((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone1, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('4', "AD");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight11 = yearMonthDay10.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType13 = yearMonthDay10.getFieldType(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32772");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateMidnight11);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.util.Date date5 = new java.util.Date(5, (int) ' ', 0, (int) (short) 100, (int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromDateFields(date5);
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay6.minusYears(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.withDayOfMonth(312);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 312 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Wed Sep 04 03:59:00 UTC 1907");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(yearMonthDay8);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        int int0 = org.joda.time.YearMonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.weekOfWeekyear();
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime15 = timeOfDay10.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay10.withHourOfDay(10);
        int[] intArray25 = new int[] { 6, 10, 9, 1969, 100, 53637206 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = dateTimeField9.add((org.joda.time.ReadablePartial) timeOfDay17, 5, intArray25, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[6, 10, 9, 1969, 100, 53637206]");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) '#', 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = calendar1.getDisplayName((int) ' ', 53636377, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455240235,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=235,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455240235,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=235,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate3 = property1.addWrapFieldToCopy(292278993);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) property1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMillis((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusMillis(4);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType17);
        int int19 = mutablePeriod18.getMonths();
        org.joda.time.Interval interval20 = new org.joda.time.Interval(readableInstant14, (org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(chronology21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType26);
        int int28 = mutablePeriod27.getMonths();
        org.joda.time.Interval interval29 = new org.joda.time.Interval(readableInstant23, (org.joda.time.ReadablePeriod) mutablePeriod27);
        int[] intArray32 = chronology21.get((org.joda.time.ReadablePeriod) mutablePeriod27, 1L, (long) 4);
        org.joda.time.Period period33 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType12, chronology21);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = dateTimeFormatter9.withChronology(chronology21);
        org.joda.time.format.DateTimeParser dateTimeParser35 = dateTimeFormatter34.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = localDateTime2.toString(dateTimeFormatter34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455240708,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=708,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter34);
        org.junit.Assert.assertNull(dateTimeParser35);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.yearOfCentury();
        int int2 = dateMidnight0.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.plusDays((int) (short) 1);
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekOfWeekyear();
        java.util.Locale locale7 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight8 = property5.setCopy("\u534f\u8c03\u4e16\u754c\u65f6\u95f4", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??????\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime11 = dateMidnight10.toMutableDateTime();
        mutableDateTime11.add((long) 1);
        org.joda.time.DateTime dateTime14 = mutableDateTime11.toDateTimeISO();
        org.joda.time.DateTime.Property property15 = dateTime14.hourOfDay();
        org.joda.time.DateTime dateTime16 = property15.roundHalfFloorCopy();
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.util.Calendar calendar18 = java.util.Calendar.getInstance(locale17);
        java.lang.String str19 = property15.getAsText(locale17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime20 = property8.set("DateTimeField[yearOfEra]", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[yearOfEra]\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1645455241134,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=1,MILLISECOND=134,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property9.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime13 = property9.addToCopy((long) 2);
        org.joda.time.LocalDateTime localDateTime15 = property9.addToCopy(0);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime18 = dateMidnight17.toMutableDateTime();
        mutableDateTime18.add((long) 1);
        org.joda.time.DateTime dateTime21 = mutableDateTime18.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.years();
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime18, readableDuration22, periodType23);
        int[] intArray25 = period24.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = dateTimeField4.set((org.joda.time.ReadablePartial) localDateTime15, 22, intArray25, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645455241174,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=1,MILLISECOND=174,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.Interval interval4 = localDate0.toInterval();
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime5.withMonthOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        int int9 = mutablePeriod8.getMonths();
        org.joda.time.Interval interval10 = new org.joda.time.Interval(readableInstant4, (org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(chronology11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType16);
        int int18 = mutablePeriod17.getMonths();
        org.joda.time.Interval interval19 = new org.joda.time.Interval(readableInstant13, (org.joda.time.ReadablePeriod) mutablePeriod17);
        int[] intArray22 = chronology11.get((org.joda.time.ReadablePeriod) mutablePeriod17, 1L, (long) 4);
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType2, chronology11);
        java.lang.String str24 = periodType2.getName();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Years" + "'", str24, "Years");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDay();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.lang.Object obj6 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType10 = periodType9.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType14);
        int int16 = mutablePeriod15.getMonths();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableInstant11, (org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(chronology18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType23);
        int int25 = mutablePeriod24.getMonths();
        org.joda.time.Interval interval26 = new org.joda.time.Interval(readableInstant20, (org.joda.time.ReadablePeriod) mutablePeriod24);
        int[] intArray29 = chronology18.get((org.joda.time.ReadablePeriod) mutablePeriod24, 1L, (long) 4);
        org.joda.time.Period period30 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType9, chronology18);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(obj6, chronology18);
        org.joda.time.DateTimeField dateTimeField32 = chronology18.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((int) (short) 0, 21, 312, 301, (int) (short) -1, 20, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 301 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate localDate4 = localDate0.withWeekyear((int) (short) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        java.util.Locale locale7 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localDate4.toString("Years", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        int int11 = yearMonthDay8.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay8.withDayOfMonth(53700000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53700000 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.parse("T10:54:02.183", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        int int3 = localDate0.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property5 = localDate0.property(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) '#', (int) (byte) 10, 20, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1, 0, 21, 3, (int) (short) 1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withTime((int) '4', 517, 10, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455242777,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=2,MILLISECOND=777,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        boolean boolean28 = dateTimeFormatter2.isOffsetParsed();
        java.lang.StringBuffer stringBuffer29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime31 = dateMidnight30.toMutableDateTime();
        java.lang.String str32 = mutableDateTime31.toString();
        mutableDateTime31.setMonthOfYear(1);
        int int35 = mutableDateTime31.getMinuteOfDay();
        mutableDateTime31.setMillis((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer29, (org.joda.time.ReadableInstant) mutableDateTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str32, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(31, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        mutablePeriod8.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        java.lang.String str14 = mutablePeriod8.toString();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Interval interval17 = interval15.withDurationAfterStart(readableDuration16);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        mutableDateTime19.add((long) 1);
        org.joda.time.DateTime dateTime22 = mutableDateTime19.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.years();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime19, readableDuration23, periodType24);
        java.lang.String str26 = mutableDateTime19.toString();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime19.millisOfSecond();
        boolean boolean28 = interval15.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        mutableDateTime19.addWeeks(9);
        mutableDateTime19.add((long) 2022);
        int int33 = mutableDateTime19.getRoundingMode();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0.034S" + "'", str14, "PT0.034S");
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022-02-21T00:00:00.001Z" + "'", str26, "2022-02-21T00:00:00.001Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        int int9 = mutablePeriod8.getMonths();
        org.joda.time.Interval interval10 = new org.joda.time.Interval(readableInstant4, (org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(chronology11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType16);
        int int18 = mutablePeriod17.getMonths();
        org.joda.time.Interval interval19 = new org.joda.time.Interval(readableInstant13, (org.joda.time.ReadablePeriod) mutablePeriod17);
        int[] intArray22 = chronology11.get((org.joda.time.ReadablePeriod) mutablePeriod17, 1L, (long) 4);
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType2, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = period23.minusHours(521);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 0, 0, 3]");
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Interval interval7 = interval6.toInterval();
        org.joda.time.Interval interval8 = interval6.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) interval6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Interval");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(interval8);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.roll((int) (byte) 100, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=305,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("Property[year]", "P0Y");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Property[year] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = timeOfDay0.toDateTime((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.minusMinutes(301);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.withHourOfDay(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property11 = timeOfDay9.property(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime3.plusSeconds(10);
        org.joda.time.DateTime dateTime8 = dateTime3.minus((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property10 = dateTime8.property(dateTimeFieldType9);
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = property10.setCopy("PeriodType[Years]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PeriodType[Years]\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter2.withOffsetParsed();
        java.lang.StringBuffer stringBuffer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter28.printTo(stringBuffer29, 292278993L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.yearOfCentury();
        int int2 = dateMidnight0.getWeekOfWeekyear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        boolean boolean9 = dateMidnight0.isEqual((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime11 = dateMidnight10.toMutableDateTime();
        mutableDateTime11.add((long) 1);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.months();
        mutableDateTime11.add(durationFieldType14, (int) (byte) 1);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType18 = periodType17.withYearsRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight0, (org.joda.time.ReadableInstant) mutableDateTime11, periodType17);
        java.util.GregorianCalendar gregorianCalendar20 = mutableDateTime11.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = gregorianCalendar20.getActualMinimum((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(gregorianCalendar20);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "P0Y");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setUnicodeLocaleKeyword("", "PeriodType[Years]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime8 = dateMidnight7.toMutableDateTime();
        mutableDateTime8.add((long) 1);
        org.joda.time.DateTime dateTime11 = mutableDateTime8.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.years();
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime8, readableDuration12, periodType13);
        org.joda.time.Chronology chronology15 = mutableDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.clockhourOfHalfday();
        java.lang.String str17 = chronology15.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(100, 100, 12, 0, 5, (int) '4', (int) (short) -1, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str17, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod(10L);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.months();
        mutablePeriod5.set(durationFieldType6, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.months();
        boolean boolean10 = mutablePeriod5.isSupported(durationFieldType9);
        int int11 = mutablePeriod1.indexOf(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.weekyears();
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.months();
        mutablePeriod16.set(durationFieldType17, (int) 'a');
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.ReadableDuration readableDuration22 = null;
        mutablePeriod21.add(readableDuration22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.months();
        mutablePeriod27.set(durationFieldType28, (int) 'a');
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType35);
        int int37 = mutablePeriod36.getMonths();
        org.joda.time.Interval interval38 = new org.joda.time.Interval(readableInstant32, (org.joda.time.ReadablePeriod) mutablePeriod36);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 100, chronology39);
        boolean boolean41 = durationFieldType28.isSupported(chronology39);
        mutablePeriod21.add(durationFieldType28, (int) (byte) 0);
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime45 = dateMidnight44.toMutableDateTime();
        mutableDateTime45.add((long) 1);
        org.joda.time.DateTime dateTime48 = mutableDateTime45.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = org.joda.time.DateTimeFieldType.era();
        boolean boolean50 = mutableDateTime45.isSupported(dateTimeFieldType49);
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime45.hourOfDay();
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType55);
        int int57 = mutablePeriod56.getMonths();
        org.joda.time.Interval interval58 = new org.joda.time.Interval(readableInstant52, (org.joda.time.ReadablePeriod) mutablePeriod56);
        org.joda.time.Chronology chronology59 = interval58.getChronology();
        org.joda.time.DateTimeField dateTimeField60 = chronology59.weekyearOfCentury();
        long long62 = dateTimeField60.roundHalfFloor((long) 1);
        mutableDateTime45.setRounding(dateTimeField60, (int) (byte) 0);
        org.joda.time.PeriodType periodType67 = null;
        org.joda.time.MutablePeriod mutablePeriod68 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType67);
        org.joda.time.DurationFieldType durationFieldType69 = org.joda.time.DurationFieldType.months();
        mutablePeriod68.set(durationFieldType69, (int) 'a');
        org.joda.time.ReadableInstant readableInstant73 = null;
        org.joda.time.PeriodType periodType76 = null;
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType76);
        int int78 = mutablePeriod77.getMonths();
        org.joda.time.Interval interval79 = new org.joda.time.Interval(readableInstant73, (org.joda.time.ReadablePeriod) mutablePeriod77);
        org.joda.time.Chronology chronology80 = interval79.getChronology();
        org.joda.time.DateTime dateTime81 = new org.joda.time.DateTime((long) (short) 100, chronology80);
        boolean boolean82 = durationFieldType69.isSupported(chronology80);
        mutableDateTime45.add(durationFieldType69, 53633250);
        org.joda.time.DurationFieldType durationFieldType85 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.DurationFieldType[] durationFieldTypeArray86 = new org.joda.time.DurationFieldType[] { durationFieldType9, durationFieldType12, durationFieldType17, durationFieldType28, durationFieldType69, durationFieldType85 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType87 = org.joda.time.PeriodType.forFields(durationFieldTypeArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [weekyears, months, months, months, centuries]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(durationFieldType69);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(chronology80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(durationFieldType85);
        org.junit.Assert.assertNotNull(durationFieldTypeArray86);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        java.lang.String str8 = mutableDateTime1.toString();
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime1.millisOfSecond();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now();
        int int11 = localTime10.size();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        boolean boolean13 = localTime10.equals((java.lang.Object) locale12);
        int int14 = property9.getMaximumTextLength(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = locale12.getUnicodeLocaleType("1969-01-01T23:59:59.999Z/1969-01-02T00:00:00.033Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 1969-01-01T23:59:59.999Z/1969-01-02T00:00:00.033Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022-02-21T00:00:00.001Z" + "'", str8, "2022-02-21T00:00:00.001Z");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = timeOfDay0.toDateTime((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) '4');
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime2.withEra((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(0, 999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = timeOfDay0.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = timeOfDay0.withSecondOfMinute(517);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 517 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray1);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        mutablePeriod8.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        java.lang.String str14 = mutablePeriod8.toString();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadablePeriod) mutablePeriod8);
        int int16 = mutablePeriod8.getDays();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0.034S" + "'", str14, "PT0.034S");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime4 = dateMidnight3.toMutableDateTime();
        mutableDateTime4.add((long) 1);
        org.joda.time.DateTime dateTime7 = mutableDateTime4.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.years();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime4, readableDuration8, periodType9);
        org.joda.time.Chronology chronology11 = mutableDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology11.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(10, 53633250, (int) (short) 0, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53633250 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime2.withHourOfDay(53636377);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53636377 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        mutableDateTime1.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfYear();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (short) -1, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusWeeks(0);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, (org.joda.time.ReadableInstant) dateMidnight13, periodType14);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime21 = timeOfDay16.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType24);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.months();
        mutablePeriod25.set(durationFieldType26, (int) 'a');
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType33);
        int int35 = mutablePeriod34.getMonths();
        org.joda.time.Interval interval36 = new org.joda.time.Interval(readableInstant30, (org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 100, chronology37);
        boolean boolean39 = durationFieldType26.isSupported(chronology37);
        org.joda.time.DateTime dateTime41 = dateTime18.withFieldAdded(durationFieldType26, 32772);
        boolean boolean42 = period15.isSupported(durationFieldType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period44 = period15.minusMillis(134);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        java.lang.String str7 = locale2.getExtension('u');
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        boolean boolean10 = localDate8.isSupported(dateTimeFieldType9);
        org.joda.time.LocalDate.Property property11 = localDate8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.DurationField durationField13 = dateTimeField12.getRangeDurationField();
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(locale15);
        java.lang.String str17 = dateTimeField12.getAsShortText((long) (short) -1, locale15);
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Locale[] localeArray20 = new java.util.Locale[] { locale1, locale2, locale15, locale18, locale19 };
        java.util.ArrayList<java.util.Locale> localeList21 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList21, localeArray20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale23 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455245135,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=5,MILLISECOND=135,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNull(durationField13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645455245135,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=5,MILLISECOND=135,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1969" + "'", str17, "1969");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(localeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType9);
        int int11 = mutablePeriod10.getMonths();
        org.joda.time.Interval interval12 = new org.joda.time.Interval(readableInstant6, (org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.Chronology chronology13 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(134, (int) (byte) -1, 2022, 22, 9, 1969, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        int int1 = localTime0.size();
        org.joda.time.LocalTime.Property property2 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property2.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime5 = property2.roundCeilingCopy();
        int int6 = localTime5.getMillisOfDay();
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = localTime5.isAfter((org.joda.time.ReadablePartial) localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53700000 + "'", int6 == 53700000);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645455245305,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=5,MILLISECOND=305,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate3 = property1.addWrapFieldToCopy(292278993);
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay(2L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = localDate3.isAfter((org.joda.time.ReadablePartial) timeOfDay5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(timeOfDay5);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.Period period2 = new org.joda.time.Period(43200000L, (long) 11);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.withDayOfYear((int) (byte) 1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) dateTime2, periodType5);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod6.setWeeks((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("DateTimeField[yearOfEra]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'DateTimeField[yearOfEra]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ISOChronology[Etc/UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfFloorCopy();
        java.util.Locale locale7 = java.util.Locale.PRC;
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        java.lang.String str9 = property5.getAsText(locale7);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property5.setCopy("UTC", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645455246084,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=6,MILLISECOND=84,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        java.util.Locale locale12 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = yearMonthDay10.toString("Property[year]", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType6);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.months();
        mutablePeriod12.set(durationFieldType13, (int) 'a');
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType22);
        int int24 = mutablePeriod23.getMonths();
        org.joda.time.Interval interval25 = new org.joda.time.Interval(readableInstant19, (org.joda.time.ReadablePeriod) mutablePeriod23);
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(chronology26);
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType31);
        int int33 = mutablePeriod32.getMonths();
        org.joda.time.Interval interval34 = new org.joda.time.Interval(readableInstant28, (org.joda.time.ReadablePeriod) mutablePeriod32);
        int[] intArray37 = chronology26.get((org.joda.time.ReadablePeriod) mutablePeriod32, 1L, (long) 4);
        mutablePeriod3.setPeriod((long) 'a', (long) (short) -1, chronology26);
        mutablePeriod3.addMonths(0);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 0, 0, 0, 0, 0, 0, 3]");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.Chronology chronology8 = mutableDateTime1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime(5, 100, (int) (short) -1, 0, 0, 521, 53636377);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 521 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((long) 312);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter27.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTimeFormatter27.parseDateTime("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(dateTimeParser28);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.secondOfMinute();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = localDate11.isSupported(dateTimeFieldType12);
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.ReadableDuration readableDuration16 = null;
        mutablePeriod15.add(readableDuration16);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.months();
        mutablePeriod22.set(durationFieldType23, (int) 'a');
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType30);
        int int32 = mutablePeriod31.getMonths();
        org.joda.time.Interval interval33 = new org.joda.time.Interval(readableInstant27, (org.joda.time.ReadablePeriod) mutablePeriod31);
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 100, chronology34);
        boolean boolean36 = durationFieldType23.isSupported(chronology34);
        mutablePeriod15.setPeriod((long) '4', chronology34);
        int[] intArray38 = mutablePeriod15.getValues();
        // The following exception was thrown during execution in test generation
        try {
            chronology7.validate((org.joda.time.ReadablePartial) localDate11, intArray38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[0, 0, 0, 0, 0, 0, 0, 52]");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        int int22 = mutablePeriod21.getMonths();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableInstant17, (org.joda.time.ReadablePeriod) mutablePeriod21);
        int[] intArray26 = chronology15.get((org.joda.time.ReadablePeriod) mutablePeriod21, 1L, (long) 4);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType6, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter3.withChronology(chronology15);
        org.joda.time.format.DateTimeParser dateTimeParser29 = dateTimeFormatter28.getParser();
        boolean boolean30 = dateTimeFormatter28.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight31 = org.joda.time.DateMidnight.parse("T10:54:02.183", dateTimeFormatter28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(dateTimeParser29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        int int1 = localTime0.size();
        org.joda.time.LocalTime.Property property2 = localTime0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = localTime0.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        int int11 = yearMonthDay8.size();
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay8.year();
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay16 = property12.setCopy("UTC", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645455247746,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=7,MILLISECOND=746,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) (byte) 0, dateTimeZone2);
        long long5 = dateTimeZone2.previousTransition((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = dateTime3.minusHours(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime3.withEra((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            calendar1.add((-1), 301);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=856,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(1L, dateTimeZone3);
        boolean boolean5 = calendar1.before((java.lang.Object) localDate4);
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.withMillis((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight6.toMutableDateTime();
        boolean boolean10 = calendar1.equals((java.lang.Object) mutableDateTime9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455248043,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=8,MILLISECOND=43,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(100);
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime6 = property5.roundHalfFloorCopy();
        org.joda.time.PeriodType periodType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) property5, periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(100);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType12 = periodType11.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType16);
        int int18 = mutablePeriod17.getMonths();
        org.joda.time.Interval interval19 = new org.joda.time.Interval(readableInstant13, (org.joda.time.ReadablePeriod) mutablePeriod17);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(chronology20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType25);
        int int27 = mutablePeriod26.getMonths();
        org.joda.time.Interval interval28 = new org.joda.time.Interval(readableInstant22, (org.joda.time.ReadablePeriod) mutablePeriod26);
        int[] intArray31 = chronology20.get((org.joda.time.ReadablePeriod) mutablePeriod26, 1L, (long) 4);
        org.joda.time.Period period32 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType11, chronology20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter8.withChronology(chronology20);
        org.joda.time.Period period34 = new org.joda.time.Period((-31449600001L), chronology20);
        org.joda.time.Period period36 = period34.minusYears(11);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.days();
        org.joda.time.Period period39 = period36.withField(durationFieldType37, 301);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime41 = localTime2.withFieldAdded(durationFieldType37, 625);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'days' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(period39);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withEra(1);
        org.joda.time.DateTime dateTime6 = dateTime1.plusMillis(32772);
        org.joda.time.DateTime dateTime8 = dateTime1.plusMillis(312);
        java.lang.String str9 = dateTime1.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str9, "1969-12-31T23:59:59.999Z");
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = timeOfDay0.toDateTime((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.withHourOfDay(10);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.plusMillis((int) (short) -1);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = timeOfDay9.toString("", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime6.dayOfMonth();
        int int9 = property8.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.era();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField9.getDifferenceAsLong((long) 32772, 1645455232633L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        int int11 = yearMonthDay8.size();
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay8.year();
        int int13 = property12.getMinimumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay15 = property12.setCopy("PT0S");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0S\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-292275054) + "'", int13 == (-292275054));
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.years();
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime2, readableDuration6, periodType7);
        org.joda.time.Chronology chronology9 = mutableDateTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now(chronology9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime14 = dateTime12.withDayOfYear((int) (byte) 1);
        int int15 = dateTime14.getDayOfMonth();
        org.joda.time.Duration duration17 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime18 = dateTime14.minus((org.joda.time.ReadableDuration) duration17);
        mutableDateTime10.add((org.joda.time.ReadableDuration) duration17);
        org.joda.time.Duration duration21 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean22 = duration17.isShorterThan((org.joda.time.ReadableDuration) duration21);
        org.joda.time.Days days23 = duration21.toStandardDays();
        mutableDateTime0.add((org.joda.time.ReadablePeriod) days23, 1);
        int int26 = days23.size();
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        mutablePeriod8.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        java.lang.String str14 = mutablePeriod8.toString();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadablePeriod) mutablePeriod8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime3.withDayOfMonth(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0.034S" + "'", str14, "PT0.034S");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime4 = dateMidnight3.toMutableDateTime();
        mutableDateTime4.add((long) 1);
        org.joda.time.DateTime dateTime7 = mutableDateTime4.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.years();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime4, readableDuration8, periodType9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType14);
        int int16 = mutablePeriod15.getMonths();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableInstant11, (org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(chronology18);
        org.joda.time.DurationField durationField20 = chronology18.weeks();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology18);
        mutableDateTime4.setChronology(chronology18);
        org.joda.time.DateTimeField dateTimeField23 = chronology18.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) (short) 0, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(3, 53637206, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637206 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(chronology2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localTime1.compareTo((org.joda.time.ReadablePartial) yearMonthDay3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime1.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfDay(53637206);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637206 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime8 = dateMidnight7.toMutableDateTime();
        mutableDateTime8.add((long) 1);
        org.joda.time.DateTime dateTime11 = mutableDateTime8.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.years();
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime8, readableDuration12, periodType13);
        org.joda.time.Chronology chronology15 = mutableDateTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now(chronology15);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfYear((int) (byte) 1);
        int int21 = dateTime20.getDayOfMonth();
        org.joda.time.Duration duration23 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((org.joda.time.ReadableDuration) duration23);
        mutableDateTime16.add((org.joda.time.ReadableDuration) duration23);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean28 = duration23.isShorterThan((org.joda.time.ReadableDuration) duration27);
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType33);
        int int35 = mutablePeriod34.getMonths();
        org.joda.time.Interval interval36 = new org.joda.time.Interval(readableInstant30, (org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.weekyearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) 10, chronology37);
        org.joda.time.Period period40 = duration23.toPeriod(chronology37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime((int) (byte) 10, 3, 23, 9, 12, 12, 53633250, chronology37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53633250 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.Interval interval4 = localDate0.toInterval();
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate0.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        int int11 = timeZone10.getRawOffset();
        java.lang.Object obj12 = timeZone10.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=156,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property4.addToCopy((long) 2);
        org.joda.time.LocalDateTime localDateTime10 = property4.addToCopy(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455250369,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=10,MILLISECOND=369,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.Locale locale1 = java.util.Locale.CHINA;
        java.util.Locale locale2 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        java.lang.String str4 = locale1.getDisplayVariant(locale2);
        java.util.Set<java.lang.String> strSet5 = locale2.getUnicodeLocaleAttributes();
        java.util.Spliterator<java.lang.String> strSpliterator6 = strSet5.spliterator();
        java.lang.String[] strArray29 = new java.lang.String[] { "\u65e5\u6587", "1969-01-01T23:59:59.999Z/1969-01-02T00:00:00.033Z", "UTC", "2022-02-21T00:00:00.001Z", "\u534f\u8c03\u4e16\u754c\u65f6\u95f4", "PeriodType[Years]", "months", "\u65e5\u6587", "2022-02-21T00:00:00.001Z", "+00:00", "52", "months", "AD", "1", "AD", "1", "2022-02-21T00:00:00.001Z", "eras", "PT0.034S", "hi!", "1969-01-01T23:59:59.999Z/1969-01-02T00:00:00.033Z", "2022-02-21T00:00:00.001Z" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        boolean boolean32 = strSet30.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray33 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList34 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList34, languageRangeArray33);
        java.lang.String[] strArray38 = new java.lang.String[] { "PT0.034S", "52" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        java.util.List<java.lang.String> strList41 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList39);
        java.util.Locale.LanguageRange[] languageRangeArray42 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList43 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList43, languageRangeArray42);
        java.lang.String[] strArray47 = new java.lang.String[] { "PT0.034S", "52" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList43, (java.util.Collection<java.lang.String>) strList48);
        java.lang.String str51 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList34, (java.util.Collection<java.lang.String>) strList48);
        boolean boolean52 = strSet30.retainAll((java.util.Collection<java.lang.String>) strList48);
        boolean boolean53 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet30);
        strSet30.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455250583,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=10,MILLISECOND=583,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSpliterator6);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(languageRangeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(languageRangeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMillis((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withWeekyear(134);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.minusMinutes((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDateTime10.getValue(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 16");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455250653,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=10,MILLISECOND=653,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        int int0 = org.joda.time.YearMonthDay.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        boolean boolean11 = calendar1.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=948,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        int int11 = yearMonthDay8.size();
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay8.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay8.withMonthOfYear(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = dateTimeFormatter2.parseLocalTime("ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(1L, dateTimeZone3);
        boolean boolean5 = calendar1.before((java.lang.Object) localDate4);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property9 = localDate8.yearOfEra();
        java.util.Locale locale10 = java.util.Locale.CHINA;
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale11);
        java.lang.String str13 = locale10.getDisplayVariant(locale11);
        int int14 = property9.getMaximumTextLength(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap15 = calendar1.getDisplayNames(0, 53700000, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455251284,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=284,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1645455251285,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=285,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        org.joda.time.DateMidnight dateMidnight2 = localDate0.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight3 = localDate0.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate0.getValue(1969);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1969");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(dateMidnight3);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        int int0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        java.util.Date date5 = mutableDateTime1.toDate();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime(69, 11, 5, 53700000, (int) ' ', (-1), 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53700000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Mon Feb 21 00:00:00 UTC 2022");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.CHINA;
        java.util.Locale locale3 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        java.lang.String str5 = locale2.getDisplayVariant(locale3);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate.Property property9 = localDate6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.joda.time.DurationField durationField11 = dateTimeField10.getRangeDurationField();
        java.util.Locale locale13 = java.util.Locale.PRC;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(locale13);
        java.lang.String str15 = dateTimeField10.getAsShortText((long) (short) -1, locale13);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = localDate16.isSupported(dateTimeFieldType17);
        org.joda.time.LocalDate.Property property19 = localDate16.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        org.joda.time.DurationField durationField21 = dateTimeField20.getRangeDurationField();
        java.util.Locale locale23 = java.util.Locale.PRC;
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale23);
        java.lang.String str25 = dateTimeField20.getAsShortText((long) (short) -1, locale23);
        java.util.Locale locale26 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(locale26);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(locale26);
        java.util.Locale locale29 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(locale29);
        org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.fromCalendarFields(calendar30);
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight32.toMutableDateTime();
        mutableDateTime33.add((long) 1);
        org.joda.time.DateTime dateTime36 = mutableDateTime33.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.years();
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime33, readableDuration37, periodType38);
        java.lang.String str40 = mutableDateTime33.toString();
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime33.millisOfSecond();
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.now();
        int int43 = localTime42.size();
        java.util.Locale locale44 = java.util.Locale.ITALY;
        boolean boolean45 = localTime42.equals((java.lang.Object) locale44);
        int int46 = property41.getMaximumTextLength(locale44);
        boolean boolean47 = calendar30.after((java.lang.Object) locale44);
        org.joda.time.LocalTime localTime48 = org.joda.time.LocalTime.now();
        int int49 = localTime48.size();
        java.util.Locale locale50 = java.util.Locale.ITALY;
        boolean boolean51 = localTime48.equals((java.lang.Object) locale50);
        java.util.Locale locale52 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = locale52.stripExtensions();
        java.util.Locale locale54 = java.util.Locale.PRC;
        java.util.Calendar calendar55 = java.util.Calendar.getInstance(locale54);
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime57 = dateMidnight56.toMutableDateTime();
        mutableDateTime57.add((long) 1);
        org.joda.time.DateTime dateTime60 = mutableDateTime57.toDateTimeISO();
        org.joda.time.DateTime.Property property61 = dateTime60.hourOfDay();
        org.joda.time.DateTime dateTime62 = property61.roundHalfFloorCopy();
        java.util.Locale locale63 = java.util.Locale.PRC;
        java.util.Calendar calendar64 = java.util.Calendar.getInstance(locale63);
        java.lang.String str65 = property61.getAsText(locale63);
        java.lang.String str66 = locale63.getDisplayScript();
        java.util.Locale locale67 = java.util.Locale.PRC;
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(locale67);
        java.util.Locale locale72 = new java.util.Locale("2022-02-21T00:00:00.000Z", "2022-02-21T00:00:00.000Z", "PT0.034S");
        java.util.Locale locale73 = java.util.Locale.getDefault();
        java.util.Locale locale74 = java.util.Locale.CHINA;
        java.util.Locale locale75 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar76 = java.util.Calendar.getInstance(locale75);
        java.lang.String str77 = locale74.getDisplayVariant(locale75);
        org.joda.time.DateMidnight dateMidnight78 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime79 = dateMidnight78.toMutableDateTime();
        mutableDateTime79.add((long) 1);
        org.joda.time.DateTime dateTime82 = mutableDateTime79.toDateTimeISO();
        org.joda.time.DateTime.Property property83 = dateTime82.hourOfDay();
        org.joda.time.DateTime dateTime84 = property83.roundHalfFloorCopy();
        java.util.Locale locale85 = java.util.Locale.PRC;
        java.util.Calendar calendar86 = java.util.Calendar.getInstance(locale85);
        java.lang.String str87 = property83.getAsText(locale85);
        java.lang.String str88 = locale85.getDisplayScript();
        java.util.Locale[] localeArray89 = new java.util.Locale[] { locale1, locale3, locale13, locale23, locale26, locale44, locale50, locale52, locale54, locale63, locale67, locale72, locale73, locale75, locale85 };
        java.util.ArrayList<java.util.Locale> localeList90 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList90, localeArray89);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale92 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455251576,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=576,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455251577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1969" + "'", str15, "1969");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNull(durationField21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=1645455251577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1969" + "'", str25, "1969");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1645455251577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1645455251577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar30);
// flaky:         org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=1645455251577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2022-02-21T00:00:00.001Z" + "'", str40, "2022-02-21T00:00:00.001Z");
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar55);
// flaky:         org.junit.Assert.assertEquals(calendar55.toString(), "java.util.GregorianCalendar[time=1645455251577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar64);
// flaky:         org.junit.Assert.assertEquals(calendar64.toString(), "java.util.GregorianCalendar[time=1645455251577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "0" + "'", str65, "0");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar68);
// flaky:         org.junit.Assert.assertEquals(calendar68.toString(), "java.util.GregorianCalendar[time=1645455251577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(locale72.toString(), "2022-02-21t00:00:00.000z_2022-02-21T00:00:00.000Z_PT0.034S");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar76);
// flaky:         org.junit.Assert.assertEquals(calendar76.toString(), "java.util.GregorianCalendar[time=1645455251577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(mutableDateTime79);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar86);
// flaky:         org.junit.Assert.assertEquals(calendar86.toString(), "java.util.GregorianCalendar[time=1645455251577,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=577,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "0" + "'", str87, "0");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertNotNull(localeArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        java.lang.String str1 = periodType0.toString();
        org.joda.time.PeriodType periodType2 = periodType0.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(periodType2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setDays(999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'days'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PeriodType[Years]" + "'", str1, "PeriodType[Years]");
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = dateTimeFormatter27.parseDateTime("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        int int22 = mutablePeriod21.getMonths();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableInstant17, (org.joda.time.ReadablePeriod) mutablePeriod21);
        int[] intArray26 = chronology15.get((org.joda.time.ReadablePeriod) mutablePeriod21, 1L, (long) 4);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType6, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter3.withChronology(chronology15);
        org.joda.time.format.DateTimeParser dateTimeParser29 = dateTimeFormatter28.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter28.withPivotYear(312);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.parse("eras", dateTimeFormatter31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(dateTimeParser29);
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(301, 1969, 6, 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 301 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withCenturyOfEra(365);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDateTime2.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455251984,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=984,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(1970, 292278993, 365, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.Interval interval3 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime2);
        boolean boolean5 = interval3.equals((java.lang.Object) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.lang.String[] strArray22 = new java.lang.String[] { "\u65e5\u6587", "1969-01-01T23:59:59.999Z/1969-01-02T00:00:00.033Z", "UTC", "2022-02-21T00:00:00.001Z", "\u534f\u8c03\u4e16\u754c\u65f6\u95f4", "PeriodType[Years]", "months", "\u65e5\u6587", "2022-02-21T00:00:00.001Z", "+00:00", "52", "months", "AD", "1", "AD", "1", "2022-02-21T00:00:00.001Z", "eras", "PT0.034S", "hi!", "1969-01-01T23:59:59.999Z/1969-01-02T00:00:00.033Z", "2022-02-21T00:00:00.001Z" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        boolean boolean25 = strSet23.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.lang.String[] strArray31 = new java.lang.String[] { "PT0.034S", "52" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        java.util.List<java.lang.String> strList34 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList32);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.lang.String[] strArray40 = new java.lang.String[] { "PT0.034S", "52" };
        java.util.ArrayList<java.lang.String> strList41 = new java.util.ArrayList<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList41, strArray40);
        java.util.List<java.lang.String> strList43 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.lang.String>) strList41);
        java.lang.String str44 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.lang.String>) strList41);
        boolean boolean45 = strSet23.retainAll((java.util.Collection<java.lang.String>) strList41);
        java.lang.String[] strArray68 = new java.lang.String[] { "\u65e5\u6587", "1969-01-01T23:59:59.999Z/1969-01-02T00:00:00.033Z", "UTC", "2022-02-21T00:00:00.001Z", "\u534f\u8c03\u4e16\u754c\u65f6\u95f4", "PeriodType[Years]", "months", "\u65e5\u6587", "2022-02-21T00:00:00.001Z", "+00:00", "52", "months", "AD", "1", "AD", "1", "2022-02-21T00:00:00.001Z", "eras", "PT0.034S", "hi!", "1969-01-01T23:59:59.999Z/1969-01-02T00:00:00.033Z", "2022-02-21T00:00:00.001Z" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        boolean boolean71 = strSet69.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray72 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList73 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList73, languageRangeArray72);
        java.lang.String[] strArray77 = new java.lang.String[] { "PT0.034S", "52" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        java.util.List<java.lang.String> strList80 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList73, (java.util.Collection<java.lang.String>) strList78);
        java.util.Locale.LanguageRange[] languageRangeArray81 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList82 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList82, languageRangeArray81);
        java.lang.String[] strArray86 = new java.lang.String[] { "PT0.034S", "52" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        java.util.List<java.lang.String> strList89 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList82, (java.util.Collection<java.lang.String>) strList87);
        java.lang.String str90 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList73, (java.util.Collection<java.lang.String>) strList87);
        boolean boolean91 = strSet69.retainAll((java.util.Collection<java.lang.String>) strList87);
        boolean boolean92 = strSet23.addAll((java.util.Collection<java.lang.String>) strSet69);
        java.util.Collection<java.lang.String> strCollection93 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean94 = strSet69.retainAll(strCollection93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(languageRangeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(languageRangeArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime3.withDayOfWeek(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        int int11 = timeZone10.getRawOffset();
        int int13 = timeZone10.getOffset((long) 'u');
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        boolean boolean16 = locale14.hasExtensions();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone10, locale14);
        int int18 = timeZone10.getDSTSavings();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=721,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645455252721,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=12,MILLISECOND=721,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645455252721,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=12,MILLISECOND=721,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0, 9, 54);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        mutablePeriod8.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        java.lang.String str14 = mutablePeriod8.toString();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadablePeriod) mutablePeriod8);
        mutablePeriod8.addMinutes(521);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0.034S" + "'", str14, "PT0.034S");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        java.lang.String str3 = periodType2.toString();
        org.joda.time.PeriodType periodType4 = periodType2.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(10L);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.months();
        mutablePeriod12.set(durationFieldType13, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.months();
        boolean boolean17 = mutablePeriod12.isSupported(durationFieldType16);
        int int18 = mutablePeriod8.indexOf(durationFieldType16);
        java.lang.String str19 = durationFieldType16.getName();
        int int20 = mutablePeriod6.get(durationFieldType16);
        boolean boolean21 = periodType4.isSupported(durationFieldType16);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 292278993, (long) (short) 10, periodType4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType24 = periodType4.getFieldType(2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PeriodType[Years]" + "'", str3, "PeriodType[Years]");
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "months" + "'", str19, "months");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.LocalDate localDate7 = property3.setCopy(2022);
        org.joda.time.LocalDate localDate8 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate10 = localDate8.plusYears(521);
        java.util.Locale locale11 = java.util.Locale.PRC;
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale11);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromCalendarFields(calendar12);
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withCenturyOfEra(365);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDate10.compareTo((org.joda.time.ReadablePartial) localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1645455253206,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=13,MILLISECOND=206,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.util.Date date6 = new java.util.Date((int) (byte) 0, (int) (short) 10, (int) ' ', (int) 'u', 53633250, 53633250);
        int int7 = date6.getTimezoneOffset();
        date6.setMinutes(0);
        java.lang.String str10 = date6.toString();
        org.junit.Assert.assertEquals(date6.toString(), "Sun Aug 08 22:00:30 UTC 2004");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Sun Aug 08 22:00:30 UTC 2004" + "'", str10, "Sun Aug 08 22:00:30 UTC 2004");
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        int int1 = localTime0.size();
        org.joda.time.LocalTime.Property property2 = localTime0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = localTime0.toDateTimeToday(dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        java.lang.String str7 = mutableDateTime6.toString();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology9 = dateMidnight8.getChronology();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.withDayOfMonth(8);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfMonth();
        org.joda.time.DateTime dateTime18 = dateTime15.plusSeconds(10);
        org.joda.time.DateTime dateTime20 = dateTime15.minus((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property22 = dateTime20.property(dateTimeFieldType21);
        int int23 = dateMidnight8.get(dateTimeFieldType21);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime6.property(dateTimeFieldType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property25 = localTime0.property(dateTimeFieldType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str7, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        int int2 = mutableDateTime1.getYearOfEra();
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.months();
        mutablePeriod6.set(durationFieldType7, (int) 'a');
        mutablePeriod6.addHours((int) (byte) -1);
        mutablePeriod6.addYears(2022);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) mutablePeriod6);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime1.year();
        mutableDateTime1.setMillis((long) 10);
        org.joda.time.DateTime dateTime18 = mutableDateTime1.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfHour(53636377);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53636377 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        int int22 = mutablePeriod21.getMonths();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableInstant17, (org.joda.time.ReadablePeriod) mutablePeriod21);
        int[] intArray26 = chronology15.get((org.joda.time.ReadablePeriod) mutablePeriod21, 1L, (long) 4);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType6, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter3.withChronology(chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter3.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.parse("1969", dateTimeFormatter29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property13 = localDate12.yearOfEra();
        java.util.Locale locale14 = java.util.Locale.CHINA;
        java.util.Locale locale15 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(locale15);
        java.lang.String str17 = locale14.getDisplayVariant(locale15);
        int int18 = property13.getMaximumTextLength(locale14);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeField9.set((long) 3, "PT0S", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0S\" for clockhourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645455253761,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=13,MILLISECOND=761,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("eras");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setExtension('4', "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.roll(16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=923,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) localTime0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.Interval interval4 = localDate0.toInterval();
        org.joda.time.DateTime dateTime5 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime7 = dateTime5.plusMillis((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime5.withTime(440, (int) (short) 10, 292278993, 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 440 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property4 = localDate3.dayOfYear();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.Interval interval7 = localDate3.toInterval(dateTimeZone6);
        long long10 = dateTimeZone6.adjustOffset((long) 2, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(50473355, 53700000, (int) 'a', dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53700000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime6 = dateTime4.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfMonth();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType14);
        mutablePeriod11.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod15);
        java.lang.String str17 = mutablePeriod11.toString();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((java.lang.Object) localTime2, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455254333,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=14,MILLISECOND=333,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0.034S" + "'", str17, "PT0.034S");
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(4, 1969, (int) ' ', (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        boolean boolean6 = dateTimeField4.isLeap((long) 4);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime12 = timeOfDay7.toDateTime((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay7.minusMinutes(301);
        org.joda.time.TimeOfDay timeOfDay16 = timeOfDay14.withHourOfDay(1);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        mutableDateTime19.add((long) 1);
        org.joda.time.DateTime dateTime22 = mutableDateTime19.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.years();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime19, readableDuration23, periodType24);
        int[] intArray26 = period25.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = dateTimeField4.set((org.joda.time.ReadablePartial) timeOfDay14, 21, intArray26, 50473355);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0]");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMillis((int) (short) 1);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology6 = dateMidnight5.getChronology();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withDayOfMonth(8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime10.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime12.plusSeconds(10);
        org.joda.time.DateTime dateTime17 = dateTime12.minus((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property19 = dateTime17.property(dateTimeFieldType18);
        int int20 = dateMidnight5.get(dateTimeFieldType18);
        int int21 = localDateTime2.indexOf(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime2.withDayOfWeek(5);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.now();
        int int25 = localTime24.size();
        org.joda.time.LocalTime localTime27 = localTime24.plusMillis(11);
        int int28 = localTime24.size();
        int int29 = localTime24.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = localDateTime2.isBefore((org.joda.time.ReadablePartial) localTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455254681,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=14,MILLISECOND=681,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 14 + "'", int29 == 14);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.add(4, 0);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        boolean boolean7 = localDate5.isSupported(dateTimeFieldType6);
        org.joda.time.LocalDate.Property property8 = localDate5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DurationField durationField10 = property8.getDurationField();
        org.joda.time.LocalDate localDate12 = property8.setCopy(2022);
        org.joda.time.LocalDate localDate13 = property8.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate15 = property8.addToCopy(365);
        int int16 = property8.getMinimumValueOverall();
        int int17 = property8.getMinimumValueOverall();
        boolean boolean18 = calendar1.equals((java.lang.Object) int17);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455254755,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=14,MILLISECOND=755,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        int int11 = timeZone10.getRawOffset();
        int int13 = timeZone10.getOffset((long) 'u');
        java.lang.String str14 = timeZone10.getDisplayName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=808,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coordinated Universal Time" + "'", str14, "Coordinated Universal Time");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(0, (-292275054), 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.add(4, 0);
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromCalendarFields(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.withSecondOfMinute(208);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 208 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455255024,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=15,MILLISECOND=24,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeOfDay5);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Interval interval7 = interval6.toInterval();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Interval interval15 = interval14.toInterval();
        boolean boolean16 = interval7.contains((org.joda.time.ReadableInterval) interval14);
        boolean boolean17 = interval7.containsNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval19 = interval7.withEndMillis((long) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType13);
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType17);
        mutablePeriod14.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType22);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.months();
        mutablePeriod23.set(durationFieldType24, (int) 'a');
        mutablePeriod14.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod23);
        boolean boolean28 = calendar1.after((java.lang.Object) mutablePeriod23);
        java.util.Locale locale29 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(locale29);
        int int31 = calendar1.compareTo(calendar30);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=88,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar30);
// flaky:         org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=1645455255088,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=15,MILLISECOND=88,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDate.Property property9 = localDate6.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        boolean boolean12 = durationField11.isPrecise();
        long long15 = durationField11.subtract((long) ' ', 0L);
        int int16 = durationField5.compareTo(durationField11);
        boolean boolean17 = durationField11.isPrecise();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.Duration duration1 = new org.joda.time.Duration((long) 'u');
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("Years");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusWeeks((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property7.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455255581,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=15,MILLISECOND=581,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = property1.setCopy("2022-02-21T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T00:00:00.000Z\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        int int11 = yearMonthDay8.size();
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay8.year();
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(locale13);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale13);
        int int16 = property12.getMaximumShortTextLength(locale13);
        org.joda.time.YearMonthDay yearMonthDay18 = property12.setCopy(6);
        java.util.Date date24 = new java.util.Date(5, (int) ' ', 0, (int) (short) 100, (int) (byte) -1);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromDateFields(date24);
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay();
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTime dateTime29 = yearMonthDay25.toDateTime(timeOfDay26, dateTimeZone28);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = property12.compareTo((org.joda.time.ReadablePartial) timeOfDay26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455255713,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=15,MILLISECOND=713,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645455255713,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=15,MILLISECOND=713,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertEquals(date24.toString(), "Wed Sep 04 03:59:00 UTC 1907");
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.Interval interval4 = localDate0.toInterval(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology7 = dateMidnight6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone3, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(100);
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime6 = property5.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = property5.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property5.withMaximumValue();
        org.joda.time.LocalTime localTime10 = property5.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.LocalTime localTime12 = property5.addWrapFieldToCopy(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = property5.addNoWrapToCopy(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfDay((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfYear(521);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 521 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455256425,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=16,MILLISECOND=425,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("P0Y", throwable1);
        java.io.IOException iOException3 = new java.io.IOException((java.lang.Throwable) iOException2);
        java.lang.Throwable throwable5 = null;
        java.io.IOException iOException6 = new java.io.IOException("P0Y", throwable5);
        java.io.IOException iOException7 = new java.io.IOException((java.lang.Throwable) iOException6);
        iOException3.addSuppressed((java.lang.Throwable) iOException6);
        java.lang.String str9 = iOException3.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.io.IOException: java.io.IOException: P0Y" + "'", str9, "java.io.IOException: java.io.IOException: P0Y");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronology();
        java.lang.Appendable appendable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter27.printTo(appendable29, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(chronology28);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property4.addToCopy((long) 2);
        org.joda.time.LocalDateTime localDateTime10 = property4.addToCopy(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = localDateTime10.toString("FR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455256644,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=16,MILLISECOND=644,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("Sun Aug 08 22:00:30 UTC 2004", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("2022-02-21T14:54:12.648");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T14:54:12.648\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        java.lang.String str1 = periodType0.toString();
        org.joda.time.PeriodType periodType2 = periodType0.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(10L);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.months();
        mutablePeriod10.set(durationFieldType11, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.months();
        boolean boolean15 = mutablePeriod10.isSupported(durationFieldType14);
        int int16 = mutablePeriod6.indexOf(durationFieldType14);
        java.lang.String str17 = durationFieldType14.getName();
        int int18 = mutablePeriod4.get(durationFieldType14);
        boolean boolean19 = periodType2.isSupported(durationFieldType14);
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime24 = dateTime22.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime25 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        java.lang.String str29 = dateTimeZone27.getName((long) 100);
        org.joda.time.DateTime dateTime30 = dateTime25.withZoneRetainFields(dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((java.lang.Object) periodType2, dateTimeZone27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PeriodType[Years]" + "'", str1, "PeriodType[Years]");
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "months" + "'", str17, "months");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        java.lang.String str1 = periodType0.toString();
        org.joda.time.PeriodType periodType2 = periodType0.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType4 = periodType2.getFieldType(53700000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53700000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PeriodType[Years]" + "'", str1, "PeriodType[Years]");
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(1L, dateTimeZone1);
        int int3 = localDate2.getYearOfEra();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = localDate2.isAfter(readablePartial4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(chronology7);
        org.joda.time.LocalDate localDate11 = localDate9.plusWeeks((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDate9.getFieldType(828);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 828");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((-31449599991L), 0L, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        mutableDateTime1.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfYear();
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) (short) -1, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusWeeks(0);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, (org.joda.time.ReadableInstant) dateMidnight13, periodType14);
        org.joda.time.MutablePeriod mutablePeriod16 = period15.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.hours();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod16.add(durationFieldType17, 944);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(mutablePeriod16);
        org.junit.Assert.assertNotNull(durationFieldType17);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.LocalDate localDate7 = property3.setCopy(2022);
        org.joda.time.LocalDate localDate8 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate10 = localDate8.plusYears(521);
        org.joda.time.LocalDate.Property property11 = localDate8.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate8.withWeekOfWeekyear(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("AD");
        java.lang.String str2 = languageRange1.getRange();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks((int) '#');
        boolean boolean7 = languageRange1.equals((java.lang.Object) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ad" + "'", str2, "ad");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        boolean boolean16 = interval6.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        int int22 = mutablePeriod21.getMonths();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableInstant17, (org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType28);
        int int30 = mutablePeriod29.getMonths();
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableInstant25, (org.joda.time.ReadablePeriod) mutablePeriod29);
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        boolean boolean33 = interval23.contains((org.joda.time.ReadableInterval) interval31);
        boolean boolean34 = interval6.overlaps((org.joda.time.ReadableInterval) interval23);
        org.joda.time.ReadableInstant readableInstant35 = null;
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType38);
        int int40 = mutablePeriod39.getMonths();
        org.joda.time.Interval interval41 = new org.joda.time.Interval(readableInstant35, (org.joda.time.ReadablePeriod) mutablePeriod39);
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology43 = dateMidnight42.getChronology();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight42.withDayOfMonth(8);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime49 = dateTime47.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property50 = dateTime49.dayOfMonth();
        org.joda.time.PeriodType periodType53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType53);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType57);
        mutablePeriod54.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod58);
        java.lang.String str60 = mutablePeriod54.toString();
        org.joda.time.Interval interval61 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime49, (org.joda.time.ReadablePeriod) mutablePeriod54);
        mutablePeriod54.setValue(0, 2022);
        org.joda.time.Duration duration66 = new org.joda.time.Duration((long) (byte) 0);
        mutablePeriod54.setPeriod((org.joda.time.ReadableDuration) duration66);
        org.joda.time.Duration duration69 = new org.joda.time.Duration((long) (byte) 0);
        long long70 = duration69.getMillis();
        org.joda.time.Duration duration72 = new org.joda.time.Duration((long) (byte) 0);
        long long73 = duration72.getMillis();
        int int74 = duration69.compareTo((org.joda.time.ReadableDuration) duration72);
        org.joda.time.Duration duration76 = duration66.withDurationAdded((org.joda.time.ReadableDuration) duration72, 2);
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight45.minus((org.joda.time.ReadableDuration) duration76);
        org.joda.time.DateMidnight dateMidnight78 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime79 = dateMidnight78.toMutableDateTime();
        mutableDateTime79.add((long) 1);
        org.joda.time.DateTime dateTime82 = mutableDateTime79.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration83 = null;
        org.joda.time.PeriodType periodType84 = org.joda.time.PeriodType.years();
        org.joda.time.Period period85 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime79, readableDuration83, periodType84);
        org.joda.time.Chronology chronology86 = mutableDateTime79.getChronology();
        org.joda.time.MutableDateTime mutableDateTime87 = org.joda.time.MutableDateTime.now(chronology86);
        org.joda.time.DateTime dateTime89 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime91 = dateTime89.withDayOfYear((int) (byte) 1);
        int int92 = dateTime91.getDayOfMonth();
        org.joda.time.Duration duration94 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime95 = dateTime91.minus((org.joda.time.ReadableDuration) duration94);
        mutableDateTime87.add((org.joda.time.ReadableDuration) duration94);
        org.joda.time.Duration duration97 = duration76.plus((org.joda.time.ReadableDuration) duration94);
        org.joda.time.Interval interval98 = interval41.withDurationAfterStart((org.joda.time.ReadableDuration) duration97);
        boolean boolean99 = interval6.isAfter((org.joda.time.ReadableInterval) interval41);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PT0.034S" + "'", str60, "PT0.034S");
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(duration76);
        org.junit.Assert.assertNotNull(dateMidnight77);
        org.junit.Assert.assertNotNull(mutableDateTime79);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertNotNull(periodType84);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(mutableDateTime87);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 1 + "'", int92 == 1);
        org.junit.Assert.assertNotNull(dateTime95);
        org.junit.Assert.assertNotNull(duration97);
        org.junit.Assert.assertNotNull(interval98);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = null;
        org.joda.time.format.DateTimeParser dateTimeParser6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter5, dateTimeParser6);
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType11 = periodType10.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType15);
        int int17 = mutablePeriod16.getMonths();
        org.joda.time.Interval interval18 = new org.joda.time.Interval(readableInstant12, (org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(chronology19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType24);
        int int26 = mutablePeriod25.getMonths();
        org.joda.time.Interval interval27 = new org.joda.time.Interval(readableInstant21, (org.joda.time.ReadablePeriod) mutablePeriod25);
        int[] intArray30 = chronology19.get((org.joda.time.ReadablePeriod) mutablePeriod25, 1L, (long) 4);
        org.joda.time.Period period31 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType10, chronology19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter7.withChronology(chronology19);
        org.joda.time.Chronology chronology33 = dateTimeFormatter32.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(7, 440, 31, (int) (short) 100, (int) (byte) 1, chronology33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = dateTimeFormatter2.parseMutableDateTime("P0Y");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        int int11 = timeZone10.getRawOffset();
        int int12 = timeZone10.getRawOffset();
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone10, locale13);
        java.lang.String str15 = locale13.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=813,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455257813,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=17,MILLISECOND=813,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "de" + "'", str15, "de");
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        mutableDateTime1.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfYear();
        int int8 = property7.getMaximumValue();
        long long9 = property7.remainder();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime4 = dateMidnight3.toMutableDateTime();
        mutableDateTime4.add((long) 1);
        org.joda.time.DateTime dateTime7 = mutableDateTime4.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.years();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime4, readableDuration8, periodType9);
        org.joda.time.Chronology chronology11 = mutableDateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.joda.time.DurationField durationField13 = chronology11.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay((int) (byte) 0, 50473355, 53, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50473355 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(575, 4, (int) (short) -1, 3, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.months();
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime3 = dateMidnight2.toMutableDateTime();
        mutableDateTime3.add((long) 1);
        mutableDateTime3.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime3.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        mutableDateTime3.add(readableDuration9, (int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime13 = dateMidnight12.toMutableDateTime();
        mutableDateTime13.add((long) 1);
        org.joda.time.DateTime dateTime16 = mutableDateTime13.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.years();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime13, readableDuration17, periodType18);
        org.joda.time.Chronology chronology20 = mutableDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.clockhourOfHalfday();
        org.joda.time.DurationField durationField22 = chronology20.halfdays();
        mutableDateTime3.setChronology(chronology20);
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (short) 100, periodType1, chronology20);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod24.setMillis(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType6);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.months();
        mutablePeriod12.set(durationFieldType13, (int) 'a');
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType18 = mutablePeriod12.getFieldType((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType13);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight11 = yearMonthDay10.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime13 = dateMidnight12.toMutableDateTime();
        mutableDateTime13.add((long) 1);
        org.joda.time.DateTime dateTime16 = mutableDateTime13.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.years();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime13, readableDuration17, periodType18);
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay10.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType24);
        int int26 = mutablePeriod25.getMonths();
        org.joda.time.Interval interval27 = new org.joda.time.Interval(readableInstant21, (org.joda.time.ReadablePeriod) mutablePeriod25);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(10L);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType32);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.months();
        mutablePeriod33.set(durationFieldType34, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.months();
        boolean boolean38 = mutablePeriod33.isSupported(durationFieldType37);
        int int39 = mutablePeriod29.indexOf(durationFieldType37);
        java.lang.String str40 = durationFieldType37.getName();
        mutablePeriod25.add(durationFieldType37, (int) (short) 10);
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay20.withFieldAdded(durationFieldType37, 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType46 = yearMonthDay20.getFieldType(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32772");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "months" + "'", str40, "months");
        org.junit.Assert.assertNotNull(yearMonthDay44);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearWeekDayTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period((int) (byte) 10, 11, (int) (byte) -1, 1970, 69, (int) (byte) 1, 9, 53636377, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime2 = localTime0.plusMillis((int) '4');
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutablePeriod4.add(readableDuration5);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        mutablePeriod11.set(durationFieldType12, (int) 'a');
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) 100, chronology23);
        boolean boolean25 = durationFieldType12.isSupported(chronology23);
        mutablePeriod4.setPeriod((long) '4', chronology23);
        org.joda.time.LocalTime localTime27 = localTime2.minus((org.joda.time.ReadablePeriod) mutablePeriod4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = localTime2.toString("DateTimeField[yearOfEra]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(0, 365, 69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.Weeks weeks8 = period7.toStandardWeeks();
        org.joda.time.Period period10 = period7.minusYears(12);
        int[] intArray11 = period10.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration12 = period10.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-12]");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        java.lang.Object obj3 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455258973,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=18,MILLISECOND=973,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "java.util.GregorianCalendar[time=1645455258973,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=18,MILLISECOND=973,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "java.util.GregorianCalendar[time=1645455258973,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=18,MILLISECOND=973,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "java.util.GregorianCalendar[time=1645455258973,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=18,MILLISECOND=973,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod13, 1L, (long) 4);
        org.joda.time.DateTimeField dateTimeField19 = chronology7.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = dateTimeField19.set((long) 4, "eras");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"eras\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime3 = dateMidnight0.toMutableDateTime();
        boolean boolean5 = dateMidnight0.isEqual((long) 2);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight0.withCenturyOfEra(0);
        org.joda.time.MutableDateTime mutableDateTime8 = dateMidnight7.toMutableDateTimeISO();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType17);
        int int19 = mutablePeriod18.getMonths();
        org.joda.time.Interval interval20 = new org.joda.time.Interval(readableInstant14, (org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 100, chronology21);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((int) (byte) 10, (int) (byte) 1, 3, (int) (short) 1, chronology21);
        org.joda.time.DateTimeField dateTimeField24 = chronology21.weekyear();
        mutableDateTime8.setRounding(dateTimeField24);
        int int27 = dateTimeField24.getMinimumValue((long) (-292275054));
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-292275054) + "'", int27 == (-292275054));
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTimeFormatter2.parseDateTime("DateTimeField[yearOfEra]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime10 = dateTime8.withDayOfYear((int) (byte) 1);
        int int11 = dateTime10.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime13 = dateMidnight12.toMutableDateTime();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) mutableDateTime13);
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime13.dayOfMonth();
        mutableDateTime13.addYears(365);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.months();
        mutablePeriod21.set(durationFieldType22, (int) 'a');
        mutableDateTime13.add((org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType29);
        int int31 = mutablePeriod30.getMonths();
        org.joda.time.Interval interval32 = new org.joda.time.Interval(readableInstant26, (org.joda.time.ReadablePeriod) mutablePeriod30);
        org.joda.time.Chronology chronology33 = interval32.getChronology();
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.PeriodType periodType37 = null;
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType37);
        int int39 = mutablePeriod38.getMonths();
        org.joda.time.Interval interval40 = new org.joda.time.Interval(readableInstant34, (org.joda.time.ReadablePeriod) mutablePeriod38);
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        boolean boolean42 = interval32.contains((org.joda.time.ReadableInterval) interval40);
        long long43 = interval40.getEndMillis();
        boolean boolean44 = interval40.containsNow();
        mutablePeriod21.add((org.joda.time.ReadableInterval) interval40);
        org.joda.time.DurationFieldType durationFieldType47 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType50);
        org.joda.time.DurationFieldType durationFieldType52 = org.joda.time.DurationFieldType.months();
        mutablePeriod51.set(durationFieldType52, (int) 'a');
        org.joda.time.ReadableInstant readableInstant56 = null;
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType59);
        int int61 = mutablePeriod60.getMonths();
        org.joda.time.Interval interval62 = new org.joda.time.Interval(readableInstant56, (org.joda.time.ReadablePeriod) mutablePeriod60);
        org.joda.time.Chronology chronology63 = interval62.getChronology();
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (short) 100, chronology63);
        boolean boolean65 = durationFieldType52.isSupported(chronology63);
        boolean boolean66 = durationFieldType47.isSupported(chronology63);
        mutablePeriod21.add((long) '4', chronology63);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime68 = new org.joda.time.MutableDateTime((int) (byte) 1, 944, 23, (int) '#', (int) (byte) -1, (int) 'a', 4, chronology63);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(chronology41);
// flaky:         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1645455259802L + "'", long43 == 1645455259802L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(durationFieldType47);
        org.junit.Assert.assertNotNull(durationFieldType52);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = property3.set("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"???????\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str2, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withCenturyOfEra(365);
        int int6 = localDateTime5.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfSecond(21);
        int int9 = localDateTime5.getSecondOfMinute();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(periodType10);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        int int22 = mutablePeriod21.getMonths();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableInstant17, (org.joda.time.ReadablePeriod) mutablePeriod21);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) 100, chronology24);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((int) (byte) 10, (int) (byte) 1, 3, (int) (short) 1, chronology24);
        org.joda.time.DateTimeField dateTimeField27 = chronology24.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((java.lang.Object) localDateTime5, periodType10, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455259921,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=19,MILLISECOND=921,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 921 + "'", int6 == 921);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 19 + "'", int9 == 19);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusWeeks((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = property7.getField();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = timeOfDay9.getFieldTypes();
        org.joda.time.Chronology chronology11 = timeOfDay9.getChronology();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology14 = dateMidnight13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekyearOfCentury();
        org.joda.time.Period period17 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period19 = period17.minusYears(8);
        org.joda.time.Period period21 = period17.withSeconds(11);
        org.joda.time.Period period23 = period17.minusMillis((int) (short) 100);
        org.joda.time.Period period25 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period27 = period25.minusYears(8);
        org.joda.time.Period period29 = period25.withSeconds(11);
        org.joda.time.Period period31 = period25.minusMillis((int) (short) 100);
        org.joda.time.Period period32 = period17.withFields((org.joda.time.ReadablePeriod) period25);
        int[] intArray35 = chronology14.get((org.joda.time.ReadablePeriod) period25, (-31449600001L), (long) 53633250);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray37 = dateTimeField8.addWrapField((org.joda.time.ReadablePartial) timeOfDay9, 8, intArray35, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455259948,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=19,MILLISECOND=948,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0, 11, 4, 2, 14, 53, 53, 251]");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) 1);
        org.joda.time.Seconds seconds2 = period1.toStandardSeconds();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) (byte) 0, dateTimeZone5);
        long long8 = dateTimeZone5.previousTransition((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) seconds2, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Seconds");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) 1);
        org.joda.time.Period period3 = period1.minusMinutes((int) '#');
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime5 = dateMidnight4.toMutableDateTime();
        int int6 = mutableDateTime5.getYearOfEra();
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.months();
        mutablePeriod10.set(durationFieldType11, (int) 'a');
        mutablePeriod10.addHours((int) (byte) -1);
        mutablePeriod10.addYears(2022);
        mutableDateTime5.add((org.joda.time.ReadablePeriod) mutablePeriod10);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime22 = dateMidnight21.toMutableDateTime();
        mutableDateTime22.add((long) 1);
        org.joda.time.DateTime dateTime25 = mutableDateTime22.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.years();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime22, readableDuration26, periodType27);
        java.lang.String str29 = mutableDateTime22.toString();
        org.joda.time.Chronology chronology30 = mutableDateTime22.getChronology();
        mutablePeriod10.setPeriod(32L, (long) (short) -1, chronology30);
        org.joda.time.DurationField durationField32 = chronology30.seconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) period3, chronology30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022-02-21T00:00:00.001Z" + "'", str29, "2022-02-21T00:00:00.001Z");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationField32);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        int int4 = dateTime3.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableInstant) mutableDateTime6);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfYear((int) (byte) 1);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime14 = dateMidnight13.toMutableDateTime();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) mutableDateTime14);
        org.joda.time.Interval interval16 = interval7.gap((org.joda.time.ReadableInterval) interval15);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = interval16.getEndMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNull(interval16);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.now();
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        int int7 = mutableDateTime6.getYearOfEra();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        mutablePeriod11.set(durationFieldType12, (int) 'a');
        mutablePeriod11.addHours((int) (byte) -1);
        mutablePeriod11.addYears(2022);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.LocalTime localTime20 = localTime3.plus((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds(100);
        java.lang.String str23 = localTime20.toString();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "13:54:20.437" + "'", str23, "13:54:20.437");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withCenturyOfEra(365);
        int int6 = localDateTime5.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfSecond(21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withDayOfYear(440);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 440 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455260429,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=20,MILLISECOND=429,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 429 + "'", int6 == 429);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime5 = property4.roundCeilingCopy();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = property4.setCopy("PT0.034S", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0.034S\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455260480,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=20,MILLISECOND=480,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate2 = property1.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withMonthOfYear(798);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 798 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(1970, (int) (short) -1, 301, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.weekOfWeekyear();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        java.lang.String str11 = periodType10.toString();
        org.joda.time.PeriodType periodType12 = periodType10.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(periodType12);
        long long16 = chronology7.add((org.joda.time.ReadablePeriod) mutablePeriod13, (long) (byte) 100, (int) (short) 1);
        mutablePeriod13.setPeriod((long) 521, (long) 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PeriodType[Years]" + "'", str11, "PeriodType[Years]");
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        boolean boolean28 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter2.withZoneUTC();
        java.lang.Appendable appendable30 = null;
        java.util.Locale locale31 = java.util.Locale.PRC;
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale31);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.fromCalendarFields(calendar32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusMillis((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime33.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime33.withWeekyear(134);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter29.printTo(appendable30, (org.joda.time.ReadablePartial) localDateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645455260646,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=20,MILLISECOND=646,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("eras");
        java.util.Locale.Builder builder3 = builder2.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder2.setUnicodeLocaleKeyword("13:54:20.437", "UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 13:54:20.437 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate localDate4 = localDate0.withWeekyear((int) (short) 100);
        int int5 = localDate4.getEra();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate4.getValue(440);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 440");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("PeriodType[Years]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'PeriodType[Years]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMillis((int) (short) 1);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology6 = dateMidnight5.getChronology();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withDayOfMonth(8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime10.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime12.plusSeconds(10);
        org.joda.time.DateTime dateTime17 = dateTime12.minus((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property19 = dateTime17.property(dateTimeFieldType18);
        int int20 = dateMidnight5.get(dateTimeFieldType18);
        int int21 = localDateTime2.indexOf(dateTimeFieldType18);
        org.joda.time.LocalDateTime.Property property22 = localDateTime2.weekOfWeekyear();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455260975,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=20,MILLISECOND=975,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        mutableDateTime1.setMonthOfYear(1);
        mutableDateTime1.addWeekyears(4);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(dateTimeZone8);
        org.joda.time.MutableDateTime mutableDateTime10 = mutableDateTime1.toMutableDateTime(dateTimeZone8);
        long long13 = dateTimeZone8.adjustOffset((-1725048060000L), true);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str2, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1725048060000L) + "'", long13 == (-1725048060000L));
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Etc/UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(517, 2, 32769, 54, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) 1);
        org.joda.time.Seconds seconds2 = period1.toStandardSeconds();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight3.plusYears((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, readableDuration8);
        org.joda.time.Period period10 = period1.plus((org.joda.time.ReadablePeriod) mutablePeriod9);
        java.lang.String str11 = period1.toString();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(seconds2);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P1D" + "'", str11, "P1D");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate localDate4 = localDate0.withWeekyear((int) (short) 100);
        int int5 = localDate4.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate4.withMonthOfYear(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        java.util.Date date6 = mutableDateTime2.toDate();
        java.util.Calendar.Builder builder7 = builder0.setInstant(date6);
        java.util.Calendar.Builder builder11 = builder0.setWeekDate(50473355, 517, 301);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar12 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 301");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Feb 21 00:00:00 GMT 2022");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("32");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"32\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(2, 134, 53633250, 828, 539, 575, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 828 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.withDayOfYear((int) (byte) 1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableDuration0, (org.joda.time.ReadableInstant) dateTime2, periodType5);
        org.joda.time.DateTime dateTime8 = dateTime2.withMonthOfYear((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay9 = dateTime8.toTimeOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime8.getZone();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.era();
        boolean boolean7 = mutableDateTime2.isSupported(dateTimeFieldType6);
        org.joda.time.MutableDateTime.Property property8 = mutableDateTime2.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = property8.getMutableDateTime();
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType13);
        int int15 = mutablePeriod14.getMonths();
        org.joda.time.Interval interval16 = new org.joda.time.Interval(readableInstant10, (org.joda.time.ReadablePeriod) mutablePeriod14);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(chronology17);
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType22);
        int int24 = mutablePeriod23.getMonths();
        org.joda.time.Interval interval25 = new org.joda.time.Interval(readableInstant19, (org.joda.time.ReadablePeriod) mutablePeriod23);
        int[] intArray28 = chronology17.get((org.joda.time.ReadablePeriod) mutablePeriod23, 1L, (long) 4);
        org.joda.time.PeriodType periodType29 = mutablePeriod23.getPeriodType();
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.millis();
        int int31 = periodType29.indexOf(durationFieldType30);
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime0, (org.joda.time.ReadableInstant) mutableDateTime9, periodType29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration33 = new org.joda.time.Duration((java.lang.Object) periodType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        int int22 = mutablePeriod21.getMonths();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableInstant17, (org.joda.time.ReadablePeriod) mutablePeriod21);
        int[] intArray26 = chronology15.get((org.joda.time.ReadablePeriod) mutablePeriod21, 1L, (long) 4);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType6, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter3.withChronology(chronology15);
        boolean boolean29 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter3.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime31 = org.joda.time.LocalTime.parse("weekyearOfCentury", dateTimeFormatter30);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("AD");
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType8 = periodType7.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(chronology16);
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType21);
        int int23 = mutablePeriod22.getMonths();
        org.joda.time.Interval interval24 = new org.joda.time.Interval(readableInstant18, (org.joda.time.ReadablePeriod) mutablePeriod22);
        int[] intArray27 = chronology16.get((org.joda.time.ReadablePeriod) mutablePeriod22, 1L, (long) 4);
        org.joda.time.Period period28 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType7, chronology16);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter4.withChronology(chronology16);
        org.joda.time.Chronology chronology30 = dateTimeFormatter29.getChronology();
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(chronology30);
        boolean boolean32 = languageRange1.equals((java.lang.Object) yearMonthDay31);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.add(4, 0);
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromCalendarFields(calendar1);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusHours(8);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = null;
        org.joda.time.format.DateTimeParser dateTimeParser10 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter9, dateTimeParser10);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay(chronology23);
        org.joda.time.ReadableInstant readableInstant25 = null;
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType28);
        int int30 = mutablePeriod29.getMonths();
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableInstant25, (org.joda.time.ReadablePeriod) mutablePeriod29);
        int[] intArray34 = chronology23.get((org.joda.time.ReadablePeriod) mutablePeriod29, 1L, (long) 4);
        org.joda.time.Period period35 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType14, chronology23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = dateTimeFormatter11.withChronology(chronology23);
        org.joda.time.Period period37 = new org.joda.time.Period((-31449600001L), chronology23);
        org.joda.time.Period period39 = period37.minusYears(11);
        org.joda.time.DurationFieldType durationFieldType40 = org.joda.time.DurationFieldType.days();
        org.joda.time.Period period42 = period39.withField(durationFieldType40, 301);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay44 = timeOfDay5.withFieldAdded(durationFieldType40, 53700000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'days' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455263247,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=23,MILLISECOND=247,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(durationFieldType40);
        org.junit.Assert.assertNotNull(period42);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.LocalDate.Property property4 = localDate0.yearOfEra();
        org.joda.time.LocalDate.Property property5 = localDate0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDate0.toString("n. Chr.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        java.util.Date date6 = mutableDateTime2.toDate();
        java.util.Calendar.Builder builder7 = builder0.setInstant(date6);
        java.util.Calendar.Builder builder11 = builder0.setWeekDate(50473355, 517, 301);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder14 = builder0.setWeekDefinition((int) ' ', (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Feb 21 00:00:00 GMT 2022");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(chronology7);
        org.joda.time.LocalDate localDate11 = localDate9.plusWeeks((-1));
        java.util.Locale locale12 = java.util.Locale.PRC;
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(locale12);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.fromCalendarFields(calendar13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMillis((int) (short) 1);
        int int17 = localDateTime16.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate11, (org.joda.time.ReadablePartial) localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645455263390,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=23,MILLISECOND=390,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 389 + "'", int17 == 389);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(0, 539, (int) (short) 100, 2, 53, 53637206, 798, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637206 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.Interval interval4 = localDate0.toInterval(dateTimeZone3);
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        mutableDateTime6.setDate((long) 5);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.Weeks weeks8 = period7.toStandardWeeks();
        org.joda.time.Period period10 = period7.minusYears(12);
        int[] intArray11 = period10.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period10.minusHours(52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-12]");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(14, (int) 'u', (-292275054), 22, (int) 'a', 0, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.util.Date date6 = new java.util.Date(22, 0, 32772, 0, (int) (short) 0, (int) ' ');
        java.lang.Object obj7 = date6.clone();
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Thu Sep 22 00:00:32 GMT 2011");
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "Thu Sep 22 00:00:32 GMT 2011");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "Thu Sep 22 00:00:32 GMT 2011");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "Thu Sep 22 00:00:32 GMT 2011");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.util.Date date6 = new java.util.Date((int) (byte) 0, (int) (short) 10, (int) ' ', (int) 'u', 53633250, 53633250);
        int int7 = date6.getTimezoneOffset();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        int int22 = mutablePeriod21.getMonths();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableInstant17, (org.joda.time.ReadablePeriod) mutablePeriod21);
        int[] intArray26 = chronology15.get((org.joda.time.ReadablePeriod) mutablePeriod21, 1L, (long) 4);
        org.joda.time.DateTimeField dateTimeField27 = chronology15.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((java.lang.Object) date6, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Sun Aug 08 22:37:30 GMT 2004");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.Interval interval4 = localDate0.toInterval(dateTimeZone3);
        long long7 = dateTimeZone3.adjustOffset((long) 2, true);
        org.joda.time.DateMidnight dateMidnight8 = org.joda.time.DateMidnight.now(dateTimeZone3);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime10.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfMonth();
        org.joda.time.DateTime dateTime15 = dateTime12.plusSeconds(10);
        org.joda.time.DateTime dateTime17 = dateTime12.minus((long) (short) -1);
        org.joda.time.DateTime dateTime19 = dateTime12.plusMinutes(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight8, (org.joda.time.ReadableInstant) dateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 2L + "'", long7 == 2L);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("1969-01-01T23:59:59.999Z/1969-01-02T00:00:00.033Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1969-01-01T23:59:59.999Z/1969-01...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.Interval interval3 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime5 = dateMidnight4.toMutableDateTime();
        mutableDateTime5.add((long) 1);
        org.joda.time.DateTime dateTime8 = mutableDateTime5.toDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        boolean boolean10 = interval3.isBefore((org.joda.time.ReadableInstant) dateTime8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval12 = interval3.withStartMillis((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale1 = locale0.stripExtensions();
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.weeks();
        org.joda.time.PeriodType periodType3 = periodType2.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((java.lang.Object) locale0, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko");
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleAttributes();
        java.util.Spliterator<java.lang.String> strSpliterator5 = strSet4.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = strSet4.add("PeriodType[Years]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455264816,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=24,MILLISECOND=816,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strSpliterator5);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder2 = builder0.setCalendarType("era");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: era");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod13, 1L, (long) 4);
        org.joda.time.DateTimeField dateTimeField19 = chronology7.monthOfYear();
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dateTimeField19.getAsText(16, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.Weeks weeks8 = period7.toStandardWeeks();
        org.joda.time.Period period10 = period7.minusYears(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = period7.plusWeeks(3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(weeks8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(23, 52, 3, 517, 0, 20, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 517 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("P1D", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("1969-01-01T23:59:59.999Z/1969-01-02T00:00:00.033Z", (double) 1640995200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.6409952E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.yearOfCentury();
        int int2 = dateMidnight0.getWeekOfWeekyear();
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime8 = timeOfDay3.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        boolean boolean9 = dateMidnight0.isEqual((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime11 = dateMidnight10.toMutableDateTime();
        mutableDateTime11.add((long) 1);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.months();
        mutableDateTime11.add(durationFieldType14, (int) (byte) 1);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType18 = periodType17.withYearsRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight0, (org.joda.time.ReadableInstant) mutableDateTime11, periodType17);
        java.util.GregorianCalendar gregorianCalendar20 = mutableDateTime11.toGregorianCalendar();
        java.lang.Object obj21 = gregorianCalendar20.clone();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(gregorianCalendar20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "java.util.GregorianCalendar[time=1647820800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=80,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "java.util.GregorianCalendar[time=1647820800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=80,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "java.util.GregorianCalendar[time=1647820800001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=13,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=80,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((long) (short) -1, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusWeeks(0);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime9 = dateTime7.withDayOfYear((int) (byte) 1);
        int int10 = dateTime9.getDayOfMonth();
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime13 = dateTime9.minus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight5.minus((org.joda.time.ReadableDuration) duration12);
        int int15 = dateMidnight14.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withEra(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 365 + "'", int15 == 365);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod13, 1L, (long) 4);
        org.joda.time.DurationField durationField19 = chronology7.eras();
        java.lang.String str20 = durationField19.getName();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDate21.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property24 = localDate21.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        org.joda.time.DurationField durationField26 = property24.getDurationField();
        long long29 = durationField26.add((long) 2, (int) (byte) 0);
        long long32 = durationField26.subtract((long) 12, (int) (byte) 100);
        int int33 = durationField19.compareTo(durationField26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "eras" + "'", str20, "eras");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 2L + "'", long29 == 2L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-3155673599988L) + "'", long32 == (-3155673599988L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate2 = property1.roundCeilingCopy();
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime4 = dateMidnight3.toMutableDateTime();
        mutableDateTime4.add((long) 1);
        org.joda.time.DateTime dateTime7 = mutableDateTime4.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.years();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime4, readableDuration8, periodType9);
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType14);
        int int16 = mutablePeriod15.getMonths();
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableInstant11, (org.joda.time.ReadablePeriod) mutablePeriod15);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(chronology18);
        org.joda.time.DurationField durationField20 = chronology18.weeks();
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology18);
        mutableDateTime4.setChronology(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) localDate2, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(0, 53636377, 0, 1970, 2022, 21, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter27.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter27.withPivotYear(312);
        boolean boolean31 = dateTimeFormatter30.isPrinter();
        java.lang.Appendable appendable32 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime36 = dateTime34.withDayOfYear((int) (byte) 1);
        int int37 = dateTime36.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime39 = dateMidnight38.toMutableDateTime();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.DateTime dateTime42 = dateTime36.plusYears((-1));
        org.joda.time.DateTime.Property property43 = dateTime42.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter30.printTo(appendable32, (org.joda.time.ReadableInstant) dateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(dateTimeParser28);
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((int) ' ', 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime3 = dateMidnight2.toMutableDateTime();
        mutableDateTime3.add((long) 1);
        org.joda.time.DateTime dateTime6 = mutableDateTime3.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.years();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime3, readableDuration7, periodType8);
        org.joda.time.Chronology chronology10 = mutableDateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.clockhourOfHalfday();
        java.lang.String str12 = chronology10.toString();
        org.joda.time.Period period13 = new org.joda.time.Period(35417L, (long) 16, chronology10);
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime15 = dateMidnight14.toMutableDateTime();
        mutableDateTime15.add((long) 1);
        org.joda.time.DateTime dateTime18 = mutableDateTime15.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.PeriodType periodType20 = org.joda.time.PeriodType.years();
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime15, readableDuration19, periodType20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType25);
        int int27 = mutablePeriod26.getMonths();
        org.joda.time.Interval interval28 = new org.joda.time.Interval(readableInstant22, (org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(chronology29);
        org.joda.time.DurationField durationField31 = chronology29.weeks();
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(chronology29);
        mutableDateTime15.setChronology(chronology29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay((java.lang.Object) period13, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str12, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.now();
        int int4 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        int int7 = mutableDateTime6.getYearOfEra();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        mutablePeriod11.set(durationFieldType12, (int) 'a');
        mutablePeriod11.addHours((int) (byte) -1);
        mutablePeriod11.addYears(2022);
        mutableDateTime6.add((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.LocalTime localTime20 = localTime3.plus((org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Period period22 = org.joda.time.Period.days((int) (short) 1);
        org.joda.time.Period period24 = period22.minusMinutes((int) '#');
        int int25 = period22.getWeeks();
        mutablePeriod11.mergePeriod((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period28 = period22.plusDays(31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType30 = period28.getFieldType(9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        int int22 = mutablePeriod21.getMonths();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableInstant17, (org.joda.time.ReadablePeriod) mutablePeriod21);
        int[] intArray26 = chronology15.get((org.joda.time.ReadablePeriod) mutablePeriod21, 1L, (long) 4);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType6, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter3.withChronology(chronology15);
        org.joda.time.format.DateTimeParser dateTimeParser29 = dateTimeFormatter28.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight30 = org.joda.time.DateMidnight.parse("13:54:20.437", dateTimeFormatter28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(dateTimeParser29);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime3.plusSeconds(10);
        org.joda.time.DateTime dateTime8 = dateTime3.minus((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property10 = dateTime8.property(dateTimeFieldType9);
        org.joda.time.DateTime dateTime12 = dateTime8.withCenturyOfEra(134);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime12.withTime((int) '#', (int) (short) 1, 9, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setScript("eras");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguageTag("DurationField[seconds]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: DurationField[seconds] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("1");
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeZone1.getOffset((int) (short) 10, 69, (int) (short) 10, 999, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField9.set(35417L, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        int int11 = yearMonthDay8.size();
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime13 = dateMidnight12.toMutableDateTime();
        mutableDateTime13.add((long) 1);
        org.joda.time.DateTime dateTime16 = mutableDateTime13.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.era();
        boolean boolean18 = mutableDateTime13.isSupported(dateTimeFieldType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property19 = yearMonthDay8.property(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        boolean boolean11 = timeZone10.observesDaylightTime();
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        java.util.Locale locale15 = locale14.stripExtensions();
        java.lang.String str16 = locale15.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = timeZone10.getDisplayName(false, (int) (byte) -1, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=297,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(100);
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration6 = new org.joda.time.Duration((java.lang.Object) property5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType6);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.months();
        mutablePeriod12.set(durationFieldType13, (int) 'a');
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        mutablePeriod3.addWeeks(828);
        org.junit.Assert.assertNotNull(durationFieldType13);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(100);
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime6 = property5.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = property5.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property5.withMaximumValue();
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property5.setCopy("FR", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"FR\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.plusYears((int) (byte) 0);
        org.joda.time.Period period6 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period8 = period6.minusYears(8);
        org.joda.time.Period period10 = period6.withSeconds(11);
        org.joda.time.PeriodType periodType11 = period6.getPeriodType();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight4.minus((org.joda.time.ReadablePeriod) period6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType14 = period6.getFieldType(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.monthOfYear();
        int int4 = property3.get();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = new org.joda.time.Period((java.lang.Object) int4, periodType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str2, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = timeOfDay0.toDateTime((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay0.withHourOfDay(10);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.plusMillis((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean11 = timeOfDay7.isSupported(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfMonth();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType23);
        mutablePeriod20.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        java.lang.String str26 = mutablePeriod20.toString();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadablePeriod) mutablePeriod20);
        mutablePeriod20.setValue(0, 2022);
        mutablePeriod20.addDays(31);
        org.joda.time.TimeOfDay timeOfDay33 = timeOfDay7.plus((org.joda.time.ReadablePeriod) mutablePeriod20);
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusHours(292278993);
        java.lang.String str36 = timeOfDay33.toString();
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime40 = dateTime38.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property41 = dateTime40.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime46 = dateTime44.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime47 = timeOfDay42.toDateTime((org.joda.time.ReadableInstant) dateTime44);
        org.joda.time.TimeOfDay timeOfDay49 = timeOfDay42.withHourOfDay(10);
        org.joda.time.TimeOfDay timeOfDay51 = timeOfDay49.plusMillis((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean53 = timeOfDay49.isSupported(dateTimeFieldType52);
        int int54 = dateTime40.get(dateTimeFieldType52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay56 = timeOfDay33.withField(dateTimeFieldType52, 828);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT0.034S" + "'", str26, "PT0.034S");
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(timeOfDay35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "T10:54:27.806" + "'", str36, "T10:54:27.806");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.weekyear();
        org.joda.time.LocalDateTime localDateTime5 = property3.addWrapFieldToCopy(2022);
        org.joda.time.LocalDateTime localDateTime7 = property3.addToCopy((long) 2022);
        org.joda.time.Period period9 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period11 = period9.minusYears(8);
        org.joda.time.Period period13 = period9.withSeconds(11);
        org.joda.time.PeriodType periodType14 = period9.getPeriodType();
        org.joda.time.PeriodType periodType15 = periodType14.withHoursRemoved();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((java.lang.Object) localDateTime7, periodType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455268028,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=28,MILLISECOND=28,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) '#');
        org.joda.time.LocalDateTime localDateTime4 = dateTime1.toLocalDateTime();
        org.joda.time.LocalDate localDate5 = localDateTime4.toLocalDate();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        calendar1.set(2022, (int) (byte) 0, (int) (short) 1, (int) (short) 0, 2022, (int) ' ');
        java.util.TimeZone timeZone10 = calendar1.getTimeZone();
        int int11 = timeZone10.getRawOffset();
        int int13 = timeZone10.getOffset((long) 'u');
        java.util.Locale locale14 = java.util.Locale.PRC;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale19);
        int int21 = property18.getMaximumShortTextLength(locale19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone10, locale19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = calendar22.getMinimum(53637206);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53637206");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=0,MINUTE=2022,SECOND=32,MILLISECOND=150,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645455268150,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=28,MILLISECOND=150,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1645455268150,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=28,MILLISECOND=150,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1645455268150,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=28,MILLISECOND=150,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime3.plusSeconds(10);
        org.joda.time.DateTime dateTime8 = dateTime3.minus((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property10 = dateTime8.property(dateTimeFieldType9);
        org.joda.time.DateTime dateTime12 = dateTime8.withCenturyOfEra(134);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withEra(539);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 539 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withCenturyOfEra(365);
        int int6 = localDateTime5.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfSecond(21);
        java.util.Date date9 = localDateTime8.toDate();
        date9.setTime((long) 23);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455268321,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=28,MILLISECOND=321,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 321 + "'", int6 == 321);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 GMT 1970");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology1 = dateMidnight0.getChronology();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType8);
        mutablePeriod5.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod9);
        java.lang.String str11 = mutablePeriod5.toString();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight0.plus((org.joda.time.ReadablePeriod) mutablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.withDayOfMonth(944);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 944 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0.034S" + "'", str11, "PT0.034S");
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((long) (short) -1, dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) category0, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale$Category");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = null;
        boolean boolean2 = localDate0.isSupported(dateTimeFieldType1);
        org.joda.time.LocalDate.Property property3 = localDate0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.DurationField durationField5 = property3.getDurationField();
        org.joda.time.LocalDate localDate7 = property3.setCopy(2022);
        org.joda.time.LocalDate localDate8 = property3.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate10 = property3.addToCopy(365);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.years();
        java.lang.String str14 = periodType13.toString();
        org.joda.time.PeriodType periodType15 = periodType13.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 2, (long) (byte) 0, periodType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) localDate10, periodType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PeriodType[Years]" + "'", str14, "PeriodType[Years]");
        org.junit.Assert.assertNotNull(periodType15);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = dateTimeFormatter2.parseLocalTime("");
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
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        boolean boolean8 = mutableDateTime1.isAfterNow();
        int int9 = mutableDateTime1.getMillisOfDay();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("n. Chr.", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=n.chr.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        int int11 = yearMonthDay8.size();
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay8.year();
        int int13 = property12.getMinimumValueOverall();
        java.lang.String str14 = property12.getAsString();
        org.joda.time.YearMonthDay yearMonthDay16 = property12.addWrapFieldToCopy(53637206);
        java.lang.String str17 = property12.getAsString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-292275054) + "'", int13 == (-292275054));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022" + "'", str17, "2022");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        boolean boolean28 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = dateTimeFormatter2.parseLocalDateTime("2022-02-21T14:54:12.648");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = dateTimeFormatter28.parseMillis("\u65e5\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime2 = dateTime1.toLocalTime();
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(100);
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime6 = property5.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = property5.withMaximumValue();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime10 = localTime8.plusMillis((int) '4');
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.ReadableDuration readableDuration13 = null;
        mutablePeriod12.add(readableDuration13);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.months();
        mutablePeriod19.set(durationFieldType20, (int) 'a');
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType27);
        int int29 = mutablePeriod28.getMonths();
        org.joda.time.Interval interval30 = new org.joda.time.Interval(readableInstant24, (org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 100, chronology31);
        boolean boolean33 = durationFieldType20.isSupported(chronology31);
        mutablePeriod12.setPeriod((long) '4', chronology31);
        org.joda.time.LocalTime localTime35 = localTime10.minus((org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(35417L);
        int int38 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime37);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.LocalTime localTime41 = dateTime40.toLocalTime();
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.now();
        int int43 = localTime41.compareTo((org.joda.time.ReadablePartial) localTime42);
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime45 = dateMidnight44.toMutableDateTime();
        int int46 = mutableDateTime45.getYearOfEra();
        org.joda.time.PeriodType periodType49 = null;
        org.joda.time.MutablePeriod mutablePeriod50 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType49);
        org.joda.time.DurationFieldType durationFieldType51 = org.joda.time.DurationFieldType.months();
        mutablePeriod50.set(durationFieldType51, (int) 'a');
        mutablePeriod50.addHours((int) (byte) -1);
        mutablePeriod50.addYears(2022);
        mutableDateTime45.add((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.LocalTime localTime59 = localTime42.plus((org.joda.time.ReadablePeriod) mutablePeriod50);
        org.joda.time.LocalTime localTime61 = localTime59.plusSeconds(100);
        boolean boolean62 = localTime37.isEqual((org.joda.time.ReadablePartial) localTime59);
        int int63 = property5.compareTo((org.joda.time.ReadablePartial) localTime59);
        org.joda.time.LocalTime localTime65 = localTime59.withMillisOfDay(0);
        org.joda.time.LocalTime localTime67 = localTime65.plusHours(53633250);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType69 = localTime67.getFieldType(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1970");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2022 + "'", int46 == 2022);
        org.junit.Assert.assertNotNull(durationFieldType51);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(localTime67);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        mutablePeriod8.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        java.lang.String str14 = mutablePeriod8.toString();
        org.joda.time.Interval interval15 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Interval interval17 = interval15.withDurationAfterStart(readableDuration16);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        mutableDateTime19.add((long) 1);
        org.joda.time.DateTime dateTime22 = mutableDateTime19.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.years();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime19, readableDuration23, periodType24);
        java.lang.String str26 = mutableDateTime19.toString();
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime19.millisOfSecond();
        boolean boolean28 = interval15.isBefore((org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.MutableDateTime mutableDateTime29 = mutableDateTime19.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime19.setDayOfWeek((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT0.034S" + "'", str14, "PT0.034S");
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022-02-21T00:00:00.001Z" + "'", str26, "2022-02-21T00:00:00.001Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(mutableDateTime29);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType8);
        int int10 = mutablePeriod9.getMonths();
        org.joda.time.Interval interval11 = new org.joda.time.Interval(readableInstant5, (org.joda.time.ReadablePeriod) mutablePeriod9);
        org.joda.time.Chronology chronology12 = interval11.getChronology();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) 100, chronology12);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (byte) 10, (int) (byte) 1, 3, (int) (short) 1, chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.weekyear();
        java.util.Locale locale16 = java.util.Locale.PRC;
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(locale16);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.fromCalendarFields(calendar17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.weekyear();
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime22 = dateMidnight21.toMutableDateTime();
        mutableDateTime22.add((long) 1);
        mutableDateTime22.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime22.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration28 = null;
        mutableDateTime22.add(readableDuration28, (int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime32 = dateMidnight31.toMutableDateTime();
        mutableDateTime32.add((long) 1);
        org.joda.time.DateTime dateTime35 = mutableDateTime32.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.PeriodType periodType37 = org.joda.time.PeriodType.years();
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime32, readableDuration36, periodType37);
        org.joda.time.Chronology chronology39 = mutableDateTime32.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.clockhourOfHalfday();
        org.joda.time.DurationField durationField41 = chronology39.halfdays();
        mutableDateTime22.setChronology(chronology39);
        org.joda.time.ReadableInstant readableInstant43 = null;
        org.joda.time.PeriodType periodType46 = null;
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType46);
        int int48 = mutablePeriod47.getMonths();
        org.joda.time.Interval interval49 = new org.joda.time.Interval(readableInstant43, (org.joda.time.ReadablePeriod) mutablePeriod47);
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.DateTimeField dateTimeField51 = chronology50.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField52 = chronology50.weekOfWeekyear();
        mutableDateTime22.setRounding(dateTimeField52);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate(1L, dateTimeZone55);
        org.joda.time.LocalDate.Property property57 = localDate56.monthOfYear();
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime59 = dateMidnight58.toMutableDateTime();
        mutableDateTime59.add((long) 1);
        org.joda.time.DateTime dateTime62 = mutableDateTime59.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.PeriodType periodType64 = org.joda.time.PeriodType.years();
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime59, readableDuration63, periodType64);
        int[] intArray66 = period65.getValues();
        int int67 = dateTimeField52.getMaximumValue((org.joda.time.ReadablePartial) localDate56, intArray66);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray69 = dateTimeField15.add((org.joda.time.ReadablePartial) localDateTime18, 9, intArray66, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645455269758,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=29,MILLISECOND=758,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(periodType37);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(periodType64);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 53 + "'", int67 == 53);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMillis((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withHourOfDay(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455269990,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=29,MILLISECOND=990,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        int int1 = localTime0.size();
        java.util.Locale locale2 = java.util.Locale.ITALY;
        boolean boolean3 = localTime0.equals((java.lang.Object) locale2);
        org.joda.time.LocalTime.Property property4 = localTime0.secondOfMinute();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(dateTimeZone6);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(dateTimeZone6);
        java.lang.String str10 = dateTimeZone6.getShortName((long) 53700000);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate12.isSupported(dateTimeFieldType13);
        org.joda.time.LocalDate.Property property15 = localDate12.yearOfEra();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.joda.time.DurationField durationField17 = dateTimeField16.getRangeDurationField();
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale19);
        java.lang.String str21 = dateTimeField16.getAsShortText((long) (short) -1, locale19);
        java.lang.String str22 = dateTimeZone6.getShortName((long) 539, locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) property4, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNull(durationField17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1645455270015,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=30,MILLISECOND=15,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1969" + "'", str21, "1969");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        java.util.Date date6 = mutableDateTime2.toDate();
        java.util.Calendar.Builder builder7 = builder0.setInstant(date6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder12 = builder0.setTimeOfDay(999, 10, 54, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Feb 21 00:00:00 GMT 2022");
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.years();
        java.lang.String str11 = periodType10.toString();
        org.joda.time.PeriodType periodType12 = periodType10.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(10L);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.months();
        mutablePeriod20.set(durationFieldType21, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.months();
        boolean boolean25 = mutablePeriod20.isSupported(durationFieldType24);
        int int26 = mutablePeriod16.indexOf(durationFieldType24);
        java.lang.String str27 = durationFieldType24.getName();
        int int28 = mutablePeriod14.get(durationFieldType24);
        boolean boolean29 = periodType12.isSupported(durationFieldType24);
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 292278993, (long) (short) 10, periodType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period31 = new org.joda.time.Period(625, 31, 0, 53, 2, 32772, 134, 365, periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PeriodType[Years]" + "'", str11, "PeriodType[Years]");
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "months" + "'", str27, "months");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = property4.addToCopy((long) 2);
        org.joda.time.LocalDateTime localDateTime10 = property4.addToCopy(0);
        java.lang.String str11 = localDateTime10.toString();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks((int) '#');
        org.joda.time.LocalDateTime localDateTime16 = dateTime13.toLocalDateTime();
        boolean boolean17 = localDateTime10.equals((java.lang.Object) dateTime13);
        int int18 = dateTime13.getEra();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455270205,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=30,MILLISECOND=205,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-02-21T14:54:30.205" + "'", str11, "2022-02-21T14:54:30.205");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.Chronology chronology8 = mutableDateTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfYear((int) (byte) 1);
        int int14 = dateTime13.getDayOfMonth();
        org.joda.time.Duration duration16 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime17 = dateTime13.minus((org.joda.time.ReadableDuration) duration16);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Duration duration20 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean21 = duration16.isShorterThan((org.joda.time.ReadableDuration) duration20);
        org.joda.time.Period period22 = duration20.toPeriod();
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime27 = dateTime25.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime28 = timeOfDay23.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime30 = dateTime25.withWeekOfWeekyear((int) '4');
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration20, (org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.Period period33 = period31.minusWeeks(5);
        org.joda.time.Period period35 = period31.plusSeconds(53669316);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.minusWeeks((int) '#');
        org.joda.time.DateTime dateTime5 = dateTime3.plusHours((int) (byte) 100);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(134);
        java.util.Locale locale8 = java.util.Locale.PRC;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromCalendarFields(calendar9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusMillis((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusMillis(4);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withWeekyear(134);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime10.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime22 = dateTime20.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property23 = dateTime22.dayOfMonth();
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType26);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType30);
        mutablePeriod27.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod31);
        java.lang.String str33 = mutablePeriod27.toString();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadablePeriod) mutablePeriod27);
        mutablePeriod27.setValue(0, 2022);
        org.joda.time.Duration duration39 = new org.joda.time.Duration((long) (byte) 0);
        mutablePeriod27.setPeriod((org.joda.time.ReadableDuration) duration39);
        org.joda.time.Duration duration42 = new org.joda.time.Duration((long) (byte) 0);
        long long43 = duration42.getMillis();
        org.joda.time.Duration duration45 = new org.joda.time.Duration((long) (byte) 0);
        long long46 = duration45.getMillis();
        int int47 = duration42.compareTo((org.joda.time.ReadableDuration) duration45);
        org.joda.time.Duration duration49 = duration39.withDurationAdded((org.joda.time.ReadableDuration) duration45, 2);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime18.withDurationAdded((org.joda.time.ReadableDuration) duration39, 69);
        java.util.Locale locale52 = java.util.Locale.PRC;
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(locale52);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.fromCalendarFields(calendar53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime54.minusMillis((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.era();
        boolean boolean58 = localDateTime56.isSupported(dateTimeFieldType57);
        boolean boolean59 = localDateTime51.isSupported(dateTimeFieldType57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime61 = dateTime7.withField(dateTimeFieldType57, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 23 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645455270342,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=30,MILLISECOND=342,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT0.034S" + "'", str33, "PT0.034S");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar53);
// flaky:         org.junit.Assert.assertEquals(calendar53.toString(), "java.util.GregorianCalendar[time=1645455270342,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=30,MILLISECOND=342,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths((int) (short) -1);
        org.joda.time.DateMidnight dateMidnight11 = yearMonthDay10.toDateMidnight();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfMonth();
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType23);
        mutablePeriod20.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod24);
        java.lang.String str26 = mutablePeriod20.toString();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime15, (org.joda.time.ReadablePeriod) mutablePeriod20);
        mutablePeriod20.setValue(0, 2022);
        org.joda.time.Duration duration32 = new org.joda.time.Duration((long) (byte) 0);
        mutablePeriod20.setPeriod((org.joda.time.ReadableDuration) duration32);
        org.joda.time.Duration duration35 = new org.joda.time.Duration((long) (byte) 0);
        long long36 = duration35.getMillis();
        org.joda.time.Duration duration38 = new org.joda.time.Duration((long) (byte) 0);
        long long39 = duration38.getMillis();
        int int40 = duration35.compareTo((org.joda.time.ReadableDuration) duration38);
        org.joda.time.Duration duration42 = duration32.withDurationAdded((org.joda.time.ReadableDuration) duration38, 2);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight11.withDurationAdded((org.joda.time.ReadableDuration) duration38, (int) (short) 10);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight11.plusWeeks(59);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT0.034S" + "'", str26, "PT0.034S");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(dateMidnight46);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "P0Y");
        java.util.Locale.Builder builder4 = builder0.clear();
        java.util.Locale locale5 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder4.setUnicodeLocaleKeyword("jpn", "era");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: jpn [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType6);
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.months();
        mutablePeriod12.set(durationFieldType13, (int) 'a');
        mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod12);
        mutablePeriod3.addMonths(2);
        org.junit.Assert.assertNotNull(durationFieldType13);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("yearOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=yearofera");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str3 = dateTimeZone1.getName((long) 100);
        java.lang.String str5 = dateTimeZone1.getNameKey(100L);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.now(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime6.withHourOfDay((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00" + "'", str3, "+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusHours((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusWeeks((int) (byte) 0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.weekOfWeekyear();
        java.util.Locale locale9 = java.util.Locale.CHINA;
        java.util.Locale locale10 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        java.lang.String str12 = locale9.getDisplayVariant(locale10);
        java.lang.String str14 = locale9.getExtension('u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = property7.setCopy("2022-02-21", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455271520,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=31,MILLISECOND=520,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455271520,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=31,MILLISECOND=520,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType5);
        int int7 = mutablePeriod6.getMonths();
        org.joda.time.Interval interval8 = new org.joda.time.Interval(readableInstant2, (org.joda.time.ReadablePeriod) mutablePeriod6);
        org.joda.time.Chronology chronology9 = interval8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 53636377, 0L, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 4, chronology10);
        org.joda.time.DateTime dateTime12 = yearMonthDay8.toDateTime(timeOfDay11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.withSecondOfMinute((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime3 = dateMidnight0.toMutableDateTime();
        boolean boolean5 = dateMidnight0.isEqual((long) 2);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight0.withCenturyOfEra(0);
        int int8 = dateMidnight0.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology1 = dateMidnight0.getChronology();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType8);
        mutablePeriod5.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod9);
        java.lang.String str11 = mutablePeriod5.toString();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight0.plus((org.joda.time.ReadablePeriod) mutablePeriod5);
        java.util.GregorianCalendar gregorianCalendar13 = dateMidnight12.toGregorianCalendar();
        int int14 = gregorianCalendar13.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = gregorianCalendar13.getGreatestMinimum((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0.034S" + "'", str11, "PT0.034S");
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53 + "'", int14 == 53);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withCenturyOfEra(365);
        int int6 = localDateTime5.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withMillisOfSecond(21);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withMillisOfDay(944);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withCenturyOfEra((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455272422,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=32,MILLISECOND=422,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 422 + "'", int6 == 422);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = mutableDateTime1.isSupported(dateTimeFieldType5);
        int int7 = mutableDateTime1.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.plus(readableDuration10);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) dateMidnight8);
        int int13 = dateMidnight8.getHourOfDay();
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime15 = dateMidnight14.toMutableDateTime();
        mutableDateTime15.add((long) 1);
        org.joda.time.DateTime dateTime18 = mutableDateTime15.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.era();
        boolean boolean20 = mutableDateTime15.isSupported(dateTimeFieldType19);
        int int21 = mutableDateTime15.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime23 = dateMidnight22.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight22.plus(readableDuration24);
        mutableDateTime15.setMillis((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime28 = dateMidnight27.toMutableDateTime();
        mutableDateTime28.add((long) 1);
        org.joda.time.DateTime dateTime31 = mutableDateTime28.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.years();
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime28, readableDuration32, periodType33);
        org.joda.time.Chronology chronology35 = mutableDateTime28.getChronology();
        org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now(chronology35);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime40 = dateTime38.withDayOfYear((int) (byte) 1);
        int int41 = dateTime40.getDayOfMonth();
        org.joda.time.Duration duration43 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime44 = dateTime40.minus((org.joda.time.ReadableDuration) duration43);
        mutableDateTime36.add((org.joda.time.ReadableDuration) duration43);
        org.joda.time.Duration duration47 = new org.joda.time.Duration((long) (byte) 0);
        boolean boolean48 = duration43.isShorterThan((org.joda.time.ReadableDuration) duration47);
        org.joda.time.Days days49 = duration47.toStandardDays();
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight22.plus((org.joda.time.ReadableDuration) duration47);
        org.joda.time.PeriodType periodType51 = org.joda.time.PeriodType.years();
        java.lang.String str52 = periodType51.toString();
        org.joda.time.PeriodType periodType53 = periodType51.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 3);
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod(10L);
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType60);
        org.joda.time.DurationFieldType durationFieldType62 = org.joda.time.DurationFieldType.months();
        mutablePeriod61.set(durationFieldType62, (int) 'a');
        org.joda.time.DurationFieldType durationFieldType65 = org.joda.time.DurationFieldType.months();
        boolean boolean66 = mutablePeriod61.isSupported(durationFieldType65);
        int int67 = mutablePeriod57.indexOf(durationFieldType65);
        java.lang.String str68 = durationFieldType65.getName();
        int int69 = mutablePeriod55.get(durationFieldType65);
        boolean boolean70 = periodType53.isSupported(durationFieldType65);
        org.joda.time.PeriodType periodType71 = periodType53.withSecondsRemoved();
        org.joda.time.PeriodType periodType72 = periodType71.withMinutesRemoved();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, (org.joda.time.ReadableInstant) dateMidnight22, periodType72);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight75 = dateMidnight22.withMonthOfYear(53670933);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53670933 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21 + "'", int21 == 21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(days49);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertNotNull(periodType51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PeriodType[Years]" + "'", str52, "PeriodType[Years]");
        org.junit.Assert.assertNotNull(periodType53);
        org.junit.Assert.assertNotNull(durationFieldType62);
        org.junit.Assert.assertNotNull(durationFieldType65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "months" + "'", str68, "months");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(periodType71);
        org.junit.Assert.assertNotNull(periodType72);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.set(1, 53633250, 53633250, 517, 50473355, 1);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.clear((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=53633250,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=53633250,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=517,MINUTE=50473355,SECOND=1,MILLISECOND=562,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMillis((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusMillis(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = localDateTime2.getField(202);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 202");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455272601,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=32,MILLISECOND=601,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.era();
        org.joda.time.DateMidnight dateMidnight2 = property1.roundHalfEvenCopy();
        org.joda.time.DateTimeField dateTimeField3 = property1.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = property1.setCopy("clockhourOfHalfday");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"clockhourOfHalfday\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType17);
        int int19 = mutablePeriod18.getMonths();
        org.joda.time.Interval interval20 = new org.joda.time.Interval(readableInstant14, (org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(chronology21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType26);
        int int28 = mutablePeriod27.getMonths();
        org.joda.time.Interval interval29 = new org.joda.time.Interval(readableInstant23, (org.joda.time.ReadablePeriod) mutablePeriod27);
        int[] intArray32 = chronology21.get((org.joda.time.ReadablePeriod) mutablePeriod27, 1L, (long) 4);
        org.joda.time.Period period33 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType12, chronology21);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        org.joda.time.DateTime dateTime35 = dateTime7.toDateTime(chronology21);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 50473355, chronology21);
        org.joda.time.DurationField durationField37 = chronology21.centuries();
        org.joda.time.Period period39 = org.joda.time.Period.seconds((int) (short) 100);
        org.joda.time.Period period41 = period39.minusYears(8);
        org.joda.time.Period period43 = period39.withSeconds(11);
        org.joda.time.PeriodType periodType44 = period39.getPeriodType();
        org.joda.time.PeriodType periodType45 = periodType44.withHoursRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) chronology21, periodType44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(periodType45);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.months();
        mutablePeriod4.set(durationFieldType5, (int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 100, chronology16);
        boolean boolean18 = durationFieldType5.isSupported(chronology16);
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType27);
        int int29 = mutablePeriod28.getMonths();
        org.joda.time.Interval interval30 = new org.joda.time.Interval(readableInstant24, (org.joda.time.ReadablePeriod) mutablePeriod28);
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 100, chronology31);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((int) (byte) 10, (int) (byte) 1, 3, (int) (short) 1, chronology31);
        org.joda.time.DateTimeField dateTimeField34 = chronology31.weekyear();
        org.joda.time.DurationField durationField35 = durationFieldType5.getField(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay((java.lang.Object) dateTimeFieldType0, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfYear();
        org.joda.time.DateMidnight dateMidnight2 = localDate0.toDateMidnight();
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.LocalDate.Property property4 = localDate0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(1L, dateTimeZone6);
        org.joda.time.Interval interval8 = localDate0.toInterval(dateTimeZone6);
        org.joda.time.LocalDate.Property property9 = localDate0.dayOfYear();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfEra();
        java.util.Locale locale13 = java.util.Locale.CHINA;
        java.util.Locale locale14 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        java.lang.String str16 = locale13.getDisplayVariant(locale14);
        int int17 = property12.getMaximumTextLength(locale13);
        java.util.Locale locale18 = java.util.Locale.CHINA;
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale19);
        java.lang.String str21 = locale18.getDisplayVariant(locale19);
        java.lang.String str22 = locale13.getDisplayCountry(locale19);
        java.lang.String str23 = locale13.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = property9.setCopy("2022-02-21", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645455273097,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=33,MILLISECOND=97,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1645455273097,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=33,MILLISECOND=97,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd" + "'", str22, "\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u4e2d\u6587\u4e2d\u56fd)" + "'", str23, "\u4e2d\u6587\u4e2d\u56fd)");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        mutableDateTime1.addWeekyears((int) 'a');
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime1.add(readableDuration7, (int) (byte) 1);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime11 = dateMidnight10.toMutableDateTime();
        mutableDateTime11.add((long) 1);
        org.joda.time.DateTime dateTime14 = mutableDateTime11.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.years();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime11, readableDuration15, periodType16);
        org.joda.time.Chronology chronology18 = mutableDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology18.halfdays();
        mutableDateTime1.setChronology(chronology18);
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime1.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfHour(828);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 828 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.dayOfMonth();
        org.joda.time.DateTime dateTime6 = dateTime3.plusSeconds(10);
        org.joda.time.DateTime dateTime8 = dateTime3.minus((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property10 = dateTime8.property(dateTimeFieldType9);
        org.joda.time.DateTime dateTime12 = dateTime8.withCenturyOfEra(134);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime16 = dateTime14.withDayOfYear((int) (byte) 1);
        int int17 = dateTime16.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime19 = dateMidnight18.toMutableDateTime();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) mutableDateTime19);
        org.joda.time.DateTime dateTime22 = dateTime16.plusYears((-1));
        java.util.GregorianCalendar gregorianCalendar23 = dateTime16.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableInstant) dateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(gregorianCalendar23);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.lang.Object obj2 = null;
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(obj2, chronology14);
        org.joda.time.DateTimeField dateTimeField28 = chronology14.yearOfEra();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField30 = chronology14.minuteOfDay();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 12, (long) 4, chronology14);
        mutablePeriod31.addHours((int) (byte) -1);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(100L);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime4 = dateTime2.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime5 = timeOfDay0.toDateTime((org.joda.time.ReadableInstant) dateTime2);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) '4');
        org.joda.time.DateTime.Property property8 = dateTime2.yearOfCentury();
        java.lang.String str9 = property8.getAsString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "69" + "'", str9, "69");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.joda.time.DateTime dateTime5 = property4.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = property4.setCopy("weekyearOfCentury");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"weekyearOfCentury\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime2 = dateMidnight1.toMutableDateTime();
        mutableDateTime2.add((long) 1);
        org.joda.time.DateTime dateTime5 = mutableDateTime2.toDateTimeISO();
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime8 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType13 = periodType12.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType17);
        int int19 = mutablePeriod18.getMonths();
        org.joda.time.Interval interval20 = new org.joda.time.Interval(readableInstant14, (org.joda.time.ReadablePeriod) mutablePeriod18);
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(chronology21);
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType26);
        int int28 = mutablePeriod27.getMonths();
        org.joda.time.Interval interval29 = new org.joda.time.Interval(readableInstant23, (org.joda.time.ReadablePeriod) mutablePeriod27);
        int[] intArray32 = chronology21.get((org.joda.time.ReadablePeriod) mutablePeriod27, 1L, (long) 4);
        org.joda.time.Period period33 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType12, chronology21);
        org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime((long) (byte) 1, chronology21);
        org.joda.time.DateTime dateTime35 = dateTime7.toDateTime(chronology21);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 50473355, chronology21);
        org.joda.time.DurationField durationField37 = chronology21.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long43 = chronology21.getDateTimeMillis((long) 52, 4, 202, 271, 40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 202 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(durationField37);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType6 = periodType5.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType10);
        int int12 = mutablePeriod11.getMonths();
        org.joda.time.Interval interval13 = new org.joda.time.Interval(readableInstant7, (org.joda.time.ReadablePeriod) mutablePeriod11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(chronology14);
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType19);
        int int21 = mutablePeriod20.getMonths();
        org.joda.time.Interval interval22 = new org.joda.time.Interval(readableInstant16, (org.joda.time.ReadablePeriod) mutablePeriod20);
        int[] intArray25 = chronology14.get((org.joda.time.ReadablePeriod) mutablePeriod20, 1L, (long) 4);
        org.joda.time.Period period26 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType5, chronology14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withChronology(chronology14);
        org.joda.time.format.DateTimeParser dateTimeParser28 = dateTimeFormatter27.getParser();
        java.io.Writer writer29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter27.printTo(writer29, (long) 828);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNull(dateTimeParser28);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 4);
        org.junit.Assert.assertNotNull(timeOfDay1);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.lang.String str1 = calendar0.toString();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455274320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=34,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.util.GregorianCalendar[time=1645455274320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=34,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str1, "java.util.GregorianCalendar[time=1645455274320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=34,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        boolean boolean6 = mutableDateTime1.isSupported(dateTimeFieldType5);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.hourOfDay();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.getMutableDateTime();
        org.joda.time.DurationField durationField9 = property7.getLeapDurationField();
        org.joda.time.DurationField durationField10 = property7.getDurationField();
        long long12 = durationField10.getMillis((long) 53700000);
        long long15 = durationField10.getDifferenceAsLong((long) 625, (long) 798);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 193320000000000L + "'", long12 == 193320000000000L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.era();
        java.lang.String str2 = property1.getAsText();
        java.lang.String str3 = property1.toString();
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u516c\u5143" + "'", str2, "\u516c\u5143");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Property[era]" + "'", str3, "Property[era]");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("\u671d\u9c9c\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ???");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeZone0.getOffset(0, 365, (int) (byte) 0, (int) (short) -1, 53637206, 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime3 = dateMidnight2.toMutableDateTime();
        boolean boolean4 = calendar1.before((java.lang.Object) dateMidnight2);
        int int5 = dateMidnight2.getMinuteOfDay();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455275148,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=35,MILLISECOND=148,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-1), (int) (short) 1, 872);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(12);
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight5.toMutableDateTime();
        mutableDateTime6.add((long) 1);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime6.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime6, "PeriodType[Years]", 999);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyearOfCentury();
        int int10 = dateTimeField8.getLeapAmount((long) ' ');
        long long12 = dateTimeField8.roundHalfEven((long) 12);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime17 = dateTime15.withDayOfYear((int) (byte) 1);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(readableDuration13, (org.joda.time.ReadableInstant) dateTime15, periodType18);
        org.joda.time.DateTime dateTime21 = dateTime15.withMonthOfYear((int) (short) 1);
        org.joda.time.TimeOfDay timeOfDay22 = dateTime21.toTimeOfDay();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime27 = dateTime25.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property28 = dateTime27.dayOfMonth();
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType31);
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType35);
        mutablePeriod32.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod36);
        java.lang.String str38 = mutablePeriod32.toString();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime27, (org.joda.time.ReadablePeriod) mutablePeriod32);
        int int40 = mutablePeriod32.getMonths();
        int[] intArray41 = mutablePeriod32.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray43 = dateTimeField8.addWrapPartial((org.joda.time.ReadablePartial) timeOfDay22, 53, intArray41, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT0.034S" + "'", str38, "PT0.034S");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[0, 0, 0, 0, 0, 0, 0, 34]");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(chronology7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType12);
        int int14 = mutablePeriod13.getMonths();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readableInstant9, (org.joda.time.ReadablePeriod) mutablePeriod13);
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePeriod) mutablePeriod13, 1L, (long) 4);
        org.joda.time.PeriodType periodType19 = mutablePeriod13.getPeriodType();
        mutablePeriod13.setMinutes(134);
        int int22 = mutablePeriod13.getSeconds();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withEra(1);
        org.joda.time.DateTime dateTime6 = dateTime1.plusMillis(32772);
        org.joda.time.DateTime.Property property7 = dateTime1.hourOfDay();
        int int8 = property7.getLeapAmount();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration10 = new org.joda.time.Duration((java.lang.Object) dateTimeField9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.util.Date date5 = new java.util.Date(5, (int) ' ', 0, (int) (short) 100, (int) (byte) -1);
        date5.setMonth((int) (short) 100);
        int int8 = date5.getTimezoneOffset();
        long long9 = date5.getTime();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime.Property property13 = dateTime12.secondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime12.withEra(1);
        org.joda.time.DateTime dateTime17 = dateTime12.plusMillis(32772);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int19 = dateTime12.get(dateTimeFieldType18);
        org.joda.time.LocalDate.Property property20 = localDate10.property(dateTimeFieldType18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = localDate10.withMonthOfYear((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Tue May 04 03:59:00 GMT+00:00 1915");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1725048060000L) + "'", long9 == (-1725048060000L));
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType7 = periodType6.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.ReadableInstant readableInstant17 = null;
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType20);
        int int22 = mutablePeriod21.getMonths();
        org.joda.time.Interval interval23 = new org.joda.time.Interval(readableInstant17, (org.joda.time.ReadablePeriod) mutablePeriod21);
        int[] intArray26 = chronology15.get((org.joda.time.ReadablePeriod) mutablePeriod21, 1L, (long) 4);
        org.joda.time.Period period27 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType6, chronology15);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter3.withChronology(chronology15);
        org.joda.time.format.DateTimeParser dateTimeParser29 = dateTimeFormatter28.getParser();
        java.lang.Integer int30 = dateTimeFormatter28.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate31 = org.joda.time.LocalDate.parse("weekyears", dateTimeFormatter28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNull(dateTimeParser29);
        org.junit.Assert.assertNull(int30);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.era();
        org.joda.time.DateMidnight dateMidnight2 = property1.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = property1.addToCopy(53633250);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateMidnight2);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(202, 312, 312);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 202 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime2 = localTime0.plusMillis((int) '4');
        int int3 = localTime2.getMillisOfDay();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53676724 + "'", int3 == 53676724);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property4 = dateTime3.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime9 = dateTime7.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime10 = timeOfDay5.toDateTime((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.TimeOfDay timeOfDay12 = timeOfDay5.withHourOfDay(10);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.plusMillis((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean16 = timeOfDay12.isSupported(dateTimeFieldType15);
        int int17 = dateTime3.get(dateTimeFieldType15);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime3.withField(dateTimeFieldType18, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("\u65e5\u6587");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"??\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        java.lang.String str2 = mutableDateTime1.toString();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = property3.set(54);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str2, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.junit.Assert.assertNotNull(period0);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology1 = dateMidnight0.getChronology();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.withDayOfMonth(8);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType15);
        mutablePeriod12.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        java.lang.String str18 = mutablePeriod12.toString();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadablePeriod) mutablePeriod12);
        mutablePeriod12.setValue(0, 2022);
        org.joda.time.Duration duration24 = new org.joda.time.Duration((long) (byte) 0);
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) (byte) 0);
        long long28 = duration27.getMillis();
        org.joda.time.Duration duration30 = new org.joda.time.Duration((long) (byte) 0);
        long long31 = duration30.getMillis();
        int int32 = duration27.compareTo((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Duration duration34 = duration24.withDurationAdded((org.joda.time.ReadableDuration) duration30, 2);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight3.minus((org.joda.time.ReadableDuration) duration34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight37 = dateMidnight3.withMonthOfYear(16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0.034S" + "'", str18, "PT0.034S");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(dateMidnight35);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.years();
        org.joda.time.PeriodType periodType3 = periodType2.withHoursRemoved();
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType7);
        int int9 = mutablePeriod8.getMonths();
        org.joda.time.Interval interval10 = new org.joda.time.Interval(readableInstant4, (org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.Chronology chronology11 = interval10.getChronology();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(chronology11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType16);
        int int18 = mutablePeriod17.getMonths();
        org.joda.time.Interval interval19 = new org.joda.time.Interval(readableInstant13, (org.joda.time.ReadablePeriod) mutablePeriod17);
        int[] intArray22 = chronology11.get((org.joda.time.ReadablePeriod) mutablePeriod17, 1L, (long) 4);
        org.joda.time.Period period23 = new org.joda.time.Period((long) (short) -1, (long) (byte) 1, periodType2, chronology11);
        org.joda.time.DurationFieldType[] durationFieldTypeArray24 = period23.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = period23.withMonths(32770);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0, 0, 0, 0, 3]");
        org.junit.Assert.assertNotNull(durationFieldTypeArray24);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('a', "P0Y");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setLanguage("\u4e2d\u83ef\u4eba\u6c11\u5171\u548c\u56fd");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: ??????? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        java.lang.String str8 = mutableDateTime1.toString();
        mutableDateTime1.addMinutes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfMonth(53670257);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53670257 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022-02-21T00:00:00.001Z" + "'", str8, "2022-02-21T00:00:00.001Z");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.yearOfCentury();
        boolean boolean3 = dateMidnight0.isBefore((long) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = dateMidnight0.withWeekOfWeekyear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime1 = dateMidnight0.toMutableDateTime();
        mutableDateTime1.add((long) 1);
        org.joda.time.DateTime dateTime4 = mutableDateTime1.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.years();
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime1, readableDuration5, periodType6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(chronology15);
        org.joda.time.DurationField durationField17 = chronology15.weeks();
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology15);
        mutableDateTime1.setChronology(chronology15);
        org.joda.time.DateTimeField dateTimeField20 = chronology15.clockhourOfDay();
        java.lang.String str22 = dateTimeField20.getAsText((long) 32770);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "24" + "'", str22, "24");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType3);
        int int5 = mutablePeriod4.getMonths();
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadablePeriod) mutablePeriod4);
        org.joda.time.Chronology chronology7 = interval6.getChronology();
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        int int13 = mutablePeriod12.getMonths();
        org.joda.time.Interval interval14 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadablePeriod) mutablePeriod12);
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        boolean boolean16 = interval6.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property18 = localDate17.dayOfYear();
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.Interval interval21 = localDate17.toInterval(dateTimeZone20);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType25);
        int int27 = mutablePeriod26.getMonths();
        org.joda.time.Interval interval28 = new org.joda.time.Interval(readableInstant22, (org.joda.time.ReadablePeriod) mutablePeriod26);
        org.joda.time.Chronology chronology29 = interval28.getChronology();
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.PeriodType periodType33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType33);
        int int35 = mutablePeriod34.getMonths();
        org.joda.time.Interval interval36 = new org.joda.time.Interval(readableInstant30, (org.joda.time.ReadablePeriod) mutablePeriod34);
        org.joda.time.Chronology chronology37 = interval36.getChronology();
        boolean boolean38 = interval28.contains((org.joda.time.ReadableInterval) interval36);
        boolean boolean39 = interval21.isBefore((org.joda.time.ReadableInterval) interval36);
        long long40 = interval36.getStartMillis();
        boolean boolean41 = interval6.overlaps((org.joda.time.ReadableInterval) interval36);
        java.lang.String str42 = interval36.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1645455278033L + "'", long40 == 1645455278033L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2022-02-21T14:54:38.033Z/2022-02-21T14:54:38.067Z" + "'", str42, "2022-02-21T14:54:38.033Z/2022-02-21T14:54:38.067Z");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(440, 52, 53676724, 100, 2119);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearWeekDayTime();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(periodType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period(59, 18, 950, (int) '4', 21, 18, (int) (short) 1, (int) 'x', periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.Chronology chronology1 = dateMidnight0.getChronology();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.withDayOfMonth(8);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfYear((int) (byte) 1);
        org.joda.time.DateTime.Property property8 = dateTime7.dayOfMonth();
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(1L, (long) '#', periodType15);
        mutablePeriod12.mergePeriod((org.joda.time.ReadablePeriod) mutablePeriod16);
        java.lang.String str18 = mutablePeriod12.toString();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadablePeriod) mutablePeriod12);
        mutablePeriod12.setValue(0, 2022);
        org.joda.time.Duration duration24 = new org.joda.time.Duration((long) (byte) 0);
        mutablePeriod12.setPeriod((org.joda.time.ReadableDuration) duration24);
        org.joda.time.Duration duration27 = new org.joda.time.Duration((long) (byte) 0);
        long long28 = duration27.getMillis();
        org.joda.time.Duration duration30 = new org.joda.time.Duration((long) (byte) 0);
        long long31 = duration30.getMillis();
        int int32 = duration27.compareTo((org.joda.time.ReadableDuration) duration30);
        org.joda.time.Duration duration34 = duration24.withDurationAdded((org.joda.time.ReadableDuration) duration30, 2);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight3.minus((org.joda.time.ReadableDuration) duration34);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight();
        org.joda.time.MutableDateTime mutableDateTime37 = dateMidnight36.toMutableDateTime();
        mutableDateTime37.add((long) 1);
        org.joda.time.DateTime dateTime40 = mutableDateTime37.toDateTimeISO();
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.years();
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime37, readableDuration41, periodType42);
        org.joda.time.Chronology chronology44 = mutableDateTime37.getChronology();
        org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now(chronology44);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.DateTime dateTime49 = dateTime47.withDayOfYear((int) (byte) 1);
        int int50 = dateTime49.getDayOfMonth();
        org.joda.time.Duration duration52 = new org.joda.time.Duration((long) (byte) 0);
        org.joda.time.DateTime dateTime53 = dateTime49.minus((org.joda.time.ReadableDuration) duration52);
        mutableDateTime45.add((org.joda.time.ReadableDuration) duration52);
        org.joda.time.Duration duration55 = duration34.plus((org.joda.time.ReadableDuration) duration52);
        org.joda.time.LocalDate localDate56 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        boolean boolean58 = localDate56.isSupported(dateTimeFieldType57);
        org.joda.time.LocalDate.Property property59 = localDate56.yearOfEra();
        org.joda.time.Interval interval60 = localDate56.toInterval();
        org.joda.time.DateTime dateTime61 = localDate56.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime63 = dateTime61.plusDays(2022);
        org.joda.time.Period period64 = duration34.toPeriodFrom((org.joda.time.ReadableInstant) dateTime61);
        long long65 = duration34.getStandardDays();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0.034S" + "'", str18, "PT0.034S");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(duration34);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(mutableDateTime37);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(duration55);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
    }
}
