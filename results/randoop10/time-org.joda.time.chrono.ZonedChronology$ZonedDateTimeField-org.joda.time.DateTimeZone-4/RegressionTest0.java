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
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTime6.toString("hi!", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDate0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        int int3 = localDate2.getDayOfWeek();
        int[] intArray10 = new int[] { 2022, '4', 7, 32769, 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            chronology1.validate((org.joda.time.ReadablePartial) localDate2, intArray10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[2022, 52, 7, 32769, 100, 32]");
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime2.withYearOfCentury((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 86399, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        java.lang.String str10 = property9.getAsText();
        int int11 = property9.get();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        int int14 = property9.compareTo((org.joda.time.ReadablePartial) localDate12);
        int[] intArray20 = new int[] { (byte) -1, '4', (byte) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = dateTimeField3.set((org.joda.time.ReadablePartial) localDate12, (int) '#', intArray20, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022" + "'", str10, "2022");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 52, 10, 52]");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localDate0.getFieldType(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2022");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType2 = localTime0.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime4.getValue(86399);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 86399");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate0.withDayOfWeek(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime6.withDate(32769, 2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        long long6 = java.util.Date.UTC(10, 0, 1, 59, (int) (byte) 100, 2022);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1893235578000L) + "'", long6 == (-1893235578000L));
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
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
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        java.util.Locale locale12 = new java.util.Locale("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localTime8, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        int int7 = dateTime4.getMinuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime4.withMinuteOfHour((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646723753237L + "'", long6 == 1646723753237L);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 435 + "'", int7 == 435);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        int int6 = localDate5.getDayOfWeek();
        int[] intArray12 = new int[] { 2, 86399, 23, (byte) 100, 23 };
        // The following exception was thrown during execution in test generation
        try {
            chronology2.validate((org.joda.time.ReadablePartial) localDate5, intArray12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2, 86399, 23, 100, 23]");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        java.util.Locale locale11 = new java.util.Locale("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField5.set((long) (byte) 10, "en-CA", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en-CA\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((java.lang.Object) localDate0, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = chronology1.getDateTimeMillis((int) '#', 2022, 2, 10, (int) (short) 10, (int) (short) 0, 435);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime1.withWeekOfWeekyear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = localDate0.getField(59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        int int7 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localTime6.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(2022);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        org.joda.time.DurationField durationField7 = dateTimeField6.getDurationField();
        org.joda.time.DurationFieldType durationFieldType8 = durationField7.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime3.withFieldAdded(durationFieldType8, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'years' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj3, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime6, "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.util.Date date1 = new java.util.Date((long) 435);
        java.lang.Object obj2 = date1.clone();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.Appendable appendable5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.era();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, (org.joda.time.ReadablePartial) localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(4, (int) (short) 0, (int) (short) 0, (int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("en-CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'en-CA' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.parse("hi!", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        long long11 = chronology5.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField12 = chronology5.minuteOfHour();
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.lang.String str15 = dateTimeField12.getAsShortText((long) 'a', locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = timeZone1.getDisplayName(false, (int) '#', locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 971923363200000L + "'", long11 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.util.Date date3 = new java.util.Date(2022, (int) (byte) -1, 2);
        java.lang.Object obj4 = date3.clone();
        org.junit.Assert.assertEquals(date3.toString(), "Fri Dec 02 00:00:00 UTC 3921");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "Fri Dec 02 00:00:00 UTC 3921");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "Fri Dec 02 00:00:00 UTC 3921");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "Fri Dec 02 00:00:00 UTC 3921");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property6.setCopy(2021);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2021 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.joda.time.ReadableDateTime[] readableDateTimeArray1 = new org.joda.time.ReadableDateTime[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.ReadableDateTime[] readableDateTimeArray2 = strSet0.toArray(readableDateTimeArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(readableDateTimeArray1);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withYearOfCentury(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        int int7 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) localTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusHours((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9223372036854775807 + 360000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(7);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.era();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        org.joda.time.DateTimeField dateTimeField6 = property4.getField();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = strSet0.remove((java.lang.Object) property4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.joda.time.LocalDateTime$Property cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTimeFormatter2.parseDateTime("97");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        java.util.TimeZone.setDefault(timeZone1);
        java.lang.Object obj4 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, (long) 435);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property11.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = property11.setCopy((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.io.Writer writer4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, readableInstant5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = localTime2.minusHours(2021);
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        java.lang.String str15 = property14.getAsText();
        int int16 = property14.get();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        int int19 = property14.compareTo((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.LocalDate localDate21 = localDate17.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalDate localDate23 = localDate21.plus(readablePeriod22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int25 = localDate23.get(dateTimeFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property26 = localTime2.property(dateTimeFieldType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022" + "'", str15, "2022");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 24 + "'", int25 == 24);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Locale locale6 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = timeZone1.getDisplayName(false, (int) (short) -1, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.plusHours((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localTime3.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.minusMonths(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime8.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.lang.Appendable appendable4 = null;
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable4, readablePartial5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes((int) (short) 100);
        int int12 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone7);
        int int14 = dateTime13.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField(86399);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 86399");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        int int13 = localDate12.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate12.withWeekOfWeekyear(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2024 + "'", int13 == 2024);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter2.getParser();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeParser5);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645514160039,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=0,MILLISECOND=39,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        int int12 = dateTime11.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int14 = dateTime11.get(dateTimeFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime4.withField(dateTimeFieldType13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(0);
        int int12 = localDateTime11.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDateTime11.getValue(86399);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 86399");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
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
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.DateTime dateTime12 = dateTime4.minusMillis(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime4.withDayOfMonth((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = localTime2.getField(2021);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2021");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) durationField3, chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((-1), 2024, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer5, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.lang.String str2 = locale1.toLanguageTag();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale1);
        int int4 = calendar0.compareTo(calendar3);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645514161099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=1,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en-CA" + "'", str2, "en-CA");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645514161099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=1,MILLISECOND=99,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(0);
        int int12 = localDateTime11.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withTime(8, (int) (short) 10, 1439, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = localTime2.minusHours(2021);
        int int9 = localTime2.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localTime2.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("22");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '22' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        int int15 = dateTime14.getWeekyear();
        int int16 = dateTime14.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj21, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        java.lang.String str27 = property26.getAsText();
        org.joda.time.DurationField durationField28 = property26.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property26.getFieldType();
        int int30 = dateTime20.get(dateTimeFieldType29);
        int int31 = dateTime14.get(dateTimeFieldType29);
        boolean boolean32 = gregorianCalendar7.equals((java.lang.Object) dateTime14);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 86399 + "'", int16 == 86399);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022" + "'", str27, "2022");
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2022 + "'", int31 == 2022);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate0.withEra((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.hours();
        boolean boolean10 = localDate8.isSupported(durationFieldType9);
        int int11 = localDate8.size();
        org.joda.time.DateTime dateTime12 = dateTime7.withFields((org.joda.time.ReadablePartial) localDate8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDate8.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(23, 0, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
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
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-CA");
        double double2 = languageRange1.getWeight();
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj3, dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        long long9 = dateTime7.getMillis();
        org.joda.time.DateTime dateTime11 = dateTime7.withCenturyOfEra(1);
        org.joda.time.YearMonthDay yearMonthDay12 = dateTime11.toYearMonthDay();
        boolean boolean13 = languageRange1.equals((java.lang.Object) dateTime11);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1646723762406L + "'", long9 == 1646723762406L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDateTime5.toString();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.util.Date date3 = new java.util.Date(2022, (int) (byte) -1, 2);
        date3.setSeconds((int) (byte) -1);
        java.lang.String str6 = date3.toString();
        org.junit.Assert.assertEquals(date3.toString(), "Thu Dec 01 23:59:59 GMT 3921");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Dec 01 23:59:59 GMT 3921" + "'", str6, "Thu Dec 01 23:59:59 GMT 3921");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(10, (int) 'a', (int) (short) -1, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withTime(21, 0, 435, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 435 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property5 = localTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeField6.set((long) '4', 435);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 435 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfHour();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfDay();
        long long18 = chronology12.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField19 = chronology12.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField20 = chronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology12.hourOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = null;
        org.joda.time.format.DateTimeParser dateTimeParser24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter23, dateTimeParser24);
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter25.withLocale(locale26);
        java.lang.String str28 = dateTimeField21.getAsShortText((int) 'a', locale26);
        java.lang.String str29 = locale26.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = dateTimeField8.set(5555754128L, "hi!", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 971923363200000L + "'", long7 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 971923363200000L + "'", long18 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "97" + "'", str28, "97");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "French" + "'", str29, "French");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTimeFormatter2.parseDateTime("Thu Dec 01 23:59:59 GMT 3921");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        java.util.Locale locale21 = new java.util.Locale("hi!", "ISOChronology[UTC]", "2022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = gregorianCalendar7.getDisplayName(8, 1439, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals(locale21.toString(), "hi!_ISOCHRONOLOGY[UTC]_2022");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        calendar2.clear((int) (byte) 1);
        java.lang.Object obj5 = calendar2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-CA" + "'", str1, "en-CA");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=?,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=4,MILLISECOND=199,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj5);
// flaky:         org.junit.Assert.assertEquals(obj5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=?,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=4,MILLISECOND=199,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=?,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=4,MILLISECOND=199,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=?,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=4,MILLISECOND=199,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = dateTimeFormatter4.parseLocalDateTime("weekyear");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(0);
        int int12 = localDateTime11.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withEra(24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime dateTime12 = dateTime6.minusHours((-1));
        java.lang.String str13 = dateTime6.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone15);
        org.joda.time.LocalTime localTime18 = localTime16.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday(dateTimeZone19);
        int int21 = dateTime20.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int23 = dateTime20.get(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone25);
        org.joda.time.LocalTime localTime28 = localTime26.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime26.toDateTimeToday(dateTimeZone29);
        int int31 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime30);
        boolean boolean32 = dateTime6.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime6.toMutableDateTimeISO();
        boolean boolean35 = mutableDateTime33.isAfter(1646723755047L);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-22T23:59:59.999Z" + "'", str13, "2022-02-22T23:59:59.999Z");
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 22 + "'", int23 == 22);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime6.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime6.withZone(dateTimeZone19);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone27);
        org.joda.time.LocalTime localTime30 = localTime28.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localTime28.toDateTimeToday(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long38 = dateTimeZone33.getMillisKeepLocal(dateTimeZone36, (long) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter25.withZone(dateTimeZone36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = dateTime20.toString(dateTimeFormatter25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-213119948L) + "'", long38 == (-213119948L));
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        int int15 = dateTime14.getWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime14.toDateTime();
        org.joda.time.DateTime dateTime18 = dateTime16.minusMonths(4);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime16.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = localDate7.toDateTimeAtCurrentTime(dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField10 = chronology2.years();
        org.joda.time.DateTimeField dateTimeField11 = chronology2.clockhourOfHalfday();
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj12, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        java.lang.String str18 = property17.getAsText();
        int int19 = property17.get();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology21 = localDate20.getChronology();
        int int22 = property17.compareTo((org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate24 = localDate20.plusWeeks((int) (short) 100);
        boolean boolean26 = localDate24.equals((java.lang.Object) 0);
        org.joda.time.DateTime dateTime27 = localDate24.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.minuteOfDay();
        long long36 = chronology30.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        java.lang.Object obj37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(obj37, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = dateTime39.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property42 = dateTime41.weekyear();
        java.lang.String str43 = property42.getAsText();
        int int44 = property42.get();
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        int int47 = property42.compareTo((org.joda.time.ReadablePartial) localDate45);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology49 = localDate48.getChronology();
        int int50 = localDate48.getDayOfWeek();
        org.joda.time.LocalDate localDate52 = localDate48.minusYears(10);
        int[] intArray53 = localDate48.getValues();
        chronology30.validate((org.joda.time.ReadablePartial) localDate45, intArray53);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray56 = dateTimeField11.addWrapField((org.joda.time.ReadablePartial) localDate24, (int) 'u', intArray53, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 971923363200000L + "'", long8 == 971923363200000L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2022" + "'", str18, "2022");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 971923363200000L + "'", long36 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2022" + "'", str43, "2022");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2022 + "'", int44 == 2022);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[2022, 2, 22]");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime localTime6 = localTime0.minusMinutes(11);
        java.util.Locale locale11 = new java.util.Locale("hi!", "", "");
        java.lang.String str12 = locale11.getDisplayScript();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        java.util.Locale locale16 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withLocale(locale16);
        java.lang.String str18 = locale11.getDisplayName(locale16);
        boolean boolean19 = locale11.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localTime0.toString("yearOfCentury", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime7.minusHours(2021);
        int int14 = localTime7.getSecondOfMinute();
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj15, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        java.lang.String str21 = property20.getAsText();
        org.joda.time.DurationField durationField22 = property20.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property20.getFieldType();
        java.lang.String str24 = dateTimeFieldType23.toString();
        boolean boolean25 = localTime7.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone27);
        org.joda.time.LocalTime localTime30 = localTime28.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = localTime28.toDateTimeToday(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTime32.getZone();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime37 = dateTime35.minusMinutes((int) (short) 100);
        int int38 = dateTimeZone33.getOffset((org.joda.time.ReadableInstant) dateTime37);
        int int40 = dateTimeZone33.getStandardOffset((long) 7);
        org.joda.time.DateTime dateTime41 = localTime7.toDateTimeToday(dateTimeZone33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(2021, (int) (byte) -1, 21, 23, 1, dateTimeZone33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022" + "'", str21, "2022");
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "weekyear" + "'", str24, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfYear();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfDay();
        long long15 = chronology9.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField17 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology9.hourOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter22.withLocale(locale23);
        java.lang.String str25 = dateTimeField18.getAsShortText((int) 'a', locale23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = property6.setCopy("", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 971923363200000L + "'", long15 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "97" + "'", str25, "97");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMinutes((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9223372036854775807 + 1920000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property23 = dateTime22.weekyear();
        java.lang.String str24 = property23.getAsText();
        int int25 = property23.get();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        int int28 = property23.compareTo((org.joda.time.ReadablePartial) localDate26);
        long long29 = property23.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property23.getFieldType();
        org.joda.time.DurationField durationField31 = property23.getRangeDurationField();
        java.util.Locale locale32 = java.util.Locale.US;
        int int33 = property23.getMaximumShortTextLength(locale32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = gregorianCalendar7.getDisplayName(292278993, 86399, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022" + "'", str24, "2022");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 5555765861L + "'", long29 == 5555765861L);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNull(durationField31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        int int7 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime6);
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        int int14 = dateTime12.getYear();
        org.joda.time.DateTime dateTime15 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property16 = dateTime15.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime19.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long29 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) '4');
        org.joda.time.DateTime dateTime30 = dateTime15.toDateTime(dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) localTime6, dateTimeZone27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-213119948L) + "'", long29 == (-213119948L));
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property6.setCopy(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime3 = dateTime2.toMutableDateTime();
        org.joda.time.DateTime dateTime4 = dateTime2.withLaterOffsetAtOverlap();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(chronology6);
        int int9 = dateTime8.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime8.withTime(21, 22, 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 26166193 + "'", int9 == 26166193);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("weekyear");
        java.util.Date date3 = new java.util.Date(1646723755766L);
        boolean boolean4 = timeZone1.inDaylightTime(date3);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals(date3.toString(), "Tue Mar 08 07:15:55 GMT 2022");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = localTime2.minusHours(2021);
        int int9 = localTime2.getSecondOfMinute();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        java.lang.String str16 = property15.getAsText();
        int int17 = property15.get();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        int int20 = property15.compareTo((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate localDate22 = localDate18.plusWeeks((int) (short) 100);
        boolean boolean24 = localDate22.equals((java.lang.Object) 0);
        org.joda.time.LocalDate localDate26 = localDate22.minusYears(32769);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = localTime2.compareTo((org.joda.time.ReadablePartial) localDate26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022" + "'", str16, "2022");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        org.joda.time.LocalDateTime localDateTime7 = property3.addWrapFieldToCopy((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate8 = localDate0.minusYears(21);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate0.get(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        java.lang.String str16 = property15.getAsText();
        int int17 = property15.get();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        int int20 = property15.compareTo((org.joda.time.ReadablePartial) localDate18);
        long long21 = property15.remainder();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property15.getFieldType();
        org.joda.time.DurationField durationField23 = property15.getRangeDurationField();
        java.util.Locale locale24 = java.util.Locale.US;
        int int25 = property15.getMaximumShortTextLength(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = gregorianCalendar7.getDisplayName(1340, (-1), locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022" + "'", str16, "2022");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5555767160L + "'", long21 == 5555767160L);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNull(durationField23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(17, 1, (int) 'x', 24, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(2021, 26162278, (int) (short) 10, 5, 435, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 435 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(0, 12, (int) (byte) 1, 34, (int) (short) 100, 2024, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone6 = dateTimeFormatter5.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant7 = org.joda.time.Instant.parse("en-CA", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeZone6);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("era");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"era\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        long long10 = chronology4.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField11 = chronology4.minuteOfHour();
        org.joda.time.DurationField durationField12 = chronology4.millis();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        int int17 = localDate15.getDayOfWeek();
        org.joda.time.LocalDate localDate19 = localDate15.minusYears(10);
        int[] intArray20 = localDate15.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = dateTimeField2.set((org.joda.time.ReadablePartial) localDate13, (int) (byte) 1, intArray20, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 971923363200000L + "'", long10 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[2022, 2, 22]");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("0");
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj2, dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.weekyear();
        java.lang.String str8 = property7.getAsText();
        int int9 = property7.get();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        int int12 = property7.compareTo((org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate14 = localDate10.plusWeeks((int) (short) 100);
        org.joda.time.LocalDate localDate15 = localDate1.withFields((org.joda.time.ReadablePartial) localDate10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate1.withDayOfWeek(366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022" + "'", str8, "2022");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property5 = localTime0.hourOfDay();
        java.lang.String str6 = property5.getAsShortText();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property5.setCopy("2022", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "7" + "'", str6, "7");
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfDay();
        long long15 = chronology9.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        java.lang.Object obj16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(obj16, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property21 = dateTime20.weekyear();
        java.lang.String str22 = property21.getAsText();
        int int23 = property21.get();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        int int26 = property21.compareTo((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = localDate27.getDayOfWeek();
        org.joda.time.LocalDate localDate31 = localDate27.minusYears(10);
        int[] intArray32 = localDate27.getValues();
        chronology9.validate((org.joda.time.ReadablePartial) localDate24, intArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((java.lang.Object) property6, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 971923363200000L + "'", long15 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2022" + "'", str22, "2022");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[2022, 2, 22]");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.plusWeeks(435);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9223372036828800000 + 263088000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        boolean boolean14 = localDate12.equals((java.lang.Object) 0);
        org.joda.time.LocalDate localDate16 = localDate12.minusYears(32769);
        int int17 = localDate12.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDate12.getValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        boolean boolean2 = locale0.equals((java.lang.Object) "0");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter5.withZone(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.parse("2022", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-213119948L) + "'", long18 == (-213119948L));
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute(436);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 436 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DateTime dateTime7 = property5.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime7.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        long long10 = chronology4.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField11 = chronology4.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField12 = chronology4.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology4.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(5, 100, 1340, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 971923363200000L + "'", long10 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        java.util.Locale locale7 = new java.util.Locale("hi!", "", "");
        int int8 = dateTimeField3.getMaximumShortTextLength(locale7);
        long long11 = dateTimeField3.add(1646723755047L, 23);
        java.util.Locale locale16 = new java.util.Locale("", "2022", "");
        java.lang.String str17 = dateTimeField3.getAsText((int) (short) 1, locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder0.setLocale(locale16);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals(locale7.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1646725135047L + "'", long11 == 1646725135047L);
        org.junit.Assert.assertEquals(locale16.toString(), "_2022");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int16 = localDate14.get(dateTimeFieldType15);
        java.lang.String str18 = localDate14.toString("24");
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localDate14.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "24" + "'", str18, "24");
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        int int9 = localDateTime6.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYear((-1));
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime6.withWeekOfWeekyear(600032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600032 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology1.hourOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        java.util.Locale locale15 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withLocale(locale15);
        java.lang.String str17 = dateTimeField10.getAsShortText((int) 'a', locale15);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withYear(22);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusDays(6);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone31);
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.era();
        org.joda.time.LocalDateTime localDateTime34 = property33.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.dayOfYear();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.minusMinutes(12);
        int[] intArray38 = localDateTime34.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = dateTimeField10.addWrapField((org.joda.time.ReadablePartial) localDateTime26, 14, intArray38, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 971923363200000L + "'", long7 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97" + "'", str17, "97");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[1, 1, 1, 0]");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        int int2 = dateTime1.getMonthOfYear();
        org.joda.time.DateTime dateTime4 = dateTime1.plusMinutes(1340);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) 1340);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        int int12 = dateTime10.getMonthOfYear();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = dateTimeFormatter4.parseLocalDate("weekyear");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (short) 100, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter4.withZone(dateTimeZone15);
        java.io.Writer writer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer19, 1646723765466L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-213119948L) + "'", long17 == (-213119948L));
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = instant1.plus(readableDuration5);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.year();
        org.joda.time.DurationField durationField5 = chronology1.days();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = durationField5.getMillis(1646723762055L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1646723762055 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        boolean boolean16 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime19.toDateTimeToday(dateTimeZone22);
        int int24 = dateTime23.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int26 = dateTime23.get(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone28);
        org.joda.time.LocalTime localTime31 = localTime29.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localTime29.toDateTimeToday(dateTimeZone32);
        int int34 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property35 = dateTime23.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime23.withZone(dateTimeZone36);
        int int38 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime37.plus((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime42 = dateTime37.withSecondOfMinute(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 22 + "'", int26 == 22);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        java.util.Locale locale5 = java.util.Locale.FRENCH;
        int int6 = property3.getMaximumShortTextLength(locale5);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfDay();
        long long15 = chronology9.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField16 = chronology9.minuteOfHour();
        java.util.Locale locale17 = java.util.Locale.ROOT;
        int int18 = dateTimeField16.getMaximumTextLength(locale17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = property3.setCopy("2022-02-22T23:59:59.999Z", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-22T23:59:59.999Z\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 971923363200000L + "'", long15 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setLanguage("24");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 24 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("Thu Dec 01 23:59:59 GMT 3921");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Thu Dec 01 23:59:59 GMT 3921\" is malformed at \"hu Dec 01 23:59:59 GMT 3921\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(12);
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, (long) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField5 = localTime3.getField(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        java.lang.String str4 = dateTimeField2.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dateTimeField2.set((long) 'u', 600032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600032 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yearOfCentury" + "'", str4, "yearOfCentury");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        java.lang.StringBuffer stringBuffer6 = null;
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime11.withLaterOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer6, (org.joda.time.ReadableInstant) dateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter4.withZone(dateTimeZone15);
        java.io.Writer writer19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.era();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.dayOfYear();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusDays(100);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withEra(0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.plusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter18.printTo(writer19, (org.joda.time.ReadablePartial) localDateTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-213119948L) + "'", long17 == (-213119948L));
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusMonths(32770);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) ' ');
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        java.lang.String str23 = dateTimeFieldType22.toString();
        boolean boolean24 = dateTime13.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property25 = localDate0.property(dateTimeFieldType22);
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        long long29 = dateTimeField26.add((long) (short) 1, 0);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022" + "'", str20, "2022");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "weekyear" + "'", str23, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate.Property property4 = localDate2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = property4.setCopy("centuries");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"centuries\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        int int7 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        int int15 = dateTime14.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int17 = dateTime14.get(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone19);
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime20.toDateTimeToday(dateTimeZone23);
        int int25 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean26 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime28 = dateTime14.plusWeeks(4);
        org.joda.time.DateTime.Property property29 = dateTime14.minuteOfDay();
        java.lang.String str30 = property29.getAsShortText();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646723773201L + "'", long6 == 1646723773201L);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 436 + "'", int7 == 436);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1439" + "'", str30, "1439");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((int) (byte) 1, 8, 23, 0, 4, chronology11);
        org.joda.time.DurationField durationField15 = chronology11.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(59, 16, 0, 1, 20, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        int[] intArray8 = localDateTime4.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withWeekOfWeekyear(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 1, 1, 0]");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDateTime6.getFieldType((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -292275054");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone7);
        int int11 = dateTimeZone7.getOffset(1646723767856L);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        int int5 = property3.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property3.addToCopy(5555757909L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((java.lang.Object) dateTimeField2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        long long13 = dateTime11.getMillis();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone15);
        org.joda.time.LocalTime localTime18 = localTime16.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes((int) (short) 100);
        int int26 = dateTimeZone21.getOffset((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime27 = dateTime11.withZoneRetainFields(dateTimeZone21);
        java.lang.String str28 = dateTimeZone21.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(213120000, 0, (int) ' ', 20, 6, (int) (short) 0, 17, dateTimeZone21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1646723773926L + "'", long13 == 1646723773926L);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Etc/UTC" + "'", str28, "Etc/UTC");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(11);
        calendar0.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("2022");
        int int12 = timeZone11.getRawOffset();
        calendar0.setTimeZone(timeZone11);
        java.lang.String str14 = calendar0.toString();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=249,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=249,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str14, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=249,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate localDate5 = localDate2.withCenturyOfEra(600032);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate8 = localDate2.withPeriodAdded(readablePeriod6, 32770);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate2.withEra(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(11);
        boolean boolean3 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645514174560,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=14,MILLISECOND=560,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.minuteOfDay();
        java.lang.String str5 = chronology2.toString();
        org.joda.time.DurationField durationField6 = chronology2.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) 17, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[UTC]" + "'", str5, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer5, (long) 435);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        long long6 = durationField3.subtract((-1893235578000L), (long) 'x');
        // The following exception was thrown during execution in test generation
        try {
            long long8 = durationField3.getMillis((-4400281234485837165L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -4400281234485837165 * 31556952000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-5679974778000L) + "'", long6 == (-5679974778000L));
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=249,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=249,ZONE_OFFSET=0,DST_OFFSET=0] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = localTime2.minusHours(2021);
        int int9 = localTime2.getSecondOfMinute();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DurationField durationField17 = property15.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        java.lang.String str19 = dateTimeFieldType18.toString();
        boolean boolean20 = localTime2.isSupported(dateTimeFieldType18);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime23 = localTime2.withField(dateTimeFieldType21, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekOfWeekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022" + "'", str16, "2022");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "weekyear" + "'", str19, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, 435L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimePrinter5);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = locale13.toLanguageTag();
        java.lang.String str15 = locale13.getDisplayVariant();
        java.lang.String str16 = dateTimeField11.getAsText((long) (short) 100, locale13);
        java.util.Set<java.lang.Character> charSet17 = locale13.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = property6.setCopy("", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en-CA" + "'", str14, "en-CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
        org.junit.Assert.assertNotNull(charSet17);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property6.addWrapFieldToCopy((-292275054));
        org.joda.time.LocalDate localDate10 = property6.getLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) property6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.Chronology chronology7 = localDate0.getChronology();
        int int8 = localDate0.getYearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate0.get(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(12);
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.LocalDate.Property property12 = localDate11.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer8, (org.joda.time.ReadablePartial) localDate11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        int int9 = localDateTime6.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withYear((-1));
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property13 = localDateTime6.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField15 = localDateTime6.getField((int) (byte) 1);
        long long17 = dateTimeField15.roundHalfCeiling(1646723762055L);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1646092800000L + "'", long17 == 1646092800000L);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfHour();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        boolean boolean11 = localDate9.isSupported(durationFieldType10);
        int int12 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.minus(readablePeriod18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusMillis(100);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks(1);
        int int24 = localDateTime21.getWeekyear();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.minuteOfDay();
        long long33 = chronology27.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        java.lang.Object obj34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(obj34, dateTimeZone35);
        org.joda.time.DateTime dateTime38 = dateTime36.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property39 = dateTime38.weekyear();
        java.lang.String str40 = property39.getAsText();
        int int41 = property39.get();
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        int int44 = property39.compareTo((org.joda.time.ReadablePartial) localDate42);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology46 = localDate45.getChronology();
        int int47 = localDate45.getDayOfWeek();
        org.joda.time.LocalDate localDate49 = localDate45.minusYears(10);
        int[] intArray50 = localDate45.getValues();
        chronology27.validate((org.joda.time.ReadablePartial) localDate42, intArray50);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology54 = localDate53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = chronology54.minuteOfDay();
        long long60 = chronology54.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField61 = chronology54.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField62 = chronology54.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField63 = chronology54.hourOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter65 = null;
        org.joda.time.format.DateTimeParser dateTimeParser66 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter67 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter65, dateTimeParser66);
        java.util.Locale locale68 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter69 = dateTimeFormatter67.withLocale(locale68);
        java.lang.String str70 = dateTimeField63.getAsShortText((int) 'a', locale68);
        java.lang.String str71 = locale68.getDisplayLanguage();
        java.util.Locale.Category category72 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale76 = new java.util.Locale("", "2022", "");
        java.lang.String str78 = locale76.getExtension('x');
        java.util.Locale.setDefault(category72, locale76);
        java.lang.String str80 = locale68.getDisplayScript(locale76);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray81 = dateTimeField8.set((org.joda.time.ReadablePartial) localDateTime21, (int) 'u', intArray50, "ISOChronology[UTC]", locale76);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[UTC]\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 971923363200000L + "'", long7 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 971923363200000L + "'", long33 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2022" + "'", str40, "2022");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2022 + "'", int41 == 2022);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 971923363200000L + "'", long60 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(dateTimeField63);
        org.junit.Assert.assertNotNull(locale68);
        org.junit.Assert.assertEquals(locale68.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "97" + "'", str70, "97");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "French" + "'", str71, "French");
        org.junit.Assert.assertTrue("'" + category72 + "' != '" + java.util.Locale.Category.FORMAT + "'", category72.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale76.toString(), "_2022");
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter4.withZone(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeFormatter18.parseMillis("French");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-213119948L) + "'", long17 == (-213119948L));
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        java.lang.String str6 = property5.toString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Property[dayOfYear]" + "'", str6, "Property[dayOfYear]");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.removeUnicodeLocaleAttribute("0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withYear(22);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays(6);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfEra(366);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = localTime0.isBefore((org.joda.time.ReadablePartial) localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        java.lang.String str21 = dateTimeZone13.getShortName((long) 10);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.minuteOfDay();
        boolean boolean27 = durationFieldType23.isSupported(chronology25);
        org.joda.time.DateTimeField dateTimeField28 = chronology25.millisOfSecond();
        java.lang.String str29 = chronology25.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone13, chronology25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ISOChronology[UTC]" + "'", str29, "ISOChronology[UTC]");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property5.getFieldType();
        java.lang.String str9 = dateTimeFieldType8.toString();
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) str9, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weekyear\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "weekyear" + "'", str9, "weekyear");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        java.lang.Appendable appendable7 = null;
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        java.lang.String str14 = property13.getAsText();
        int int15 = property13.get();
        org.joda.time.DateTime dateTime16 = property13.withMaximumValue();
        org.joda.time.DateTime dateTime17 = property13.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable7, (org.joda.time.ReadableInstant) dateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property5 = localTime0.hourOfDay();
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = property5.getAsText(locale6);
        java.lang.String str8 = locale6.toString();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7" + "'", str7, "7");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en_CA" + "'", str8, "en_CA");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("CAN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"CAN\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        java.time.Instant instant3 = calendar2.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar2.getLeastMaximum(435);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 435");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-CA" + "'", str1, "en-CA");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645514176706,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=16,MILLISECOND=706,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime6.getValue(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 14");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        int int7 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        int int15 = dateTime14.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int17 = dateTime14.get(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone19);
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime20.toDateTimeToday(dateTimeZone23);
        int int25 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean26 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime28 = dateTime14.plusWeeks(4);
        org.joda.time.DateTime.Property property29 = dateTime14.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = dateTime14.withFieldAdded(durationFieldType30, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646723777017L + "'", long6 == 1646723777017L);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 436 + "'", int7 == 436);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate8.withMonthOfYear(213120000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 213120000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
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
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime3.toDateTimeToday(dateTimeZone6);
        boolean boolean9 = dateTime7.isAfter((long) 2);
        org.joda.time.DateTime dateTime11 = dateTime7.minusDays(1);
        org.joda.time.DateTime dateTime12 = localTime0.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property14 = localTime0.property(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0, 1, 0, 10);
        org.joda.time.LocalTime localTime6 = localTime4.withSecondOfMinute((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime4.withSecondOfMinute(600032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600032 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        calendar2.clear((int) (byte) 1);
        boolean boolean5 = calendar2.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-CA" + "'", str1, "en-CA");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=?,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=17,MILLISECOND=760,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        gregorianCalendar7.roll(100, (int) (short) 0);
        gregorianCalendar7.set(1439, (int) (byte) 100, 12);
        java.time.Instant instant23 = gregorianCalendar7.toInstant();
        java.util.Date date25 = new java.util.Date(1646723755766L);
        gregorianCalendar7.setTime(date25);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = gregorianCalendar7.getActualMaximum(366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 366");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Mar 08 07:15:55 GMT 2022");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.minus(readablePeriod9);
        org.joda.time.DateTime.Property property11 = dateTime8.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer6, (org.joda.time.ReadableInstant) dateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder2 = builder0.setLocale(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(2021, 1340, 0, 32770, (int) ' ', 7, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        boolean boolean14 = localDate12.equals((java.lang.Object) 0);
        org.joda.time.LocalDate localDate16 = localDate12.minusYears(32769);
        int int17 = localDate12.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate12.withDayOfWeek(24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.Instant instant7 = new org.joda.time.Instant((java.lang.Object) dateTimeZone5);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        org.joda.time.LocalDateTime localDateTime7 = property3.addWrapFieldToCopy((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property3.addToCopy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) 'a', 22, 21, 51, 14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 51 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.lang.String str6 = timeZone1.getID();
        java.lang.String str7 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645514178785,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=18,MILLISECOND=785,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GMT" + "'", str6, "GMT");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Greenwich Mean Time" + "'", str7, "Greenwich Mean Time");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property5.setCopy("en_CA");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en_CA\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("fr");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder0.setRegion("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setLanguage("16");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 16 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        int int7 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        int int15 = dateTime14.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int17 = dateTime14.get(dateTimeFieldType16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone19);
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime20.toDateTimeToday(dateTimeZone23);
        int int25 = dateTime14.compareTo((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean26 = dateTime4.isEqual((org.joda.time.ReadableInstant) dateTime14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dateTime14.toString("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=249,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646723779085L + "'", long6 == 1646723779085L);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 436 + "'", int7 == 436);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withDefaultYear(10);
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter4.withZone(dateTimeZone15);
        java.io.Writer writer19 = null;
        java.lang.Object obj20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj20, dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime26 = dateTime22.minusDays((int) (short) 100);
        org.joda.time.DateTime dateTime28 = dateTime22.plusMinutes(86399);
        java.lang.Object obj29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj29, dateTimeZone30);
        org.joda.time.DateTime dateTime33 = dateTime31.withYear(7);
        int int34 = dateTime33.getMonthOfYear();
        int int35 = dateTime33.getDayOfMonth();
        boolean boolean36 = dateTime22.isEqual((org.joda.time.ReadableInstant) dateTime33);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter18.printTo(writer19, (org.joda.time.ReadableInstant) dateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-213119948L) + "'", long17 == (-213119948L));
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 22 + "'", int35 == 22);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        long long8 = chronology2.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology2);
        org.joda.time.DurationField durationField10 = chronology2.millis();
        org.joda.time.DurationField durationField11 = chronology2.weekyears();
        java.lang.String str12 = durationField11.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 971923363200000L + "'", long8 == 971923363200000L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "weekyears" + "'", str12, "weekyears");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = localDate0.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks(1);
        int int11 = localDateTime8.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localDateTime8.getField(59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.minuteOfDay();
        boolean boolean9 = durationFieldType5.isSupported(chronology7);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(chronology11);
        boolean boolean13 = durationFieldType5.isSupported(chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(366, 366, 0, (int) ' ', 19059, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.Chronology chronology5 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.dayOfWeek();
        java.lang.String str8 = dateTimeField6.getAsShortText((-213119948L));
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears((int) (byte) 0);
        int[] intArray19 = new int[] { 53, 21, (short) 10, 51, 22, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = dateTimeField6.addWrapField((org.joda.time.ReadablePartial) localDateTime9, 436, intArray19, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 436");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Mon" + "'", str8, "Mon");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[53, 21, 10, 51, 22, 0]");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean11 = dateTimeZone10.isFixed();
        int int13 = dateTimeZone10.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime14 = localDate7.toDateTimeAtCurrentTime(dateTimeZone10);
        long long18 = dateTimeZone10.convertLocalToUTC((long) (short) 0, false, (long) 8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((int) (short) 0, 2024, 26175799, (int) ' ', (int) (byte) 0, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 213120000 + "'", int13 == 213120000);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-213120000L) + "'", long18 == (-213120000L));
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale[] localeArray6 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList7 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList7, localeArray6);
        java.util.Locale.FilteringMode filteringMode9 = null;
        java.util.List<java.util.Locale> localeList10 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList7, filteringMode9);
        java.util.List<java.util.Locale> localeList11 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) languageRangeList1, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.ArrayList");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localeList10);
        org.junit.Assert.assertNotNull(localeList11);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withDayOfWeek(26176839);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26176839 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        java.lang.String str8 = localDate7.toString();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime12 = localTime10.plusHours(2022);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime15 = localTime12.withFieldAdded(durationFieldType13, (int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localDate7.compareTo((org.joda.time.ReadablePartial) localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "292278994-08-17" + "'", str8, "292278994-08-17");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 34);
        org.joda.time.Instant instant8 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dateTimeFormatter6.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime9, "clockhourOfDay", 26174796);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        boolean boolean8 = durationFieldType4.isSupported(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) chronology1, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.clockhourOfHalfday();
        java.util.Locale locale12 = new java.util.Locale("24", "hi!");
        java.lang.String str13 = dateTimeField8.getAsShortText(5555776727L, locale12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        int int16 = localDate14.getDayOfWeek();
        org.joda.time.LocalDate localDate18 = localDate14.minusYears(10);
        java.util.Locale locale22 = new java.util.Locale("24", "hi!");
        java.lang.String str23 = locale22.getCountry();
        java.lang.String str24 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDate14, (int) '4', locale22);
        int int26 = dateTimeField8.get((long) (short) 100);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals(locale12.toString(), "24_HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7" + "'", str13, "7");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertEquals(locale22.toString(), "24_HI!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HI!" + "'", str23, "HI!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "52" + "'", str24, "52");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 12 + "'", int26 == 12);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(7);
        java.util.Date date5 = dateTime4.toDate();
        java.lang.Object obj6 = date5.clone();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Thu Feb 24 07:16:20 GMT 7");
        org.junit.Assert.assertNotNull(obj6);
// flaky:         org.junit.Assert.assertEquals(obj6.toString(), "Thu Feb 24 07:16:20 GMT 7");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "Thu Feb 24 07:16:20 GMT 7");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "Thu Feb 24 07:16:20 GMT 7");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = localTime2.minusHours(2021);
        int int9 = localTime2.getSecondOfMinute();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        java.lang.String str16 = property15.getAsText();
        org.joda.time.DurationField durationField17 = property15.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        java.lang.String str19 = dateTimeFieldType18.toString();
        boolean boolean20 = localTime2.isSupported(dateTimeFieldType18);
        java.util.Locale locale25 = new java.util.Locale("hi!", "", "");
        java.lang.String str26 = locale25.getDisplayScript();
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        java.util.Locale locale30 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter31 = dateTimeFormatter29.withLocale(locale30);
        java.lang.String str32 = locale25.getDisplayName(locale30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = localTime2.toString("2 Dec 3921 00:00:00 GMT", locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022" + "'", str16, "2022");
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "weekyear" + "'", str19, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        gregorianCalendar7.roll(100, (int) (short) 0);
        gregorianCalendar7.set(1439, (int) (byte) 100, 12);
        java.time.Instant instant23 = gregorianCalendar7.toInstant();
        java.util.Date date25 = new java.util.Date(1646723755766L);
        gregorianCalendar7.setTime(date25);
        java.lang.Object obj27 = date25.clone();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Mar 08 07:15:55 GMT 2022");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "Tue Mar 08 07:15:55 GMT 2022");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "Tue Mar 08 07:15:55 GMT 2022");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "Tue Mar 08 07:15:55 GMT 2022");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.addUnicodeLocaleAttribute("59");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 59 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        java.time.Instant instant3 = calendar2.toInstant();
        calendar2.set(5, 6);
        calendar2.setWeekDate(6, 12, 1);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.roll(51, 27445396);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-CA" + "'", str1, "en-CA");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-61971756219039,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=6,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=73,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=20,MILLISECOND=961,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Instant instant3 = instant1.toInstant();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter5.withZone(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.parse("en-ca", dateTimeFormatter19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-213119948L) + "'", long18 == (-213119948L));
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (short) -1, (int) '4', 26176839, 16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime9.toDateTimeToday(dateTimeZone12);
        org.joda.time.LocalTime localTime15 = localTime9.minusHours(2021);
        int int16 = localTime9.getSecondOfMinute();
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property22 = dateTime21.weekyear();
        java.lang.String str23 = property22.getAsText();
        org.joda.time.DurationField durationField24 = property22.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property22.getFieldType();
        java.lang.String str26 = dateTimeFieldType25.toString();
        boolean boolean27 = localTime9.isSupported(dateTimeFieldType25);
        org.joda.time.DateTime dateTime28 = localTime9.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dateTimeFormatter6.print((org.joda.time.ReadableInstant) dateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 59 + "'", int16 == 59);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022" + "'", str23, "2022");
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "weekyear" + "'", str26, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfHour();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        boolean boolean11 = localDate9.isSupported(durationFieldType10);
        int int12 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DurationField durationField13 = dateTimeField8.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeField8.set(1646092800000L, "Thu Dec 01 23:59:59 GMT 3921");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Thu Dec 01 23:59:59 GMT 3921\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 971923363200000L + "'", long7 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        boolean boolean16 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime19.toDateTimeToday(dateTimeZone22);
        int int24 = dateTime23.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int26 = dateTime23.get(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone28);
        org.joda.time.LocalTime localTime31 = localTime29.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localTime29.toDateTimeToday(dateTimeZone32);
        int int34 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property35 = dateTime23.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime23.withZone(dateTimeZone36);
        int int38 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime37.plus((long) 3);
        java.util.GregorianCalendar gregorianCalendar41 = dateTime37.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            int int43 = gregorianCalendar41.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 22 + "'", int26 == 22);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(gregorianCalendar41);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime localTime6 = localTime0.minusMinutes(11);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        java.lang.String str17 = property16.getAsText();
        org.joda.time.DurationField durationField18 = property16.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property16.getFieldType();
        int int20 = dateTime10.get(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localTime6.get(dateTimeFieldType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022" + "'", str17, "2022");
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int int5 = localDate4.getYearOfEra();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate4.withMonthOfYear(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2012 + "'", int5 == 2012);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        boolean boolean17 = gregorianCalendar7.isSet((int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        java.lang.String str12 = property11.getAsText();
        int int13 = property11.get();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        int int16 = property11.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate localDate18 = localDate14.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.plus(readablePeriod19);
        org.joda.time.DateTime dateTime21 = localDate18.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime21.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(17, 15, 2022, 0, (int) '4', 15, dateTimeZone22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(2024, 2024, 32770, 2024, 24, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths((int) '4');
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        java.lang.String str11 = property10.getAsText();
        int int12 = property10.get();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        int int15 = property10.compareTo((org.joda.time.ReadablePartial) localDate13);
        org.joda.time.LocalDate localDate17 = localDate13.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate17.plus(readablePeriod18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int21 = localDate19.get(dateTimeFieldType20);
        boolean boolean22 = localDate0.isSupported(dateTimeFieldType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = localDate0.withDayOfMonth(26176839);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26176839 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(292278993);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        int int6 = dateTimeField5.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        int int14 = localTime9.compareTo((org.joda.time.ReadablePartial) localTime13);
        int[] intArray17 = new int[] { 1340 };
        java.util.Locale locale22 = new java.util.Locale("hi!", "", "");
        java.lang.String str23 = locale22.getDisplayScript();
        java.util.Locale locale27 = new java.util.Locale("hi!", "", "");
        java.lang.String str28 = locale22.getDisplayScript(locale27);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = dateTimeField5.set((org.joda.time.ReadablePartial) localTime9, (int) 'u', intArray17, "Thu Dec 01 23:59:59 GMT 3921", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Thu Dec 01 23:59:59 GMT 3921\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1340]");
        org.junit.Assert.assertEquals(locale22.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals(locale27.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        gregorianCalendar7.roll(100, (int) (short) 0);
        gregorianCalendar7.set(1439, (int) (byte) 100, 12);
        java.time.Instant instant23 = gregorianCalendar7.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar7.set(51, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 51");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(instant23);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        int int4 = localDate2.getDayOfWeek();
        org.joda.time.LocalDate localDate6 = localDate2.minusMonths(32770);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localTime0.compareTo((org.joda.time.ReadablePartial) localDate6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localTime2.getFields();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.weekyearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = dateTimeField6.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property8 = localTime2.property(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withZone(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime9.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withMillisOfSecond((int) (byte) 100);
        int int16 = property6.compareTo((org.joda.time.ReadableInstant) dateTime15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = property6.setCopy("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Etc/UTC\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = dateTimeFormatter2.parseMutableDateTime("Thu Dec 01 23:59:59 GMT 3921");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone7);
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        int int16 = dateTime14.getYear();
        org.joda.time.DateTime dateTime17 = dateTime14.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.hours();
        boolean boolean20 = localDate18.isSupported(durationFieldType19);
        int int21 = localDate18.size();
        org.joda.time.DateTime dateTime22 = dateTime17.withFields((org.joda.time.ReadablePartial) localDate18);
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.weekyear();
        java.lang.String str29 = property28.getAsText();
        org.joda.time.DurationField durationField30 = property28.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property28.getFieldType();
        java.lang.String str32 = dateTimeFieldType31.toString();
        boolean boolean33 = dateTime17.isSupported(dateTimeFieldType31);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = localTime9.get(dateTimeFieldType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022" + "'", str29, "2022");
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "weekyear" + "'", str32, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusMonths(32770);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) ' ');
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        java.lang.String str23 = dateTimeFieldType22.toString();
        boolean boolean24 = dateTime13.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property25 = localDate0.property(dateTimeFieldType22);
        org.joda.time.LocalDate localDate26 = property25.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = property25.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022" + "'", str20, "2022");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "weekyear" + "'", str23, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = strSet0.remove(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone4);
        org.joda.time.LocalTime localTime7 = localTime5.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime5.toDateTimeToday(dateTimeZone8);
        boolean boolean11 = dateTime9.isAfter((long) 2);
        org.joda.time.DateTime dateTime13 = dateTime9.minusDays(1);
        org.joda.time.DateTime dateTime15 = dateTime9.minusHours((-1));
        java.lang.String str16 = dateTime9.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime19.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long29 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) '4');
        org.joda.time.DateTime dateTime30 = dateTime9.toDateTime(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) 59, dateTimeZone24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022-02-22T23:59:59.999Z" + "'", str16, "2022-02-22T23:59:59.999Z");
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-213119948L) + "'", long29 == (-213119948L));
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.minuteOfDay();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (byte) 1, 8, 23, 0, 4, chronology6);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMonths(0);
        org.joda.time.DateTime dateTime13 = dateTime9.minusYears(59);
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withYear(7);
        boolean boolean19 = dateTime9.isBefore((org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime18.getYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = dateTime18.withField(dateTimeFieldType21, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(durationFieldType22);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        gregorianCalendar7.set(1340, 86399, 12);
        java.lang.String str20 = gregorianCalendar7.toString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1340,MONTH=86399,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=12,DAY_OF_YEAR=2,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str20, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1340,MONTH=86399,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=12,DAY_OF_YEAR=2,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime7 = property6.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime7.withSecondOfMinute(26162278);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26162278 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property6.addToCopy(59);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = property14.setCopy("+59:12");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+59:12\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        boolean boolean16 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime17 = dateTime10.toDateTime();
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property23 = dateTime22.weekyear();
        long long24 = dateTime22.getMillis();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone26);
        org.joda.time.LocalTime localTime29 = localTime27.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = localTime27.toDateTimeToday(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTime31.getZone();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes((int) (short) 100);
        int int37 = dateTimeZone32.getOffset((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime38 = dateTime22.withZoneRetainFields(dateTimeZone32);
        org.joda.time.DateTime dateTime40 = dateTime38.plusMonths((int) (short) 100);
        boolean boolean41 = dateTime10.isBefore((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.DateTime dateTime43 = dateTime10.withWeekyear(51);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime45 = dateTime10.withMinuteOfHour(1649);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1649 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1646723783341L + "'", long24 == 1646723783341L);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("CAN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"CAN\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate localDate5 = localDate2.withCenturyOfEra(600032);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate2.getValue(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("zho");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zho\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(67, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        boolean boolean16 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime19.toDateTimeToday(dateTimeZone22);
        int int24 = dateTime23.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int26 = dateTime23.get(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone28);
        org.joda.time.LocalTime localTime31 = localTime29.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localTime29.toDateTimeToday(dateTimeZone32);
        int int34 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property35 = dateTime23.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime23.withZone(dateTimeZone36);
        int int38 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime.Property property39 = dateTime15.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = dateTime15.toString("1 Jan 1970 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 22 + "'", int26 == 22);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.Chronology chronology7 = localDate0.getChronology();
        int int8 = localDate0.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate0.withWeekOfWeekyear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        long long11 = property5.remainder();
        java.lang.String str12 = property5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = property5.setCopy("yearOfCentury");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearOfCentury\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5555783769L + "'", long11 == 5555783769L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[weekyear]" + "'", str12, "Property[weekyear]");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        boolean boolean1 = locale0.hasExtensions();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.weeks();
        long long8 = durationField5.subtract((long) 5, (long) 32770);
        boolean boolean9 = locale0.equals((java.lang.Object) durationField5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-19819295999995L) + "'", long8 == (-19819295999995L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(6);
        int int11 = localDateTime10.getDayOfYear();
        org.joda.time.Chronology chronology12 = localDateTime10.getChronology();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.parse("0");
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj15, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        java.lang.String str21 = property20.getAsText();
        int int22 = property20.get();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        int int25 = property20.compareTo((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate27 = localDate23.plusWeeks((int) (short) 100);
        org.joda.time.LocalDate localDate28 = localDate14.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate.Property property29 = localDate28.centuryOfEra();
        org.joda.time.LocalDate localDate30 = property29.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = localDateTime10.isAfter((org.joda.time.ReadablePartial) localDate30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 360 + "'", int11 == 360);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022" + "'", str21, "2022");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        java.lang.String str16 = gregorianCalendar7.getCalendarType();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar7.roll(17, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "gregory" + "'", str16, "gregory");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        boolean boolean4 = property3.isLeap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = property3.addToCopy(435L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(dateTimeZone4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        boolean boolean10 = durationFieldType6.isSupported(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfSecond();
        int int12 = dateTime5.get(dateTimeField11);
        long long15 = dateTimeField11.add(0L, (int) (short) 100);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        int int18 = localDate16.getDayOfWeek();
        org.joda.time.LocalDate localDate20 = localDate16.minusYears(10);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localDate16.getFields();
        org.joda.time.LocalDate localDate23 = localDate16.withYearOfEra(5);
        java.lang.Object obj25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj25, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property30 = dateTime29.weekyear();
        java.lang.String str31 = property30.getAsText();
        int int32 = property30.get();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology34 = localDate33.getChronology();
        int int35 = property30.compareTo((org.joda.time.ReadablePartial) localDate33);
        org.joda.time.LocalDate localDate37 = localDate33.plusWeeks((int) (short) 100);
        int int38 = localDate37.getWeekyear();
        int[] intArray39 = localDate37.getValues();
        java.util.Locale locale43 = new java.util.Locale("24", "hi!");
        java.lang.String str44 = locale43.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray45 = dateTimeField11.set((org.joda.time.ReadablePartial) localDate16, 4, intArray39, "CAN", locale43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"CAN\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2022" + "'", str31, "2022");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2024 + "'", int38 == 2024);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[2024, 1, 23]");
        org.junit.Assert.assertEquals(locale43.toString(), "24_HI!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "HI!" + "'", str44, "HI!");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withWeekOfWeekyear(1340);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1340 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.Chronology chronology3 = instant1.getChronology();
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) ' ');
        org.joda.time.LocalTime localTime6 = localTime4.plusSeconds((int) (byte) 1);
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.era();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localTime6.compareTo((org.joda.time.ReadablePartial) localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int int5 = localDate4.getYearOfEra();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate4.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2012 + "'", int5 == 2012);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.toDateTime(dateTimeZone4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        boolean boolean10 = durationFieldType6.isSupported(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.millisOfSecond();
        int int12 = dateTime5.get(dateTimeField11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime5.withTime((int) (short) 0, 436, 122, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 436 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusWeeks(23);
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.lang.String str12 = locale11.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime9.toString("2022-02-22T23:59:59.999Z", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "fr" + "'", str12, "fr");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime(chronology12);
        int int14 = dateTime11.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(obj19, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property24 = dateTime23.weekyear();
        java.lang.String str25 = property24.getAsText();
        org.joda.time.DurationField durationField26 = property24.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property24.getFieldType();
        int int28 = dateTime18.get(dateTimeFieldType27);
        java.lang.String str29 = dateTimeFieldType27.getName();
        org.joda.time.DateTime dateTime31 = dateTime11.withField(dateTimeFieldType27, 26171150);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property32 = localTime2.property(dateTimeFieldType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2022" + "'", str25, "2022");
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2022 + "'", int28 == 2022);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "weekyear" + "'", str29, "weekyear");
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(32769, 1340, 122, 15, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1340 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setRegion("GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: GMT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        gregorianCalendar7.roll(100, (int) (short) 0);
        gregorianCalendar7.set(1439, (int) (byte) 100, 12);
        java.time.Instant instant23 = gregorianCalendar7.toInstant();
        boolean boolean24 = gregorianCalendar7.isLenient();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("en-CA");
        double double2 = languageRange1.getWeight();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        boolean boolean5 = languageRange1.equals((java.lang.Object) chronology4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet1 = provider0.getAvailableIDs();
        java.util.Calendar.Builder builder2 = new java.util.Calendar.Builder();
        java.util.Calendar calendar3 = builder2.build();
        java.util.Calendar.Builder builder8 = builder2.setTimeOfDay((int) (short) 100, 16, 3, 53);
        java.util.Calendar.Builder builder9 = new java.util.Calendar.Builder();
        java.util.Calendar calendar10 = builder9.build();
        java.util.Calendar.Builder builder12 = builder9.setLenient(false);
        java.util.Calendar.Builder builder13 = new java.util.Calendar.Builder();
        java.util.Calendar calendar14 = builder13.build();
        java.util.Calendar.Builder builder16 = builder13.setLenient(false);
        java.util.Calendar.Builder builder20 = builder16.setDate(4, 26180752, 0);
        java.util.Calendar.Builder builder21 = new java.util.Calendar.Builder();
        java.util.Calendar calendar22 = builder21.build();
        java.util.Calendar.Builder builder23 = new java.util.Calendar.Builder();
        java.util.Calendar calendar24 = builder23.build();
        java.util.Calendar.Builder builder29 = builder23.setTimeOfDay((int) (short) 100, 16, 3, 53);
        java.util.Calendar.Builder builder30 = new java.util.Calendar.Builder();
        java.util.Calendar calendar31 = builder30.build();
        java.util.Calendar.Builder[] builderArray32 = new java.util.Calendar.Builder[] { builder8, builder12, builder20, builder21, builder23, builder30 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder[] builderArray33 = strSet1.toArray(builderArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(calendar31);
// flaky:         org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builderArray32);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = chronology1.get(readablePeriod5, 20000801142000000L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getNameKey(0L);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(19059);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19059 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant7 = instant1.withDurationAdded(readableDuration5, 0);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant7);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.util.Locale locale3 = new java.util.Locale("hi!", "ISOChronology[UTC]", "2022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_ISOCHRONOLOGY[UTC]_2022");
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(11);
        calendar0.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("2022");
        int int12 = timeZone11.getRawOffset();
        calendar0.setTimeZone(timeZone11);
        boolean boolean14 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=55,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setScript("Chinese");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Chinese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        org.joda.time.LocalDate localDate8 = property6.roundHalfCeilingCopy();
        int int9 = property6.getMinimumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property6.addToCopy((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 22]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMonthOfYear(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(11);
        int int3 = calendar0.getMinimalDaysInFirstWeek();
        java.lang.Object obj4 = calendar0.clone();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645514187534,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=27,MILLISECOND=534,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(obj4);
// flaky:         org.junit.Assert.assertEquals(obj4.toString(), "java.util.GregorianCalendar[time=1645514187534,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=27,MILLISECOND=534,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "java.util.GregorianCalendar[time=1645514187534,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=27,MILLISECOND=534,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "java.util.GregorianCalendar[time=1645514187534,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=27,MILLISECOND=534,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant5 = org.joda.time.Instant.parse("", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Greenwich Mean Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Greenwich Mean Time' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withDefaultYear(26171150);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter4.print((long) 1649);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfYear();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfDay();
        boolean boolean12 = durationFieldType8.isSupported(chronology10);
        org.joda.time.DurationField durationField13 = chronology10.weeks();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(694252944000L, chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) localDateTime4, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        gregorianCalendar7.roll(100, (int) (short) 0);
        gregorianCalendar7.set(1439, (int) (byte) 100, 12);
        java.time.Instant instant23 = gregorianCalendar7.toInstant();
        java.util.Date date25 = new java.util.Date(1646723755766L);
        gregorianCalendar7.setTime(date25);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar7.setWeekDate(6, 26182169, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(instant23);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Tue Mar 08 07:15:55 GMT+00:00 2022");
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime11.getZone();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes((int) (short) 100);
        int int17 = dateTimeZone12.getOffset((org.joda.time.ReadableInstant) dateTime16);
        java.lang.String str18 = dateTimeZone12.toString();
        java.lang.String str20 = dateTimeZone12.getNameKey(1646723758993L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((-292275054), 0, 10, 15, (int) '4', dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 213120000 + "'", int17 == 213120000);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+59:12" + "'", str18, "+59:12");
// flaky:         org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.clockhourOfHalfday();
        java.util.Locale locale12 = new java.util.Locale("24", "hi!");
        java.lang.String str13 = dateTimeField8.getAsShortText(5555776727L, locale12);
        java.lang.String str14 = locale12.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals(locale12.toString(), "24_HI!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7" + "'", str13, "7");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "24_HI!" + "'", str14, "24_HI!");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        int int7 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate5.minusYears(10);
        int[] intArray10 = localDate5.getValues();
        org.joda.time.LocalDate.Property property11 = localDate5.era();
        org.joda.time.Chronology chronology12 = localDate5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(14, 26162278, 15, 21, 21, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26162278 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(intArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        timeZone1.setRawOffset((int) 'u');
        java.lang.Object obj7 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=117,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=117,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=117,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        int int11 = dateTime9.getYear();
        org.joda.time.DateTime dateTime12 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        boolean boolean16 = dateTimeZone15.isFixed();
        int int18 = dateTimeZone15.getStandardOffset((long) (-1));
        org.joda.time.DateTime dateTime19 = dateTime12.withZoneRetainFields(dateTimeZone15);
        java.lang.String str21 = dateTimeZone15.getShortName((long) 5);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone23);
        org.joda.time.LocalDateTime.Property property25 = localDateTime24.era();
        org.joda.time.LocalDateTime localDateTime26 = property25.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfYear();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withYear((int) (short) 1);
        boolean boolean32 = dateTimeZone15.isLocalDateTimeGap(localDateTime31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(600032, (int) ' ', 26174796, 0, 3, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 213120000 + "'", int18 == 213120000);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+59:12" + "'", str21, "+59:12");
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        boolean boolean8 = durationField7.isSupported();
        long long11 = durationField7.add(0L, 0);
        long long14 = durationField7.add(1646723762055L, 1L);
        long long17 = durationField7.getMillis(2024, (long) 86399);
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property23 = dateTime22.weekyear();
        java.lang.String str24 = property23.getAsText();
        org.joda.time.DurationField durationField25 = property23.getDurationField();
        int int26 = durationField7.compareTo(durationField25);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1678173362055L + "'", long14 == 1678173362055L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 63871718400000L + "'", long17 == 63871718400000L);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022" + "'", str24, "2022");
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        int int7 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime9 = localTime2.withHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.year();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localTime9.get(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.util.Date date5 = new java.util.Date((int) (short) -1, (int) (byte) 10, 292278993, 34, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(435);
        int int9 = dateTimeZone7.getOffsetFromLocal(1646723759380L);
        int int11 = dateTimeZone7.getOffset(1646723769545L);
        boolean boolean12 = date5.equals((java.lang.Object) dateTimeZone7);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Tue Jul 15 10:52:00 GMT+00:00 802132");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 435 + "'", int9 == 435);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 435 + "'", int11 == 435);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            calendar5.set(52, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645514188546,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=28,MILLISECOND=546,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        java.util.Locale locale6 = new java.util.Locale("hi!", "", "");
        int int7 = dateTimeField2.getMaximumShortTextLength(locale6);
        long long9 = dateTimeField2.roundHalfCeiling((long) (short) -1);
        boolean boolean10 = dateTimeField2.isSupported();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withYear(22);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minus(readablePeriod16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMillis(100);
        int int20 = localDateTime17.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withYear((-1));
        org.joda.time.LocalDateTime.Property property23 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime.Property property24 = localDateTime17.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime17.minus(readablePeriod25);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.era();
        org.joda.time.LocalDateTime localDateTime32 = property31.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.dayOfYear();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.minusMinutes(12);
        int[] intArray36 = localDateTime32.getValues();
        java.util.Locale locale38 = java.util.Locale.CHINA;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = dateTimeField2.set((org.joda.time.ReadablePartial) localDateTime26, 26175799, intArray36, "Greenwich Mean Time", locale38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Greenwich Mean Time\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1, 1, 1, 0]");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_CN");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        long long13 = dateTime11.getMillis();
        org.joda.time.DateTime.Property property14 = dateTime11.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime11, dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(8, (int) (short) -1, 51, 9, 26162278, 100, 2012, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26162278 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1646723788640L + "'", long13 == 1646723788640L);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.year();
        org.joda.time.DurationField durationField9 = chronology5.days();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = chronology5.add(readablePeriod10, 1646723777197L, 19059);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(99, 2000, 2022, 26176839, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1646723777197L + "'", long13 == 1646723777197L);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.util.Date date3 = new java.util.Date(2022, (int) (byte) -1, 2);
        date3.setSeconds((int) (byte) -1);
        int int6 = date3.getTimezoneOffset();
        int int7 = date3.getMinutes();
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Thu Dec 01 23:59:59 GMT+00:00 3921");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(26174796, 1340);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 1340");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime9.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeField6, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.ZeroIsMaxDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone5);
        org.joda.time.LocalTime localTime8 = localTime6.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localTime6.toDateTimeToday(dateTimeZone9);
        boolean boolean12 = dateTime10.isAfter((long) 2);
        org.joda.time.DateTime dateTime14 = dateTime10.minusDays(1);
        org.joda.time.DateTime dateTime16 = dateTime10.minusHours((-1));
        java.lang.String str17 = dateTime10.toString();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone19);
        org.joda.time.LocalTime localTime22 = localTime20.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localTime20.toDateTimeToday(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTime24.getZone();
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime29 = dateTime27.minusMinutes((int) (short) 100);
        int int30 = dateTimeZone25.getOffset((org.joda.time.ReadableInstant) dateTime29);
        int int32 = dateTimeZone25.getStandardOffset((long) 7);
        org.joda.time.MutableDateTime mutableDateTime33 = dateTime10.toMutableDateTime(dateTimeZone25);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime33, "AD", 20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2022-02-24T11:11:59.999+59:12" + "'", str17, "2022-02-24T11:11:59.999+59:12");
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 213120000 + "'", int30 == 213120000);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 213120000 + "'", int32 == 213120000);
        org.junit.Assert.assertNotNull(mutableDateTime33);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.minus(readablePeriod6);
        org.joda.time.DateTime dateTime8 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime5.withYearOfCentury((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        timeZone1.setID("French");
        java.lang.String str4 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GMT+00:00" + "'", str4, "GMT+00:00");
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder3 = builder0.setLenient(false);
        java.util.Calendar.Builder builder5 = builder3.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder5.setWeekDefinition((-52), 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        long long10 = durationField7.getMillis(12, (long) 11);
        boolean boolean11 = durationField7.isSupported();
        long long14 = durationField7.subtract((long) 'x', 59);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 379209600000L + "'", long10 == 379209600000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1861574399880L) + "'", long14 == (-1861574399880L));
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        long long6 = java.util.Date.UTC(360, 26176839, 1970, 99, 32770, 7);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 68847761538607000L + "'", long6 == 68847761538607000L);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime6.withDate((int) 'x', 0, 600032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(1340, 0, 9, (int) (short) 0, 99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(0);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localDateTime9.getFields();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.plusSeconds(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime14.withTime(0, 122, 32770, 122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean10 = dateTime8.isSupported(dateTimeFieldType9);
        int int11 = dateTime8.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime8.withMinuteOfHour(26162278);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26162278 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeField dateTimeField3 = chronology1.monthOfYear();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = chronology1.add(readablePeriod5, (long) 435, (int) 'a');
        org.joda.time.DateTimeField dateTimeField9 = chronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.era();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
        org.joda.time.LocalDateTime localDateTime17 = property15.setCopy((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.era();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusMinutes(12);
        int[] intArray27 = localDateTime23.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = dateTimeField9.addWrapField((org.joda.time.ReadablePartial) localDateTime17, 26171150, intArray27, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 26171150");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 435L + "'", long8 == 435L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 1, 1, 0]");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.era();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = property12.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusSeconds(11);
        int[] intArray23 = new int[] { 3, 17, 2, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = dateTimeField8.addWrapPartial((org.joda.time.ReadablePartial) localDateTime15, 2022, intArray23, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 971923363200000L + "'", long7 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[3, 17, 2, -1]");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        long long12 = dateTime10.getMillis();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone14);
        org.joda.time.LocalTime localTime17 = localTime15.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localTime15.toDateTimeToday(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime19.getZone();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((int) (short) 100);
        int int25 = dateTimeZone20.getOffset((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime26 = dateTime10.withZoneRetainFields(dateTimeZone20);
        java.lang.String str28 = dateTimeZone20.getName((long) 2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(292278993, (int) 'u', 55, 0, 25, 26175799, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26175799 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1646723790176L + "'", long12 == 1646723790176L);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 213120000 + "'", int25 == 213120000);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+59:12" + "'", str28, "+59:12");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 26171150);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths((int) '4');
        org.joda.time.LocalDate localDate6 = localDate4.withWeekyear(436);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        int int8 = property7.getMaximumValue();
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 292278993 + "'", int8 == 292278993);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(7);
        int int5 = dateTime4.getMonthOfYear();
        int int6 = dateTime4.getDayOfMonth();
        org.joda.time.DateTime dateTime8 = dateTime4.plusHours(1340);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 24 + "'", int6 == 24);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        java.lang.String str4 = localDate0.toString("2024-01-23");
        org.joda.time.LocalTime localTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDate0.toLocalDateTime(localTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2024-01-23" + "'", str4, "2024-01-23");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay((int) (short) 100, 16, 3, 53);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder0.setInstant((long) 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.yearOfEra();
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField8.set(22L, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=249,ZONE_OFFSET=0,DST_OFFSET=0]", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=249,ZONE_OFFSET=0,DST_OFFSET=0]\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeField dateTimeField3 = chronology1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone4);
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        java.lang.String str12 = property11.getAsText();
        int int13 = property11.get();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        int int16 = property11.compareTo((org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate localDate18 = localDate14.plusWeeks((int) (short) 100);
        int int19 = localDate18.getWeekyear();
        int[] intArray20 = localDate18.getValues();
        // The following exception was thrown during execution in test generation
        try {
            chronology1.validate((org.joda.time.ReadablePartial) localTime5, intArray20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2024 + "'", int19 == 2024);
        org.junit.Assert.assertNotNull(intArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[2024, 1, 25]");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime3.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTime7.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long13 = dateTimeZone8.getMillisKeepLocal(dateTimeZone11, (long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) '4', dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.Instant instant8 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime9, "59", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setExtension('a', "00:16:24.241");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: 00:16:24.241 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter2.print(1646723759380L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Etc/UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long12 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) '4');
        java.lang.String str13 = dateTimeZone10.getID();
        long long17 = dateTimeZone10.convertLocalToUTC(725806296000L, true, 1678173362055L);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+59:12" + "'", str13, "+59:12");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 725593176000L + "'", long17 == 725593176000L);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(23, 1649, 436, (int) (short) 1, 28, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer7 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.minuteOfDay();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((int) (byte) 1, 8, 23, 0, 4, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (org.joda.time.ReadableInstant) dateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime6.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime6.withZone(dateTimeZone19);
        org.joda.time.DateTime.Property property21 = dateTime6.hourOfDay();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.plusWeeks(40319);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9223372036828800000 + 24384931200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(6);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime12 = property11.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField14 = localDateTime12.getField((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(11);
        calendar0.set((int) (short) 1, 34, 435, 435, 5, 67);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.minuteOfDay();
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = locale17.toLanguageTag();
        java.lang.String str19 = locale17.getDisplayVariant();
        java.lang.String str20 = dateTimeField15.getAsText((long) (short) 100, locale17);
        java.util.Set<java.lang.Character> charSet21 = locale17.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap22 = calendar0.getDisplayNames(8, 16, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=18,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en-CA" + "'", str18, "en-CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(charSet21);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        java.util.Locale locale5 = dateTimeFormatter3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.parse("16", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate4.withField(dateTimeFieldType5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = dateTimeFormatter19.parseLocalDate("2022");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 213120000 + "'", int18 == 213120000);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setLanguage("1439");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 1439 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("fr");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder0.setRegion("fr");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setLanguageTag("22");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 22 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        java.lang.StringBuffer stringBuffer20 = null;
        java.lang.Object obj21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj21, dateTimeZone22);
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime23.toMutableDateTime();
        org.joda.time.DateTime dateTime25 = dateTime23.withLaterOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.DateTime dateTime27 = dateTime23.minus(readablePeriod26);
        org.joda.time.DateTime dateTime29 = dateTime27.withMillis(1678173362055L);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer20, (org.joda.time.ReadableInstant) dateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 213120000 + "'", int18 == 213120000);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant10 = org.joda.time.Instant.parse("en-CA", dateTimeFormatter9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        int int8 = dateTime6.getSecondOfDay();
        boolean boolean10 = dateTime6.isBefore(1646723767611L);
        org.joda.time.DateTime dateTime12 = dateTime6.minusHours(2021);
        boolean boolean14 = dateTime12.isBefore(7275600002L);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40319 + "'", int8 == 40319);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime5 = property3.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property3.setCopy((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = dateTimeFormatter2.parseMutableDateTime("Heure de Greenwich");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        boolean boolean2 = localDate0.isSupported(durationFieldType1);
        java.lang.String str4 = localDate0.toString("2022-02-22");
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = localDate0.getFields();
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-22" + "'", str4, "2022-02-22");
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.LocalTime.Property property4 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime6 = localTime2.minusSeconds(15);
        org.joda.time.LocalTime.Property property7 = localTime2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone9);
        org.joda.time.LocalTime localTime12 = localTime10.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        boolean boolean16 = dateTime14.isAfter((long) 2);
        org.joda.time.DateTime dateTime18 = dateTime14.minusDays(1);
        org.joda.time.DateTime dateTime20 = dateTime14.minusHours((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = property7.getDifference((org.joda.time.ReadableInstant) dateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1645447680000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime6.getZone();
        boolean boolean8 = dateTimeZone7.isFixed();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localTime9.getField(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(6);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plus(readablePeriod12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMonthOfYear(14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(28, 40319, 66512921, (int) (byte) 1, (int) (short) -1, 99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(0);
        int int12 = localDateTime11.size();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.minuteOfDay();
        long long21 = chronology15.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField22 = chronology15.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField23 = chronology15.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology15.hourOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter26 = null;
        org.joda.time.format.DateTimeParser dateTimeParser27 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter26, dateTimeParser27);
        java.util.Locale locale29 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter28.withLocale(locale29);
        java.lang.String str31 = dateTimeField24.getAsShortText((int) 'a', locale29);
        java.lang.String str32 = locale29.getDisplayLanguage();
        java.util.Locale.Category category33 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale37 = new java.util.Locale("", "2022", "");
        java.lang.String str39 = locale37.getExtension('x');
        java.util.Locale.setDefault(category33, locale37);
        java.lang.String str41 = locale29.getDisplayScript(locale37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = localDateTime11.toString("1 Jan 1970 00:00:00 GMT", locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 971923363200000L + "'", long21 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "97" + "'", str31, "97");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "French" + "'", str32, "French");
        org.junit.Assert.assertTrue("'" + category33 + "' != '" + java.util.Locale.Category.FORMAT + "'", category33.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale37.toString(), "_2022");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(1649, 100, 26171150, 21, 32769, 66512921, 11, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTime11.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long17 = dateTimeZone12.getMillisKeepLocal(dateTimeZone15, (long) '4');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter4.withZone(dateTimeZone15);
        java.lang.StringBuffer stringBuffer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter18.printTo(stringBuffer19, (long) (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay((int) (short) 100, 16, 3, 53);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder0.setInstant((long) 66514);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate.Property property4 = localDate2.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.minus(readablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate2.withDayOfWeek(213120000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 213120000 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay((int) (short) 100, 16, 3, 53);
        java.util.Date date8 = new java.util.Date(1646723755766L);
        org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) date8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        java.util.Date date12 = localDate10.toDate();
        date12.setMonth(0);
        boolean boolean15 = date8.after(date12);
        java.util.Date date19 = new java.util.Date(24, 51, 2012);
        boolean boolean20 = date12.after(date19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder21 = builder6.setInstant(date12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals(date8.toString(), "Tue Mar 08 07:15:55 GMT 2022");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Jan 24 00:00:00 GMT 2022");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals(date19.toString(), "Tue Oct 03 00:00:00 GMT 1933");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        int int5 = property3.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant6 = new org.joda.time.Instant((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology2.getZone();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField10 = localDate8.getField(26174796);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26174796");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(600032, 6, 13, 436, 34, 3, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 436 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("2022");
        int int8 = timeZone7.getRawOffset();
        timeZone7.setRawOffset(0);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone7);
        java.lang.String str12 = timeZone7.getID();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone("2022");
        timeZone14.setID("French");
        java.util.TimeZone.setDefault(timeZone14);
        boolean boolean18 = timeZone7.hasSameRules(timeZone14);
        calendar5.setTimeZone(timeZone7);
        boolean boolean20 = calendar5.isLenient();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645514194968,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=34,MILLISECOND=968,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645514194968,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=34,MILLISECOND=968,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GMT" + "'", str12, "GMT");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("24");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int16 = localDate14.get(dateTimeFieldType15);
        int int17 = localDate14.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDate14.getValue(26180752);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26180752");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar5.getActualMaximum(55);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645514195777,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=35,MILLISECOND=777,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.setLanguageTag("fr");
        java.util.Locale locale3 = java.util.Locale.KOREAN;
        java.lang.String str4 = locale3.getDisplayVariant();
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        java.util.Locale.Builder builder7 = builder0.setLanguageTag("en-CA");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder10 = builder0.setUnicodeLocaleKeyword("", "GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        java.time.Instant instant3 = calendar2.toInstant();
        calendar2.set(5, 6);
        calendar2.setWeekDate(6, 12, 1);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.setWeekDate(18, 26171150, (-52));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: -52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "en-CA" + "'", str1, "en-CA");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-61971756204073,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=6,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=73,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=35,MILLISECOND=927,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        boolean boolean10 = durationFieldType6.isSupported(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = chronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = chronology8.getZone();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(10, 1970, 34, 52, 59, 52, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("2022-02-24T11:11:59.999+59:12");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-24T11:11:59.999+59:12\" is malformed at \"+59:12\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        java.util.Locale locale6 = new java.util.Locale("hi!", "", "");
        int int7 = dateTimeField2.getMaximumShortTextLength(locale6);
        long long9 = dateTimeField2.roundHalfCeiling((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = dateTimeField2.getType();
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property16 = dateTime15.weekyear();
        int int17 = dateTime15.getYear();
        org.joda.time.DateTime dateTime18 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        boolean boolean21 = localDate19.isSupported(durationFieldType20);
        int int22 = localDate19.size();
        org.joda.time.DateTime dateTime23 = dateTime18.withFields((org.joda.time.ReadablePartial) localDate19);
        java.util.Locale locale27 = new java.util.Locale("hi!", "ISOChronology[UTC]", "2022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDate19, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertEquals(locale27.toString(), "hi!_ISOCHRONOLOGY[UTC]_2022");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(53, (int) (byte) 10, 19059, (int) (byte) 10, 1, 2012);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2012 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = chronology2.monthOfYear();
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        java.lang.String str16 = property15.getAsText();
        int int17 = property15.get();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        int int20 = property15.compareTo((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.LocalDate localDate22 = localDate18.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDate localDate24 = localDate22.plus(readablePeriod23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate22.plus(readablePeriod25);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        int int30 = localDate28.getDayOfWeek();
        org.joda.time.LocalDate localDate32 = localDate28.minusYears(10);
        int[] intArray33 = localDate28.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = dateTimeField9.addWrapField((org.joda.time.ReadablePartial) localDate26, 366, intArray33, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 366");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022" + "'", str16, "2022");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronology29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(intArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[2022, 2, 24]");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        java.lang.String str8 = localDate7.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate7.get(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdayOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "292278994-08-17" + "'", str8, "292278994-08-17");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property5 = localTime0.hourOfDay();
        java.lang.String str6 = property5.getAsShortText();
        org.joda.time.LocalTime localTime7 = property5.getLocalTime();
        org.joda.time.LocalTime localTime9 = property5.setCopy((int) (byte) 1);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.yearOfCentury();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 32769, chronology12);
        org.joda.time.LocalDate localDate16 = localDate14.minusDays(14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = localTime9.isEqual((org.joda.time.ReadablePartial) localDate16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "18" + "'", str6, "18");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusMillis((int) (short) -1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime4.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withMonthOfYear(34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(720024L);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.Instant instant4 = instant1.plus(1646723751922L);
        org.joda.time.DateTime dateTime5 = instant1.toDateTime();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        int int12 = dateTime10.getYear();
        org.joda.time.DateTime dateTime13 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property14 = dateTime13.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone16);
        org.joda.time.LocalTime localTime19 = localTime17.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime17.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime21.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long27 = dateTimeZone22.getMillisKeepLocal(dateTimeZone25, (long) '4');
        org.joda.time.DateTime dateTime28 = dateTime13.toDateTime(dateTimeZone25);
        boolean boolean29 = instant1.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 52L + "'", long27 == 52L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date5 = localDateTime4.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -968 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        java.lang.Appendable appendable6 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYear(22);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withMinuteOfHour(10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable6, (org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(1439, 26182169, 2022, 8, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.parse("24_HI!", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime12.toDateTimeToday(dateTimeZone15);
        int int17 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.DateTime.Property property18 = dateTime6.millisOfSecond();
        org.joda.time.DateTime dateTime19 = property18.withMaximumValue();
        org.joda.time.DateTime dateTime20 = property18.getDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime20.withMonthOfYear(34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("en-ca");
        timeZone1.setID("24_HI!");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer6, (long) 292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        int int4 = timeZone1.getOffset(379209600000L);
        java.time.ZoneId zoneId5 = timeZone1.toZoneId();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone(zoneId5);
        int int7 = timeZone6.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(zoneId5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int int5 = localDate4.getYearOfEra();
        int int6 = localDate4.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localDate4.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2012 + "'", int5 == 2012);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2012 + "'", int6 == 2012);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int16 = localDate14.get(dateTimeFieldType15);
        int int17 = localDate14.getCenturyOfEra();
        org.joda.time.LocalDate.Property property18 = localDate14.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = property18.setCopy(51);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 51 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(59, 12);
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(14, 24, 34320035, 15, 24, 0, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime7 = localTime2.withPeriodAdded(readablePeriod5, 2);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        boolean boolean12 = localDate8.equals((java.lang.Object) 2022);
        java.lang.Object obj13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(obj13, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property18 = dateTime17.weekyear();
        int int19 = dateTime17.getYear();
        org.joda.time.DateTime dateTime20 = dateTime17.withEarlierOffsetAtOverlap();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.hours();
        boolean boolean23 = localDate21.isSupported(durationFieldType22);
        int int24 = localDate21.size();
        org.joda.time.DateTime dateTime25 = dateTime20.withFields((org.joda.time.ReadablePartial) localDate21);
        java.lang.Object obj26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj26, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property31 = dateTime30.weekyear();
        java.lang.String str32 = property31.getAsText();
        org.joda.time.DurationField durationField33 = property31.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property31.getFieldType();
        java.lang.String str35 = dateTimeFieldType34.toString();
        boolean boolean36 = dateTime20.isSupported(dateTimeFieldType34);
        int int37 = localDate8.indexOf(dateTimeFieldType34);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = localTime7.get(dateTimeFieldType34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2022" + "'", str32, "2022");
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "weekyear" + "'", str35, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-22");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-22T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-22t23:59:59.999z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths((int) '4');
        org.joda.time.LocalDate localDate6 = localDate4.withWeekyear(436);
        org.joda.time.LocalDate localDate8 = localDate6.withWeekOfWeekyear(51);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        int int11 = dateTime6.getMillisOfDay();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40319999 + "'", int11 == 40319999);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDateTime6.getValue(59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        boolean boolean14 = localDate12.equals((java.lang.Object) 0);
        org.joda.time.LocalDate localDate16 = localDate12.minusYears(32769);
        int int17 = localDate12.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate12.withDayOfYear(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDate16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (short) -1, 0, 13, 40320032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField10 = localDateTime4.getField(40319);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 40319");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.LocalDateTime localDateTime11 = property8.addWrapFieldToCopy(1);
        org.joda.time.Chronology chronology12 = localDateTime11.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(7, (int) 'a', (int) '#', 28, 11, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = chronology2.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology2.getDateTimeMillis((long) 435, 34, 53, 66514657, 35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(38, (-1), 23, 122, 99, 17, 86399, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = dateTimeFormatter2.parseLocalDate("10");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        java.util.Calendar calendar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = gregorianCalendar7.compareTo(calendar16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(0L);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis((-1));
        java.util.Locale locale5 = java.util.Locale.CHINESE;
        java.util.Locale locale6 = java.util.Locale.CHINESE;
        java.lang.String str7 = locale5.getDisplayCountry(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localTime3.toString("Property[weekOfWeekyear]", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(0);
        int int12 = localDateTime11.size();
        int int13 = localDateTime11.getEra();
        int int14 = localDateTime11.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withDayOfYear((-52));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -52 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DurationField durationField5 = chronology2.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.lang.String[] strArray22 = new java.lang.String[] { "0", "16", "French", "1 Jan 1970 00:00:00 GMT", "22", "1", "1439", "French", "weekyear", "zho", "97", "2024-01-23", "zho", "Etc/UTC", "2 Dec 3921 00:00:00 GMT", "centuries", "Property[weekyear]", "24", "Etc/UTC", "GMT", "centuries", "24" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        strSet23.clear();
        org.joda.time.Interval[] intervalArray26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval[] intervalArray27 = strSet23.toArray(intervalArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = property14.setCopy(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        org.joda.time.DateTime.Property property11 = dateTime10.minuteOfHour();
        org.joda.time.DateTime dateTime12 = property11.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.plus(readableDuration13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime12.withDayOfWeek(8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        long long6 = durationField3.subtract((-1893235578000L), (long) 'x');
        long long9 = durationField3.add(5555757909L, (long) 34);
        long long12 = durationField3.getValueAsLong(971923363200000L, 720024L);
        java.lang.String str13 = durationField3.getName();
        java.lang.String str14 = durationField3.toString();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-5679974778000L) + "'", long6 == (-5679974778000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1078557357909L + "'", long9 == 1078557357909L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 30799L + "'", long12 == 30799L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "years" + "'", str13, "years");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "DurationField[years]" + "'", str14, "DurationField[years]");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        gregorianCalendar7.roll(100, (int) (short) 0);
        gregorianCalendar7.set(1439, (int) (byte) 100, 12);
        java.time.Instant instant23 = gregorianCalendar7.toInstant();
        java.util.Date date25 = new java.util.Date(1646723755766L);
        gregorianCalendar7.setTime(date25);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology29 = localDate28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.minuteOfDay();
        boolean boolean31 = durationFieldType27.isSupported(chronology29);
        org.joda.time.DateTimeField dateTimeField32 = chronology29.millisOfSecond();
        boolean boolean33 = gregorianCalendar7.equals((java.lang.Object) dateTimeField32);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Mar 08 07:15:55 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        java.util.Date date2 = localDate0.toDate();
        date2.setMonth(0);
        int int5 = date2.getDay();
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = dateTime8.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime13 = dateTime8.toLocalDateTime();
        org.joda.time.Chronology chronology14 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) int5, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Jan 24 00:00:00 GMT+00:00 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone1);
        java.lang.String str6 = timeZone1.getID();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        long long14 = chronology8.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField15 = chronology8.minuteOfHour();
        org.joda.time.DurationField durationField16 = chronology8.millis();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.hourOfHalfday();
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale19.toLanguageTag();
        java.lang.String str21 = dateTimeField17.getAsShortText((int) (byte) 10, locale19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone1, locale19);
        boolean boolean23 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645514200664,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=40,MILLISECOND=664,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GMT" + "'", str6, "GMT");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 971923363200000L + "'", long14 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "en-CA" + "'", str20, "en-CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1645514200664,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=40,MILLISECOND=664,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime3.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTime7.getZone();
        boolean boolean9 = localTime0.equals((java.lang.Object) dateTimeZone8);
        int int10 = localTime0.getMillisOfDay();
        org.joda.time.LocalTime.Property property11 = localTime0.millisOfSecond();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = property11.setCopy("Property[dayOfYear]", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[dayOfYear]\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 66520756 + "'", int10 == 66520756);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter4.getPrinter();
        int int21 = dateTimeFormatter4.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = dateTimeFormatter4.print((long) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 213120000 + "'", int18 == 213120000);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertNull(dateTimePrinter20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2000 + "'", int21 == 2000);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYearOfCentury(34);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withYear(32770);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withSecondOfMinute(4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusWeeks((int) 'a');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withYearOfCentury(26174796);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26174796 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(2022);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime6 = localTime3.withFieldAdded(durationFieldType4, (int) 'u');
        org.joda.time.LocalTime localTime8 = localTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalTime.Property property9 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime11 = localTime3.withMillisOfSecond(6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localTime3.getValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("1", (double) 1646723788832L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.646723788832E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.Locale locale3 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withLocale(locale3);
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter4.getZone();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withDefaultYear(26171150);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.minus(readablePeriod10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime11.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = dateTimeFormatter4.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime12, "era", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        java.util.Locale locale6 = new java.util.Locale("hi!", "", "");
        int int7 = dateTimeField2.getMaximumShortTextLength(locale6);
        boolean boolean8 = dateTimeField2.isSupported();
        java.util.Locale locale10 = java.util.Locale.JAPAN;
        java.lang.String str11 = dateTimeField2.getAsText(0L, locale10);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeField2.set(61596547200000L, "1 Jan 1970 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1 Jan 1970 00:00:00 GMT\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals(locale6.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalTime.Property property5 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime7 = property5.addCopy(8);
        org.joda.time.LocalTime localTime8 = property5.withMinimumValue();
        java.lang.String str9 = localTime8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime8.withMinuteOfHour(66512921);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 66512921 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00:28:41.370" + "'", str9, "00:28:41.370");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) 2);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(1);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(obj11, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((int) (byte) 10);
        boolean boolean16 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone18);
        org.joda.time.LocalTime localTime21 = localTime19.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime19.toDateTimeToday(dateTimeZone22);
        int int24 = dateTime23.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int26 = dateTime23.get(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone28);
        org.joda.time.LocalTime localTime31 = localTime29.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localTime29.toDateTimeToday(dateTimeZone32);
        int int34 = dateTime23.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTime.Property property35 = dateTime23.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime23.withZone(dateTimeZone36);
        int int38 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime dateTime40 = dateTime37.withMillis((long) (byte) 1);
        int int41 = dateTime37.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean43 = dateTime37.isSupported(dateTimeFieldType42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime45 = dateTime37.withEra((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 22 + "'", int26 == 22);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear(22);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMinuteOfHour((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays(6);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withYearOfEra(366);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusYears(22);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusMillis(360);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((java.lang.Object) localDateTime16, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        long long6 = java.util.Date.UTC((int) (byte) 0, 0, 34, (int) (byte) 10, 40319999, (-292275054));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-79176714000L) + "'", long6 == (-79176714000L));
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str2 = dateTimeZone0.getNameKey(0L);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMinuteOfHour(26162278);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26162278 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.era();
        boolean boolean13 = property12.isLeap();
        int int14 = property12.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime16 = property12.addWrapFieldToCopy((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        timeZone1.setID("");
        boolean boolean7 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.lang.String[] strArray19 = new java.lang.String[] { "22", "", "22", "en-CA", "16", "16", "French", "1", "en-CA", "24", "0", "en-CA", "hi!", "1", "2022", "zho", "0", "", "ISOChronology[UTC]" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.Locale.LanguageRange[] languageRangeArray22 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList23 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList23, languageRangeArray22);
        java.util.Locale[] localeArray25 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList26 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList26, localeArray25);
        java.util.Locale.FilteringMode filteringMode28 = null;
        java.util.List<java.util.Locale> localeList29 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList23, (java.util.Collection<java.util.Locale>) localeList26, filteringMode28);
        boolean boolean30 = strSet20.removeAll((java.util.Collection<java.util.Locale>) localeList26);
        boolean boolean31 = strSet20.isEmpty();
        boolean boolean32 = strSet20.isEmpty();
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(languageRangeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localeList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(15, 24, 21, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("1970");
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj2, dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.weekyear();
        long long8 = dateTime6.getMillis();
        boolean boolean9 = locale1.equals((java.lang.Object) dateTime6);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1646723802262L + "'", long8 == 1646723802262L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withHourOfDay(26171150);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26171150 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(0);
        timeZone1.setRawOffset((int) '4');
        java.lang.String str7 = timeZone1.getID();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = timeZone1.getOffset(51, (int) (short) 1, 1439, 11, 86399, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GMT" + "'", str7, "GMT");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.LocalDateTime localDateTime5 = property3.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = property3.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusSeconds(11);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMinuteOfHour(21);
        java.util.Date date12 = new java.util.Date((long) 435);
        int int13 = date12.getHours();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.fromDateFields(date12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDate14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = property5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate12 = localDate8.plusWeeks((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.plus(readablePeriod13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int16 = localDate14.get(dateTimeFieldType15);
        java.lang.String str18 = localDate14.toString("24");
        org.joda.time.DateMidnight dateMidnight19 = localDate14.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType21 = localDate14.getFieldType(455544);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 455544");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 24 + "'", int16 == 24);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "24" + "'", str18, "24");
        org.junit.Assert.assertNotNull(dateMidnight19);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology1.getDateTimeMillis(82800000, 18, (int) (byte) 1, (int) (short) 0, (int) (short) -1, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.tz.NameProvider nameProvider5 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.minuteOfDay();
        java.util.Locale locale12 = new java.util.Locale("hi!", "", "");
        int int13 = dateTimeField8.getMaximumShortTextLength(locale12);
        java.lang.String str16 = nameProvider5.getName(locale12, "24", "yearOfCentury");
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = locale17.toLanguageTag();
        java.lang.String str19 = locale17.getDisplayVariant();
        java.lang.String str22 = nameProvider5.getShortName(locale17, "Property[weekyear]", "10");
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = locale23.toLanguageTag();
        java.lang.String str25 = locale23.getDisplayVariant();
        java.lang.String str28 = nameProvider5.getShortName(locale23, "1", "2022-02-22");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = localTime2.toString("ISOChronology[UTC]", locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(nameProvider5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals(locale12.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en-CA" + "'", str18, "en-CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "en-CA" + "'", str24, "en-CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.util.Locale locale7 = java.util.Locale.PRC;
        org.joda.time.DateTime dateTime8 = property5.setCopy("0", locale7);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = calendar9.get(40319999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 40319999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645514202720,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"French\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=16,SECOND=42,MILLISECOND=720,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean2 = false; // flaky: strSet0.remove((java.lang.Object) (-5679974778000L));
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        java.lang.String str4 = chronology1.toString();
        org.joda.time.DurationField durationField5 = chronology1.weeks();
        org.joda.time.DurationField durationField6 = chronology1.eras();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar7 = dateTime6.toGregorianCalendar();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        int int10 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate8.minusYears(10);
        int[] intArray13 = localDate8.getValues();
        org.joda.time.LocalDate.Property property14 = localDate8.era();
        boolean boolean15 = gregorianCalendar7.before((java.lang.Object) property14);
        gregorianCalendar7.roll(100, (int) (short) 0);
        gregorianCalendar7.set(1439, (int) (byte) 100, 12);
        java.time.Instant instant23 = gregorianCalendar7.toInstant();
        java.util.Date date25 = new java.util.Date(1646723755766L);
        gregorianCalendar7.setTime(date25);
        java.lang.String str27 = gregorianCalendar7.toString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(gregorianCalendar7);
        org.junit.Assert.assertNotNull(chronology9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertEquals(date25.toString(), "Tue Mar 08 07:15:55 GMT+00:00 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "java.util.GregorianCalendar[time=1646723755766,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=67,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=15,SECOND=55,MILLISECOND=766,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str27, "java.util.GregorianCalendar[time=1646723755766,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=67,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=15,SECOND=55,MILLISECOND=766,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.parse("clockhourOfDay", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.era();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime10 = property8.getLocalDateTime();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.weekyear();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        int int18 = localDate16.getDayOfWeek();
        org.joda.time.LocalDate localDate20 = localDate16.minusYears(10);
        int[] intArray21 = localDate16.getValues();
        org.joda.time.LocalDate.Property property22 = localDate16.era();
        org.joda.time.LocalDate localDate24 = localDate16.minusYears(2012);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDate localDate26 = localDate16.plus(readablePeriod25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        int int29 = localDate27.getDayOfWeek();
        org.joda.time.LocalDate localDate31 = localDate27.minusYears(10);
        int[] intArray32 = localDate27.getValues();
        int int33 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDate26, intArray32);
        java.util.Locale locale35 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = dateTimeField4.set((org.joda.time.ReadablePartial) localDateTime10, (int) (byte) 0, intArray32, "Greenwich Mean Time", locale35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Greenwich Mean Time\" for clockhourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(chronology17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(intArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronology28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(intArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[2022, 2, 24]");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 292278993 + "'", int33 == 292278993);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_CA");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = property5.getMaximumValue();
        org.joda.time.DateTime dateTime7 = property5.roundCeilingCopy();
        org.joda.time.DateTime dateTime9 = property5.addWrapFieldToCopy((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime9.withDate((int) '4', 435, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 435 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 292278993 + "'", int6 == 292278993);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime2.minusDays((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime7 = dateTime2.toLocalDateTime();
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.minusSeconds(292278993);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusSeconds(292278993);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withMillisOfSecond(2012);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2012 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 43 + "'", int8 == 43);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        java.lang.String str21 = dateTimeZone13.getShortName((long) 10);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone13);
        java.util.TimeZone timeZone23 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime26 = dateTime24.withYearOfEra(66512921);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone28);
        org.joda.time.LocalTime localTime31 = localTime29.plusSeconds((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime34 = localTime29.withPeriodAdded(readablePeriod32, 2);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalTime localTime37 = localTime29.withPeriodAdded(readablePeriod35, 2024);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int39 = localTime29.indexOf(dateTimeFieldType38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime41 = dateTime24.withField(dateTimeFieldType38, (-51));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -51 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 213120000 + "'", int18 == 213120000);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+59:12" + "'", str21, "+59:12");
        org.junit.Assert.assertNotNull(timeZone23);
// flaky:         org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("292278994-08-17");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"292278994-08-17\" is malformed at \"2278994-08-17\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1L));
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(2022);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime6 = localTime3.withFieldAdded(durationFieldType4, (int) 'u');
        org.joda.time.LocalTime localTime8 = localTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalTime.Property property9 = localTime3.millisOfDay();
        org.joda.time.DateTime dateTime10 = localTime3.toDateTimeToday();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.plus(readableDuration11);
        org.joda.time.DateTime dateTime14 = dateTime10.withMillisOfDay(1340);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime14.withDate((int) (byte) -1, (-1), 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.lang.Object[] objArray1 = strSet0.toArray();
        java.util.Collection<java.util.Locale> localeCollection2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = strSet0.containsAll(localeCollection2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[]");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withTime(33, 1970, 600032, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 33 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2022 + "'", int1 == 2022);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long7 = chronology1.getDateTimeMillis(32769, 1, (int) (byte) 10, 0);
        org.joda.time.DateTimeField dateTimeField8 = chronology1.minuteOfHour();
        org.joda.time.DurationField durationField9 = chronology1.millis();
        org.joda.time.DateTimeField dateTimeField10 = chronology1.hourOfHalfday();
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = locale12.toLanguageTag();
        java.lang.String str14 = dateTimeField10.getAsShortText((int) (byte) 10, locale12);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeField10.set((long) 2024, 28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 971923363200000L + "'", long7 == 971923363200000L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en-CA" + "'", str13, "en-CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate8 = localDate0.minusYears(2012);
        int int9 = localDate8.getEra();
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(2);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.clockhourOfDay();
        java.lang.String str6 = dateTimeField4.getAsShortText((long) 32769);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.minusMillis(0);
        org.joda.time.LocalTime localTime11 = localTime9.minusHours((int) ' ');
        org.joda.time.Chronology chronology12 = localTime9.getChronology();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.weekyear();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        int int20 = localDate18.getDayOfWeek();
        org.joda.time.LocalDate localDate22 = localDate18.minusYears(10);
        int[] intArray23 = localDate18.getValues();
        org.joda.time.LocalDate.Property property24 = localDate18.era();
        org.joda.time.LocalDate localDate26 = localDate18.minusYears(2012);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate18.plus(readablePeriod27);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        int int31 = localDate29.getDayOfWeek();
        org.joda.time.LocalDate localDate33 = localDate29.minusYears(10);
        int[] intArray34 = localDate29.getValues();
        int int35 = dateTimeField17.getMaximumValue((org.joda.time.ReadablePartial) localDate28, intArray34);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray37 = dateTimeField4.set((org.joda.time.ReadablePartial) localTime9, (int) '4', intArray34, 26171150);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26171150 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "24" + "'", str6, "24");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(intArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(chronology30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(intArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[2022, 2, 24]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 292278993 + "'", int35 == 292278993);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusYears(10);
        int[] intArray5 = localDate0.getValues();
        org.joda.time.LocalDate.Property property6 = localDate0.era();
        org.joda.time.LocalDate localDate7 = property6.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property6.addWrapFieldToCopy((-292275054));
        java.lang.Object obj10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj10, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        java.util.Locale locale17 = java.util.Locale.PRC;
        org.joda.time.DateTime dateTime18 = property15.setCopy("0", locale17);
        int int19 = dateTime18.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = property6.getDifference((org.joda.time.ReadableInstant) dateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(intArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear(2024);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.parse("years", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        java.lang.String str10 = property9.getAsText();
        org.joda.time.DurationField durationField11 = property9.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property9.getFieldType();
        int int13 = dateTime3.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime15 = dateTime3.minusMinutes((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = dateTime3.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = property17.setCopy(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022" + "'", str10, "2022");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.LocalDate.Property property4 = localDate2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = property4.setCopy((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes(12);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusDays(100);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime11.getFieldType(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2022");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime9.toDateTimeToday(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime13.getZone();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes((int) (short) 100);
        int int19 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime4.withZoneRetainFields(dateTimeZone14);
        org.joda.time.DateTime dateTime22 = dateTime20.plusMonths((int) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.withMillis(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime22.withMonthOfYear(26180752);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26180752 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646723804773L + "'", long6 == 1646723804773L);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 213120000 + "'", int19 == 213120000);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(66514147, 15, 2022, 600032, 16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600032 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        org.joda.time.DateTime dateTime7 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.DateTime dateTime12 = dateTime4.minusMillis(4);
        int int13 = dateTime4.getMonthOfYear();
        org.joda.time.DateTime dateTime15 = dateTime4.withYearOfEra((int) '#');
        org.joda.time.DateTime.Property property16 = dateTime4.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = property16.addToCopy(5555754128L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime11.toDateTimeToday(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime15.getZone();
        boolean boolean17 = localTime8.equals((java.lang.Object) dateTimeZone16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 26180752, dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(40320032, 436, 26176839, 600032, 20, 16, (int) (byte) 100, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600032 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.minuteOfDay();
        java.lang.String str4 = chronology1.toString();
        org.joda.time.DateTimeField dateTimeField5 = chronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = chronology1.get(readablePeriod6, 1646723785186L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[UTC]" + "'", str4, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(11);
        calendar0.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("2022");
        int int12 = timeZone11.getRawOffset();
        calendar0.setTimeZone(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours(23);
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        boolean boolean17 = timeZone11.hasSameRules(timeZone16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = timeZone16.getDisplayName(false, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=549,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "GMT+23:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum(11);
        calendar0.set((int) (short) 1, 34, 435, 435, 5, 67);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("2022");
        int int12 = timeZone11.getRawOffset();
        calendar0.setTimeZone(timeZone11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calendar0.getActualMaximum(455544);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 455544");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=34,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=435,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=7,HOUR_OF_DAY=435,MINUTE=5,SECOND=67,MILLISECOND=615,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime12.getZone();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) (short) 100);
        int int18 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter4.withZone(dateTimeZone13);
        java.lang.String str21 = dateTimeZone13.getShortName((long) 10);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone13);
        long long24 = dateTimeZone13.previousTransition((-1893235578000L));
        long long28 = dateTimeZone13.convertLocalToUTC(1646723775598L, false, 379209600000L);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 213120000 + "'", int18 == 213120000);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+59:12" + "'", str21, "+59:12");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1893235578000L) + "'", long24 == (-1893235578000L));
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1646510655598L + "'", long28 == 1646510655598L);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.LocalDateTime localDateTime6 = property3.addWrapFieldToCopy(1);
        org.joda.time.Chronology chronology7 = localDateTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology7.getDateTimeMillis(2340008L, 26174796, (int) (short) 1, 366, 122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26174796 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(0L);
        org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute(53);
        java.lang.Object obj4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(obj4, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property9 = dateTime8.weekyear();
        org.joda.time.DateTime dateTime10 = property9.roundCeilingCopy();
        java.util.GregorianCalendar gregorianCalendar11 = dateTime10.toGregorianCalendar();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        int int14 = localDate12.getDayOfWeek();
        org.joda.time.LocalDate localDate16 = localDate12.minusYears(10);
        int[] intArray17 = localDate12.getValues();
        org.joda.time.LocalDate.Property property18 = localDate12.era();
        boolean boolean19 = gregorianCalendar11.before((java.lang.Object) property18);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar) gregorianCalendar11);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localTime3.compareTo((org.joda.time.ReadablePartial) localDate20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
        org.junit.Assert.assertNotNull(chronology13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(intArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[2022, 2, 24]");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime(chronology7);
        int int9 = dateTime6.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withMillisOfSecond((int) (byte) 1);
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        int int23 = dateTime13.get(dateTimeFieldType22);
        java.lang.String str24 = dateTimeFieldType22.getName();
        org.joda.time.DateTime dateTime26 = dateTime6.withField(dateTimeFieldType22, 26171150);
        java.lang.Object obj27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(obj27, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = dateTime29.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property32 = dateTime31.weekyear();
        long long33 = dateTime31.getMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone35);
        org.joda.time.LocalTime localTime38 = localTime36.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = localTime36.toDateTimeToday(dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTime40.getZone();
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DateTime dateTime45 = dateTime43.minusMinutes((int) (short) 100);
        int int46 = dateTimeZone41.getOffset((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime dateTime47 = dateTime31.withZoneRetainFields(dateTimeZone41);
        java.lang.String str48 = dateTimeZone41.getID();
        org.joda.time.DateTime dateTime49 = dateTime26.toDateTime(dateTimeZone41);
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.now(dateTimeZone41);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022" + "'", str20, "2022");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "weekyear" + "'", str24, "weekyear");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1646723805916L + "'", long33 == 1646723805916L);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 213120000 + "'", int46 == 213120000);
        org.junit.Assert.assertNotNull(dateTime47);
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+59:12" + "'", str48, "+59:12");
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(localTime50);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022");
        timeZone1.setID("French");
        int int4 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) ' ', dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        long long6 = dateTimeField4.remainder((long) 21);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeField4.set((-2158237116000L), 2021);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2021 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 62135596800021L + "'", long6 == 62135596800021L);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        boolean boolean1 = locale0.hasExtensions();
        java.lang.Object obj2 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "zh_CN");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "zh_CN");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "zh_CN");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = chronology1.weeks();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.millis();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        int int7 = localDate4.size();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.minuteOfDay();
        java.lang.String str9 = chronology6.toString();
        org.joda.time.DateTimeField dateTimeField10 = chronology6.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = chronology6.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(122, 24, (int) (short) 1, 0, 67, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 67 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[UTC]" + "'", str9, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime6 = property5.roundCeilingCopy();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        boolean boolean8 = durationField7.isSupported();
        long long11 = durationField7.add(0L, 0);
        long long14 = durationField7.add(1646723762055L, 1L);
        long long17 = durationField7.getMillis(2024, (long) 86399);
        int int20 = durationField7.getDifference(31556952000L, 1646723770045L);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = durationField7.getMillis(1017118800002L, (-2158237116000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1017118800002");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1678173362055L + "'", long14 == 1678173362055L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 63871718400000L + "'", long17 == 63871718400000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-51) + "'", int20 == (-51));
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.minusMonths(32770);
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withCenturyOfEra((int) ' ');
        java.lang.Object obj14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(obj14, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property19 = dateTime18.weekyear();
        java.lang.String str20 = property19.getAsText();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        java.lang.String str23 = dateTimeFieldType22.toString();
        boolean boolean24 = dateTime13.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate.Property property25 = localDate0.property(dateTimeFieldType22);
        org.joda.time.DateTimeField dateTimeField26 = property25.getField();
        int int28 = dateTimeField26.getLeapAmount((long) 2012);
        boolean boolean29 = dateTimeField26.isLenient();
        org.junit.Assert.assertNotNull(chronology1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022" + "'", str20, "2022");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "weekyear" + "'", str23, "weekyear");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }
}
