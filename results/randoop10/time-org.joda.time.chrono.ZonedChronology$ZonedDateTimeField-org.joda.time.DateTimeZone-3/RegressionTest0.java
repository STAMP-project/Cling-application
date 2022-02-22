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
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
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
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDate0.getValue(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2022");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        int int3 = localDate2.getDayOfWeek();
        int[] intArray10 = new int[] { (short) 0, (short) -1, 'a', 86399, (byte) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            chronology1.validate((org.joda.time.ReadablePartial) localDate2, intArray10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1, 97, 86399, 1, 1]");
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime2.withYearOfCentury((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) (byte) 10, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
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
        int[] intArray20 = new int[] { (byte) 100, (-1), (byte) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = dateTimeField3.set((org.joda.time.ReadablePartial) localDate12, 86399, intArray20, 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 86399");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, -1, 0, 0]");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = chronology1.getDateTimeMillis((int) (short) 1, (int) (byte) -1, 2022, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localDate0.getFieldType(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
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
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
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
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        long long6 = java.util.Date.UTC((int) 'a', 0, 86399, (int) (short) 0, 36, 2022);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 8316868182000L + "'", long6 == 8316868182000L);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
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
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfDay();
        boolean boolean12 = durationFieldType8.isSupported(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.yearOfEra();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        int int15 = localDate14.getDayOfWeek();
        org.joda.time.LocalDate localDate17 = localDate14.withDayOfWeek(1);
        java.util.Locale locale21 = new java.util.Locale("hi!", "", "");
        java.lang.String str22 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDate17, locale21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = property5.setCopy("hi!", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2022" + "'", str22, "2022");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        java.util.Locale locale9 = new java.util.Locale("hi!", "", "");
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeField3.set((long) (short) 10, "", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        int int3 = localTime2.getSecondOfMinute();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        boolean boolean8 = durationFieldType4.isSupported(chronology6);
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
        int[] intArray25 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology6.validate((org.joda.time.ReadablePartial) localDate17, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((java.lang.Object) localTime2, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022" + "'", str15, "2022");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32769, 2, 22, 100, 22]");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("hi!", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        int int6 = localTime4.getValue(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime4.withHourOfDay(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
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
        org.joda.time.DateTime dateTime19 = dateTime6.minusMinutes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for minuteOfHour must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone3);
        org.joda.time.LocalTime localTime6 = localTime4.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localTime4.toDateTimeToday(dateTimeZone7);
        boolean boolean10 = dateTime8.isAfter((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime8.minusDays(0);
        org.joda.time.DateTime dateTime14 = dateTime8.minusHours((int) (byte) 1);
        boolean boolean15 = date0.equals((java.lang.Object) dateTime14);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:53:45 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(86399, (int) (short) 10, (int) (byte) 0, 25, 21, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "");
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Locale.setDefault(locale3);
        java.lang.Object obj6 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "hi!");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("years", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localTime10.toString(dateTimeFormatter11);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.minuteOfDay();
        boolean boolean18 = durationFieldType14.isSupported(chronology16);
        org.joda.time.DateTimeField dateTimeField19 = chronology16.yearOfEra();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        int int21 = localDate20.getDayOfWeek();
        org.joda.time.LocalDate localDate23 = localDate20.withDayOfWeek(1);
        java.util.Locale locale27 = new java.util.Locale("hi!", "", "");
        java.lang.String str28 = dateTimeField19.getAsShortText((org.joda.time.ReadablePartial) localDate23, locale27);
        int[] intArray29 = localDate23.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = dateTimeField5.add((org.joda.time.ReadablePartial) localTime10, 3, intArray29, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00:01:36.999" + "'", str12, "00:01:36.999");
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertEquals(locale27.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2022" + "'", str28, "2022");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[2022, 2, 21]");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("hours", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate0.withDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        java.util.Locale locale16 = new java.util.Locale("hi!", "", "");
        java.lang.String str17 = locale16.getDisplayScript();
        java.util.Locale.setDefault(locale16);
        java.lang.String str19 = locale16.getDisplayLanguage();
        java.util.Locale locale23 = new java.util.Locale("hi!", "", "");
        java.lang.String str24 = locale23.getDisplayScript();
        java.util.Locale.setDefault(locale23);
        java.lang.String str26 = locale23.getDisplayLanguage();
        java.lang.String str27 = locale16.getDisplayName(locale23);
        java.lang.String str28 = timeZone11.getDisplayName(locale23);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals(locale16.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coordinated Universal Time" + "'", str28, "Coordinated Universal Time");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = chronology2.halfdays();
        org.joda.time.DurationField durationField7 = chronology2.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField7.add((long) 59, 1646664827245L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 164666482724500");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
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
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withDate(100, 100, 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664827772L + "'", long6 == 1646664827772L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        java.lang.String str12 = timeZone11.getDisplayName();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coordinated Universal Time" + "'", str12, "Coordinated Universal Time");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("DateTimeField[dayOfYear]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localTime0.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53628075 + "'", int5 == 53628075);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.util.Date date3 = new java.util.Date(7, (int) (byte) -1, 32769);
        java.lang.Object obj4 = date3.clone();
        org.junit.Assert.assertEquals(date3.toString(), "Sun Aug 18 00:00:00 UTC 1996");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "Sun Aug 18 00:00:00 UTC 1996");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "Sun Aug 18 00:00:00 UTC 1996");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "Sun Aug 18 00:00:00 UTC 1996");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
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
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMonthOfYear(2);
        org.joda.time.DurationFieldType durationFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withFieldAdded(durationFieldType15, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664828454L + "'", long6 == 1646664828454L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        boolean boolean3 = dateTime2.isBeforeNow();
        long long4 = dateTime2.getMillis();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645455228738L + "'", long4 == 1645455228738L);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.DurationField durationField8 = property5.getLeapDurationField();
        org.joda.time.DateTime dateTime9 = property5.roundFloorCopy();
        org.joda.time.DurationField durationField10 = property5.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNull(durationField10);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology5 = chronology1.withZone(dateTimeZone4);
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        boolean boolean7 = dateTimeZone4.equals((java.lang.Object) locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale6.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        org.joda.time.LocalDate.Property property15 = localDate9.dayOfWeek();
        org.joda.time.LocalDate localDate16 = property15.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = property15.setCopy("hours");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hours\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMonthOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664829006L + "'", long6 == 1646664829006L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = localDate0.isBefore((org.joda.time.ReadablePartial) localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField10 = chronology8.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((int) (short) 100, 8, (int) (byte) 10, (int) '#', (int) (short) 100, (int) (byte) 0, 0, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int3 = localDate0.indexOf(dateTimeFieldType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDate0.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
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
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withTime((int) 'a', 21, (int) (short) 100, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664829397L + "'", long6 == 1646664829397L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
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
        int[] intArray21 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology2.validate((org.joda.time.ReadablePartial) localDate13, intArray21);
        org.joda.time.DateTimeField dateTimeField23 = chronology2.clockhourOfHalfday();
        java.lang.Object obj24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(obj24, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property29 = dateTime28.weekyear();
        long long30 = dateTime28.getMillis();
        org.joda.time.DateTime dateTime32 = dateTime28.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime34 = org.joda.time.DateTime.now(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime32, dateTimeZone33);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.withMonthOfYear(2);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.minusMinutes((int) '4');
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology44 = localDate43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = chronology44.minuteOfDay();
        boolean boolean46 = durationFieldType42.isSupported(chronology44);
        org.joda.time.DateTimeField dateTimeField47 = chronology44.yearOfEra();
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate();
        int int49 = localDate48.getDayOfWeek();
        org.joda.time.LocalDate localDate51 = localDate48.withDayOfWeek(1);
        java.util.Locale locale55 = new java.util.Locale("hi!", "", "");
        java.lang.String str56 = dateTimeField47.getAsShortText((org.joda.time.ReadablePartial) localDate51, locale55);
        int[] intArray57 = localDate51.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray59 = dateTimeField23.add((org.joda.time.ReadablePartial) localDateTime38, 32769, intArray57, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1646664829653L + "'", long30 == 1646664829653L);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertEquals(locale55.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "2022" + "'", str56, "2022");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[2022, 2, 21]");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        int int5 = localTime0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localTime0.getValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(86399);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime4.withTime(8, 70, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        org.joda.time.DurationField durationField4 = chronology2.months();
        org.joda.time.DurationField durationField5 = durationFieldType0.getField(chronology2);
        org.joda.time.DateTimeField dateTimeField6 = chronology2.minuteOfHour();
        java.lang.String str7 = chronology2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = chronology2.getDateTimeMillis((int) (short) 0, 0, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[UTC]" + "'", str7, "ISOChronology[UTC]");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.LocalDate localDate2 = property1.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate2.getFieldType(893);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 893");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getDate();
        java.util.Date date7 = new java.util.Date(4, 0, 9, (int) 'a', 53626437);
        int int8 = date0.compareTo(date7);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:53:50 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertEquals(date7.toString(), "Wed Dec 28 14:57:00 UTC 2005");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        int int16 = dateTime4.get(dateTimeField15);
        long long19 = dateTimeField15.set((long) (byte) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = dateTimeField15.add((long) 8, 1646664827830L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1646664827830");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664830614L + "'", long6 == 1646664830614L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022" + "'", str13, "2022");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-61851081600001L) + "'", long19 == (-61851081600001L));
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.minusMillis(0);
        boolean boolean10 = property5.equals((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property5.addToCopy(1646664830462L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1646664830462");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        int int16 = dateTime4.get(dateTimeField15);
        long long19 = dateTimeField15.set((long) (byte) -1, (int) (short) 10);
        java.lang.Object obj20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj20, dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property25 = dateTime24.weekyear();
        long long26 = dateTime24.getMillis();
        org.joda.time.DateTime dateTime28 = dateTime24.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime28, dateTimeZone29);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology34 = localDate33.getChronology();
        org.joda.time.DateTimeField dateTimeField35 = chronology34.yearOfCentury();
        java.lang.Object obj36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime(obj36, dateTimeZone37);
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime38.toMutableDateTime();
        int int40 = dateTime38.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay41 = dateTime38.toYearMonthDay();
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology45 = localDate44.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = chronology45.minuteOfDay();
        boolean boolean47 = durationFieldType43.isSupported(chronology45);
        java.lang.Object obj48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(obj48, dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime50.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property53 = dateTime52.weekyear();
        java.lang.String str54 = property53.getAsText();
        int int55 = property53.get();
        org.joda.time.LocalDate localDate56 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology57 = localDate56.getChronology();
        int int58 = property53.compareTo((org.joda.time.ReadablePartial) localDate56);
        int[] intArray64 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology45.validate((org.joda.time.ReadablePartial) localDate56, intArray64);
        int[] intArray67 = dateTimeField35.set((org.joda.time.ReadablePartial) yearMonthDay41, (int) (byte) 0, intArray64, 16);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray69 = dateTimeField15.addWrapPartial((org.joda.time.ReadablePartial) localDateTime31, 20, intArray67, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664831020L + "'", long6 == 1646664831020L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022" + "'", str13, "2022");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-61851081600001L) + "'", long19 == (-61851081600001L));
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1646664831020L + "'", long26 == 1646664831020L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 22 + "'", int40 == 22);
        org.junit.Assert.assertNotNull(yearMonthDay41);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2022" + "'", str54, "2022");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2022 + "'", int55 == 2022);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[16, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[16, 2, 22, 100, 22]");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (short) 10, 59, 14, 53626437, 53625652, 48, 53626437);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626437 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate3 = localDate0.withDayOfWeek(1);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(1);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.hours();
        boolean boolean8 = localDate6.isSupported(durationFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate3.withFieldAdded(durationFieldType7, 53626437);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hours' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getDate();
        int int2 = date0.getMonth();
        java.lang.String str3 = date0.toString();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:53:51 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Mon Feb 21 14:53:51 UTC 2022" + "'", str3, "Mon Feb 21 14:53:51 UTC 2022");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        java.lang.String str10 = dateTimeZone6.getShortName(1646664825911L, locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((int) '4', 8, 53626437, (int) (short) 1, 7, 32772, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.plusMinutes(4);
        java.util.Locale locale5 = java.util.Locale.JAPANESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localTime1.toString("hi!", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property12.addToCopy(1646664828637L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 164666482863700");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664831735L + "'", long6 == 1646664831735L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeZone11.getOffset((int) (short) 10, 32772, 2, 53627676, 48, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        boolean boolean2 = localDate0.isSupported(durationFieldType1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate4.minus(readablePeriod5);
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        long long13 = dateTime11.getMillis();
        org.joda.time.DateTime dateTime15 = dateTime11.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime15, dateTimeZone16);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withMonthOfYear(2);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMinutes((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = localDate6.compareTo((org.joda.time.ReadablePartial) localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1646664831834L + "'", long13 == 1646664831834L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMonthOfYear(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMinutes((int) '4');
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withFieldAdded(durationFieldType17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664831909L + "'", long6 == 1646664831909L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(durationFieldType17);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        int[] intArray15 = localDate9.getValues();
        org.joda.time.LocalDate.Property property16 = localDate9.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.minuteOfDay();
        boolean boolean22 = durationFieldType18.isSupported(chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) dateTimeFieldType17, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2022, 2, 21]");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        int int16 = dateTime4.get(dateTimeField15);
        long long19 = dateTimeField15.set((long) (byte) -1, (int) (short) 10);
        int int20 = dateTimeField15.getMaximumValue();
        java.util.Locale locale23 = java.util.Locale.UK;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = dateTimeField15.set((long) 49, "hours", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hours\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664832116L + "'", long6 == 1646664832116L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022" + "'", str13, "2022");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-61851081600001L) + "'", long19 == (-61851081600001L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292278993 + "'", int20 == 292278993);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.setFirstDayOfWeek((int) '4');
        calendar14.setMinimalDaysInFirstWeek(12);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = calendar14.getActualMaximum(59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 59");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=52,minimalDaysInFirstWeek=12,ERA=1,YEAR=48,MONTH=52,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=32769,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=32,MINUTE=1970,SECOND=52,MILLISECOND=251,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate3 = localDate0.withDayOfWeek(1);
        org.joda.time.LocalDate.Property property4 = localDate0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = property4.setCopy("Mon Feb 21 14:53:51 UTC 2022");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Mon Feb 21 14:53:51 UTC 2022\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.util.Date date3 = new java.util.Date(7, (int) (byte) -1, 32769);
        java.lang.String str4 = date3.toString();
        org.junit.Assert.assertEquals(date3.toString(), "Sun Aug 18 00:00:00 UTC 1996");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sun Aug 18 00:00:00 UTC 1996" + "'", str4, "Sun Aug 18 00:00:00 UTC 1996");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        boolean boolean1 = locale0.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("2022-02-21");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2022-02-21");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime3 = localTime1.minusMillis(0);
        org.joda.time.LocalTime localTime5 = localTime1.withSecondOfMinute((int) (short) 0);
        int int6 = localTime1.getMillisOfDay();
        org.joda.time.LocalTime localTime8 = localTime1.withSecondOfMinute(3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate0.compareTo((org.joda.time.ReadablePartial) localTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 53632837 + "'", int6 == 53632837);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(9, 53625652, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625652 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getDisplayName(locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        java.util.Locale locale9 = new java.util.Locale("hi!", "", "");
        int int10 = dateTimeField5.getMaximumShortTextLength(locale9);
        org.joda.time.DurationField durationField11 = dateTimeField5.getDurationField();
        java.lang.Object obj12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj12, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property17 = dateTime16.weekyear();
        long long18 = dateTime16.getMillis();
        org.joda.time.DateTime dateTime20 = dateTime16.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime20, dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDateTime23.toLocalDate();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        java.lang.Object obj29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(obj29, dateTimeZone30);
        org.joda.time.MutableDateTime mutableDateTime32 = dateTime31.toMutableDateTime();
        int int33 = dateTime31.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay34 = dateTime31.toYearMonthDay();
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology38 = localDate37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.minuteOfDay();
        boolean boolean40 = durationFieldType36.isSupported(chronology38);
        java.lang.Object obj41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(obj41, dateTimeZone42);
        org.joda.time.DateTime dateTime45 = dateTime43.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property46 = dateTime45.weekyear();
        java.lang.String str47 = property46.getAsText();
        int int48 = property46.get();
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology50 = localDate49.getChronology();
        int int51 = property46.compareTo((org.joda.time.ReadablePartial) localDate49);
        int[] intArray57 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology38.validate((org.joda.time.ReadablePartial) localDate49, intArray57);
        int[] intArray60 = dateTimeField28.set((org.joda.time.ReadablePartial) yearMonthDay34, (int) (byte) 0, intArray57, 16);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray62 = dateTimeField5.addWrapPartial((org.joda.time.ReadablePartial) localDateTime23, 1, intArray60, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1646664833009L + "'", long18 == 1646664833009L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 22 + "'", int33 == 22);
        org.junit.Assert.assertNotNull(yearMonthDay34);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2022" + "'", str47, "2022");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2022 + "'", int48 == 2022);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[16, 24, 22, 100, 22]");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[16, 24, 22, 100, 22]");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "");
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Locale.setDefault(locale3);
        java.lang.String str6 = locale3.getDisplayLanguage();
        java.util.Locale locale10 = new java.util.Locale("hi!", "", "");
        java.lang.String str11 = locale10.getDisplayScript();
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = locale10.getDisplayLanguage();
        java.lang.String str14 = locale3.getDisplayName(locale10);
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj15, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        long long21 = dateTime19.getMillis();
        org.joda.time.DateTime dateTime23 = dateTime19.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime23, dateTimeZone24);
        boolean boolean27 = locale10.equals((java.lang.Object) dateTime23);
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1646664833117L + "'", long21 == 1646664833117L);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "");
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Locale.setDefault(locale3);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = strSet6.add("DateTimeField[dayOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj3, dateTimeZone4);
        org.joda.time.MutableDateTime mutableDateTime6 = dateTime5.toMutableDateTime();
        int int7 = dateTime5.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay8 = dateTime5.toYearMonthDay();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfDay();
        boolean boolean14 = durationFieldType10.isSupported(chronology12);
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
        int[] intArray31 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology12.validate((org.joda.time.ReadablePartial) localDate23, intArray31);
        int[] intArray34 = dateTimeField2.set((org.joda.time.ReadablePartial) yearMonthDay8, (int) (byte) 0, intArray31, 16);
        java.lang.Class<?> wildcardClass35 = intArray34.getClass();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022" + "'", str21, "2022");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[16, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[16, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        java.util.TimeZone timeZone7 = dateTimeZone4.toTimeZone();
        java.lang.String str8 = timeZone7.getDisplayName();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coordinated Universal Time" + "'", str8, "Coordinated Universal Time");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTime1.withDayOfWeek(48);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.parse("00:01:36.999", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property7.addNoWrapToCopy(292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53633484 + "'", int5 == 53633484);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology5 = chronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.plusHours(22);
        int[] intArray14 = new int[] { (short) 10, 11 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = dateTimeField6.set((org.joda.time.ReadablePartial) localTime8, (int) '4', intArray14, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 11]");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
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
        int[] intArray21 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology2.validate((org.joda.time.ReadablePartial) localDate13, intArray21);
        org.joda.time.DateTimeField dateTimeField23 = chronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology2.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = chronology2.get(readablePeriod25, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.parse("Mon Feb 21 14:53:51 UTC 2022", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.Instant instant4 = instant3.toInstant();
        org.joda.time.MutableDateTime mutableDateTime5 = instant3.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime5, "2022-02-21T23:59:59.999Z", 53626437);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.clear();
        java.util.TimeZone timeZone22 = calendar14.getTimeZone();
        java.util.Locale locale25 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = calendar14.getDisplayName(1970, 21, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTime dateTime8 = property5.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime8.withDayOfMonth(49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
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
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMonthOfYear(2);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withMinuteOfHour((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664834312L + "'", long6 == 1646664834312L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        org.joda.time.LocalTime localTime6 = localTime4.plusHours(7);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.minusMillis(0);
        org.joda.time.LocalTime localTime11 = localTime7.withMillisOfDay((int) 'a');
        int int12 = localTime7.size();
        int int13 = localTime4.compareTo((org.joda.time.ReadablePartial) localTime7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime7.withHourOfDay(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.LocalDate.Property property2 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate3 = property2.roundCeilingCopy();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology10 = chronology6.withZone(dateTimeZone9);
        java.util.Locale locale11 = java.util.Locale.ENGLISH;
        boolean boolean12 = dateTimeZone9.equals((java.lang.Object) locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property2.setCopy("DateTimeField[dayOfYear]", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[dayOfYear]\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime9 = property7.addCopy((int) (short) -1);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property7.setCopy("+00:00", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+00:00\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53634707 + "'", int5 == 53634707);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.setFirstDayOfWeek((int) '4');
        int int24 = calendar14.getGreatestMinimum(0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = calendar14.getMaximum((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=52,minimalDaysInFirstWeek=1,ERA=1,YEAR=48,MONTH=52,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=32769,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=32,MINUTE=1970,SECOND=54,MILLISECOND=738,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(86399, 32772, 7, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology5 = chronology1.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = chronology5.hourOfHalfday();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        int[] intArray12 = new int[] { '#', 36, 20 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = dateTimeField6.set((org.joda.time.ReadablePartial) localDate7, 0, intArray12, 507);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 507 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[35, 36, 20]");
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
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime6.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.toDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withHourOfDay((int) (byte) 10);
        int int14 = dateTime11.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime11.withEra(3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        int int16 = dateTime4.get(dateTimeField15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime4.withDayOfYear(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664835030L + "'", long6 == 1646664835030L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022" + "'", str13, "2022");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        boolean boolean2 = localDate0.isSupported(durationFieldType1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths((int) '4');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate4.minus(readablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withDayOfMonth(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.clear();
        java.util.TimeZone timeZone22 = calendar14.getTimeZone();
        boolean boolean23 = timeZone22.useDaylightTime();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateTimeFormatter2.print((long) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property7.setCopy(53628688);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628688 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53635621 + "'", int5 == 53635621);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(70, 52, 1, 53634194, 53628688);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53634194 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(507, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 507 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0, 1, 0, 10);
        int int5 = localTime4.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime4.withHourOfDay(53626437);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626437 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property7.setCopy("2022-03-07T14:53:50.054Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-03-07T14:53:50.054Z\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53635909 + "'", int5 == 53635909);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale10 = new java.util.Locale("hi!", "", "");
        java.lang.String str11 = locale10.getDisplayScript();
        java.util.Locale.setDefault(locale10);
        java.lang.String str13 = locale10.getDisplayLanguage();
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.lang.String str15 = locale10.getDisplayCountry(locale14);
        java.lang.String str16 = dateTimeZone5.getName((long) 507, locale10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((int) '4', 507, 507, (int) (short) 100, 13, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        int int16 = dateTime4.get(dateTimeField15);
        java.lang.Class<?> wildcardClass17 = dateTime4.getClass();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664835992L + "'", long6 == 1646664835992L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022" + "'", str13, "2022");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime6.weekOfWeekyear();
        int int10 = dateTime6.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTime6.toString("2022-02-21T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.minuteOfDay();
        boolean boolean9 = durationFieldType5.isSupported(chronology7);
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
        int[] intArray26 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology7.validate((org.joda.time.ReadablePartial) localDate18, intArray26);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = localDate18.getFieldType((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property30 = localTime0.property(dateTimeFieldType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022" + "'", str16, "2022");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(8, 49, 20, 53630702);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53630702 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDateTime11.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664836391L + "'", long6 == 1646664836391L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate12);
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
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        int int13 = localDateTime11.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDateTime11.toString("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: oo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664836580L + "'", long6 == 1646664836580L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53636580 + "'", int13 == 53636580);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((int) (byte) 1, 49, 64433670, (int) (short) 10, 13, 2, 70, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        boolean boolean5 = dateTimeFormatter3.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.parse("Chinese (China)", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate0.plusWeeks((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDate0.getValue(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 50");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        java.time.ZoneId zoneId13 = timeZone11.toZoneId();
        boolean boolean14 = timeZone11.useDaylightTime();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField10 = chronology8.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((int) '4', 12, 0, 50, 1, 59, 53637095, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("00:10:00.097");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = property1.setCopy("GB");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"GB\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        java.util.TimeZone timeZone7 = dateTimeZone4.toTimeZone();
        java.lang.Object obj8 = timeZone7.clone();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(53637612, (int) 'u', 59, 53635175, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53635175 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant5 = new org.joda.time.Instant((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isParser();
        java.io.Writer writer6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int10 = localDate7.indexOf(dateTimeFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, (org.joda.time.ReadablePartial) localDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        int int13 = localDateTime11.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664838153L + "'", long6 == 1646664838153L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 58 + "'", int13 == 58);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
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
            org.joda.time.LocalTime.Property property15 = localTime0.property(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = localDateTime11.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -335 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664838665L + "'", long6 == 1646664838665L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyear();
        org.joda.time.DurationField durationField5 = chronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType0.getField(chronology2);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology2.getDateTimeMillis((int) '4', 13, (int) (short) 0, 2022, 53868668, (int) (byte) 0, 53638338);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.setFirstDayOfWeek((int) '4');
        int int24 = calendar14.getGreatestMinimum(0);
        java.util.Locale locale29 = new java.util.Locale("2022-03-07T14:53:49.500Z", "2022-03-07T14:53:49.500Z");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = calendar14.getDisplayName(49, 893, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=52,minimalDaysInFirstWeek=1,ERA=1,YEAR=48,MONTH=52,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=32769,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=32,MINUTE=1970,SECOND=58,MILLISECOND=809,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals(locale29.toString(), "2022-03-07t14:53:49.500z_2022-03-07T14:53:49.500Z");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(893, (int) (byte) 10, 53638476);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53638476 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMonthOfYear(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withDayOfWeek(53637612);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637612 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664838881L + "'", long6 == 1646664838881L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(16, 25, 53637612);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Etc/UTC", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=etc/utc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        int int4 = localDate2.getDayOfWeek();
        int int5 = localDate2.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime1.compareTo((org.joda.time.ReadablePartial) localDate2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("years");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"years\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.yearOfCentury();
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime20.toMutableDateTime();
        int int22 = dateTime20.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay23 = dateTime20.toYearMonthDay();
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.minuteOfDay();
        boolean boolean29 = durationFieldType25.isSupported(chronology27);
        java.lang.Object obj30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj30, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = dateTime32.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property35 = dateTime34.weekyear();
        java.lang.String str36 = property35.getAsText();
        int int37 = property35.get();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        int int40 = property35.compareTo((org.joda.time.ReadablePartial) localDate38);
        int[] intArray46 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology27.validate((org.joda.time.ReadablePartial) localDate38, intArray46);
        int[] intArray49 = dateTimeField17.set((org.joda.time.ReadablePartial) yearMonthDay23, (int) (byte) 0, intArray46, 16);
        java.util.Locale locale53 = new java.util.Locale("hi!", "", "");
        java.lang.String str54 = locale53.getDisplayScript();
        java.util.Locale.setDefault(locale53);
        java.lang.String str56 = locale53.getDisplayLanguage();
        java.util.Locale locale60 = new java.util.Locale("hi!", "", "");
        java.lang.String str61 = locale60.getDisplayScript();
        java.util.Locale.setDefault(locale60);
        java.lang.String str63 = locale60.getDisplayLanguage();
        java.lang.String str64 = locale53.getDisplayName(locale60);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) yearMonthDay23, locale60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2022" + "'", str36, "2022");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[16, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[16, 2, 22, 100, 22]");
        org.junit.Assert.assertEquals(locale53.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals(locale60.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = chronology2.halfdays();
        org.joda.time.DurationField durationField7 = chronology2.centuries();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = chronology2.get(readablePeriod8, (long) 36, 1646664837035L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTimeFormatter2.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        boolean boolean2 = localDate0.isSupported(durationFieldType1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths((int) '4');
        int int5 = localDate4.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate4.withEra(53627676);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627676 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("GB", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(13, 53630088, 53632276, 53639598, 53627676);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53639598 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.DurationField durationField8 = property5.getLeapDurationField();
        java.lang.String str9 = property5.getAsShortText();
        org.joda.time.DateTime dateTime10 = property5.getDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.withSecondOfMinute(53634194);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53634194 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundHalfCeilingCopy();
        int int15 = localDateTime14.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withWeekOfWeekyear(53635175);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53635175 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664839851L + "'", long6 == 1646664839851L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean5 = localTime1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTime dateTime6 = localTime1.toDateTimeToday();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property8 = localTime1.property(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(99, 53638476, (int) (byte) 1, (int) (byte) 0, 53637436, 4, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637436 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        boolean boolean8 = dateTime5.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property9 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property10 = dateTime5.dayOfMonth();
        org.joda.time.LocalTime localTime11 = dateTime5.toLocalTime();
        boolean boolean12 = localTime0.equals((java.lang.Object) dateTime5);
        java.lang.String str13 = dateTime5.toString();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-03-07T14:53:59.970Z" + "'", str13, "2022-03-07T14:53:59.970Z");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = chronology2.get(readablePeriod6, (long) 22, (long) 22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        java.util.Locale locale23 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.lang.String str25 = locale23.getDisplayName(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = calendar14.getDisplayName((int) ' ', (int) (short) 0, locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=48,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=32769,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=32,MINUTE=1970,SECOND=0,MILLISECOND=289,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Chinese (China)" + "'", str25, "Chinese (China)");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("2022-02-21");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        int int8 = localDate6.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.hours();
        boolean boolean8 = localDate6.isSupported(durationFieldType7);
        org.joda.time.LocalDate localDate10 = localDate6.plusMonths((int) '4');
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.minuteOfDay();
        boolean boolean16 = durationFieldType12.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.yearOfEra();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        int int19 = localDate18.getDayOfWeek();
        org.joda.time.LocalDate localDate21 = localDate18.withDayOfWeek(1);
        java.util.Locale locale25 = new java.util.Locale("hi!", "", "");
        java.lang.String str26 = dateTimeField17.getAsShortText((org.joda.time.ReadablePartial) localDate21, locale25);
        int[] intArray27 = localDate21.getValues();
        java.util.Locale locale29 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.lang.String str31 = locale29.getDisplayName(locale30);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = dateTimeField5.set((org.joda.time.ReadablePartial) localDate10, 53637612, intArray27, "Mon Feb 21 14:53:51 UTC 2022", locale29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Mon Feb 21 14:53:51 UTC 2022\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022" + "'", str26, "2022");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[2022, 2, 21]");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Chinese (China)" + "'", str31, "Chinese (China)");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.parse("Property[dayOfMonth]", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(0);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withDayOfWeek(57);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        java.lang.String str15 = calendar14.toString();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455240793,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=793,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.util.GregorianCalendar[time=1645455240793,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=793,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str15, "java.util.GregorianCalendar[time=1645455240793,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=793,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.util.Locale locale1 = new java.util.Locale("2022-02-21");
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj2, dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.weekyear();
        java.lang.String str8 = property7.getAsText();
        int int9 = property7.get();
        org.joda.time.DurationField durationField10 = property7.getLeapDurationField();
        org.joda.time.DateTime dateTime11 = property7.roundFloorCopy();
        org.joda.time.DateTime dateTime12 = property7.withMaximumValue();
        boolean boolean13 = locale1.equals((java.lang.Object) property7);
        org.junit.Assert.assertEquals(locale1.toString(), "2022-02-21");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022" + "'", str8, "2022");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(53636186, 32772, 507, 7, (int) (byte) 1, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2022-03-07T14:53:50.054Z", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-03-07t14:53:50.054z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("months");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53636950, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj5, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property10 = dateTime9.weekyear();
        boolean boolean12 = dateTime9.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property13 = dateTime9.millisOfSecond();
        org.joda.time.DateTime dateTime15 = dateTime9.minusMillis(86399);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTime dateTime8 = property5.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime11.toDateTimeToday(dateTimeZone14);
        int int16 = dateTime15.getWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTime();
        org.joda.time.DateTime.Property property18 = dateTime15.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime15.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withHourOfDay((int) (byte) 10);
        int int23 = property5.compareTo((org.joda.time.ReadableInstant) dateTime22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = property5.addToCopy(1646664821169L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1646664821169");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isParser();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, (org.joda.time.ReadableInstant) instant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        java.lang.Appendable appendable4 = null;
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        int int6 = localDateTime5.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable4, (org.joda.time.ReadablePartial) localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.weekyear();
        long long7 = chronology1.add((long) 2, (long) 59, 53628688);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfDay();
        boolean boolean12 = durationFieldType8.isSupported(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.yearOfEra();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        int int15 = localDate14.getDayOfWeek();
        org.joda.time.LocalDate localDate17 = localDate14.withDayOfWeek(1);
        java.util.Locale locale21 = new java.util.Locale("hi!", "", "");
        java.lang.String str22 = dateTimeField13.getAsShortText((org.joda.time.ReadablePartial) localDate17, locale21);
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.weekyear();
        java.lang.String str29 = property28.getAsText();
        int int30 = property28.get();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        int int33 = property28.compareTo((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate localDate34 = localDate17.withFields((org.joda.time.ReadablePartial) localDate31);
        org.joda.time.LocalDate localDate36 = localDate34.minusMonths(32769);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.minuteOfDay();
        boolean boolean41 = durationFieldType37.isSupported(chronology39);
        org.joda.time.DateTimeField dateTimeField42 = chronology39.yearOfEra();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtMidnight(dateTimeZone44);
        int[] intArray47 = chronology39.get((org.joda.time.ReadablePartial) localDate43, (long) (-1));
        chronology1.validate((org.joda.time.ReadablePartial) localDate34, intArray47);
        org.joda.time.LocalDate.Property property49 = localDate34.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType50 = org.joda.time.DurationFieldType.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate52 = localDate34.withFieldAdded(durationFieldType50, 53638338);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minutes' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3164092594L + "'", long7 == 3164092594L);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2022" + "'", str22, "2022");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022" + "'", str29, "2022");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[1969, 12, 31]");
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(durationFieldType50);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.clear();
        java.util.TimeZone timeZone22 = calendar14.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = calendar14.getGreatestMinimum(49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664842972L + "'", long6 == 1646664842972L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.clear();
        java.util.TimeZone timeZone22 = calendar14.getTimeZone();
        int int23 = calendar14.getFirstDayOfWeek();
        boolean boolean24 = calendar14.isLenient();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        org.joda.time.LocalTime localTime6 = localTime4.plusHours(7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localTime4.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int int2 = localDate1.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate1.withDayOfWeek(1);
        int int5 = localDate1.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        int int8 = localDate6.getDayOfWeek();
        int int9 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtStartOfDay(dateTimeZone10);
        java.util.TimeZone timeZone13 = dateTimeZone10.toTimeZone();
        org.joda.time.DateMidnight dateMidnight14 = localDate1.toDateMidnight(dateTimeZone10);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (-457392), dateTimeZone10);
        java.lang.String str16 = dateTimeZone10.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Etc/UTC" + "'", str16, "Etc/UTC");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology10 = chronology6.withZone(dateTimeZone9);
        long long12 = dateTimeZone9.nextTransition((long) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(42, 48, 12, 0, 53642083, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53642083 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2022-02-21T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T23:59:59.999Z\" is malformed at \"Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        boolean boolean8 = dateTime5.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property9 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property10 = dateTime5.dayOfMonth();
        org.joda.time.LocalTime localTime11 = dateTime5.toLocalTime();
        boolean boolean12 = localTime0.equals((java.lang.Object) dateTime5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localTime0.getFieldType(53643687);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53643687");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.util.Locale locale2 = new java.util.Locale("years", "Coordinated Universal Time");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale2.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for years");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "years_COORDINATED UNIVERSAL TIME");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.Locale.FilteringMode filteringMode6 = null;
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4, filteringMode6);
        java.util.stream.Stream<java.util.Locale> localeStream8 = localeList7.parallelStream();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) localeList7, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.ArrayList");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertNotNull(localeStream8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(16, 10, 50, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime9 = property7.addCopy((int) (short) -1);
        org.joda.time.LocalTime localTime11 = property7.setCopy((int) (byte) 1);
        boolean boolean12 = property7.isLeap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = property7.setCopy(53626437);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626437 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53644469 + "'", int5 == 53644469);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
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
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMonthOfYear(2);
        boolean boolean16 = localDateTime11.equals((java.lang.Object) 53632276);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withSecondOfMinute(53642865);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53642865 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664844583L + "'", long6 == 1646664844583L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = localDate0.toDateTimeAtMidnight(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = localDate0.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withDayOfWeek((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isParser();
        int int6 = dateTimeFormatter2.getDefaultYear();
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        boolean boolean15 = dateTime12.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property16 = dateTime12.millisOfSecond();
        org.joda.time.DateTime dateTime18 = dateTime12.minusMillis(86399);
        org.joda.time.Instant instant19 = dateTime18.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, (org.joda.time.ReadableInstant) dateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(instant19);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime2 = instant1.toMutableDateTimeISO();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant5 = instant1.withDurationAdded(readableDuration3, 999);
        org.junit.Assert.assertNotNull(mutableDateTime2);
        org.junit.Assert.assertNotNull(instant5);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.DurationField durationField8 = property5.getLeapDurationField();
        java.lang.String str9 = property5.getAsShortText();
        org.joda.time.DateTime dateTime11 = property5.addToCopy((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withHourOfDay(53637095);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637095 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = calendar14.getMinimum(70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 70");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.DateTime dateTime1 = localDate0.toDateTimeAtMidnight();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = localDate0.toString("dayOfYear", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localDate0.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, 1646664833302L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        int int13 = localDateTime11.getSecondOfMinute();
        org.joda.time.Chronology chronology14 = localDateTime11.getChronology();
        org.joda.time.LocalTime localTime15 = localDateTime11.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime11.withDayOfMonth(53638476);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53638476 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664845104L + "'", long6 == 1646664845104L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getMillisOfSecond();
        java.util.Locale locale14 = java.util.Locale.UK;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDateTime11.toString("2022-02-21T23:59:59.999Z", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664845161L + "'", long6 == 1646664845161L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 161 + "'", int12 == 161);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        int[] intArray15 = localDate9.getValues();
        org.joda.time.LocalDate.Property property16 = localDate9.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = property16.setCopy(53637612);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637612 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2022, 2, 21]");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone4);
        org.joda.time.LocalTime localTime7 = localTime5.plusSeconds((int) 'a');
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DurationField durationField3 = chronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.secondOfMinute();
        org.joda.time.DurationField durationField5 = chronology1.days();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = chronology1.get(readablePeriod6, (long) 32770, 1646664827830L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
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
        int[] intArray21 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology2.validate((org.joda.time.ReadablePartial) localDate13, intArray21);
        org.joda.time.DateTimeField dateTimeField23 = chronology2.clockhourOfHalfday();
        int int25 = dateTimeField23.get((long) 292278993);
        long long27 = dateTimeField23.roundCeiling(0L);
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            long long31 = dateTimeField23.set(1646664830261L, "+00:00", locale30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+00:00\" for clockhourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("00:01:36.999");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        boolean boolean8 = dateTime5.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property9 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property10 = dateTime5.dayOfMonth();
        org.joda.time.LocalTime localTime11 = dateTime5.toLocalTime();
        boolean boolean12 = localTime0.equals((java.lang.Object) dateTime5);
        org.joda.time.LocalTime localTime14 = localTime0.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property16 = localTime0.property(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withEra(54);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "en_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "en_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "en_CA");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime9 = property7.addCopy((int) (short) -1);
        org.joda.time.LocalTime localTime11 = property7.addNoWrapToCopy(0);
        org.joda.time.LocalTime localTime13 = property7.addCopy(1646664841221L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = property7.setCopy(53627676);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53627676 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53645929 + "'", int5 == 53645929);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(53638227);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology5 = chronology1.withZone(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology5.getDateTimeMillis((int) (short) 1, 58, 32769, (int) 'u', 877, (int) (byte) 0, 21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = dateTimeFormatter2.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.util.Date date1 = new java.util.Date((long) 893);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromDateFields(date1);
        java.util.Date date6 = new java.util.Date(7, (int) (byte) -1, 32769);
        boolean boolean7 = date1.before(date6);
        java.lang.String str8 = date1.toString();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Aug 18 00:00:00 UTC 1996");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Thu Jan 01 00:00:00 UTC 1970" + "'", str8, "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        int int15 = dateTimeField5.getMinimumValue();
        long long17 = dateTimeField5.roundHalfCeiling((long) 14);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField5.set(1692262126166400000L, "Sun Aug 18 00:00:00 UTC 1996");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Sun Aug 18 00:00:00 UTC 1996\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        int int5 = dateTimeFormatter2.getDefaultYear();
        boolean boolean6 = dateTimeFormatter2.isPrinter();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (long) 53638338);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = localTime4.toString(dateTimeFormatter5);
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property12.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localTime4.get(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00:01:36.999" + "'", str6, "00:01:36.999");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022" + "'", str13, "2022");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        java.lang.String str1 = durationFieldType0.getName();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        org.joda.time.DurationField durationField6 = chronology4.months();
        org.joda.time.DurationField durationField7 = durationFieldType2.getField(chronology4);
        org.joda.time.DurationField durationField8 = chronology4.years();
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology4);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = chronology4.get(readablePeriod10, 1646664843179L, 1646664830462L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hours" + "'", str1, "hours");
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.setMinimalDaysInFirstWeek(9);
        calendar14.setFirstDayOfWeek(0);
        int int25 = calendar14.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale33 = new java.util.Locale("hi!", "", "");
        java.lang.String str34 = locale33.getDisplayScript();
        java.util.Locale.setDefault(locale33);
        java.lang.String str36 = locale33.getDisplayLanguage();
        java.util.Locale locale37 = java.util.Locale.CANADA;
        java.lang.String str38 = locale33.getDisplayCountry(locale37);
        java.lang.String str39 = dateTimeZone28.getName((long) 507, locale33);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone41);
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.lang.String str45 = dateTimeZone41.getShortName(1646664825911L, locale44);
        java.lang.String str46 = dateTimeZone28.getShortName(1646664833117L, locale44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = calendar14.getDisplayName(53646113, 32, locale44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553792972,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=0,minimalDaysInFirstWeek=9,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=7,MILLISECOND=28,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 142 + "'", int25 == 142);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals(locale33.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00" + "'", str39, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "+00:00" + "'", str45, "+00:00");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime9 = property7.addCopy((int) (short) -1);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.LocalTime localTime12 = localTime9.minusMinutes(25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime9.withSecondOfMinute(53640182);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640182 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53647130 + "'", int5 == 53647130);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        boolean boolean5 = dateTimeFormatter3.isPrinter();
        int int6 = dateTimeFormatter3.getDefaultYear();
        boolean boolean7 = dateTimeFormatter3.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.parse("hi!", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(86399);
        org.joda.time.TimeOfDay timeOfDay5 = dateTime2.toTimeOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(timeOfDay5);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        int int5 = localTime0.size();
        int int6 = localTime0.getHourOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField12 = durationFieldType7.getField(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime0.withFieldAdded(durationFieldType7, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'months' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 14 + "'", int6 == 14);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0);
        java.lang.Object obj2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(obj2, dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.weekyear();
        long long8 = dateTime6.getMillis();
        org.joda.time.DateTime dateTime10 = dateTime6.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime10, dateTimeZone11);
        int int14 = localDateTime13.getHourOfDay();
        int int15 = localDateTime13.getWeekOfWeekyear();
        org.joda.time.LocalTime localTime16 = localTime1.withFields((org.joda.time.ReadablePartial) localDateTime13);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1646664847401L + "'", long8 == 1646664847401L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14 + "'", int14 == 14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        java.util.TimeZone timeZone12 = dateTimeZone7.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeZone12.getOffset((-1), 36, 53637612, 53636186, 53638204, 53627676);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        java.lang.String str13 = timeZone11.getID();
        int int15 = timeZone11.getOffset((long) (-18));
        java.lang.String str16 = timeZone11.getDisplayName();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coordinated Universal Time" + "'", str16, "Coordinated Universal Time");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime8 = property7.withMaximumValue();
        int int9 = property7.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property7.addNoWrapToCopy(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53647774 + "'", int5 == 53647774);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.LocalDate localDate2 = property1.roundCeilingCopy();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.halfdayOfDay();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate8 = property6.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate10 = property6.addToCopy(0);
        java.util.Locale locale14 = new java.util.Locale("2022-03-07T14:53:49.500Z", "2022-03-07T14:53:49.500Z");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localDate10, 53634194, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53634194");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals(locale14.toString(), "2022-03-07t14:53:49.500z_2022-03-07T14:53:49.500Z");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        long long5 = dateTimeField2.add(48L, 1645401600000L);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 98724096000000048L + "'", long5 == 98724096000000048L);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        java.lang.Object[] objArray1 = strSet0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            strSet0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[gregory, buddhist, japanese]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[gregory, buddhist, japanese]");
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        java.lang.String str3 = dateTimeField2.toString();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0);
        org.joda.time.LocalTime localTime7 = localTime5.plusHours(7);
        int int8 = localTime5.getMillisOfSecond();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfDay();
        boolean boolean14 = durationFieldType10.isSupported(chronology12);
        org.joda.time.DateTimeField dateTimeField15 = chronology12.yearOfEra();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate();
        int int17 = localDate16.getDayOfWeek();
        org.joda.time.LocalDate localDate19 = localDate16.withDayOfWeek(1);
        java.util.Locale locale23 = new java.util.Locale("hi!", "", "");
        java.lang.String str24 = dateTimeField15.getAsShortText((org.joda.time.ReadablePartial) localDate19, locale23);
        int[] intArray25 = localDate19.getValues();
        java.util.Locale locale30 = new java.util.Locale("hi!", "", "");
        java.lang.String str31 = locale30.getDisplayScript();
        java.util.Locale.setDefault(locale30);
        java.util.Set<java.lang.String> strSet33 = locale30.getUnicodeLocaleAttributes();
        java.lang.String str34 = locale30.getLanguage();
        java.util.Locale locale37 = new java.util.Locale("2022-03-07T14:53:49.500Z", "2022-03-07T14:53:49.500Z");
        java.lang.String str38 = locale30.getDisplayLanguage(locale37);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = dateTimeField2.set((org.joda.time.ReadablePartial) localTime5, 53626437, intArray25, "java.util.GregorianCalendar[time=1645455240793,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=793,ZONE_OFFSET=0,DST_OFFSET=0]", locale30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.util.GregorianCalendar[time=1645455240793,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=793,ZONE_OFFSET=0,DST_OFFSET=0]\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DateTimeField[yearOfCentury]" + "'", str3, "DateTimeField[yearOfCentury]");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertEquals(locale23.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022" + "'", str24, "2022");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[2022, 2, 21]");
        org.junit.Assert.assertEquals(locale30.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals(locale37.toString(), "2022-03-07t14:53:49.500z_2022-03-07T14:53:49.500Z");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 53636950);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.363695E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(48, (int) (short) 100, 2021, 86399999, 32, 53643773);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
        boolean boolean7 = dateTime4.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfSecond();
        org.joda.time.DateTime dateTime9 = dateTime4.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime10 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((java.lang.Integer) 42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTime4.toString(dateTimeFormatter15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(53642083);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        int int5 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (long) 53637095);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter6);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("DateTimeField[yearOfCentury]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=datetimefield[yearofcentury]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        java.lang.String str1 = durationFieldType0.getName();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        org.joda.time.DurationField durationField6 = chronology4.months();
        org.joda.time.DurationField durationField7 = durationFieldType2.getField(chronology4);
        org.joda.time.DurationField durationField8 = chronology4.years();
        org.joda.time.DurationField durationField9 = durationFieldType0.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField10 = chronology4.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone12);
        org.joda.time.LocalTime localTime15 = localTime13.plusSeconds((int) 'a');
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.minuteOfDay();
        boolean boolean20 = durationFieldType16.isSupported(chronology18);
        java.lang.Object obj21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(obj21, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property26 = dateTime25.weekyear();
        java.lang.String str27 = property26.getAsText();
        int int28 = property26.get();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        int int31 = property26.compareTo((org.joda.time.ReadablePartial) localDate29);
        int[] intArray37 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology18.validate((org.joda.time.ReadablePartial) localDate29, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            chronology4.validate((org.joda.time.ReadablePartial) localTime13, intArray37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hours" + "'", str1, "hours");
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2022" + "'", str27, "2022");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2022 + "'", int28 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[32769, 2, 22, 100, 22]");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.setMinimalDaysInFirstWeek(9);
        calendar14.setFirstDayOfWeek(0);
        int int25 = calendar14.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar14.add(53637612, 835);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553791099,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=0,minimalDaysInFirstWeek=9,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=8,MILLISECOND=901,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 142 + "'", int25 == 142);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 42);
        java.lang.Appendable appendable5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.monthOfYear();
        org.joda.time.LocalDate localDate8 = property7.roundCeilingCopy();
        org.joda.time.LocalDate localDate9 = property7.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable5, (org.joda.time.ReadablePartial) localDate9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        int int5 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime9.toDateTimeToday(dateTimeZone12);
        boolean boolean15 = dateTime13.isAfter((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime13.minusDays(0);
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property23 = dateTime22.weekyear();
        java.lang.String str24 = property23.getAsText();
        org.joda.time.DurationField durationField25 = property23.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property23.getFieldType();
        int int27 = dateTime17.get(dateTimeFieldType26);
        java.lang.Object obj28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(obj28, dateTimeZone29);
        org.joda.time.MutableDateTime mutableDateTime31 = dateTime30.toMutableDateTime();
        boolean boolean32 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022" + "'", str24, "2022");
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2022 + "'", int27 == 2022);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("00:10:00.097");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
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
        org.joda.time.DateTime dateTime19 = dateTime6.minusMinutes((int) ' ');
        org.joda.time.DateTime.Property property20 = dateTime6.yearOfEra();
        boolean boolean21 = property20.isLeap();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2022-03-07T14:53:50.054Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-03-07T14:53:50.054Z\" is malformed at \"T14:53:50.054Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.minuteOfDay();
        boolean boolean11 = durationFieldType7.isSupported(chronology9);
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
        int[] intArray28 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology9.validate((org.joda.time.ReadablePartial) localDate20, intArray28);
        org.joda.time.DateTimeField dateTimeField30 = chronology9.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(10, 70, 100, (int) (byte) 10, 42, 36, 53647, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53647 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2022" + "'", str18, "2022");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(dateTimeField30);
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
        org.joda.time.DurationField durationField8 = property5.getLeapDurationField();
        java.lang.String str9 = property5.getAsShortText();
        org.joda.time.DateTime dateTime11 = property5.addToCopy((long) (byte) 100);
        java.lang.String str12 = property5.getAsString();
        org.joda.time.DateTime dateTime14 = property5.setCopy(142);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime14.withDate(2, 42, 53632276);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        java.util.Locale locale18 = new java.util.Locale("hi!", "", "");
        java.lang.String str19 = locale18.getDisplayScript();
        java.util.Locale.setDefault(locale18);
        java.lang.String str21 = locale18.getDisplayLanguage();
        java.util.Locale locale25 = new java.util.Locale("hi!", "", "");
        java.lang.String str26 = locale25.getDisplayScript();
        java.util.Locale.setDefault(locale25);
        java.lang.String str28 = locale25.getDisplayLanguage();
        java.lang.String str29 = locale18.getDisplayName(locale25);
        java.util.Set<java.lang.String> strSet30 = locale18.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = property13.setCopy("Property[hourOfDay]", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[hourOfDay]\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664850210L + "'", long6 == 1646664850210L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals(locale18.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals(locale25.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 53649428);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.3649428E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664850356L + "'", long6 == 1646664850356L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withHourOfDay(2);
        boolean boolean11 = dateTime8.isEqualNow();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.minusMillis(0);
        org.joda.time.LocalTime localTime16 = localTime12.withMillisOfDay((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, (int) (byte) 0);
        org.joda.time.DateTime dateTime20 = dateTime8.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.DateTime dateTime22 = dateTime8.plusYears(32769);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = dateTime22.withEra(53637612);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637612 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        int int8 = dateTime6.getSecondOfDay();
        org.joda.time.DateTime dateTime10 = dateTime6.plusSeconds(835);
        java.lang.String str11 = dateTime10.toString();
        int int12 = dateTime10.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime10.withDate(53636186, 53647989, 835);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53647989 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 86399 + "'", int8 == 86399);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-02-22T00:13:54.999Z" + "'", str11, "2022-02-22T00:13:54.999Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        java.time.ZoneId zoneId13 = timeZone11.toZoneId();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        boolean boolean15 = calendar14.isLenient();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455250793,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=10,MILLISECOND=793,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        java.util.TimeZone timeZone12 = dateTimeZone7.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = timeZone12.getDisplayName(true, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 70");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
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
        int int11 = localDate8.size();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        int int14 = localDate12.getDayOfWeek();
        int int15 = localDate12.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = localDate8.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = localDate8.toDateTimeAtStartOfDay(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = localDate8.withCenturyOfEra(53628688);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628688 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getYear();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusWeeks((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localDateTime14.getValue(53637875);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53637875");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664851128L + "'", long6 == 1646664851128L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfDay();
        boolean boolean12 = durationFieldType8.isSupported(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.yearOfEra();
        org.joda.time.DurationField durationField14 = chronology10.halfdays();
        org.joda.time.DurationField durationField15 = chronology10.centuries();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(2000L, chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((int) (byte) 0, 0, 8, 53647989, 20, 142, 3, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53647989 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        org.joda.time.LocalTime localTime6 = localTime4.plusHours((int) (byte) 100);
        int int7 = localTime6.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        int int5 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter2.getPrinter();
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, 1646664850926L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertNull(dateTimePrinter6);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        int int7 = localDate5.getDayOfWeek();
        int int8 = localDate5.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate5.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) (byte) 0);
        java.util.TimeZone timeZone16 = dateTimeZone12.toTimeZone();
        java.util.TimeZone timeZone17 = dateTimeZone12.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(53627676, 53630702, 53632276, 53638227, 0, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53638227 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        java.util.Date date21 = calendar14.getTime();
        calendar14.setMinimalDaysInFirstWeek(86399);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.minuteOfDay();
        boolean boolean29 = durationFieldType25.isSupported(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.yearOfEra();
        org.joda.time.DurationField durationField31 = chronology27.halfdays();
        org.joda.time.DurationField durationField32 = chronology27.centuries();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(2000L, chronology27);
        boolean boolean34 = calendar14.after((java.lang.Object) 2000L);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        java.util.Locale locale40 = java.util.Locale.getDefault();
        java.lang.String str41 = dateTimeZone37.getShortName(1646664825911L, locale40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap42 = calendar14.getDisplayNames(999, (int) '#', locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553788388,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=86399,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=11,MILLISECOND=612,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 19 16:50:11 UTC 142");
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology5 = chronology1.withZone(dateTimeZone4);
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = chronology5.get(readablePeriod7, (long) 53634194, 3164092594L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        int int10 = localDate6.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        int int13 = localDate11.getDayOfWeek();
        int int14 = localDate11.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localDate11.toDateTimeAtStartOfDay(dateTimeZone15);
        java.util.TimeZone timeZone18 = dateTimeZone15.toTimeZone();
        org.joda.time.DateMidnight dateMidnight19 = localDate6.toDateMidnight(dateTimeZone15);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(1646664833748L, dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localTime0.compareTo((org.joda.time.ReadablePartial) localDate20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateMidnight19);
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = property5.setCopy("dayOfMonth");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"dayOfMonth\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 53637436);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        boolean boolean6 = durationFieldType2.isSupported(chronology4);
        org.joda.time.DateTimeField dateTimeField7 = chronology4.yearOfEra();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        int int9 = localDate8.getDayOfWeek();
        org.joda.time.LocalDate localDate11 = localDate8.withDayOfWeek(1);
        java.util.Locale locale15 = new java.util.Locale("hi!", "", "");
        java.lang.String str16 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localDate11, locale15);
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property22 = dateTime21.weekyear();
        java.lang.String str23 = property22.getAsText();
        int int24 = property22.get();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology26 = localDate25.getChronology();
        int int27 = property22.compareTo((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate28 = localDate11.withFields((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate30 = localDate28.minusMonths(32769);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDate28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022" + "'", str16, "2022");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022" + "'", str23, "2022");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMonthOfYear(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMinutes((int) '4');
        int int17 = localDateTime16.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.minusWeeks(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withMillisOfSecond(53638476);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53638476 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664851899L + "'", long6 == 1646664851899L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 899 + "'", int17 == 899);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
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
        org.joda.time.LocalDate localDate26 = localDate9.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate28 = localDate26.minusMonths(32769);
        org.joda.time.LocalDate localDate30 = localDate28.withDayOfMonth(21);
        org.joda.time.LocalDate.Property property31 = localDate28.era();
        org.joda.time.LocalDate localDate32 = property31.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = property31.addToCopy(49);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022" + "'", str21, "2022");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDate32);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.lang.String[] strArray25 = new java.lang.String[] { "14:53:50.326", "0", "0032-03-01T14:53:59.260", "DurationField[years]", "GB", "hours", "0032-03-01T14:54:02.865", "2022-03-07T14:53:49.500Z", "Property[dayOfMonth]", "2022-02-22T00:13:54.999Z", "2022-03-07T14:53:50.054Z", "+00:00", "2022", "+00:00", "14:54:02.639", "2022-02-21T23:59:59.999Z", "months", "Coordinated Universal Time", "00:10:00.097", "+00:00", "Property[dayOfMonth]", "2022-02-22T00:13:54.999Z", "DateTimeField[dayOfYear]", "2022-02-22T00:13:54.999Z", "2022-03-07T14:53:49.500Z" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        java.util.Iterator<java.lang.String> strItor28 = strSet26.iterator();
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology30 = localDate29.getChronology();
        int int31 = localDate29.getDayOfWeek();
        int int32 = localDate29.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.DateTime dateTime35 = localDate29.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        long long39 = dateTimeZone33.getMillisKeepLocal(dateTimeZone36, (long) (byte) 0);
        java.util.TimeZone timeZone40 = dateTimeZone36.toTimeZone();
        java.util.TimeZone timeZone41 = dateTimeZone36.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime((java.lang.Object) strSet26, dateTimeZone36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.LinkedHashSet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone41);
        org.junit.Assert.assertEquals(timeZone41.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(1970, 53630088, (int) '4', 53649071, 53639598, 53643687);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53649071 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
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
        org.joda.time.DateTime dateTime21 = dateTime6.withDate(36, 2, (int) (byte) 1);
        org.joda.time.DateTime dateTime23 = dateTime6.minusMillis(0);
        org.joda.time.DateTime dateTime25 = dateTime6.minusHours(5);
        int int26 = dateTime6.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = dateTime6.withHourOfDay(36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 999 + "'", int26 == 999);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.parse("00:10:00.097", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        java.util.Date date21 = calendar14.getTime();
        int int23 = calendar14.getGreatestMinimum(2);
        // The following exception was thrown during execution in test generation
        try {
            calendar14.setWeekDate(100, (int) (short) 100, 53647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 53647");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553787462,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=12,MILLISECOND=538,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 19 16:50:12 UTC 142");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.DurationField durationField6 = chronology2.halfdays();
        org.joda.time.DurationField durationField7 = chronology2.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField7.subtract((long) 53642865, 1646664821169L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -164666482116900");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate3 = localDate0.withDayOfWeek(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = localDate3.toString("Property[hourOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isParser();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronology();
        java.lang.Appendable appendable8 = null;
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        long long15 = dateTime13.getMillis();
        org.joda.time.DateTime dateTime17 = dateTime13.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime17, dateTimeZone18);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withMonthOfYear(2);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.minusMonths((int) '#');
        boolean boolean28 = localDateTime26.equals((java.lang.Object) 53639598);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable8, (org.joda.time.ReadablePartial) localDateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1646664852943L + "'", long15 == 1646664852943L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.clear();
        java.util.TimeZone timeZone22 = calendar14.getTimeZone();
        int int23 = calendar14.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = calendar14.getMaximum(86399);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 86399");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = chronology2.getDateTimeMillis(1646664848759L, 53637436, 52, 53646394, 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637436 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.LocalDate localDate2 = property1.roundCeilingCopy();
        org.joda.time.LocalDate localDate3 = property1.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = property1.setCopy((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime9 = property7.addCopy((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime9.withSecondOfMinute(894);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 894 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53653259 + "'", int5 == 53653259);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        java.util.Date date21 = calendar14.getTime();
        int int23 = calendar14.getGreatestMinimum(2);
        boolean boolean25 = calendar14.equals((java.lang.Object) 1646664847063L);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553786579,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=13,MILLISECOND=421,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 19 16:50:13 UTC 142");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology5 = chronology1.withZone(dateTimeZone4);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now(dateTimeZone4);
        java.lang.String str7 = dateTimeZone4.toString();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withEra(53639598);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53639598 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Etc/UTC" + "'", str7, "Etc/UTC");
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField5 = localDate0.getField(99);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 99");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = dateTimeFormatter2.parseLocalDate("00:01:36.999");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = dateTimeFormatter2.parseLocalDate("ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        java.lang.String str13 = property12.getAsText();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        int int16 = dateTime4.get(dateTimeField15);
        long long19 = dateTimeField15.set((long) (byte) -1, (int) (short) 10);
        int int20 = dateTimeField15.getMaximumValue();
        int int22 = dateTimeField15.getMinimumValue(1646664838691L);
        int int24 = dateTimeField15.getMinimumValue((long) 53638204);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664853966L + "'", long6 == 1646664853966L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022" + "'", str13, "2022");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-61851081600001L) + "'", long19 == (-61851081600001L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 292278993 + "'", int20 == 292278993);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-292275054) + "'", int22 == (-292275054));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-292275054) + "'", int24 == (-292275054));
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        org.joda.time.DurationField durationField5 = chronology3.months();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = chronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = chronology3.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) dateTimeZone0, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        int int3 = localTime2.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime2.withMillisOfSecond(53640182);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640182 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = property2.setCopy(53642083);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53642083 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        int int5 = dateTimeField2.getMinimumValue(1646664829115L);
        long long8 = dateTimeField2.getDifferenceAsLong(1646664822647L, 1646664828637L);
        int int10 = dateTimeField2.get(1646664848631L);
        long long13 = dateTimeField2.addWrapField(1646664835992L, 53637612);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2025356035992L + "'", long13 == 2025356035992L);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("DateTimeField[yearOfCentury]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'DateTimeField[yearOfCentury]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        boolean boolean7 = dateTime4.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfSecond();
        org.joda.time.DateTime dateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTime.Property property10 = dateTime9.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property10.addToCopy(1646664837844L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Magnitude of add amount is too large: 1646664837844");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
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
        java.lang.Object obj18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(obj18, dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property23 = dateTime22.weekyear();
        boolean boolean25 = dateTime22.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property26 = dateTime22.millisOfSecond();
        org.joda.time.DateTime dateTime28 = dateTime22.minusMillis(86399);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime22.getZone();
        org.joda.time.DateTime dateTime30 = dateTime16.toDateTime(dateTimeZone29);
        int int31 = dateTime30.getYearOfEra();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2022 + "'", int31 == 2022);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(0);
        org.joda.time.DateTime.Property property11 = dateTime6.millisOfSecond();
        int int12 = dateTime6.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property12.addToCopy(1646664840390L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 164666484039000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664854939L + "'", long6 == 1646664854939L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField10 = chronology8.months();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(53649428, 0, 86399, 86399, 86399999, 9, 53646113, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=isochronology[etc/utc]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.setFirstDayOfWeek(12);
        // The following exception was thrown during execution in test generation
        try {
            calendar14.roll(50, 2021);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=12,minimalDaysInFirstWeek=1,ERA=1,YEAR=48,MONTH=52,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=32769,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=32,MINUTE=1970,SECOND=15,MILLISECOND=172,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
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
        int int11 = localDate8.size();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        int int14 = localDate12.getDayOfWeek();
        int int15 = localDate12.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = localDate8.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = localDate8.toDateTimeAtStartOfDay(dateTimeZone21);
        java.util.TimeZone timeZone24 = dateTimeZone21.toTimeZone();
        int int25 = timeZone24.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        boolean boolean8 = dateTime5.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property9 = dateTime5.millisOfSecond();
        org.joda.time.DateTime.Property property10 = dateTime5.dayOfMonth();
        org.joda.time.LocalTime localTime11 = dateTime5.toLocalTime();
        boolean boolean12 = localTime0.equals((java.lang.Object) dateTime5);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property14 = localTime0.property(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withYear(53630702);
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        java.lang.String str12 = property11.getAsText();
        org.joda.time.DurationField durationField13 = property11.getDurationField();
        org.joda.time.DateTime dateTime14 = property11.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis(894);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.plus(readablePeriod17);
        org.joda.time.DateTime dateTime19 = localDateTime5.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime5.withMillisOfSecond(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        int int14 = localDateTime11.getYear();
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("hours");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localDateTime11.toString("DateTimeField[yearOfCentury]", locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664855528L + "'", long6 == 1646664855528L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "hours");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        java.util.Date date21 = calendar14.getTime();
        calendar14.setMinimalDaysInFirstWeek(86399);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.minuteOfDay();
        boolean boolean29 = durationFieldType25.isSupported(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.yearOfEra();
        org.joda.time.DurationField durationField31 = chronology27.halfdays();
        org.joda.time.DurationField durationField32 = chronology27.centuries();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(2000L, chronology27);
        boolean boolean34 = calendar14.after((java.lang.Object) 2000L);
        int int35 = calendar14.getWeekYear();
        java.lang.String str36 = calendar14.toString();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553784172,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=86399,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=15,MILLISECOND=828,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 19 16:50:15 UTC 142");
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 142 + "'", int35 == 142);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "java.util.GregorianCalendar[time=-57684553784172,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=86399,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=15,MILLISECOND=828,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str36, "java.util.GregorianCalendar[time=-57684553784172,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=86399,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=15,MILLISECOND=828,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        boolean boolean5 = dateTimeFormatter3.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant6 = org.joda.time.Instant.parse("Etc/UTC", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(53647989);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.millisOfSecond();
        java.util.Locale locale9 = new java.util.Locale("hi!", "", "");
        int int10 = dateTimeField5.getMaximumShortTextLength(locale9);
        java.lang.String str12 = dateTimeField5.getAsShortText(0L);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals(locale9.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970\" is malformed at \"70\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int3 = localDate0.indexOf(dateTimeFieldType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) int3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        int int15 = dateTimeField5.getMinimumValue();
        long long17 = dateTimeField5.roundHalfCeiling((long) 14);
        long long20 = dateTimeField5.addWrapField(1646664850926L, (int) (byte) 1);
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1678200850926L + "'", long20 == 1678200850926L);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMonthOfYear(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((-1));
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfDay();
        boolean boolean21 = durationFieldType17.isSupported(chronology19);
        java.lang.Object obj22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj22, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property27 = dateTime26.weekyear();
        java.lang.String str28 = property27.getAsText();
        int int29 = property27.get();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        int int32 = property27.compareTo((org.joda.time.ReadablePartial) localDate30);
        int[] intArray38 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology19.validate((org.joda.time.ReadablePartial) localDate30, intArray38);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = localDate30.getFieldType((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDate30);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664856433L + "'", long6 == 1646664856433L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2022" + "'", str28, "2022");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.util.Locale locale1 = new java.util.Locale("Chinese (China)");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "chinese (china)");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "chinese (china)");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "chinese (china)");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "chinese (china)");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        long long6 = java.util.Date.UTC(53654216, (int) (byte) -1, 70, 4, (-457392), 53637436);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1693161339379516000L + "'", long6 == 1693161339379516000L);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMillis(0);
        int int7 = dateTime6.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime6.withEra(53654216);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53654216 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        long long9 = dateTime8.getMillis();
        org.joda.time.DateTime.Property property10 = dateTime8.weekyear();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1645487999999L + "'", long9 == 1645487999999L);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = property12.addWrapFieldToCopy(0);
        org.joda.time.LocalDateTime localDateTime18 = property12.addToCopy(7);
        java.util.Locale locale19 = java.util.Locale.getDefault();
        java.lang.String str20 = property12.getAsText(locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = property12.addToCopy(1646664830921L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 164666483092100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664857118L + "'", long6 == 1646664857118L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology5 = chronology1.withZone(dateTimeZone4);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now(dateTimeZone4);
        org.joda.time.LocalDate localDate8 = localDate6.minusMonths(53637612);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localDate8.getFieldType(53625652);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53625652");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.setFirstDayOfWeek(12);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = calendar14.getMinimum((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=12,minimalDaysInFirstWeek=1,ERA=1,YEAR=48,MONTH=52,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=32769,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=32,MINUTE=1970,SECOND=17,MILLISECOND=190,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.lang.String[] strArray19 = new java.lang.String[] { "ISOChronology[UTC]", "Coordinated Universal Time", "00:01:36.999", "+00:00", "DateTimeField[dayOfYear]", "", "DateTimeField[yearOfCentury]", "2022", "", "+00:00", "hours", "2022-02-21T23:59:59.999Z", "DateTimeField[yearOfCentury]", "hours", "years", "DurationField[years]", "DurationField[years]", "", "DurationField[years]" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime24 = localTime22.minusMillis(0);
        org.joda.time.LocalTime localTime26 = localTime22.withSecondOfMinute((int) (short) 0);
        int int27 = localTime22.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = localTime22.getFields();
        org.joda.time.LocalTime.Property property29 = localTime22.hourOfDay();
        boolean boolean30 = strSet20.equals((java.lang.Object) localTime22);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.minuteOfDay();
        boolean boolean35 = durationFieldType31.isSupported(chronology33);
        org.joda.time.DateTimeField dateTimeField36 = chronology33.yearOfEra();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        int int38 = localDate37.getDayOfWeek();
        org.joda.time.LocalDate localDate40 = localDate37.withDayOfWeek(1);
        java.util.Locale locale44 = new java.util.Locale("hi!", "", "");
        java.lang.String str45 = dateTimeField36.getAsShortText((org.joda.time.ReadablePartial) localDate40, locale44);
        java.lang.Object obj46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(obj46, dateTimeZone47);
        org.joda.time.DateTime dateTime50 = dateTime48.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property51 = dateTime50.weekyear();
        java.lang.String str52 = property51.getAsText();
        int int53 = property51.get();
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology55 = localDate54.getChronology();
        int int56 = property51.compareTo((org.joda.time.ReadablePartial) localDate54);
        org.joda.time.LocalDate localDate57 = localDate40.withFields((org.joda.time.ReadablePartial) localDate54);
        org.joda.time.DurationFieldType durationFieldType58 = org.joda.time.DurationFieldType.months();
        boolean boolean59 = localDate40.isSupported(durationFieldType58);
        org.joda.time.DurationFieldType[] durationFieldTypeArray60 = new org.joda.time.DurationFieldType[] { durationFieldType58 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType[] durationFieldTypeArray61 = strSet20.toArray(durationFieldTypeArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53657280 + "'", int27 == 53657280);
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertEquals(locale44.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "2022" + "'", str45, "2022");
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "2022" + "'", str52, "2022");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2022 + "'", int53 == 2022);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(durationFieldType58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(durationFieldTypeArray60);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        java.time.ZoneId zoneId13 = timeZone11.toZoneId();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = calendar14.getActualMinimum(22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1645455257378,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=17,MILLISECOND=378,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
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
        org.joda.time.LocalDate localDate26 = localDate9.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = dateTime27.withHourOfDay(53628688);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53628688 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022" + "'", str21, "2022");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.clear();
        boolean boolean22 = calendar14.isWeekDateSupported();
        java.lang.String str23 = calendar14.toString();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]" + "'", str23, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
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
        org.joda.time.LocalDate localDate26 = localDate9.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate28 = localDate26.minusMonths(32769);
        org.joda.time.LocalDate localDate30 = localDate28.withDayOfMonth(21);
        org.joda.time.LocalDate.Property property31 = localDate28.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = localDate28.withDayOfYear(507);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 507 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022" + "'", str21, "2022");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        org.joda.time.LocalTime localTime6 = localTime4.plusHours((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.LocalTime.Property property8 = localTime4.property(dateTimeFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property8.addNoWrapToCopy((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(53627676);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime1.withHourOfDay(835);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 835 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.dayOfYear();
        org.joda.time.DurationField durationField12 = durationFieldType7.getField(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(53636186, 8, 1, 86399999, 53868668, (int) (byte) 10, (int) (byte) 10, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.months();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.dayOfYear();
        org.joda.time.DurationField durationField5 = durationFieldType0.getField(chronology2);
        java.lang.String str6 = durationFieldType0.toString();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "months" + "'", str6, "months");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        java.util.Date date21 = calendar14.getTime();
        calendar14.setMinimalDaysInFirstWeek(86399);
        // The following exception was thrown during execution in test generation
        try {
            calendar14.add(53651180, 53647989);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553781666,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=86399,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=18,MILLISECOND=334,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 19 16:50:18 UTC 142");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = property12.addWrapFieldToCopy(0);
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.minusMonths(53637095);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plus(readablePeriod23);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = localDateTime22.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664858387L + "'", long6 == 1646664858387L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 53635446);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.parse("", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        java.util.Date date21 = calendar14.getTime();
        calendar14.setMinimalDaysInFirstWeek(86399);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.minuteOfDay();
        boolean boolean29 = durationFieldType25.isSupported(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.yearOfEra();
        org.joda.time.DurationField durationField31 = chronology27.halfdays();
        org.joda.time.DurationField durationField32 = chronology27.centuries();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(2000L, chronology27);
        boolean boolean34 = calendar14.after((java.lang.Object) 2000L);
        int int35 = calendar14.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int37 = calendar14.get(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553781405,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=86399,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=18,MILLISECOND=595,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 19 16:50:18 UTC 142");
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 142 + "'", int35 == 142);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withYear(53630702);
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj6, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.weekyear();
        java.lang.String str12 = property11.getAsText();
        org.joda.time.DurationField durationField13 = property11.getDurationField();
        org.joda.time.DateTime dateTime14 = property11.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime16 = dateTime14.plusMillis(894);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.plus(readablePeriod17);
        org.joda.time.DateTime dateTime19 = localDateTime5.toDateTime((org.joda.time.ReadableInstant) dateTime18);
        int int20 = localDateTime5.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime5.withHourOfDay(53644241);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53644241 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.util.Date date1 = new java.util.Date((long) 893);
        date1.setHours(9);
        date1.setMinutes(0);
        java.time.Instant instant6 = date1.toInstant();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 09:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property5.getFieldType();
        org.joda.time.DateTime dateTime9 = property5.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        long long6 = java.util.Date.UTC(2021, 49, 53655758, 53647, 142, (-457392));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4697746597128000L + "'", long6 == 4697746597128000L);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
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
        org.joda.time.DateTime dateTime19 = dateTime6.plus(3164092594L);
        java.util.Date date20 = dateTime6.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime6.withDayOfMonth(53626437);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53626437 for dayOfMonth must be in the range [1,28]");
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
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Mon Feb 21 23:59:59 UTC 2022");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        boolean boolean8 = dateTime6.isAfter((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime6.minusDays(0);
        org.joda.time.DateTime dateTime12 = dateTime6.minusHours((int) (byte) 1);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime12.withSecondOfMinute(53640182);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640182 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(53635724, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.clear();
        java.util.TimeZone timeZone22 = calendar14.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            calendar14.setWeekDate(53630088, (int) 'u', 53640182);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 53640182");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.setFirstDayOfWeek((int) '4');
        calendar14.setMinimalDaysInFirstWeek(12);
        // The following exception was thrown during execution in test generation
        try {
            calendar14.clear((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=52,minimalDaysInFirstWeek=12,ERA=1,YEAR=48,MONTH=52,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=32769,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=32,MINUTE=1970,SECOND=19,MILLISECOND=946,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("dayOfMonth", (double) 1646664838691L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.646664838691E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        java.lang.Object obj3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(obj3, dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property8 = dateTime7.weekyear();
        long long9 = dateTime7.getMillis();
        org.joda.time.DateTime dateTime11 = dateTime7.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime11, dateTimeZone12);
        int int15 = localDateTime14.getYear();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.yearOfCentury();
        java.lang.Object obj22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(obj22, dateTimeZone23);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime24.toMutableDateTime();
        int int26 = dateTime24.getYearOfCentury();
        org.joda.time.YearMonthDay yearMonthDay27 = dateTime24.toYearMonthDay();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.minuteOfDay();
        boolean boolean33 = durationFieldType29.isSupported(chronology31);
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
        int[] intArray50 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology31.validate((org.joda.time.ReadablePartial) localDate42, intArray50);
        int[] intArray53 = dateTimeField21.set((org.joda.time.ReadablePartial) yearMonthDay27, (int) (byte) 0, intArray50, 16);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray55 = dateTimeField2.add((org.joda.time.ReadablePartial) localDateTime17, 53656897, intArray53, 292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53656897");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1646664860251L + "'", long9 == 1646664860251L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 22 + "'", int26 == 22);
        org.junit.Assert.assertNotNull(yearMonthDay27);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2022" + "'", str40, "2022");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2022 + "'", int41 == 2022);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[16, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[16, 2, 22, 100, 22]");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.setFirstDayOfWeek(12);
        // The following exception was thrown during execution in test generation
        try {
            calendar14.add(835, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=12,minimalDaysInFirstWeek=1,ERA=1,YEAR=48,MONTH=52,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=32769,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=32,MINUTE=1970,SECOND=20,MILLISECOND=319,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        int int13 = localDateTime11.getSecondOfMinute();
        org.joda.time.Chronology chronology14 = localDateTime11.getChronology();
        org.joda.time.LocalTime localTime15 = localDateTime11.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField17 = localTime15.getField(877);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 877");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664860576L + "'", long6 == 1646664860576L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime0.withField(dateTimeFieldType1, 53625652);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53625652 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
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
        int[] intArray21 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology2.validate((org.joda.time.ReadablePartial) localDate13, intArray21);
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.weekyear();
        long long29 = dateTime27.getMillis();
        org.joda.time.DateTime dateTime31 = dateTime27.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime33 = org.joda.time.DateTime.now(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime31, dateTimeZone32);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withMonthOfYear(2);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.plusWeeks((-1));
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int41 = localDate13.compareTo((org.joda.time.ReadablePartial) localDateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1646664861098L + "'", long29 == 1646664861098L);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        boolean boolean6 = durationFieldType2.isSupported(chronology4);
        org.joda.time.DateTimeField dateTimeField7 = chronology4.yearOfEra();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtMidnight(dateTimeZone9);
        int[] intArray12 = chronology4.get((org.joda.time.ReadablePartial) localDate8, (long) (-1));
        org.joda.time.DateTime dateTime13 = dateTime1.withChronology(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime13.withDate(53625652, 53643773, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53643773 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1969, 12, 31]");
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        boolean boolean5 = dateTimeFormatter3.isPrinter();
        boolean boolean6 = dateTimeFormatter3.isParser();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        int int9 = localDate7.getDayOfWeek();
        int int10 = localDate7.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        long long17 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) (byte) 0);
        java.util.TimeZone timeZone18 = dateTimeZone14.toTimeZone();
        java.lang.String str20 = dateTimeZone14.getShortName(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter3.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.parse("ISOChronology[UTC]", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.parse("Mon Feb 21 14:53:51 UTC 2022", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate2 = property1.roundHalfCeilingCopy();
        org.joda.time.DurationField durationField3 = property1.getRangeDurationField();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNull(durationField3);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(2000);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withHourOfDay(2);
        boolean boolean11 = dateTime8.isEqualNow();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.minusMillis(0);
        org.joda.time.LocalTime localTime16 = localTime12.withMillisOfDay((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, (int) (byte) 0);
        org.joda.time.DateTime dateTime20 = dateTime8.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.DateTime dateTime22 = dateTime8.plusYears(32769);
        java.util.Locale locale27 = new java.util.Locale("hi!", "", "");
        java.lang.String str28 = locale27.getDisplayScript();
        java.util.Locale.setDefault(locale27);
        java.lang.String str30 = locale27.getDisplayLanguage();
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale27.getDisplayCountry(locale31);
        java.lang.String str33 = dateTime22.toString("14:54:02.639", locale31);
        java.lang.Object obj34 = locale31.clone();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertEquals(locale27.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "14:54:02.639" + "'", str33, "14:54:02.639");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "en_CA");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "en_CA");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "en_CA");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfDay();
        org.joda.time.DurationField durationField7 = chronology5.months();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = chronology5.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(22, (int) (short) 100, 53868668, 57, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        java.lang.String str6 = property5.getAsText();
        int int7 = property5.get();
        org.joda.time.DurationField durationField8 = property5.getLeapDurationField();
        java.lang.String str9 = property5.getAsShortText();
        org.joda.time.DateTime dateTime11 = property5.addToCopy((long) (byte) 100);
        java.lang.String str12 = property5.getAsString();
        java.lang.String str13 = property5.getName();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "weekyear" + "'", str13, "weekyear");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
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
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.weekyearOfCentury();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        int int16 = localDate15.getDayOfWeek();
        org.joda.time.LocalDate localDate18 = localDate15.withDayOfWeek(1);
        int int19 = localDate18.getEra();
        long long21 = chronology12.set((org.joda.time.ReadablePartial) localDate18, 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) int10, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1645401600000L + "'", long21 == 1645401600000L);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        int int5 = dateTimeFormatter3.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.parse("weeks", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        java.util.Locale locale19 = new java.util.Locale("hi!", "", "");
        java.lang.String str20 = locale19.getDisplayScript();
        java.util.Locale.setDefault(locale19);
        java.util.Set<java.lang.String> strSet22 = locale19.getUnicodeLocaleAttributes();
        java.lang.String str23 = locale19.getLanguage();
        java.util.Locale locale26 = new java.util.Locale("2022-03-07T14:53:49.500Z", "2022-03-07T14:53:49.500Z");
        java.lang.String str27 = locale19.getDisplayLanguage(locale26);
        java.lang.String str28 = dateTimeField5.getAsShortText(53647989, locale26);
        java.util.Set<java.lang.String> strSet29 = locale26.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = strSet29.add("Thu");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertEquals(locale19.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals(locale26.toString(), "2022-03-07t14:53:49.500z_2022-03-07T14:53:49.500Z");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "53647989" + "'", str28, "53647989");
        org.junit.Assert.assertNotNull(strSet29);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(22, (-292275054), 53638338, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(53640182, 53638204, 100, 0, (int) (byte) 100, 53649428, 50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMonthOfYear(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime1.withHourOfDay(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        int int9 = dateTime6.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime6.withDayOfMonth(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 999 + "'", int9 == 999);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        int int6 = dateTimeField3.getDifference(1646664838338L, 1645455228738L);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        int int9 = localDate7.getDayOfWeek();
        int int10 = localDate7.getWeekyear();
        int int11 = dateTimeField3.getMinimumValue((org.joda.time.ReadablePartial) localDate7);
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 14 + "'", int6 == 14);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        org.joda.time.DurationField durationField4 = chronology2.months();
        org.joda.time.DurationField durationField5 = durationFieldType0.getField(chronology2);
        java.lang.String str6 = durationField5.getName();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hours" + "'", str6, "hours");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.setMinimalDaysInFirstWeek(9);
        int int23 = calendar14.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar14.clear((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553776682,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=9,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=23,MILLISECOND=318,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 142 + "'", int23 == 142);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology7 = chronology3.withZone(dateTimeZone6);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDate0.toDateTimeAtCurrentTime(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withDayOfMonth(53630702);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53630702 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("java.util.GregorianCalendar[time=-57684553784172,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=86399,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=15,MILLISECOND=828,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.util.gregoriancalendar[time=-57684553784172");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withWeekOfWeekyear(20);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.era();
        org.joda.time.LocalDateTime.Property property18 = localDateTime11.monthOfYear();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime20 = property18.roundHalfFloorCopy();
        int int21 = localDateTime20.getYearOfCentury();
        int int22 = localDateTime20.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType24 = localDateTime20.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664863583L + "'", long6 == 1646664863583L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        java.time.ZoneId zoneId13 = timeZone11.toZoneId();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getTimeZone(zoneId13);
        java.lang.String str15 = timeZone14.getDisplayName();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coordinated Universal Time" + "'", str15, "Coordinated Universal Time");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
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
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.LocalDate localDate2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate3 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate4 = property1.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDate4.getValue(59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 20, chronology1);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime dateTime10 = dateTime8.withHourOfDay(2);
        boolean boolean11 = dateTime8.isEqualNow();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.minusMillis(0);
        org.joda.time.LocalTime localTime16 = localTime12.withMillisOfDay((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, (int) (byte) 0);
        org.joda.time.DateTime dateTime20 = dateTime8.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        boolean boolean23 = dateTime20.equals((java.lang.Object) "00:10:00.097");
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime7 = localTime4.withPeriodAdded(readablePeriod5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localTime7.getValue(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 42);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        int int12 = dateTime11.getWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int14 = dateTime11.get(dateTimeFieldType13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone16);
        org.joda.time.LocalTime localTime19 = localTime17.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime17.toDateTimeToday(dateTimeZone20);
        int int22 = dateTime11.compareTo((org.joda.time.ReadableInstant) dateTime21);
        java.lang.Object obj23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(obj23, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property28 = dateTime27.weekyear();
        boolean boolean30 = dateTime27.equals((java.lang.Object) (-1.0f));
        org.joda.time.DateTime.Property property31 = dateTime27.millisOfSecond();
        org.joda.time.DateTime dateTime33 = dateTime27.minusMillis(86399);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTime27.getZone();
        org.joda.time.DateTime dateTime35 = dateTime21.toDateTime(dateTimeZone34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = dateTimeFormatter4.print((org.joda.time.ReadableInstant) dateTime35);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withWeekOfWeekyear(20);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime11.withDayOfYear(53650926);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53650926 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664864458L + "'", long6 == 1646664864458L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        java.util.Locale locale8 = new java.util.Locale("2022-02-21");
        java.util.Calendar calendar9 = dateTime4.toCalendar(locale8);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = calendar9.getMinimum(53660847);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53660847");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertEquals(locale8.toString(), "2022-02-21");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1646664864481,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=66,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=24,MILLISECOND=481,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getYear();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusWeeks((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType16 = localDateTime11.getFieldType(53642083);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53642083");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664864528L + "'", long6 == 1646664864528L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime9 = property7.addCopy(1646664835149L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property7.setCopy("2022-03-07T14:54:11.977Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-03-07T14:54:11.977Z\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53664581 + "'", int5 == 53664581);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = chronology1.dayOfYear();
        long long5 = dateTimeField3.roundFloor(1646664830989L);
        org.joda.time.DurationField durationField6 = dateTimeField3.getRangeDurationField();
        java.lang.Object obj7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj7, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property12 = dateTime11.weekyear();
        long long13 = dateTime11.getMillis();
        org.joda.time.DateTime dateTime15 = dateTime11.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime15, dateTimeZone16);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withMonthOfYear(2);
        boolean boolean23 = localDateTime18.equals((java.lang.Object) 53632276);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime18.withMillisOfDay(53646394);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology28 = localDate27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.weekyear();
        long long34 = chronology28.add((long) 2, (long) 59, 53628688);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology37 = localDate36.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.minuteOfDay();
        boolean boolean39 = durationFieldType35.isSupported(chronology37);
        org.joda.time.DateTimeField dateTimeField40 = chronology37.yearOfEra();
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate();
        int int42 = localDate41.getDayOfWeek();
        org.joda.time.LocalDate localDate44 = localDate41.withDayOfWeek(1);
        java.util.Locale locale48 = new java.util.Locale("hi!", "", "");
        java.lang.String str49 = dateTimeField40.getAsShortText((org.joda.time.ReadablePartial) localDate44, locale48);
        java.lang.Object obj50 = null;
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime(obj50, dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property55 = dateTime54.weekyear();
        java.lang.String str56 = property55.getAsText();
        int int57 = property55.get();
        org.joda.time.LocalDate localDate58 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology59 = localDate58.getChronology();
        int int60 = property55.compareTo((org.joda.time.ReadablePartial) localDate58);
        org.joda.time.LocalDate localDate61 = localDate44.withFields((org.joda.time.ReadablePartial) localDate58);
        org.joda.time.LocalDate localDate63 = localDate61.minusMonths(32769);
        org.joda.time.DurationFieldType durationFieldType64 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate65 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology66 = localDate65.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.minuteOfDay();
        boolean boolean68 = durationFieldType64.isSupported(chronology66);
        org.joda.time.DateTimeField dateTimeField69 = chronology66.yearOfEra();
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = localDate70.toDateTimeAtMidnight(dateTimeZone71);
        int[] intArray74 = chronology66.get((org.joda.time.ReadablePartial) localDate70, (long) (-1));
        chronology28.validate((org.joda.time.ReadablePartial) localDate61, intArray74);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray77 = dateTimeField3.addWrapPartial((org.joda.time.ReadablePartial) localDateTime18, 13, intArray74, 53642083);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1646611200000L + "'", long5 == 1646611200000L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1646664864965L + "'", long13 == 1646664864965L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3164092594L + "'", long34 == 3164092594L);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertEquals(locale48.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2022" + "'", str49, "2022");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "2022" + "'", str56, "2022");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2022 + "'", int57 == 2022);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[1969, 12, 31]");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        int int13 = localDateTime11.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.plusMonths(894);
        boolean boolean18 = localDateTime16.equals((java.lang.Object) 1646664849222L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant19 = new org.joda.time.Instant((java.lang.Object) localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664865005L + "'", long6 == 1646664865005L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53665005 + "'", int13 == 53665005);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        int int4 = dateTimeFormatter2.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter2.print(1646664843712L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2000 + "'", int4 == 2000);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(obj1, dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property6 = dateTime5.weekyear();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfHalfday();
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) dateTime5, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) durationFieldType0, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
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
        org.joda.time.LocalDate localDate26 = localDate9.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate28 = localDate26.minusMonths(32769);
        org.joda.time.LocalDate localDate30 = localDate28.withDayOfMonth(21);
        org.joda.time.LocalDate.Property property31 = localDate28.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = property31.setCopy("893");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"893\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022" + "'", str21, "2022");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate3 = localDate0.withDayOfWeek(1);
        org.joda.time.LocalDate.Property property4 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate6 = localDate0.minusDays(86399);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) localDate6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0);
        org.joda.time.LocalTime localTime3 = localTime1.plusHours(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        boolean boolean5 = localTime1.isSupported(dateTimeFieldType4);
        org.joda.time.DateTime dateTime6 = localTime1.toDateTimeToday();
        java.util.Locale locale11 = new java.util.Locale("hi!", "", "");
        java.lang.String str12 = locale11.getDisplayScript();
        java.util.Locale.setDefault(locale11);
        java.lang.String str14 = locale11.getDisplayLanguage();
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = locale11.getDisplayCountry(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localTime1.toString("0032-03-01T14:53:59.260", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals(locale11.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        int int13 = localDateTime11.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.weekOfWeekyear();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.minus(readableDuration15);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDateTime16.getValue(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664866036L + "'", long6 == 1646664866036L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53666036 + "'", int13 == 53666036);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        long long5 = durationField3.getValueAsLong((-1L));
        boolean boolean6 = durationField3.isPrecise();
        boolean boolean7 = durationField3.isSupported();
        boolean boolean8 = durationField3.isSupported();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
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
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = null;
        org.joda.time.format.DateTimeParser dateTimeParser28 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter27, dateTimeParser28);
        boolean boolean30 = dateTimeFormatter29.isPrinter();
        boolean boolean31 = dateTimeFormatter29.isPrinter();
        boolean boolean32 = dateTimeFormatter29.isParser();
        int int33 = dateTimeFormatter29.getDefaultYear();
        org.joda.time.format.DateTimeParser dateTimeParser34 = dateTimeFormatter29.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = dateTime4.toString(dateTimeFormatter29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664866089L + "'", long6 == 1646664866089L);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 894 + "'", int7 == 894);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 22 + "'", int17 == 22);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2000 + "'", int33 == 2000);
        org.junit.Assert.assertNull(dateTimeParser34);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        java.util.Date date21 = calendar14.getTime();
        // The following exception was thrown during execution in test generation
        try {
            calendar14.roll(53628688, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553773877,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=26,MILLISECOND=123,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 19 16:50:26 UTC 142");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.setWeekDefinition(53660185, 53649428);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMonthOfYear(2);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusMinutes((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withDayOfYear(53663998);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53663998 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664866292L + "'", long6 == 1646664866292L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        int int6 = dateTime4.getYear();
        java.util.Locale locale8 = new java.util.Locale("2022-02-21");
        java.util.Calendar calendar9 = dateTime4.toCalendar(locale8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = calendar9.isSet(53649071);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53649071");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertEquals(locale8.toString(), "2022-02-21");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1646664866344,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=66,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=26,MILLISECOND=344,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withYear(53630702);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withDayOfMonth(8);
        int int9 = localDateTime3.getValue(0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMonthOfYear(2);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withYearOfEra(64433670);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMillisOfDay(53637612);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime17.withDayOfMonth(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664866574L + "'", long6 == 1646664866574L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withMillisOfDay((int) 'a');
        org.joda.time.LocalTime localTime6 = localTime4.plusHours(7);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfDay();
        boolean boolean12 = durationFieldType8.isSupported(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfSecond();
        java.util.Locale locale17 = new java.util.Locale("hi!", "", "");
        int int18 = dateTimeField13.getMaximumShortTextLength(locale17);
        java.util.Set<java.lang.Character> charSet19 = locale17.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localTime6.toString("ISOChronology[Etc/UTC]", locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals(locale17.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(charSet19);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.clear();
        java.util.TimeZone timeZone22 = calendar14.getTimeZone();
        int int23 = calendar14.getFirstDayOfWeek();
        java.time.Instant instant24 = calendar14.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = calendar14.get(53906631);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53906631");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(instant24);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = property12.addWrapFieldToCopy(0);
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.minusMonths(53637095);
        int int23 = localDateTime16.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = localDateTime16.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664866771L + "'", long6 == 1646664866771L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.LocalDate localDate2 = property1.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate3 = property1.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate4 = property1.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate4.withCenturyOfEra(53660185);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53660185 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withWeekOfWeekyear(20);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.era();
        org.joda.time.LocalDateTime.Property property18 = localDateTime11.monthOfYear();
        org.joda.time.tz.NameProvider nameProvider20 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider20);
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = locale22.getDisplayVariant();
        java.lang.String str26 = nameProvider20.getShortName(locale22, "14:53:50.326", "ISOChronology[Etc/UTC]");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = property18.setCopy("35", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"35\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664866825L + "'", long6 == 1646664866825L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(nameProvider20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.util.Date date1 = new java.util.Date((long) 893);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromDateFields(date1);
        java.util.Date date6 = new java.util.Date(7, (int) (byte) -1, 32769);
        boolean boolean7 = date1.before(date6);
        java.util.Date date9 = new java.util.Date((long) 893);
        date9.setMonth(49);
        boolean boolean12 = date6.after(date9);
        java.lang.String str13 = date6.toString();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertEquals(date6.toString(), "Sun Aug 18 00:00:00 UTC 1996");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals(date9.toString(), "Fri Feb 01 00:00:00 UTC 1974");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sun Aug 18 00:00:00 UTC 1996" + "'", str13, "Sun Aug 18 00:00:00 UTC 1996");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.LocalTime.Property property7 = localTime0.hourOfDay();
        org.joda.time.LocalTime localTime9 = property7.addCopy((int) (short) -1);
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusMinutes(53637875);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDate13.toDateTimeAtMidnight(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int17 = dateTime15.get(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime12.get(dateTimeFieldType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53667167 + "'", int5 == 53667167);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
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
        int int11 = localDate8.size();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        int int14 = localDate12.getDayOfWeek();
        int int15 = localDate12.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDate12.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = localDate8.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime22 = dateTime20.minusHours(53643687);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime2.secondOfMinute();
        java.util.Locale locale12 = new java.util.Locale("2022-03-07T14:53:59.970Z", "years", "Chinese (China)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localTime2.toString("Chinese (China)", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale12.toString(), "2022-03-07t14:53:59.970z_YEARS_Chinese (China)");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.plusSeconds(4);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withYear(53637612);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime11.withHourOfDay(53650631);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53650631 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664867364L + "'", long6 == 1646664867364L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        calendar14.setMinimalDaysInFirstWeek(9);
        calendar14.setFirstDayOfWeek(0);
        int int25 = calendar14.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar14.setWeekDate(53637436, 12, 53635446);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 53635446");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553772377,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=0,minimalDaysInFirstWeek=9,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=27,MILLISECOND=623,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 142 + "'", int25 == 142);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        int int13 = localDateTime11.getSecondOfMinute();
        org.joda.time.Chronology chronology14 = localDateTime11.getChronology();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withCenturyOfEra((int) 'u');
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.era();
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withFieldAdded(durationFieldType18, 42864697);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664867778L + "'", long6 == 1646664867778L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27 + "'", int13 == 27);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(durationFieldType18);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.yearOfCentury();
        boolean boolean7 = durationFieldType3.isSupported(chronology5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(53663459, 53665587, 835, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53665587 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DurationField durationField3 = chronology1.millis();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.util.Locale locale3 = new java.util.Locale("hi!", "", "");
        java.lang.String str4 = locale3.getDisplayScript();
        java.util.Locale.setDefault(locale3);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleAttributes();
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology10 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.minuteOfDay();
        boolean boolean12 = durationFieldType8.isSupported(chronology10);
        org.joda.time.DateTimeField dateTimeField13 = chronology10.yearOfEra();
        org.joda.time.DurationField durationField14 = chronology10.halfdays();
        org.joda.time.DurationField durationField15 = chronology10.centuries();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(2000L, chronology10);
        org.joda.time.DateTimeField dateTimeField17 = chronology10.dayOfMonth();
        boolean boolean18 = strSet6.remove((java.lang.Object) dateTimeField17);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime21 = localTime19.minusMillis(0);
        org.joda.time.LocalTime localTime23 = localTime19.withSecondOfMinute((int) (short) 0);
        int int24 = localTime19.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = localTime19.getFields();
        org.joda.time.LocalTime.Property property26 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime28 = property26.addCopy((int) (short) -1);
        org.joda.time.LocalTime localTime30 = property26.setCopy((int) (byte) 1);
        int[] intArray32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray34 = dateTimeField17.addWrapPartial((org.joda.time.ReadablePartial) localTime30, 24, intArray32, 53651180);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53667987 + "'", int24 == 53667987);
        org.junit.Assert.assertNotNull(dateTimeFieldArray25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        boolean boolean5 = durationFieldType1.isSupported(chronology3);
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
        int[] intArray22 = new int[] { 32769, 2, 22, (byte) 100, 22 };
        chronology3.validate((org.joda.time.ReadablePartial) localDate14, intArray22);
        org.joda.time.DateTimeField dateTimeField24 = chronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType0.getField(chronology3);
        java.lang.Object obj26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(obj26, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property31 = dateTime30.weekyear();
        long long32 = dateTime30.getMillis();
        org.joda.time.DateTime dateTime34 = dateTime30.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime36 = org.joda.time.DateTime.now(dateTimeZone35);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime34, dateTimeZone35);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withMonthOfYear(2);
        boolean boolean42 = localDateTime37.equals((java.lang.Object) 53632276);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime37.withMillisOfDay(53646394);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology47 = localDate46.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField49 = chronology47.weekyear();
        long long53 = chronology47.add((long) 2, (long) 59, 53628688);
        org.joda.time.DurationFieldType durationFieldType54 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology56 = localDate55.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.minuteOfDay();
        boolean boolean58 = durationFieldType54.isSupported(chronology56);
        org.joda.time.DateTimeField dateTimeField59 = chronology56.yearOfEra();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate();
        int int61 = localDate60.getDayOfWeek();
        org.joda.time.LocalDate localDate63 = localDate60.withDayOfWeek(1);
        java.util.Locale locale67 = new java.util.Locale("hi!", "", "");
        java.lang.String str68 = dateTimeField59.getAsShortText((org.joda.time.ReadablePartial) localDate63, locale67);
        java.lang.Object obj69 = null;
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime(obj69, dateTimeZone70);
        org.joda.time.DateTime dateTime73 = dateTime71.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property74 = dateTime73.weekyear();
        java.lang.String str75 = property74.getAsText();
        int int76 = property74.get();
        org.joda.time.LocalDate localDate77 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology78 = localDate77.getChronology();
        int int79 = property74.compareTo((org.joda.time.ReadablePartial) localDate77);
        org.joda.time.LocalDate localDate80 = localDate63.withFields((org.joda.time.ReadablePartial) localDate77);
        org.joda.time.LocalDate localDate82 = localDate80.minusMonths(32769);
        org.joda.time.DurationFieldType durationFieldType83 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate84 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology85 = localDate84.getChronology();
        org.joda.time.DateTimeField dateTimeField86 = chronology85.minuteOfDay();
        boolean boolean87 = durationFieldType83.isSupported(chronology85);
        org.joda.time.DateTimeField dateTimeField88 = chronology85.yearOfEra();
        org.joda.time.LocalDate localDate89 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone90 = null;
        org.joda.time.DateTime dateTime91 = localDate89.toDateTimeAtMidnight(dateTimeZone90);
        int[] intArray93 = chronology85.get((org.joda.time.ReadablePartial) localDate89, (long) (-1));
        chronology47.validate((org.joda.time.ReadablePartial) localDate80, intArray93);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray96 = dateTimeField25.set((org.joda.time.ReadablePartial) localDateTime37, 53661354, intArray93, 53666965);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53666965 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[32769, 2, 22, 100, 22]");
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1646664868023L + "'", long32 == 1646664868023L);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 3164092594L + "'", long53 == 3164092594L);
        org.junit.Assert.assertNotNull(durationFieldType54);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertEquals(locale67.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "2022" + "'", str68, "2022");
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "2022" + "'", str75, "2022");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2022 + "'", int76 == 2022);
        org.junit.Assert.assertNotNull(chronology78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertNotNull(localDate82);
        org.junit.Assert.assertNotNull(durationFieldType83);
        org.junit.Assert.assertNotNull(chronology85);
        org.junit.Assert.assertNotNull(dateTimeField86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(dateTimeField88);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[1969, 12, 31]");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.util.Locale locale2 = new java.util.Locale("2022-03-07T14:53:49.500Z", "2022-03-07T14:53:49.500Z");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "2022-03-07t14:53:49.500z_2022-03-07T14:53:49.500Z");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        int int12 = localDateTime11.getHourOfDay();
        int int13 = localDateTime11.getWeekOfWeekyear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.weekOfWeekyear();
        java.lang.Object obj15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(obj15, dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property20 = dateTime19.weekyear();
        long long21 = dateTime19.getMillis();
        org.joda.time.DateTime dateTime23 = dateTime19.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime23, dateTimeZone24);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.plusHours(507);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.minus(readableDuration30);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.LocalDateTime.Property property33 = localDateTime31.property(dateTimeFieldType32);
        org.joda.time.LocalDateTime localDateTime35 = property33.addWrapFieldToCopy(0);
        boolean boolean36 = localDateTime11.isBefore((org.joda.time.ReadablePartial) localDateTime35);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime11.minusMillis(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime40 = localDateTime11.withWeekOfWeekyear((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664868110L + "'", long6 == 1646664868110L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1646664868111L + "'", long21 == 1646664868111L);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localDateTime38);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withWeekOfWeekyear(20);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.era();
        int int18 = localDateTime11.getHourOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664868139L + "'", long6 == 1646664868139L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isParser();
        int int6 = dateTimeFormatter2.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = dateTimeFormatter2.parseMutableDateTime("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) '#');
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology4 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfDay();
        boolean boolean6 = durationFieldType2.isSupported(chronology4);
        org.joda.time.DateTimeField dateTimeField7 = chronology4.yearOfEra();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtMidnight(dateTimeZone9);
        int[] intArray12 = chronology4.get((org.joda.time.ReadablePartial) localDate8, (long) (-1));
        org.joda.time.DateTime dateTime13 = dateTime1.withChronology(chronology4);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.Chronology chronology19 = chronology15.withZone(dateTimeZone18);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(dateTimeZone18);
        long long22 = dateTimeZone18.nextTransition(1692262126166400000L);
        org.joda.time.DateTime dateTime23 = dateTime1.withZone(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime23.withYearOfCentury(53658241);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53658241 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1969, 12, 31]");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1692262126166400000L + "'", long22 == 1692262126166400000L);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(86399);
        org.joda.time.DateTime dateTime6 = dateTime4.plusDays((int) (byte) 0);
        int int7 = dateTime4.getWeekyear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 86399 + "'", int7 == 86399);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isParser();
        int int6 = dateTimeFormatter2.getDefaultYear();
        org.joda.time.Chronology chronology7 = dateTimeFormatter2.getChronolgy();
        java.lang.StringBuffer stringBuffer8 = null;
        java.lang.Object obj9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(obj9, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property14 = dateTime13.weekyear();
        long long15 = dateTime13.getMillis();
        org.joda.time.DateTime dateTime17 = dateTime13.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime17, dateTimeZone18);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusHours(507);
        int int24 = localDateTime20.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer8, (org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2000 + "'", int6 == 2000);
        org.junit.Assert.assertNull(chronology7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1646664868526L + "'", long15 == 1646664868526L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        int int2 = localDate0.getDayOfWeek();
        int int3 = localDate0.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate0.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone7, (long) (byte) 0);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean12 = timeZone11.observesDaylightTime();
        int int13 = timeZone11.getRawOffset();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(timeZone11);
        calendar14.set(48, (int) '4', 32769, 32, 1970);
        java.util.Date date21 = calendar14.getTime();
        calendar14.setMinimalDaysInFirstWeek(86399);
        org.joda.time.DurationFieldType durationFieldType25 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.minuteOfDay();
        boolean boolean29 = durationFieldType25.isSupported(chronology27);
        org.joda.time.DateTimeField dateTimeField30 = chronology27.yearOfEra();
        org.joda.time.DurationField durationField31 = chronology27.halfdays();
        org.joda.time.DurationField durationField32 = chronology27.centuries();
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(2000L, chronology27);
        boolean boolean34 = calendar14.after((java.lang.Object) 2000L);
        int int35 = calendar14.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = calendar14.isSet(53635724);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53635724");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-57684553771407,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=86399,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=28,MILLISECOND=593,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date21);
// flaky:         org.junit.Assert.assertEquals(date21.toString(), "Thu Jan 19 16:50:28 GMT 142");
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 142 + "'", int35 == 142);
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
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        int int14 = localDateTime11.getYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withSecondOfMinute(57);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withWeekyear(58);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.weekyear();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.plusMillis(24);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664868653L + "'", long6 == 1646664868653L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 10);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusWeeks(53627676);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfEra();
        org.joda.time.LocalDate localDate8 = property7.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = localDateTime3.isEqual((org.joda.time.ReadablePartial) localDate8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("DateTimeField[dayOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"DateTimeField[dayOfYear]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.set(53625652, 53663486);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(53661354, 53636186, 52, (-1), 507);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(53642865, 877, (int) (short) 0, 893, 53660185, 53630702, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 893 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.minuteOfDay();
        org.joda.time.DurationField durationField3 = chronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = chronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = chronology1.eras();
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.monthOfYear();
        org.joda.time.LocalDate localDate2 = property1.roundCeilingCopy();
        org.joda.time.Chronology chronology3 = localDate2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.halfdayOfDay();
        int int5 = dateTimeField4.getMinimumValue();
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("00:01:36.999");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeField4.getAsText(53636950, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53636950");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        boolean boolean5 = dateTimeFormatter2.isParser();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        int int8 = localDate6.getDayOfWeek();
        int int9 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtStartOfDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) (byte) 0);
        java.util.TimeZone timeZone17 = dateTimeZone13.toTimeZone();
        java.lang.String str19 = dateTimeZone13.getShortName(0L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        java.util.Locale locale26 = new java.util.Locale("hi!", "", "");
        java.lang.String str27 = locale26.getDisplayScript();
        java.util.Locale.setDefault(locale26);
        java.lang.String str29 = locale26.getDisplayLanguage();
        java.util.Locale locale30 = java.util.Locale.CANADA;
        java.lang.String str31 = locale26.getDisplayCountry(locale30);
        java.lang.String str32 = dateTimeZone21.getName((long) 507, locale26);
        java.util.Locale locale33 = java.util.Locale.getDefault();
        java.lang.String str34 = locale26.getDisplayName(locale33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter2.withLocale(locale26);
        java.lang.StringBuffer stringBuffer36 = null;
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology39 = localDate38.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.minuteOfDay();
        boolean boolean41 = durationFieldType37.isSupported(chronology39);
        org.joda.time.DateTimeField dateTimeField42 = chronology39.yearOfEra();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        int int44 = localDate43.getDayOfWeek();
        org.joda.time.LocalDate localDate46 = localDate43.withDayOfWeek(1);
        java.util.Locale locale50 = new java.util.Locale("hi!", "", "");
        java.lang.String str51 = dateTimeField42.getAsShortText((org.joda.time.ReadablePartial) localDate46, locale50);
        java.lang.Object obj52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(obj52, dateTimeZone53);
        org.joda.time.DateTime dateTime56 = dateTime54.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property57 = dateTime56.weekyear();
        java.lang.String str58 = property57.getAsText();
        int int59 = property57.get();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology61 = localDate60.getChronology();
        int int62 = property57.compareTo((org.joda.time.ReadablePartial) localDate60);
        org.joda.time.LocalDate localDate63 = localDate46.withFields((org.joda.time.ReadablePartial) localDate60);
        org.joda.time.DateTime dateTime64 = localDate60.toDateTimeAtStartOfDay();
        boolean boolean66 = dateTime64.isAfter(1646664826106L);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer36, (org.joda.time.ReadableInstant) dateTime64);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals(locale26.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertEquals(locale50.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2022" + "'", str51, "2022");
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "2022" + "'", str58, "2022");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2022 + "'", int59 == 2022);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder2.setVariant("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setExtension('#', "yearOfEra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clearExtensions();
        java.util.Locale.Builder builder4 = builder1.removeUnicodeLocaleAttribute("DEU");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder4.setExtension('a', "14:54:16.897");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: 14:54:16.897 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        int int5 = dateTimeFormatter2.getDefaultYear();
        boolean boolean6 = dateTimeFormatter2.isPrinter();
        java.lang.StringBuffer stringBuffer7 = null;
        java.lang.Object obj8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(obj8, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property13 = dateTime12.weekyear();
        long long14 = dateTime12.getMillis();
        org.joda.time.DateTime dateTime16 = dateTime12.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime16, dateTimeZone17);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.centuryOfEra();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.dayOfMonth();
        org.joda.time.LocalDateTime.Property property23 = localDateTime19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusMinutes(53627676);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, (org.joda.time.ReadablePartial) localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1646664869551L + "'", long14 == 1646664869551L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("ISOChronology[Etc/UTC]", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=isochronology[etc/utc]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
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
        org.joda.time.DateTime dateTime21 = dateTime6.withDate(36, 2, (int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DateTime.Property property23 = dateTime21.property(dateTimeFieldType22);
        org.joda.time.DateTime.Property property24 = dateTime21.weekyear();
        org.joda.time.DurationField durationField25 = property24.getRangeDurationField();
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNull(durationField25);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology5 = localDate4.getChronology();
        int int6 = localDate4.getDayOfWeek();
        int int7 = localDate4.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtStartOfDay(dateTimeZone8);
        org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter2.withZone(dateTimeZone8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear(53630702);
        java.lang.StringBuffer stringBuffer15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone17);
        org.joda.time.LocalTime localTime20 = localTime18.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localTime18.toDateTimeToday(dateTimeZone21);
        int int23 = dateTime22.getWeekyear();
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime();
        org.joda.time.DateTime dateTime26 = dateTime24.withHourOfDay(2);
        boolean boolean27 = dateTime24.isEqualNow();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuffer15, (org.joda.time.ReadableInstant) dateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        int int2 = localDate1.getDayOfWeek();
        org.joda.time.LocalDate localDate4 = localDate1.withDayOfWeek(1);
        int int5 = localDate1.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        int int8 = localDate6.getDayOfWeek();
        int int9 = localDate6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDate6.toDateTimeAtStartOfDay(dateTimeZone10);
        java.util.TimeZone timeZone13 = dateTimeZone10.toTimeZone();
        org.joda.time.DateMidnight dateMidnight14 = localDate1.toDateMidnight(dateTimeZone10);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) (-457392), dateTimeZone10);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(dateTimeZone10);
        int int18 = dateTimeZone10.getOffsetFromLocal(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
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
        org.joda.time.LocalDate localDate26 = localDate9.withFields((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate.Property property27 = localDate23.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate29 = property27.addToCopy(0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022" + "'", str21, "2022");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(0);
        org.joda.time.LocalTime localTime4 = localTime0.withSecondOfMinute((int) (short) 0);
        int int5 = localTime0.getMillisOfDay();
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = localTime0.getFields();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime0.plus(readablePeriod7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime0.withHourOfDay(53630088);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53630088 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53670468 + "'", int5 == 53670468);
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(53636950);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
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
        org.joda.time.DateTime dateTime19 = dateTime6.minusMinutes((int) ' ');
        java.lang.Object obj20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(obj20, dateTimeZone21);
        org.joda.time.DateTime.Property property23 = dateTime22.weekOfWeekyear();
        boolean boolean24 = dateTime6.equals((java.lang.Object) dateTime22);
        org.joda.time.DateTime.Property property25 = dateTime22.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTime22.withYearOfCentury(53655758);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53655758 for yearOfCentury must be in the range [0,99]");
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
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        long long6 = java.util.Date.UTC(53658241, (-18), 10, 14, 53643773, (int) 'a');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1693291498635277000L + "'", long6 == 1693291498635277000L);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("893");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        java.lang.String str6 = property5.getAsText();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        org.joda.time.DateTime dateTime8 = property5.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localTime11.toDateTimeToday(dateTimeZone14);
        int int16 = dateTime15.getWeekyear();
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTime();
        org.joda.time.DateTime.Property property18 = dateTime15.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = dateTime15.toDateTime(dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withHourOfDay((int) (byte) 10);
        int int23 = property5.compareTo((org.joda.time.ReadableInstant) dateTime22);
        int int24 = property5.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022" + "'", str6, "2022");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-292275054) + "'", int24 == (-292275054));
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology2 = localDate1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.minuteOfDay();
        boolean boolean4 = durationFieldType0.isSupported(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.yearOfEra();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfWeek(1);
        java.util.Locale locale13 = new java.util.Locale("hi!", "", "");
        java.lang.String str14 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate9, locale13);
        org.joda.time.LocalDate.Property property15 = localDate9.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localDate9.toString("2022-02-21T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(locale13.toString(), "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
        org.junit.Assert.assertNotNull(property15);
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
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = property12.addWrapFieldToCopy(0);
        java.lang.Object obj17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj17, dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone22);
        org.joda.time.LocalTime localTime25 = localTime23.plusMillis(48);
        org.joda.time.LocalTime localTime27 = localTime25.minusMinutes(52);
        org.joda.time.LocalTime localTime29 = localTime25.minusMillis(16);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664871411L + "'", long6 == 1646664871411L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isPrinter();
        int int5 = dateTimeFormatter2.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = dateTimeFormatter2.parseLocalDateTime("0");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime2.withField(dateTimeFieldType3, 53664697);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53664697 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property7.setCopy(53651536);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53651536 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology1 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField2 = chronology1.yearOfCentury();
        org.joda.time.DurationField durationField3 = dateTimeField2.getDurationField();
        org.joda.time.DurationFieldType durationFieldType4 = durationField3.getType();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.yearOfCentury();
        org.joda.time.DurationField durationField8 = dateTimeField7.getDurationField();
        org.joda.time.DurationFieldType durationFieldType9 = durationField8.getType();
        long long12 = durationField8.add((long) (byte) 1, 10L);
        int int13 = durationField3.compareTo(durationField8);
        boolean boolean14 = durationField8.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = durationField8.subtract((long) 86399999, 1646664854216L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1646664854216");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 315532800001L + "'", long12 == 315532800001L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfWeek();
        org.joda.time.LocalDate localDate3 = localDate0.withDayOfWeek(1);
        org.joda.time.LocalDate localDate5 = localDate3.plusDays(1);
        org.joda.time.LocalDate.Property property6 = localDate3.yearOfEra();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = property6.compareTo(readablePartial7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 53640182);
        java.util.Calendar.Builder builder4 = builder0.setInstant(1646664830866L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder7 = builder4.set(53649253, 53630702);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology6 = localDate5.getChronology();
        int int7 = localDate5.getDayOfWeek();
        int int8 = localDate5.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate5.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter3.withZone(dateTimeZone9);
        org.joda.time.Chronology chronology14 = dateTimeFormatter13.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant15 = org.joda.time.Instant.parse("00:01:36.999", dateTimeFormatter13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNull(chronology14);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfEra();
        org.joda.time.LocalDate localDate2 = property1.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDate localDate4 = localDate2.minus(readablePeriod3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate4.withDayOfYear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(53671054);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(obj0, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withWeekOfWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property5 = dateTime4.weekyear();
        long long6 = dateTime4.getMillis();
        org.joda.time.DateTime dateTime8 = dateTime4.withWeekyear((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8, dateTimeZone9);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.centuryOfEra();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.millisOfSecond();
        int int14 = localDateTime11.getYear();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withSecondOfMinute(57);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime11.plus(readablePeriod17);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        int int21 = localDate19.getDayOfWeek();
        int int22 = localDate19.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localDate19.toDateTimeAtStartOfDay(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        long long29 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) (byte) 0);
        java.util.TimeZone timeZone30 = dateTimeZone26.toTimeZone();
        boolean boolean31 = timeZone30.observesDaylightTime();
        int int32 = timeZone30.getRawOffset();
        java.util.Calendar calendar33 = java.util.Calendar.getInstance(timeZone30);
        calendar33.set(48, (int) '4', 32769, 32, 1970);
        calendar33.setFirstDayOfWeek((int) '4');
        calendar33.setMinimalDaysInFirstWeek(12);
        int int45 = calendar33.getActualMaximum((int) (byte) 0);
        org.joda.time.LocalDate localDate46 = org.joda.time.LocalDate.fromCalendarFields(calendar33);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.secondOfDay();
        int int48 = localDate46.indexOf(dateTimeFieldType47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime50 = localDateTime18.withField(dateTimeFieldType47, 53651180);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53651180 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1646664872209L + "'", long6 == 1646664872209L);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(calendar33);
// flaky:         org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=-57684553767790,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=52,minimalDaysInFirstWeek=12,ERA=1,YEAR=142,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=19,DAY_OF_YEAR=19,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=50,SECOND=32,MILLISECOND=210,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField10 = chronology8.months();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.secondOfMinute();
        org.joda.time.DurationField durationField12 = chronology8.days();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((int) (byte) 0, (int) (short) 10, (int) (short) 0, 3, 835, 53651536, 53668749, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 835 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 42);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone6);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime7.toDateTimeToday(dateTimeZone10);
        int int12 = dateTime11.getWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime11.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime13.withHourOfDay(2);
        org.joda.time.DateTime dateTime16 = dateTime15.withLaterOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(2022, 26, 53642083, 53671054, 17, 53638227, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53671054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime6.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.toDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withHourOfDay((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime11.plus(readableDuration14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime11.withTime(11, 53649584, 53666205, 53635446);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53649584 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime8 = dateTime6.toDateTime();
        org.joda.time.DateTime.Property property9 = dateTime6.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.toDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime11.withField(dateTimeFieldType14, 53644241);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53644241 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
    }
}
