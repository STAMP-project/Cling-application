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
            java.util.Date date1 = new java.util.Date("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("South Korea", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        java.util.Locale locale5 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dateTimeField2.set((long) (byte) 1, "hi!", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 11, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(9, 1, (int) (short) -1, (int) (byte) -1, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll((int) 'a', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455482820,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=2,MILLISECOND=820,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localTime1.getValue(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeField2.set((long) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) ' ', 2, (int) (short) 0, 2, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("eras", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        int[] intArray10 = new int[] { 4, 0, 2, (short) 10 };
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        java.lang.String str15 = locale13.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = dateTimeField2.set((org.joda.time.ReadablePartial) localTime4, (int) (byte) 1, intArray10, "", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[4, 0, 2, 10]");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withFieldAdded(durationFieldType4, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("South Korea");
        java.util.Date date3 = new java.util.Date((long) (byte) -1);
        int int4 = date3.getDate();
        boolean boolean5 = timeZone1.inDaylightTime(date3);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals(date3.toString(), "Wed Dec 31 23:59:59 UTC 1969");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localTime8.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("South Korea");
        timeZone1.setID("South Korea");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone1.getOffset((int) (short) 0, 7, (int) (short) -1, (int) ' ', (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDate11.get(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        java.lang.String str2 = dateTimeFieldType0.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "minuteOfDay" + "'", str2, "minuteOfDay");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 0, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.plus(readableDuration13);
        org.joda.time.DateTime dateTime16 = dateTime11.withWeekOfWeekyear((int) (short) 10);
        int int17 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) dateTime16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((int) (byte) 100, (int) '#', (int) '4', (int) (byte) 100, 2, 31, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 37920000 + "'", int17 == 37920000);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
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
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.String str3 = calendar0.toString();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455484256,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=4,MILLISECOND=256,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.util.GregorianCalendar[time=1645455484256,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=4,MILLISECOND=256,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str3, "java.util.GregorianCalendar[time=1645455484256,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=4,MILLISECOND=256,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate2.withWeekOfWeekyear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.DateTime dateTime13 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime17 = dateTime10.toDateTime(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((int) (short) 10, (int) '4', (int) (byte) 10, (int) (short) -1, 1, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime4 = localTime1.withFields((org.joda.time.ReadablePartial) localTime3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime4.getValue(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 31");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        calendar0.setFirstDayOfWeek((int) (short) 0);
        boolean boolean5 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455484368,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=4,MILLISECOND=368,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        boolean boolean13 = localDate4.equals((java.lang.Object) dateTime10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property17 = localDate4.property(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDate11.toString("eras");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.clear(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455484648,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=4,MILLISECOND=648,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minuteOfDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        boolean boolean10 = dateTime2.equals((java.lang.Object) "eras");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime2.withTime(1970, (int) (short) 10, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTime();
        org.joda.time.Instant instant10 = instant8.toInstant();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(instant10);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
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
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withSecondOfMinute((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withYearOfCentury((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime5.toDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology13.get(readablePeriod14, (long) 31, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        java.util.Date date11 = new java.util.Date((long) (byte) -1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) date11, chronology12);
        int int14 = localTime13.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDate9.compareTo((org.joda.time.ReadablePartial) localTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 23:59:59 UTC 1969");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        boolean boolean4 = dateTimeField2.isLeap((long) 9);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone6);
        int int8 = localDate7.getDayOfMonth();
        java.util.Locale locale9 = java.util.Locale.TAIWAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeField2.getAsText((org.joda.time.ReadablePartial) localDate7, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime5.withYearOfCentury((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        java.util.Collection<java.lang.String> strCollection7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = strSet4.addAll(strCollection7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) 'a', 59, (int) (short) 1, 8, (int) 'u', 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int10 = dateTime8.get(dateTimeFieldType9);
        org.joda.time.DateTime dateTime11 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime15 = dateTime8.toDateTime(dateTimeZone14);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((int) (byte) 10, 6, (int) (byte) 0, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = property3.setCopy("java.util.GregorianCalendar[time=1645455484256,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=4,MILLISECOND=256,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.util.GregorianCalendar[time=1645455484256,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=4,MILLISECOND=256,ZONE_OFFSET=0,DST_OFFSET=0]\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        calendar0.setFirstDayOfWeek((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar0.getLeastMaximum((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455486652,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=6,MILLISECOND=652,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = property3.setCopy("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale1.getDisplayLanguage(locale4);
        java.util.Set<java.lang.String> strSet7 = locale1.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime16 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime20 = dateTime13.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) strSet7, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Collections$EmptySet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("millisOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=millisofday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime4 = localTime1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime9 = localTime6.withFields((org.joda.time.ReadablePartial) localTime8);
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 0, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.DateTime dateTime16 = property14.addWrapFieldToCopy((int) (byte) -1);
        boolean boolean17 = localTime6.equals((java.lang.Object) dateTime16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long22 = dateTimeZone19.adjustOffset((long) 9, true);
        java.lang.String str23 = dateTimeZone19.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) localTime6, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9L + "'", long22 == 9L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.100" + "'", str23, "+00:00:00.100");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.setCopy(31);
        org.joda.time.LocalTime localTime6 = property2.addWrapFieldToCopy(37920000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property2.setCopy("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"minuteOfDay\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.writePaddedInteger(writer0, (long) 59, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setWeekDate(16, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455487186,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=7,MILLISECOND=186,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime4 = localTime1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime9 = localTime6.withFields((org.joda.time.ReadablePartial) localTime8);
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime6);
        int int11 = localTime6.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType13.getField(chronology14);
        org.joda.time.ReadablePartial readablePartial16 = null;
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = dateTimeField15.getAsShortText(readablePartial16, (int) (byte) 1, locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = localTime6.toString("", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        calendar0.setFirstDayOfWeek((int) (short) 0);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        java.lang.Object obj6 = calendar0.clone();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455487309,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=7,MILLISECOND=309,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(obj6);
// flaky:         org.junit.Assert.assertEquals(obj6.toString(), "java.util.GregorianCalendar[time=1645455487309,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=7,MILLISECOND=309,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "java.util.GregorianCalendar[time=1645455487309,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=7,MILLISECOND=309,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "java.util.GregorianCalendar[time=1645455487309,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=7,MILLISECOND=309,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) 1);
        boolean boolean9 = localTime4.isBefore((org.joda.time.ReadablePartial) localTime8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localTime4.getFieldType(37920000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 37920000");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalTime localTime6 = localTime1.withField(dateTimeFieldType2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime6.withMinuteOfHour((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
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
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.util.Date date1 = new java.util.Date((long) (byte) -1);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) date1, chronology2);
        int int4 = localTime3.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime3.getValue(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 23:59:59 UTC 1969");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("South Korea");
        timeZone4.setID("South Korea");
        calendar0.setTimeZone(timeZone4);
        java.util.Locale locale10 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = timeZone4.getDisplayName(true, 8, locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455487902,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"South Korea\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=7,MILLISECOND=902,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.lang.String str5 = locale2.getDisplayLanguage(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = chronology14.get(readablePeriod16, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime10 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime14 = dateTime7.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType1.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((java.lang.Object) locale0, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37920000 + "'", int9 == 37920000);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.lang.String[] strArray14 = new java.lang.String[] { "gregory", "1970-01-01T00:00:00.000+10:32", "gregory", "37920001", "minuteOfDay", "37920001", "+00:00:00.100", "gregory", "GMT", "1970-01-01T00:00:00.000+10:32", "eras", "GMT", "GMT", "1" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.util.stream.Stream<java.lang.String> strStream17 = strList15.stream();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strStream17);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.DateTime dateTime13 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime17 = dateTime10.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType4.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(6, 37920000, 0, 23, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37920000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37920000 + "'", int12 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime7.toMutableDateTime(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime7.minus((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.withDayOfWeek(4);
        org.joda.time.LocalDate localDate14 = dateTime7.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.plus(readablePeriod15);
        org.joda.time.LocalDate.Property property17 = localDate16.weekyear();
        org.joda.time.LocalDate localDate18 = localDate4.withFields((org.joda.time.ReadablePartial) localDate16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate4.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.util.Date date1 = new java.util.Date((long) (byte) -1);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) date1, chronology2);
        date1.setMonth((int) (byte) -1);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromDateFields(date1);
        org.joda.time.LocalTime localTime8 = localTime6.withSecondOfMinute(53);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = localTime8.toString("", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Tue Dec 31 23:59:59 UTC 1968");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        boolean boolean11 = localDate9.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate13 = localDate9.plusYears(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate13.withMonthOfYear(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        int int13 = localDate11.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType14.getField(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property17 = localDate11.property(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime6.minus((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withDayOfWeek(4);
        boolean boolean14 = dateTime6.equals((java.lang.Object) "eras");
        int int15 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime16 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate2.withFieldAdded(durationFieldType17, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(durationFieldType17);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime1.property(dateTimeFieldType8);
        java.lang.String str11 = property10.getName();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = property10.getAsShortText(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = property10.setCopy("years");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"years\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37920000 + "'", int9 == 37920000);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "millisOfDay" + "'", str11, "millisOfDay");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37920001" + "'", str13, "37920001");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        int int10 = localDate9.getYearOfEra();
        org.joda.time.LocalDate.Property property11 = localDate9.dayOfYear();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = property11.compareTo(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime12 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime9.toDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType3.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.centuryOfEra();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 0, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime23.toMutableDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime23.minus((long) '#');
        org.joda.time.DateTime dateTime29 = dateTime23.withDayOfWeek(4);
        org.joda.time.LocalDate localDate30 = dateTime23.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.plus(readablePeriod31);
        org.joda.time.LocalDate.Property property33 = localDate32.weekyear();
        org.joda.time.LocalDate localDate34 = property33.withMinimumValue();
        org.joda.time.LocalDate.Property property35 = localDate34.yearOfEra();
        long long37 = chronology17.set((org.joda.time.ReadablePartial) localDate34, (long) 11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(69, (int) (short) -1, 5, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-9223372016611199989L) + "'", long37 == (-9223372016611199989L));
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime10.withDate(0, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) 'u');
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("+00:00:00.100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00:00.100\" is malformed at \":00:00.100\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime15 = dateTime11.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay16 = dateTime11.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.DateTime dateTime26 = dateTime23.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime30 = dateTime23.toDateTime(dateTimeZone29);
        org.joda.time.Chronology chronology31 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType17.getField(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.weekyear();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime35 = dateTime11.toMutableDateTime(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(14, (int) (byte) 1, (int) (short) 100, 12, 2, 8, chronology31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 37920000 + "'", int25 == 37920000);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime6 = localTime4.withHourOfDay((int) (byte) 10);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (short) 1);
        boolean boolean9 = localTime4.isBefore((org.joda.time.ReadablePartial) localTime8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) localTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("+00:00:00.100", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+00:00:00.100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("South Korea", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=south korea");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.util.Locale locale2 = new java.util.Locale("1", "+00:00:00.100");
        org.junit.Assert.assertEquals(locale2.toString(), "1_+00:00:00.100");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eras");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime6 = localTime3.withFields((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime11 = localTime8.withFields((org.joda.time.ReadablePartial) localTime10);
        int int12 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime8);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.lang.String str15 = localTime5.toString("1", locale14);
        org.joda.time.LocalTime localTime17 = localTime5.plusMinutes(1);
        org.joda.time.LocalTime localTime19 = localTime17.withMillisOfSecond(23);
        boolean boolean20 = languageRange1.equals((java.lang.Object) localTime17);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtMidnight(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate9.withCenturyOfEra((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime4 = localTime1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime9 = localTime6.withFields((org.joda.time.ReadablePartial) localTime8);
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime6);
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = localTime3.toString("1", locale12);
        org.joda.time.LocalTime localTime15 = localTime3.plusMinutes(1);
        org.joda.time.LocalTime localTime17 = localTime15.withMillisOfSecond(23);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        java.lang.String str19 = durationFieldType18.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = localTime15.withFieldAdded(durationFieldType18, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'years' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "years" + "'", str19, "years");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.minusDays(7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) localDate11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("South Korea");
        int int2 = timeZone1.getRawOffset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone1.getDisplayName(false, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        org.joda.time.LocalDate localDate14 = localDate9.withFieldAdded(durationFieldType12, 6);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) 37920000, dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone17.isLocalDateTimeGap(localDateTime19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) localDate9, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        calendar0.setFirstDayOfWeek((int) (short) 0);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(16, 37920);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455490236,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=10,MILLISECOND=236,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("millisOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"millisOfDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("South Korea");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(10);
        int int5 = timeZone1.getRawOffset();
        int int6 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.util.Locale locale3 = new java.util.Locale("", "South Korea", "1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime8 = localTime5.withFields((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime13 = localTime10.withFields((org.joda.time.ReadablePartial) localTime12);
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime10);
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.lang.String str17 = localTime7.toString("1", locale16);
        java.lang.String str18 = locale3.getDisplayScript(locale16);
        java.lang.String str19 = locale16.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "_SOUTH KOREA_1970-01-01");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en_CA" + "'", str19, "en_CA");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMinutes((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.DateTime dateTime18 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime22 = dateTime15.toDateTime(dateTimeZone21);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType9.getField(chronology23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withField(dateTimeFieldType26, 5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = localTime4.isBefore((org.joda.time.ReadablePartial) localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 37920000 + "'", int17 == 37920000);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("+00:00:00.100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 100);
        int int9 = localTime8.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37920197 + "'", int9 == 37920197);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("DateTimeField[hourOfDay]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = dateTime10.toString("DateTimeField[hourOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        org.joda.time.Interval interval5 = property4.toInterval();
        org.joda.time.LocalDate localDate6 = property4.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate6.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMinuteOfHour((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.minusDays(7);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDate11.getValue(37920197);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 37920197");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        boolean boolean18 = dateTimeField17.isLenient();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime11 = property9.addNoWrapToCopy((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = property9.setCopy("weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"weekOfWeekyear\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.writePaddedInteger(writer0, 1970, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.LocalDate localDate5 = localDate2.minusMonths(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate2.withDayOfWeek(37920);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37920 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 0, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.plus(readableDuration13);
        org.joda.time.DateTime dateTime16 = dateTime11.withWeekOfWeekyear((int) (short) 10);
        boolean boolean17 = dateTime8.equals((java.lang.Object) (short) 10);
        int int18 = dateTime8.getMinuteOfDay();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 37920000 + "'", int7 == 37920000);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        boolean boolean13 = localDate4.equals((java.lang.Object) dateTime10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readableDuration15);
        org.joda.time.DateTime dateTime17 = dateTime16.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime16.withMonthOfYear(37919999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37919999 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37920000 + "'", int12 == 37920000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.Instant instant10 = dateTime2.toInstant();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.plus(readableDuration11);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(instant12);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime6.minus((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withDayOfWeek(4);
        boolean boolean14 = dateTime6.equals((java.lang.Object) "eras");
        int int15 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime16 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property18 = localDate2.property(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        boolean boolean11 = localDate9.equals((java.lang.Object) 37920000);
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("");
        java.lang.String str15 = locale14.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDate9.toString("minuteOfDay", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int20 = dateTimeZone18.getOffsetFromLocal((long) 8);
        org.joda.time.DateTime dateTime21 = localDateTime16.toDateTime(dateTimeZone18);
        java.util.Date date22 = localDateTime16.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime16.withDayOfWeek(37920197);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37920197 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Feb 22 01:30:11 UTC 2022");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("eras");
        java.util.Locale locale2 = java.util.Locale.ITALY;
        boolean boolean3 = languageRange1.equals((java.lang.Object) locale2);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone17);
        org.joda.time.LocalDate.Property property19 = localDate18.weekOfWeekyear();
        org.joda.time.LocalDate.Property property20 = localDate18.centuryOfEra();
        long long21 = property20.remainder();
        org.joda.time.LocalDate localDate22 = property20.roundHalfCeilingCopy();
        int[] intArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = dateTimeField15.add((org.joda.time.ReadablePartial) localDate22, (int) (short) 100, intArray24, 37920197);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime14 = dateTime10.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay15 = dateTime10.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int24 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime29 = dateTime22.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType16.getField(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekyear();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime10.toMutableDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField35 = chronology30.millisOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology30.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(59, (int) (short) -1, (int) (byte) 1, 2, 0, chronology30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37920000 + "'", int24 == 37920000);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        boolean boolean3 = dateTimeField2.isLenient();
        long long5 = dateTimeField2.roundCeiling((long) 5);
        java.lang.String str7 = dateTimeField2.getAsText(32L);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime10.toMutableDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.minus((long) '#');
        org.joda.time.DateTime dateTime16 = dateTime10.withDayOfWeek(4);
        org.joda.time.LocalDate localDate17 = dateTime10.toLocalDate();
        int int18 = localDate17.getYearOfEra();
        org.joda.time.LocalDate.Property property19 = localDate17.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone25);
        org.joda.time.LocalDate.Property property27 = localDate26.weekOfWeekyear();
        int[] intArray31 = new int[] { 7, 100, (short) 10 };
        int int32 = dateTimeField23.getMinimumValue((org.joda.time.ReadablePartial) localDate26, intArray31);
        java.util.Locale locale34 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = dateTimeField2.set((org.joda.time.ReadablePartial) localDate17, (int) (short) 1, intArray31, "1970-01-01T00:00:00.000+10:32", locale34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T00:00:00.000+10:32\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5L + "'", long5 == 5L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "37920032" + "'", str7, "37920032");
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[7, 100, 10]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate13.withEra(37920000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37920000 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime16 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime20 = dateTime13.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType7.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.centuryOfEra();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 0, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime27.toMutableDateTime(chronology28);
        org.joda.time.DateTime dateTime31 = dateTime27.minus((long) '#');
        org.joda.time.DateTime dateTime33 = dateTime27.withDayOfWeek(4);
        org.joda.time.LocalDate localDate34 = dateTime27.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate34.plus(readablePeriod35);
        org.joda.time.LocalDate.Property property37 = localDate36.weekyear();
        org.joda.time.LocalDate localDate38 = property37.withMinimumValue();
        org.joda.time.LocalDate.Property property39 = localDate38.yearOfEra();
        long long41 = chronology21.set((org.joda.time.ReadablePartial) localDate38, (long) 11);
        org.joda.time.DurationField durationField42 = chronology21.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime((int) (byte) 1, (int) (short) 100, (int) (short) 100, (int) (short) -1, (int) (short) 1, 4, 37920000, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37920000 + "'", int15 == 37920000);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-9223372016611199989L) + "'", long41 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(durationField42);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) '4', 69, 50, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime8.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy(70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("South Korea");
        int int2 = timeZone1.getRawOffset();
        timeZone1.setRawOffset(10);
        java.util.Locale locale6 = new java.util.Locale("37920001");
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.lang.String str8 = timeZone1.getDisplayName(locale6);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "37920001");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Greenwich Mean Time" + "'", str8, "Greenwich Mean Time");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1970, 50, 1, (int) (byte) -1, (int) (short) 0, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        boolean boolean13 = localDate4.equals((java.lang.Object) dateTime10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.minus(readableDuration15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime16.withDate(37919999, (int) (byte) -1, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37920000 + "'", int12 == 37920000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.writeUnpaddedInteger(writer0, (long) 37919999);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale4.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet10 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str11 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet10);
        strSet10.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strSet10.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("ISOChronology[+10:32]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ISOChronology[+10:32]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        java.lang.Class<?> wildcardClass22 = localDateTime19.getClass();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale1.getDisplayLanguage(locale4);
        java.util.Set<java.lang.String> strSet7 = locale1.getUnicodeLocaleAttributes();
        java.lang.String str8 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("hi!");
        java.lang.String str2 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Greenwich Mean Time" + "'", str2, "Greenwich Mean Time");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        org.joda.time.DateTime dateTime9 = dateTime5.minus((long) '#');
        org.joda.time.DateTime dateTime11 = dateTime5.withDayOfWeek(4);
        org.joda.time.DateTime.Property property12 = dateTime5.weekyear();
        org.joda.time.DateTime dateTime14 = dateTime5.withYear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int16 = dateTime14.get(dateTimeFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = localTime1.withField(dateTimeFieldType15, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime16 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime20 = dateTime13.toDateTime(dateTimeZone19);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType7.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.weekyear();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.halfdayOfDay();
        org.joda.time.DurationField durationField25 = chronology21.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(100, 14, 31, 5, 52, 32, 50, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37920000 + "'", int15 == 37920000);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime.Property property7 = dateTime2.minuteOfHour();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTime dateTime15 = dateTime10.withWeekOfWeekyear((int) (short) 10);
        long long16 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.plus(readableDuration31);
        org.joda.time.DateTime dateTime34 = dateTime29.withWeekOfWeekyear((int) (short) 10);
        int int35 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(9, 12, 23, 4, 5, 14, 23, dateTimeZone26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) property7, dateTimeZone26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 37920000 + "'", int35 == 37920000);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        org.joda.time.LocalDate localDate14 = localDate9.withFieldAdded(durationFieldType12, 6);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property17.setCopy(31);
        org.joda.time.LocalTime localTime21 = property17.addWrapFieldToCopy(37920000);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDate9.compareTo((org.joda.time.ReadablePartial) localTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime10 = instant8.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = mutableDateTime10.toString("ISOChronology[+10:32]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMinutes((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField10 = localTime4.getField((int) (short) 0);
        int int11 = dateTimeField10.getMaximumValue();
        long long14 = dateTimeField10.add(5L, (int) '#');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime19 = localTime16.withFields((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime24 = localTime21.withFields((org.joda.time.ReadablePartial) localTime23);
        int int25 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 0, chronology27);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfCentury();
        org.joda.time.DateTime dateTime31 = property29.addWrapFieldToCopy((int) (byte) -1);
        boolean boolean32 = localTime21.equals((java.lang.Object) dateTime31);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType34.getField(chronology35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone38);
        org.joda.time.LocalDate.Property property40 = localDate39.weekOfWeekyear();
        int[] intArray44 = new int[] { 7, 100, (short) 10 };
        int int45 = dateTimeField36.getMinimumValue((org.joda.time.ReadablePartial) localDate39, intArray44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime51 = localTime48.withFields((org.joda.time.ReadablePartial) localTime50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(dateTimeZone52);
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime56 = localTime53.withFields((org.joda.time.ReadablePartial) localTime55);
        int int57 = localTime50.compareTo((org.joda.time.ReadablePartial) localTime53);
        java.util.Locale locale59 = java.util.Locale.CANADA;
        java.lang.String str60 = localTime50.toString("1", locale59);
        java.util.Set<java.lang.String> strSet61 = locale59.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray62 = dateTimeField10.set((org.joda.time.ReadablePartial) localTime21, 37919999, intArray44, "1", locale59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37919999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 23 + "'", int11 == 23);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 126000005L + "'", long14 == 126000005L);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[7, 100, 10]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime56);
// flaky:         org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "1" + "'", str60, "1");
        org.junit.Assert.assertNotNull(strSet61);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime6.minus((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withDayOfWeek(4);
        boolean boolean14 = dateTime6.equals((java.lang.Object) "eras");
        int int15 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime16 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate2.withWeekOfWeekyear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DurationField durationField18 = chronology14.years();
        org.joda.time.DurationField durationField19 = chronology14.weeks();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.eras();
        java.lang.String str2 = durationFieldType1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = localTime0.withFieldAdded(durationFieldType1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "eras" + "'", str2, "eras");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long5 = dateTimeField2.add((long) 1, 19);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone7);
        org.joda.time.LocalDate.Property property9 = localDate8.weekOfWeekyear();
        org.joda.time.LocalDate localDate10 = property9.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 0, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int18 = dateTime16.get(dateTimeFieldType17);
        boolean boolean19 = localDate10.equals((java.lang.Object) dateTime16);
        int int20 = localDate10.getWeekyear();
        org.joda.time.Chronology chronology21 = localDate10.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getRangeDurationType();
        boolean boolean24 = localDate10.isSupported(dateTimeFieldType22);
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("");
        java.lang.String str29 = locale26.getDisplayLanguage(locale28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localDate10, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 20L + "'", long5 == 20L);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37920000 + "'", int18 == 37920000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        java.util.Locale locale6 = new java.util.Locale("37920001");
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = calendar0.getDisplayName(50, (int) (short) 100, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455493831,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=13,MILLISECOND=841,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(locale6.toString(), "37920001");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        java.lang.Object obj6 = calendar0.clone();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455494030,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=14,MILLISECOND=40,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertNotNull(obj6);
// flaky:         org.junit.Assert.assertEquals(obj6.toString(), "java.util.GregorianCalendar[time=1645455494030,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=14,MILLISECOND=40,ZONE_OFFSET=10,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "java.util.GregorianCalendar[time=1645455494030,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=14,MILLISECOND=40,ZONE_OFFSET=10,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "java.util.GregorianCalendar[time=1645455494030,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=14,MILLISECOND=40,ZONE_OFFSET=10,DST_OFFSET=0]");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        int int7 = dateTimeField2.getMinimumValue();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime12 = localTime9.plusMinutes((int) (short) 100);
        org.joda.time.LocalTime localTime14 = localTime12.withHourOfDay((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType16.getField(chronology17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone20);
        org.joda.time.LocalDate.Property property22 = localDate21.weekOfWeekyear();
        int[] intArray26 = new int[] { 7, 100, (short) 10 };
        int int27 = dateTimeField18.getMinimumValue((org.joda.time.ReadablePartial) localDate21, intArray26);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = dateTimeField2.add((org.joda.time.ReadablePartial) localTime14, (int) 'u', intArray26, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[7, 100, 10]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.halfdayOfDay();
        org.joda.time.DurationField durationField18 = chronology14.hours();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone21);
        org.joda.time.LocalDate.Property property23 = localDate22.weekOfWeekyear();
        int[] intArray26 = new int[] { (short) 1, 23 };
        // The following exception was thrown during execution in test generation
        try {
            chronology14.validate((org.joda.time.ReadablePartial) localDate22, intArray26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 23 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 23]");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = localTime4.getFieldType(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        int int20 = localDateTime19.getEra();
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = dateTime21.withWeekOfWeekyear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.util.Date date1 = new java.util.Date((long) (byte) -1);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) date1, chronology2);
        long long4 = date1.getTime();
        java.util.Date date6 = new java.util.Date((long) (byte) -1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) date6, chronology7);
        date6.setSeconds(2);
        boolean boolean11 = date1.before(date6);
        date1.setYear((int) 'u');
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Sun Jan 01 00:00:00 GMT 2017");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:02 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMinutes((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField10 = localTime4.getField((int) (short) 0);
        long long12 = dateTimeField10.roundHalfCeiling((long) 2022);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        int int1 = org.joda.time.format.FormatUtils.calculateDigitCount((long) 53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.withMinimumValue();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 0, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.plus(readableDuration20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int23 = dateTime21.get(dateTimeFieldType22);
        org.joda.time.DateTime dateTime24 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime28 = dateTime21.toDateTime(dateTimeZone27);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = dateTimeFieldType15.getField(chronology29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withField(dateTimeFieldType32, 5);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.minusHours(23);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int40 = localDate13.compareTo((org.joda.time.ReadablePartial) localDateTime38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 37920000 + "'", int23 == 37920000);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) 37920197);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        boolean boolean11 = localDate9.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate13 = localDate9.plusYears(10);
        org.joda.time.LocalDate localDate15 = localDate13.minusYears((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate15.withDayOfMonth((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        org.joda.time.LocalDate localDate14 = localDate9.withFieldAdded(durationFieldType12, 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = localDate9.withField(dateTimeFieldType15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        long long6 = java.util.Date.UTC(59, 631, 37919999, 10, 12, 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3277600020721000L + "'", long6 == 3277600020721000L);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.setCopy(31);
        org.joda.time.LocalTime localTime6 = property2.addWrapFieldToCopy(37920000);
        boolean boolean7 = property2.isLeap();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 0, chronology10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime11.toMutableDateTime(chronology12);
        org.joda.time.DateTime dateTime15 = dateTime11.minus((long) '#');
        org.joda.time.DateTime dateTime17 = dateTime11.withDayOfWeek(4);
        org.joda.time.LocalDate localDate18 = dateTime11.toLocalDate();
        boolean boolean20 = localDate18.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate22 = localDate18.plusYears(10);
        org.joda.time.LocalDate localDate24 = localDate22.minusYears((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = property2.compareTo((org.joda.time.ReadablePartial) localDate24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.clear((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455494812,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=14,MILLISECOND=822,ZONE_OFFSET=10,DST_OFFSET=0]");
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        boolean boolean13 = localDate4.equals((java.lang.Object) dateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime10.withDayOfYear(631);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 631 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37920000 + "'", int12 == 37920000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime7 = property6.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime7.withField(dateTimeFieldType8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime.Property property7 = localTime4.hourOfDay();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int15 = dateTime13.get(dateTimeFieldType14);
        org.joda.time.DateTime dateTime16 = dateTime13.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean18 = dateTime16.isSupported(dateTimeFieldType17);
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType17.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localTime4.get(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37920000 + "'", int15 == 37920000);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(durationFieldType19);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 37920197, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withDayOfMonth((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.halfdayOfDay();
        org.joda.time.DurationField durationField18 = chronology14.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = chronology14.getDateTimeMillis(22, (int) (short) 1, 22, 37920197, 7, 37920197, 69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37920197 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        int int4 = calendar0.getActualMinimum(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType7.getField(chronology8);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        int int13 = dateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) localTime11);
        long long15 = dateTimeField9.roundCeiling(1L);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = locale17.getDisplayLanguage(locale19);
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str24 = locale17.getDisplayVariant(locale22);
        int int25 = dateTimeField9.getMaximumTextLength(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = calendar0.getDisplayName(37214189, 70, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455495196,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=15,MILLISECOND=206,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("GMT", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField17.set(1030851992L, "gregory");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"gregory\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        int int22 = localDateTime21.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfEra(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withWeekOfWeekyear(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        int int1 = org.joda.time.format.FormatUtils.calculateDigitCount((-37919999L));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.util.Date date1 = new java.util.Date((long) (byte) -1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime10 = dateTime7.withTimeAtStartOfDay();
        java.util.Date date11 = dateTime10.toDate();
        int int12 = date1.compareTo(date11);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37920000 + "'", int9 == 37920000);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Wed Dec 31 13:28:00 GMT 1969");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime2.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.ReadablePartial readablePartial3 = null;
        java.util.Locale locale6 = java.util.Locale.forLanguageTag("");
        java.lang.String str7 = dateTimeField2.getAsShortText(readablePartial3, (int) (byte) 1, locale6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone9);
        org.joda.time.LocalDate.Property property11 = localDate10.weekOfWeekyear();
        org.joda.time.LocalDate localDate12 = property11.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        boolean boolean21 = localDate12.equals((java.lang.Object) dateTime18);
        int int22 = localDate12.getMonthOfYear();
        int[] intArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = dateTimeField2.set((org.joda.time.ReadablePartial) localDate12, 292278993, intArray24, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37920000 + "'", int20 == 37920000);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime14 = dateTime10.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay15 = dateTime10.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int24 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime29 = dateTime22.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType16.getField(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekyear();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime10.toMutableDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField35 = chronology30.millisOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology30.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(23, 1970, 7, 292278993, 37920, chronology30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37920000 + "'", int24 == 37920000);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int20 = dateTimeZone18.getOffsetFromLocal((long) 8);
        org.joda.time.DateTime dateTime21 = localDateTime16.toDateTime(dateTimeZone18);
        java.util.Date date22 = localDateTime16.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType24 = localDateTime16.getFieldType(19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 19");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Feb 22 01:30:17 GMT 2022");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime6.minus((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withDayOfWeek(4);
        boolean boolean14 = dateTime6.equals((java.lang.Object) "eras");
        int int15 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime16 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes((int) 'u');
        int int19 = dateTime18.getWeekyear();
        int int20 = dateTime18.getSecondOfDay();
        org.joda.time.DateTime dateTime22 = dateTime18.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType24.getField(chronology25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone28);
        org.joda.time.LocalDate.Property property30 = localDate29.weekOfWeekyear();
        int[] intArray34 = new int[] { 7, 100, (short) 10 };
        int int35 = dateTimeField26.getMinimumValue((org.joda.time.ReadablePartial) localDate29, intArray34);
        long long38 = dateTimeField26.addWrapField((long) 32, 2022);
        java.util.Locale locale40 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale41 = java.util.Locale.UK;
        java.lang.String str42 = locale40.getDisplayName(locale41);
        int int43 = dateTimeField26.getMaximumTextLength(locale41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = dateTime22.toString("Greenwich Mean Time", locale41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 44940 + "'", int20 == 44940);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[7, 100, 10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 2054L + "'", long38 == 2054L);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 8 + "'", int43 == 8);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra(37919999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate14.withDayOfWeek((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime4 = localTime1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime9 = localTime6.withFields((org.joda.time.ReadablePartial) localTime8);
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 0, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.DateTime dateTime16 = property14.addWrapFieldToCopy((int) (byte) -1);
        boolean boolean17 = localTime6.equals((java.lang.Object) dateTime16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = localTime6.toString("Greenwich Mean Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int20 = dateTimeZone18.getOffsetFromLocal((long) 8);
        org.joda.time.DateTime dateTime21 = localDateTime16.toDateTime(dateTimeZone18);
        java.util.Date date22 = localDateTime16.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime16.withDate(37920, (int) '4', 5415578);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Tue Feb 22 01:30:17 GMT 2022");
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int13 = dateTime11.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime14 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime18 = dateTime11.toDateTime(dateTimeZone17);
        org.joda.time.Chronology chronology19 = dateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType5.getField(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.weekyear();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.centuryOfEra();
        org.joda.time.DurationField durationField23 = chronology19.years();
        org.joda.time.DateTimeField dateTimeField24 = chronology19.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(5415578, (int) 'x', 11, 86399999, 50, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37920000 + "'", int13 == 37920000);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime6.minus((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withDayOfWeek(4);
        boolean boolean14 = dateTime6.equals((java.lang.Object) "eras");
        int int15 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime16 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        long long17 = dateTime16.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property8 = dateTime2.millisOfSecond();
        org.joda.time.DateTime dateTime10 = dateTime2.plusMillis((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime2.withSecondOfMinute(44940);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44940 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (short) 1, 69, (int) 'x', 52, 6, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        int int22 = localDateTime21.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = localDateTime21.toString("years");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("1970-01-01", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1970-01-01");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone6);
        org.joda.time.LocalDate.Property property8 = localDate7.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property8.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime12.toMutableDateTime(chronology13);
        org.joda.time.DateTime dateTime16 = dateTime12.minus((long) '#');
        org.joda.time.DateTime dateTime18 = dateTime12.withDayOfWeek(4);
        org.joda.time.LocalDate localDate19 = dateTime12.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDate localDate21 = localDate19.plus(readablePeriod20);
        org.joda.time.LocalDate.Property property22 = localDate21.weekyear();
        org.joda.time.LocalDate localDate23 = localDate9.withFields((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) 0, chronology28);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.DateTime dateTime32 = dateTime29.plus(readableDuration31);
        org.joda.time.DateTime dateTime34 = dateTime29.withWeekOfWeekyear((int) (short) 10);
        int int35 = dateTimeZone26.getOffset((org.joda.time.ReadableInstant) dateTime34);
        long long37 = dateTimeZone26.nextTransition((long) '#');
        org.joda.time.DateTime dateTime38 = localDate23.toDateTimeAtMidnight(dateTimeZone26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(44940, (int) ' ', 37920000, 32770, 59, dateTimeZone26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 37920000 + "'", int35 == 37920000);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 35L + "'", long37 == 35L);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime6.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay11 = dateTime6.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime25 = dateTime18.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType12.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime6.toMutableDateTime(chronology26);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.millisOfDay();
        org.joda.time.DateTimeField dateTimeField32 = chronology26.dayOfWeek();
        org.joda.time.DurationField durationField33 = durationFieldType0.getField(chronology26);
        org.joda.time.DateTimeZone dateTimeZone34 = chronology26.getZone();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray37 = chronology26.get(readablePeriod35, (long) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37920000 + "'", int20 == 37920000);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType6.getField(chronology7);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        int int12 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.LocalTime localTime14 = localTime10.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property15 = localTime14.minuteOfHour();
        org.joda.time.DateTime dateTime16 = dateTime5.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime19.toMutableDateTime(chronology20);
        int int22 = mutableDateTime21.getDayOfWeek();
        org.joda.time.Chronology chronology23 = mutableDateTime21.getChronology();
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime5.toMutableDateTime(chronology23);
        org.joda.time.DurationField durationField25 = chronology23.centuries();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond(44940);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44940 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField3 = localTime1.getField(70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 70");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        int int4 = calendar0.getMinimum(6);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        int int7 = calendar5.getMaximum(11);
        java.lang.Object obj8 = null;
        boolean boolean9 = calendar5.before(obj8);
        java.lang.String str10 = calendar5.getCalendarType();
        int int12 = calendar5.getGreatestMinimum(0);
        java.util.Date date14 = new java.util.Date((long) (byte) -1);
        int int15 = date14.getDate();
        boolean boolean16 = calendar5.after((java.lang.Object) int15);
        int int17 = calendar0.compareTo(calendar5);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455497738,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=17,MILLISECOND=748,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455497739,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=17,MILLISECOND=749,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gregory" + "'", str10, "gregory");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.DateTime.Property property9 = dateTime2.weekyear();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int20 = dateTime18.get(dateTimeFieldType19);
        org.joda.time.DateTime dateTime21 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime25 = dateTime18.toDateTime(dateTimeZone24);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType12.getField(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyear();
        org.joda.time.DateTimeField dateTimeField29 = chronology26.centuryOfEra();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 0, chronology31);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime32.toMutableDateTime(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime32.minus((long) '#');
        org.joda.time.DateTime dateTime38 = dateTime32.withDayOfWeek(4);
        org.joda.time.LocalDate localDate39 = dateTime32.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDate localDate41 = localDate39.plus(readablePeriod40);
        org.joda.time.LocalDate.Property property42 = localDate41.weekyear();
        org.joda.time.LocalDate localDate43 = property42.withMinimumValue();
        org.joda.time.LocalDate.Property property44 = localDate43.yearOfEra();
        long long46 = chronology26.set((org.joda.time.ReadablePartial) localDate43, (long) 11);
        org.joda.time.DurationField durationField47 = chronology26.months();
        org.joda.time.DateTimeField dateTimeField48 = chronology26.year();
        java.lang.String str49 = chronology26.toString();
        org.joda.time.DurationField durationField50 = chronology26.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((java.lang.Object) property9, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37920000 + "'", int20 == 37920000);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-9223372016611199989L) + "'", long46 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ISOChronology[+10:32]" + "'", str49, "ISOChronology[+10:32]");
        org.junit.Assert.assertNotNull(durationField50);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("ISOChronology[+10:32]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'ISOChronology[+10:32]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        calendar0.setFirstDayOfWeek((int) (short) 0);
        int int5 = calendar0.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setWeekDate(22, 23, 44940);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 44940");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455498149,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=18,MILLISECOND=159,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = locale19.getScript();
        java.util.Calendar calendar21 = dateTime8.toCalendar(locale19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusMillis((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = localDateTime24.getValue(5415578);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 5415578");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime7.toMutableDateTime(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime7.minus((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.withDayOfWeek(4);
        org.joda.time.LocalDate localDate14 = dateTime7.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.plus(readablePeriod15);
        org.joda.time.LocalDate.Property property17 = localDate16.weekyear();
        org.joda.time.LocalDate localDate18 = localDate4.withFields((org.joda.time.ReadablePartial) localDate16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localDate18.toString("1970-01-01T00:00:00.000+10:32");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.roundFloorCopy();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.DateTimeField dateTimeField15 = property12.getField();
        int int17 = dateTimeField15.getMaximumValue(7L);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField15.set((long) 37919999, "1970-01-01T10:32:00.000+10:32");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T10:32:00.000+10:32\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 292278993 + "'", int17 == 292278993);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.util.Date date1 = new java.util.Date((long) (byte) -1);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) date1, chronology2);
        date1.setMonth((int) (byte) -1);
        date1.setHours(1);
        java.lang.Object obj8 = date1.clone();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Dec 01 01:00:00 GMT 1969");
        org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "Mon Dec 01 01:00:00 GMT 1969");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "Mon Dec 01 01:00:00 GMT 1969");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "Mon Dec 01 01:00:00 GMT 1969");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = dateTime2.withYearOfEra(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime2.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime12 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime9.toDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType3.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.centuryOfEra();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) 0, chronology22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime23.toMutableDateTime(chronology24);
        org.joda.time.DateTime dateTime27 = dateTime23.minus((long) '#');
        org.joda.time.DateTime dateTime29 = dateTime23.withDayOfWeek(4);
        org.joda.time.LocalDate localDate30 = dateTime23.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDate localDate32 = localDate30.plus(readablePeriod31);
        org.joda.time.LocalDate.Property property33 = localDate32.weekyear();
        org.joda.time.LocalDate localDate34 = property33.withMinimumValue();
        org.joda.time.LocalDate.Property property35 = localDate34.yearOfEra();
        long long37 = chronology17.set((org.joda.time.ReadablePartial) localDate34, (long) 11);
        org.joda.time.DurationField durationField38 = chronology17.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate(50, 37920, (int) '4', chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37920 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-9223372016611199989L) + "'", long37 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(durationField38);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        int int5 = property4.get();
        java.lang.Class<?> wildcardClass6 = property4.getClass();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 19 + "'", int5 == 19);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime6.minus((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withDayOfWeek(4);
        boolean boolean14 = dateTime6.equals((java.lang.Object) "eras");
        int int15 = dateTime6.getWeekyear();
        org.joda.time.DateTime dateTime16 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime18.withDate(19, 292278993, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.lang.String[] strArray33 = new java.lang.String[] { "1", "en_CA", "1970-01-01T10:32:00.000+10:32", "Thu", "eras", "+10:32", "70", "centuries", "-1", "-1", "70", "+10:32", "", "1", "1970-01-01T00:00:00.000+10:32", "GMT", "years", "37920032", "era", "centuries", "1970", "+10:32", "10:32:00.097", "+00:00:00.100", "32", "Greenwich Mean Time", "37920012", "hourOfDay", "era", "12:12:00.097", "millisOfDay", "en_CA", "years" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        java.util.Collection<java.lang.String> strCollection36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = strSet34.removeAll(strCollection36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 100, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("South Korea");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone1.getOffset(31, 37920197, (int) ' ', (int) 'a', 37214189, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455499509,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=19,MILLISECOND=509,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("South Korea");
        timeZone4.setID("South Korea");
        calendar0.setTimeZone(timeZone4);
        java.lang.String str8 = calendar0.toString();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455499518,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"South Korea\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=19,MILLISECOND=528,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.util.GregorianCalendar[time=1645455499518,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"South Korea\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=19,MILLISECOND=528,ZONE_OFFSET=10,DST_OFFSET=0]" + "'", str8, "java.util.GregorianCalendar[time=1645455499518,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"South Korea\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=19,MILLISECOND=528,ZONE_OFFSET=10,DST_OFFSET=0]");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("minuteOfDay", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes((int) (short) 100);
        java.lang.String str5 = localTime4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = localTime4.getFieldType(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32769");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12:12:00.097" + "'", str5, "12:12:00.097");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(69, 23, 1, 23, 19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 23 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        int int4 = calendar0.getActualMinimum(3);
        boolean boolean5 = calendar0.isWeekDateSupported();
        calendar0.set(10, (int) (byte) 10, (-1), 1970, 9, 7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = calendar0.isSet((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=10,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=-1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=1970,MINUTE=9,SECOND=7,MILLISECOND=745,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        boolean boolean11 = localDate9.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate13 = localDate9.plusYears(10);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 0, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.plus(readableDuration20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int23 = dateTime21.get(dateTimeFieldType22);
        org.joda.time.LocalTime.Property property24 = localTime15.property(dateTimeFieldType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property25 = localDate9.property(dateTimeFieldType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 37920000 + "'", int23 == 37920000);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime9 = dateTime5.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime5.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.plus(readableDuration16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime20 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime24 = dateTime17.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType11.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime5.toMutableDateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology25.hourOfHalfday();
        org.joda.time.LocalDate localDate32 = org.joda.time.LocalDate.now(chronology25);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology25);
        java.util.Locale locale35 = java.util.Locale.KOREAN;
        java.lang.String str36 = locale35.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = localDate33.toString("", locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 37920000 + "'", int19 == 37920000);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight5 = dateTime2.toDateMidnight();
        org.joda.time.DateTime dateTime6 = dateTime2.withTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime2.withHourOfDay(24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime9 = dateTime5.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime5.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.plus(readableDuration16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime20 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime24 = dateTime17.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType11.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime5.toMutableDateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField30 = chronology25.millisOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology25.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = chronology25.get(readablePeriod32, 37920000L, (long) 99);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 37920000 + "'", int19 == 37920000);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("SOUTH KOREA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=southkorea");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("1", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime8.plus(readableDuration10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int13 = dateTime11.get(dateTimeFieldType12);
        org.joda.time.DateTime dateTime14 = dateTime11.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime18 = dateTime11.toDateTime(dateTimeZone17);
        int int20 = dateTimeZone17.getStandardOffset((long) 9);
        long long22 = dateTimeZone17.convertUTCToLocal(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((int) 'x', (int) (short) 0, (-1), (-1), 1, 53, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37920000 + "'", int13 == 37920000);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37920000 + "'", int20 == 37920000);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 37920100L + "'", long22 == 37920100L);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = locale19.getScript();
        java.util.Calendar calendar21 = dateTime8.toCalendar(locale19);
        java.util.TimeZone timeZone22 = calendar21.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        java.lang.Object obj24 = timeZone22.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+10:32");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(obj24);
// flaky:         org.junit.Assert.assertEquals(obj24.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withMinuteOfHour((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime2.withHourOfDay((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.withMinimumValue();
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfEra();
        java.util.Date date16 = new java.util.Date((long) (byte) -1);
        date16.setTime((long) ' ');
        date16.setYear((int) 'u');
        int int21 = date16.getMonth();
        boolean boolean22 = localDate13.equals((java.lang.Object) int21);
        int int23 = localDate13.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Sun Jan 01 00:00:00 GMT 2017");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        boolean boolean10 = dateTime2.equals((java.lang.Object) "eras");
        int int11 = dateTime2.getWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime2.plusYears((int) (byte) 10);
        java.util.Locale locale18 = new java.util.Locale("", "South Korea", "1970-01-01");
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime23 = localTime20.withFields((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime28 = localTime25.withFields((org.joda.time.ReadablePartial) localTime27);
        int int29 = localTime22.compareTo((org.joda.time.ReadablePartial) localTime25);
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = localTime22.toString("1", locale31);
        java.lang.String str33 = locale18.getDisplayScript(locale31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = dateTime2.toString("GMT+10:32", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals(locale18.toString(), "_SOUTH KOREA_1970-01-01");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1" + "'", str32, "1");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withDayOfWeek(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        int int13 = localDate11.size();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType16.getField(chronology17);
        org.joda.time.LocalTime localTime20 = localTime15.withField(dateTimeFieldType16, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = localDate11.isAfter((org.joda.time.ReadablePartial) localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        boolean boolean4 = strSet2.equals((java.lang.Object) "gregory");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = strSet2.add("GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        int int7 = calendar0.getGreatestMinimum(0);
        java.util.Date date9 = new java.util.Date((long) (byte) -1);
        int int10 = date9.getDate();
        boolean boolean11 = calendar0.after((java.lang.Object) int10);
        java.lang.Object obj12 = calendar0.clone();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455500607,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=20,MILLISECOND=617,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
// flaky:         org.junit.Assert.assertEquals(obj12.toString(), "java.util.GregorianCalendar[time=1645455500607,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=20,MILLISECOND=617,ZONE_OFFSET=10,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "java.util.GregorianCalendar[time=1645455500607,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=20,MILLISECOND=617,ZONE_OFFSET=10,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "java.util.GregorianCalendar[time=1645455500607,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=20,MILLISECOND=617,ZONE_OFFSET=10,DST_OFFSET=0]");
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        boolean boolean3 = dateTimeField2.isLenient();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        int int10 = dateTimeField6.getMinimumValue((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.LocalTime localTime12 = localTime8.plusMinutes((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField14 = localTime8.getField((int) (short) 0);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str19 = locale17.getVariant();
        java.lang.String str20 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime8, (int) (short) 1, locale17);
        java.lang.Object obj21 = locale17.clone();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(3, 37920000, 32770, 10, 37920, 100, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37920 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.util.Date date5 = new java.util.Date(14, 23, 5, (int) (short) 0, 32);
        int int6 = date5.getYear();
        java.lang.Object obj7 = date5.clone();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Sun Dec 05 00:32:00 GMT 1915");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "Sun Dec 05 00:32:00 GMT 1915");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "Sun Dec 05 00:32:00 GMT 1915");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "Sun Dec 05 00:32:00 GMT 1915");
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("java.util.GregorianCalendar[time=1645455484256,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=4,MILLISECOND=256,ZONE_OFFSET=0,DST_OFFSET=0]", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=java.util.gregoriancalendar[time=1645455484256");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime.Property property4 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime6 = property4.withMaximumValue();
        boolean boolean8 = dateTime6.isEqual(126000005L);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate.Property property4 = localDate2.centuryOfEra();
        long long5 = property4.remainder();
        org.joda.time.LocalDate localDate6 = property4.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property4.setCopy("ISOChronology[+10:32]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[+10:32]\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime.Property property7 = localTime4.hourOfDay();
        long long8 = property7.remainder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property7.setCopy(5420956);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5420956 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1920097L + "'", long8 == 1920097L);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.lang.String[] strArray3 = new java.lang.String[] { "1", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet4 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet4, strArray3);
        boolean boolean6 = strSet4.isEmpty();
        org.joda.time.tz.NameProvider nameProvider7 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider7);
        org.joda.time.tz.NameProvider nameProvider9 = org.joda.time.DateTimeZone.getNameProvider();
        org.joda.time.DateTimeZone.setNameProvider(nameProvider9);
        org.joda.time.tz.NameProvider[] nameProviderArray11 = new org.joda.time.tz.NameProvider[] { nameProvider7, nameProvider9 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.tz.NameProvider[] nameProviderArray12 = strSet4.toArray(nameProviderArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nameProvider7);
        org.junit.Assert.assertNotNull(nameProvider9);
        org.junit.Assert.assertNotNull(nameProviderArray11);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        org.joda.time.LocalDateTime localDateTime25 = property24.getLocalDateTime();
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withHourOfDay(31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("DateTimeField[millisOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"DateTimeField[millisOfDay]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.clockhourOfDay();
        long long20 = dateTimeField18.roundHalfFloor(37920L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1680000L + "'", long20 == 1680000L);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        org.joda.time.LocalDate localDate14 = localDate9.withFieldAdded(durationFieldType12, 6);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDate localDate17 = localDate9.withFieldAdded(durationFieldType15, (int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate9.withFieldAdded(durationFieldType19, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdays' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        int int4 = calendar0.getActualMinimum(3);
        boolean boolean5 = calendar0.isWeekDateSupported();
        calendar0.set(10, (int) (byte) 10, (-1), 1970, 9, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = calendar0.getLeastMaximum(5420956);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5420956");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=10,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=-1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=1970,MINUTE=9,SECOND=7,MILLISECOND=450,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        boolean boolean11 = localDate9.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate13 = localDate9.plusYears(10);
        org.joda.time.Interval interval14 = localDate13.toInterval();
        int int15 = localDate13.getYear();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1980 + "'", int15 == 1980);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.util.Date date6 = new java.util.Date(12, 11, 1, (int) (byte) 10, (int) 'u', 0);
        date6.setSeconds(50);
        java.util.Date date10 = new java.util.Date((long) (byte) -1);
        date10.setTime((long) ' ');
        boolean boolean13 = date6.before(date10);
        java.lang.String str14 = date6.toString();
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Sun Dec 01 11:57:50 GMT 1912");
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Sun Dec 01 11:57:50 GMT 1912" + "'", str14, "Sun Dec 01 11:57:50 GMT 1912");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime.Property property7 = localTime4.hourOfDay();
        boolean boolean8 = property7.isLeap();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekOfWeekyear();
        org.joda.time.LocalDate localDate13 = property12.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime16.toMutableDateTime(chronology17);
        org.joda.time.DateTime dateTime20 = dateTime16.minus((long) '#');
        org.joda.time.DateTime dateTime22 = dateTime16.withDayOfWeek(4);
        org.joda.time.LocalDate localDate23 = dateTime16.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDate localDate25 = localDate23.plus(readablePeriod24);
        org.joda.time.LocalDate.Property property26 = localDate25.weekyear();
        org.joda.time.LocalDate localDate27 = localDate13.withFields((org.joda.time.ReadablePartial) localDate25);
        org.joda.time.LocalDate localDate29 = localDate27.withDayOfMonth(22);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = property7.compareTo((org.joda.time.ReadablePartial) localDate27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        calendar0.setWeekDate((-1), 3, 4);
        calendar0.set(16, 37920000, (int) (byte) 1, (int) (byte) -1, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = calendar0.isSet(5420956);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5420956");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=0,YEAR=16,MONTH=37920000,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=1,DAY_OF_YEAR=15,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=-1,MINUTE=0,SECOND=-1,MILLISECOND=718,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("SOUTH KOREA (1970-01-01)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"SOUTH KOREA (1970-01-01)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) 0, chronology17);
        org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.DateTime dateTime21 = dateTime18.plus(readableDuration20);
        org.joda.time.DateTime dateTime23 = dateTime18.withWeekOfWeekyear((int) (short) 10);
        int int24 = dateTimeZone15.getOffset((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(9, 12, 23, 4, 5, 14, 23, dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(16, 5419344, 32772, 59, 70, 1970, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37920000 + "'", int24 == 37920000);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long5 = dateTimeField2.add((long) 1, 19);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        int int9 = dateTime8.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = dateTime8.withYear(10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime14.toMutableDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime14.minus((long) '#');
        org.joda.time.DateTime dateTime20 = dateTime14.withDayOfWeek(4);
        boolean boolean22 = dateTime14.equals((java.lang.Object) "eras");
        boolean boolean23 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime14);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("");
        java.lang.String str26 = locale25.getScript();
        java.util.Calendar calendar27 = dateTime14.toCalendar(locale25);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime14);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusMillis((int) 'u');
        int[] intArray33 = new int[] { 20 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = dateTimeField2.addWrapPartial((org.joda.time.ReadablePartial) localDateTime30, 365, intArray33, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 365");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 20L + "'", long5 == 20L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[20]");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        int int7 = dateTime6.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        int int10 = dateTime6.getMinuteOfDay();
        java.util.GregorianCalendar gregorianCalendar11 = dateTime6.toGregorianCalendar();
        gregorianCalendar11.setFirstDayOfWeek(100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = gregorianCalendar11.getMaximum(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 70 + "'", int9 == 70);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 631 + "'", int10 == 631);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.halfdayOfDay();
        org.joda.time.DurationField durationField18 = chronology14.hours();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = chronology14.get(readablePeriod20, 3277600020721000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(37919999);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        int int4 = calendar0.getActualMinimum(3);
        boolean boolean5 = calendar0.isWeekDateSupported();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        long long7 = calendar0.getTimeInMillis();
        java.lang.Object obj8 = calendar0.clone();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455501950,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=21,MILLISECOND=960,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDate6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1645455501950L + "'", long7 == 1645455501950L);
        org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "java.util.GregorianCalendar[time=1645455501950,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=21,MILLISECOND=960,ZONE_OFFSET=10,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "java.util.GregorianCalendar[time=1645455501950,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=21,MILLISECOND=960,ZONE_OFFSET=10,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "java.util.GregorianCalendar[time=1645455501950,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=21,MILLISECOND=960,ZONE_OFFSET=10,DST_OFFSET=0]");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.Instant instant10 = dateTime2.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getRangeDurationType();
        boolean boolean13 = instant10.isSupported(dateTimeFieldType11);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Instant instant15 = instant10.minus(readableDuration14);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(instant15);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1970-01-01");
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int10 = dateTime8.get(dateTimeFieldType9);
        org.joda.time.DateTime dateTime11 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime15 = dateTime8.toDateTime(dateTimeZone14);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType2.getField(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.weekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology16.centuryOfEra();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 0, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime22.toMutableDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime22.minus((long) '#');
        org.joda.time.DateTime dateTime28 = dateTime22.withDayOfWeek(4);
        org.joda.time.LocalDate localDate29 = dateTime22.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDate localDate31 = localDate29.plus(readablePeriod30);
        org.joda.time.LocalDate.Property property32 = localDate31.weekyear();
        org.joda.time.LocalDate localDate33 = property32.withMinimumValue();
        org.joda.time.LocalDate.Property property34 = localDate33.yearOfEra();
        long long36 = chronology16.set((org.joda.time.ReadablePartial) localDate33, (long) 11);
        org.joda.time.DateTime dateTime37 = dateTime1.withChronology(chronology16);
        int int38 = dateTime37.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37920000 + "'", int10 == 37920000);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-9223372016611199989L) + "'", long36 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.monthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.minusMillis(86399999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withDayOfYear(5420956);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5420956 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.writePaddedInteger(writer0, (int) '4', 32772);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("South Korea");
        timeZone4.setID("South Korea");
        calendar0.setTimeZone(timeZone4);
        java.lang.Object obj8 = timeZone4.clone();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455502127,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"South Korea\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=22,MILLISECOND=137,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "sun.util.calendar.ZoneInfo[id=\"South Korea\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "sun.util.calendar.ZoneInfo[id=\"South Korea\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "sun.util.calendar.ZoneInfo[id=\"South Korea\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime9 = dateTime5.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfMonth(2);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Calendar calendar13 = dateTime9.toCalendar(locale12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calendar13.getMaximum((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=-61133702400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=32,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("1970-01-01", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr_CA" + "'", str1, "fr_CA");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(5419344, (int) '4', 37214189, 0, 1, 3, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.util.Date date6 = new java.util.Date(0, 1, 99, 5419344, (int) (byte) 10, 69);
        java.lang.String str7 = date6.toGMTString();
        java.util.Date date9 = new java.util.Date((long) (byte) -1);
        java.util.Date date11 = new java.util.Date((long) (byte) -1);
        date11.setTime((long) ' ');
        boolean boolean14 = date9.after(date11);
        int int15 = date6.compareTo(date9);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Thu Aug 04 00:11:09 GMT 2518");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4 Aug 2518 00:11:08 GMT" + "'", str7, "4 Aug 2518 00:11:08 GMT");
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (long) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime.Property property7 = dateTime2.minuteOfHour();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTime dateTime15 = dateTime10.withWeekOfWeekyear((int) (short) 10);
        long long16 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime10);
        java.lang.String str17 = property7.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        int int21 = dateTimeZone19.getOffsetFromLocal((long) 8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) property7, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32" + "'", str17, "32");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime20.toMutableDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime20.withDayOfWeek(4);
        org.joda.time.LocalDate localDate27 = dateTime20.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.LocalDate.Property property30 = localDate29.weekyear();
        org.joda.time.LocalDate localDate31 = property30.withMinimumValue();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfEra();
        long long34 = chronology14.set((org.joda.time.ReadablePartial) localDate31, (long) 11);
        org.joda.time.DurationField durationField35 = chronology14.months();
        org.joda.time.DateTimeField dateTimeField36 = chronology14.year();
        java.lang.String str37 = chronology14.toString();
        org.joda.time.DateTimeField dateTimeField38 = chronology14.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long43 = chronology14.getDateTimeMillis(22, 7, 70, 44940);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-9223372016611199989L) + "'", long34 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ISOChronology[+10:32]" + "'", str37, "ISOChronology[+10:32]");
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long5 = dateTimeField2.set((long) 6, "1");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        int int9 = dateTime8.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = dateTime8.withYear(10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime14.toMutableDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime14.minus((long) '#');
        org.joda.time.DateTime dateTime20 = dateTime14.withDayOfWeek(4);
        boolean boolean22 = dateTime14.equals((java.lang.Object) "eras");
        boolean boolean23 = dateTime8.isEqual((org.joda.time.ReadableInstant) dateTime14);
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("");
        java.lang.String str26 = locale25.getScript();
        java.util.Calendar calendar27 = dateTime14.toCalendar(locale25);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime14);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 0, chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.plus(readableDuration35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int38 = dateTime36.get(dateTimeFieldType37);
        org.joda.time.DateTime dateTime39 = dateTime36.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime43 = dateTime36.toDateTime(dateTimeZone42);
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType30.getField(chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.weekyear();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.centuryOfEra();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 0, chronology49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime50.toMutableDateTime(chronology51);
        org.joda.time.DateTime dateTime54 = dateTime50.minus((long) '#');
        org.joda.time.DateTime dateTime56 = dateTime50.withDayOfWeek(4);
        org.joda.time.LocalDate localDate57 = dateTime50.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDate localDate59 = localDate57.plus(readablePeriod58);
        org.joda.time.LocalDate.Property property60 = localDate59.weekyear();
        org.joda.time.LocalDate localDate61 = property60.withMinimumValue();
        org.joda.time.LocalDate.Property property62 = localDate61.yearOfEra();
        long long64 = chronology44.set((org.joda.time.ReadablePartial) localDate61, (long) 11);
        int[] intArray65 = localDate61.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray67 = dateTimeField2.addWrapPartial((org.joda.time.ReadablePartial) localDateTime28, 9, intArray65, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-37919999L) + "'", long5 == (-37919999L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 37920000 + "'", int38 == 37920000);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-9223372016611199989L) + "'", long64 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[-292275054, 1, 6]");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("millisOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=millisofday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime9 = dateTime5.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime5.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.plus(readableDuration16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int19 = dateTime17.get(dateTimeFieldType18);
        org.joda.time.DateTime dateTime20 = dateTime17.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime24 = dateTime17.toDateTime(dateTimeZone23);
        org.joda.time.Chronology chronology25 = dateTime24.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType11.getField(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime5.toMutableDateTime(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            long long37 = chronology25.getDateTimeMillis((int) 'u', (int) ' ', 21, 22, (-292275054), 5420956, 51);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 37920000 + "'", int19 == 37920000);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("Thu");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Thu\" is malformed at \"hu\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime4 = localTime1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime9 = localTime6.withFields((org.joda.time.ReadablePartial) localTime8);
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime6);
        int int11 = localTime6.getHourOfDay();
        org.joda.time.LocalTime localTime13 = localTime6.plusMinutes(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = localTime13.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.io.Writer writer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.writeUnpaddedInteger(writer0, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        int int10 = localDate9.getYearOfEra();
        org.joda.time.LocalDate.Property property11 = localDate9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone13);
        org.joda.time.LocalDate.Property property15 = localDate14.weekOfWeekyear();
        org.joda.time.LocalDate localDate16 = property15.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime19.toMutableDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime19.minus((long) '#');
        org.joda.time.DateTime dateTime25 = dateTime19.withDayOfWeek(4);
        org.joda.time.LocalDate localDate26 = dateTime19.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDate localDate28 = localDate26.plus(readablePeriod27);
        org.joda.time.LocalDate.Property property29 = localDate28.weekyear();
        org.joda.time.LocalDate localDate30 = localDate16.withFields((org.joda.time.ReadablePartial) localDate28);
        int int31 = property11.compareTo((org.joda.time.ReadablePartial) localDate30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = localDate30.withMonthOfYear(5421637);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5421637 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime2.toMutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        long long18 = dateTimeZone15.adjustOffset((long) 9, true);
        java.lang.String str19 = dateTimeZone15.getID();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        org.joda.time.ReadablePartial readablePartial24 = null;
        java.util.Locale locale27 = java.util.Locale.forLanguageTag("");
        java.lang.String str28 = dateTimeField23.getAsShortText(readablePartial24, (int) (byte) 1, locale27);
        java.lang.String str29 = dateTimeZone15.getShortName(20L, locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = mutableDateTime12.toString("eras", locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9L + "'", long18 == 9L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.100" + "'", str19, "+00:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1" + "'", str28, "1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.100" + "'", str29, "+00:00:00.100");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 631);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(5416138);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5416138 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GMT\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setWeekDate((int) 'u', (-292275054), 5421637);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 5421637");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455502965,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=22,MILLISECOND=975,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField10 = localTime8.getField(1);
        org.joda.time.LocalTime localTime12 = localTime8.withMinuteOfHour(50);
        org.joda.time.LocalTime.Property property13 = localTime12.hourOfDay();
        org.joda.time.LocalTime localTime14 = property13.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = property13.addNoWrapToCopy(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = locale19.getScript();
        java.util.Calendar calendar21 = dateTime8.toCalendar(locale19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8);
        org.joda.time.DateTime dateTime24 = dateTime8.withHourOfDay((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime8.withMinuteOfHour((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime1.property(dateTimeFieldType8);
        java.lang.String str11 = property10.getName();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = property10.getAsShortText(locale12);
        java.lang.String str14 = locale12.toString();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37920000 + "'", int9 == 37920000);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "millisOfDay" + "'", str11, "millisOfDay");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37920001" + "'", str13, "37920001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en_GB" + "'", str14, "en_GB");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) property2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone6);
        org.joda.time.Chronology chronology8 = localDate7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(69, 12, 11, 100, 2, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime9 = dateTime7.plusMonths(37919999);
        org.joda.time.LocalDate localDate10 = dateTime9.toLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        int int18 = dateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) localTime16);
        boolean boolean19 = dateTimeField14.isSupported();
        long long22 = dateTimeField14.add((long) 631, 1645455491851L);
        java.util.Locale locale24 = new java.util.Locale("37920001");
        int int25 = dateTimeField14.getMaximumShortTextLength(locale24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = localDate10.toString("", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1645455492482L + "'", long22 == 1645455492482L);
        org.junit.Assert.assertEquals(locale24.toString(), "37920001");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime();
        int int8 = dateTime2.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime2.withEra(23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 23 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(10, 9, 1980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1980 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, 23L, 37919999);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTime dateTime7 = dateTime2.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime9 = dateTime2.withMonthOfYear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime2.minus(readablePeriod10);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 0, chronology13);
        org.joda.time.DateTime.Property property15 = dateTime14.yearOfCentury();
        org.joda.time.DateTime.Property property16 = dateTime14.yearOfCentury();
        org.joda.time.DateTime dateTime17 = property16.roundFloorCopy();
        boolean boolean18 = dateTime11.isBefore((org.joda.time.ReadableInstant) dateTime17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime17.withCenturyOfEra(37214189);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37214189 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("South Korea");
        timeZone4.setID("South Korea");
        calendar0.setTimeZone(timeZone4);
        boolean boolean8 = timeZone4.useDaylightTime();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455503704,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"South Korea\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=23,MILLISECOND=714,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.add(37920097, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455503921,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=23,MILLISECOND=931,ZONE_OFFSET=10,DST_OFFSET=0]");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime4 = localTime1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime9 = localTime6.withFields((org.joda.time.ReadablePartial) localTime8);
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime3.minus(readablePeriod11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localTime3.toString("greenwich mean time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: g");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, 365, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        int int22 = localDateTime21.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfEra(11);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.minus(readableDuration25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plus(readablePeriod27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusYears(31);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.withPeriodAdded(readablePeriod31, 5420956);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime37 = localDateTime28.withDate(5423123, (int) 'x', 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2024-01-22T01:05:23.569");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2024-01-22t01:05:23.569");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.minusDays(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property13 = localDate11.property(dateTimeFieldType12);
        org.joda.time.LocalDate localDate14 = property13.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime19 = localTime16.withFields((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime24 = localTime21.withFields((org.joda.time.ReadablePartial) localTime23);
        int int25 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime27 = localTime18.minus(readablePeriod26);
        org.joda.time.LocalTime localTime29 = localTime27.minusSeconds(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) 0, chronology32);
        org.joda.time.DateTime.Property property34 = dateTime33.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTime dateTime36 = dateTime33.plus(readableDuration35);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int38 = dateTime36.get(dateTimeFieldType37);
        org.joda.time.DateTime dateTime39 = dateTime36.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime43 = dateTime36.toDateTime(dateTimeZone42);
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType30.getField(chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.weekyear();
        org.joda.time.DateTimeField dateTimeField47 = chronology44.centuryOfEra();
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) 0, chronology49);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutableDateTime mutableDateTime52 = dateTime50.toMutableDateTime(chronology51);
        org.joda.time.DateTime dateTime54 = dateTime50.minus((long) '#');
        org.joda.time.DateTime dateTime56 = dateTime50.withDayOfWeek(4);
        org.joda.time.LocalDate localDate57 = dateTime50.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.LocalDate localDate59 = localDate57.plus(readablePeriod58);
        org.joda.time.LocalDate.Property property60 = localDate59.weekyear();
        org.joda.time.LocalDate localDate61 = property60.withMinimumValue();
        org.joda.time.LocalDate.Property property62 = localDate61.yearOfEra();
        long long64 = chronology44.set((org.joda.time.ReadablePartial) localDate61, (long) 11);
        org.joda.time.DurationField durationField65 = chronology44.months();
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology70 = null;
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) 0, chronology70);
        org.joda.time.DateTime.Property property72 = dateTime71.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration73 = null;
        org.joda.time.DateTime dateTime74 = dateTime71.plus(readableDuration73);
        org.joda.time.DateTime dateTime76 = dateTime71.withWeekOfWeekyear((int) (short) 10);
        int int77 = dateTimeZone68.getOffset((org.joda.time.ReadableInstant) dateTime76);
        org.joda.time.Chronology chronology78 = chronology44.withZone(dateTimeZone68);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime79 = localDate14.toDateTime(localTime29, dateTimeZone68);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 37920000 + "'", int38 == 37920000);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(mutableDateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(localDate59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localDate61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-9223372016611199989L) + "'", long64 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(durationField65);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 37920000 + "'", int77 == 37920000);
        org.junit.Assert.assertNotNull(chronology78);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.util.Date date1 = new java.util.Date((long) (byte) -1);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) date1, chronology2);
        date1.setMonth((int) (byte) -1);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromDateFields(date1);
        org.joda.time.LocalTime localTime8 = localTime6.minusMinutes(3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localTime6.getValue(5423123);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 5423123");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Dec 01 00:00:00 GMT 1969");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        boolean boolean11 = localDate9.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate13 = localDate9.plusYears(10);
        org.joda.time.LocalDate localDate15 = localDate13.withCenturyOfEra(70);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.DateTime.Property property21 = dateTime20.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.DateTime dateTime23 = dateTime20.plus(readableDuration22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int25 = dateTime23.get(dateTimeFieldType24);
        org.joda.time.LocalTime.Property property26 = localTime17.property(dateTimeFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = localDate15.get(dateTimeFieldType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 37920000 + "'", int25 == 37920000);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayScript();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_TW" + "'", str2, "zh_TW");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (long) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.yearOfEra();
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        org.joda.time.Chronology chronology28 = dateTimeFormatter27.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = localDateTime23.toString(dateTimeFormatter27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNull(chronology28);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GMT\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("6");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = dateTimeFormatter2.parseLocalDateTime("32");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        int int7 = dateTime6.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        int int10 = dateTime6.getMinuteOfDay();
        java.util.GregorianCalendar gregorianCalendar11 = dateTime6.toGregorianCalendar();
        gregorianCalendar11.set((int) (short) 100, 32770, 50, 5419344, 5416138);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = gregorianCalendar11.getActualMaximum(37920197);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 37920197");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 70 + "'", int9 == 70);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 631 + "'", int10 == 631);
        org.junit.Assert.assertNotNull(gregorianCalendar11);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) 0, chronology19);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime20.toMutableDateTime(chronology21);
        org.joda.time.DateTime dateTime24 = dateTime20.minus((long) '#');
        org.joda.time.DateTime dateTime26 = dateTime20.withDayOfWeek(4);
        org.joda.time.LocalDate localDate27 = dateTime20.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.LocalDate localDate29 = localDate27.plus(readablePeriod28);
        org.joda.time.LocalDate.Property property30 = localDate29.weekyear();
        org.joda.time.LocalDate localDate31 = property30.withMinimumValue();
        org.joda.time.LocalDate.Property property32 = localDate31.yearOfEra();
        long long34 = chronology14.set((org.joda.time.ReadablePartial) localDate31, (long) 11);
        org.joda.time.DurationField durationField35 = chronology14.months();
        org.joda.time.DateTimeField dateTimeField36 = chronology14.year();
        java.lang.String str37 = chronology14.toString();
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) 0, chronology42);
        org.joda.time.DateTime.Property property44 = dateTime43.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration45 = null;
        org.joda.time.DateTime dateTime46 = dateTime43.plus(readableDuration45);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int48 = dateTime46.get(dateTimeFieldType47);
        org.joda.time.DateTime dateTime49 = dateTime46.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime53 = dateTime46.toDateTime(dateTimeZone52);
        org.joda.time.Chronology chronology54 = dateTime53.getChronology();
        org.joda.time.DateTimeField dateTimeField55 = dateTimeFieldType40.getField(chronology54);
        org.joda.time.DateTimeField dateTimeField56 = chronology54.weekyear();
        org.joda.time.DateTimeField dateTimeField57 = chronology54.centuryOfEra();
        org.joda.time.DurationField durationField58 = chronology54.years();
        org.joda.time.DateTimeField dateTimeField59 = chronology54.yearOfCentury();
        org.joda.time.LocalDate localDate60 = new org.joda.time.LocalDate(632L, chronology54);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate61 = new org.joda.time.LocalDate((java.lang.Object) chronology14, chronology54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-9223372016611199989L) + "'", long34 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ISOChronology[+10:32]" + "'", str37, "ISOChronology[+10:32]");
        org.junit.Assert.assertNotNull(localDate38);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 37920000 + "'", int48 == 37920000);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(dateTimeField59);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(8);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.util.Date date1 = new java.util.Date((long) (byte) -1);
        java.util.Date date3 = new java.util.Date((long) (byte) -1);
        date3.setTime((long) ' ');
        boolean boolean6 = date1.after(date3);
        int int7 = date1.getYear();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 70 + "'", int7 == 70);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusSeconds(15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withEra(14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = dateTimeFormatter2.parseMutableDateTime("hourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusWeeks((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime21.withYear(37920000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType29 = localDateTime27.getFieldType(5420956);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 5420956");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = locale19.getScript();
        java.util.Calendar calendar21 = dateTime8.toCalendar(locale19);
        org.joda.time.DateTime.Property property22 = dateTime8.millisOfSecond();
        org.joda.time.DateTime dateTime24 = property22.addToCopy(1);
        org.joda.time.format.DateTimePrinter dateTimePrinter25 = null;
        org.joda.time.format.DateTimeParser dateTimeParser26 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter25, dateTimeParser26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dateTime24.toString(dateTimeFormatter27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = property22.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = property22.setCopy("1970-01-01");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        boolean boolean13 = localDate4.equals((java.lang.Object) dateTime10);
        org.joda.time.DateTime dateTime14 = localDate4.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localDate4.get(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37920000 + "'", int12 == 37920000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("37920000-02-21T01:05:24.104");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"37920000-02-21T01:05:24.104\" is malformed at \"T01:05:24.104\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = locale19.getScript();
        java.util.Calendar calendar21 = dateTime8.toCalendar(locale19);
        java.util.TimeZone timeZone22 = calendar21.getTimeZone();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 0, chronology24);
        int int26 = dateTime25.getSecondOfMinute();
        org.joda.time.DateTime dateTime28 = dateTime25.withYear(10);
        org.joda.time.DateTime dateTime30 = dateTime25.withWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property31 = dateTime25.millisOfSecond();
        org.joda.time.DateTime dateTime33 = dateTime25.plusMillis((int) (byte) 10);
        boolean boolean34 = calendar21.before((java.lang.Object) dateTime33);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = calendar21.getActualMinimum(365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 365");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+10:32");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = locale19.getScript();
        java.util.Calendar calendar21 = dateTime8.toCalendar(locale19);
        org.joda.time.DateTime.Property property22 = dateTime8.millisOfSecond();
        org.joda.time.Interval interval23 = property22.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) interval23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Interval");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime3.minus((long) '#');
        org.joda.time.DateTime dateTime9 = dateTime3.withDayOfWeek(4);
        org.joda.time.Chronology chronology10 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.millisOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime15.toMutableDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime15.minus((long) '#');
        org.joda.time.DateTime dateTime21 = dateTime15.withDayOfWeek(4);
        org.joda.time.LocalDate localDate22 = dateTime15.toLocalDate();
        boolean boolean24 = localDate22.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate26 = localDate22.plusYears(10);
        org.joda.time.LocalDate localDate28 = localDate26.minusYears((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType30.getField(chronology31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone34);
        org.joda.time.LocalDate.Property property36 = localDate35.weekOfWeekyear();
        int[] intArray40 = new int[] { 7, 100, (short) 10 };
        int int41 = dateTimeField32.getMinimumValue((org.joda.time.ReadablePartial) localDate35, intArray40);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray43 = dateTimeField12.add((org.joda.time.ReadablePartial) localDate26, (int) (short) -1, intArray40, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[7, 100, 10]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 37920000, dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone7.isLocalDateTimeGap(localDateTime9);
        long long13 = dateTimeZone7.convertLocalToUTC(126000005L, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(86399999, 37919999, 7, (-292275054), 50, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 125999905L + "'", long13 == 125999905L);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        int int4 = calendar0.getActualMinimum(3);
        boolean boolean5 = calendar0.isWeekDateSupported();
        calendar0.set(10, (int) (byte) 10, (-1), 1970, 9, 7);
        java.util.Date date19 = new java.util.Date((int) (short) 100, 4, 37920000, 8, (-1), 1);
        calendar0.setTime(date19);
        java.time.Instant instant21 = calendar0.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            int int23 = calendar0.getLeastMaximum(37920197);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 37920197");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=3277245081540990,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=105821,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=6,DAY_OF_YEAR=279,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=7,HOUR_OF_DAY=7,MINUTE=59,SECOND=1,MILLISECOND=0,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Sat Oct 06 07:59:01 GMT 105821");
        org.junit.Assert.assertNotNull(instant21);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        int int5 = property3.getMaximumValueOverall();
        org.joda.time.LocalDate localDate7 = property3.setCopy("1");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = property3.setCopy("centuries");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"centuries\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        int int7 = calendar0.getGreatestMinimum(0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar0.get(365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 365");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455506214,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=26,MILLISECOND=224,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter2.getPrinter();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime10 = localTime7.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.DateTime.Property property17 = dateTime16.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime16.plus(readableDuration18);
        org.joda.time.DateTime dateTime21 = dateTime16.withWeekOfWeekyear((int) (short) 10);
        int int22 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((java.lang.Object) localTime9, dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTime dateTime26 = localTime23.toDateTimeToday(dateTimeZone25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.DateTime dateTime28 = dateTime26.plus(readablePeriod27);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (org.joda.time.ReadableInstant) dateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37920000 + "'", int22 == 37920000);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime.Property property7 = localTime4.hourOfDay();
        boolean boolean8 = property7.isLeap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property7.setCopy(37919999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37919999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.util.Date date1 = new java.util.Date((long) (byte) -1);
        java.util.Date date3 = new java.util.Date((long) (byte) -1);
        date3.setTime((long) ' ');
        boolean boolean6 = date1.after(date3);
        date3.setMinutes(2022);
        java.lang.Object obj9 = date3.clone();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Jan 02 09:42:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
// flaky:         org.junit.Assert.assertEquals(obj9.toString(), "Fri Jan 02 09:42:00 GMT 1970");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "Fri Jan 02 09:42:00 GMT 1970");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "Fri Jan 02 09:42:00 GMT 1970");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.util.Date date1 = new java.util.Date((long) (byte) -1);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) date1, chronology2);
        long long4 = date1.getTime();
        java.lang.String str5 = date1.toLocaleString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) str5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1 janv. 1970 00:00:00\" is malformed at \" janv. 1970 00:00:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1 janv. 1970 00:00:00" + "'", str5, "1 janv. 1970 00:00:00");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        boolean boolean13 = localDate4.equals((java.lang.Object) dateTime10);
        int int14 = localDate4.getWeekyear();
        org.joda.time.Chronology chronology15 = localDate4.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.Chronology chronology19 = dateTimeFormatter18.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localDate4.toString(dateTimeFormatter18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37920000 + "'", int12 == 37920000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNull(chronology19);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate13 = property12.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate13.withMonthOfYear(15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withDate(5420956, 2022, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        int int7 = calendar0.getGreatestMinimum(0);
        calendar0.set(365, 0, 0, 1970, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calendar0.get((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-50641796972948,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=365,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=82,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=10,SECOND=27,MILLISECOND=62,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_CN" + "'", str2, "zh_CN");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate1.withDayOfYear(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        calendar0.setWeekDate((-1), 3, 4);
        calendar0.set(16, 37920000, (int) (byte) 1, (int) (byte) -1, 0, (-1));
        calendar0.set((int) 'u', 0, 0);
        java.util.Locale.LanguageRange[] languageRangeArray18 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList19 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList19, languageRangeArray18);
        java.util.Locale locale22 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleAttributes();
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("");
        java.lang.String str26 = locale25.getScript();
        java.lang.String str27 = locale22.getDisplayLanguage(locale25);
        java.util.Set<java.lang.String> strSet28 = locale22.getUnicodeLocaleAttributes();
        java.lang.String str29 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, (java.util.Collection<java.lang.String>) strSet28);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap30 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList31 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList19, strMap30);
        java.lang.String[] strArray40 = new java.lang.String[] { "1970-01-01", "millisOfDay", "", "minuteOfDay", "South Korea", "1970-01-01", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        java.util.Locale.LanguageRange[] languageRangeArray43 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList44 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList44, languageRangeArray43);
        java.util.Locale locale47 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet48 = locale47.getUnicodeLocaleAttributes();
        java.util.Locale locale50 = java.util.Locale.forLanguageTag("");
        java.lang.String str51 = locale50.getScript();
        java.lang.String str52 = locale47.getDisplayLanguage(locale50);
        java.util.Set<java.lang.String> strSet53 = locale47.getUnicodeLocaleAttributes();
        java.lang.String str54 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList44, (java.util.Collection<java.lang.String>) strSet53);
        boolean boolean55 = strSet41.removeAll((java.util.Collection<java.lang.String>) strSet53);
        java.lang.String[] strArray59 = new java.lang.String[] { "1", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        boolean boolean62 = strSet60.isEmpty();
        boolean boolean63 = strSet53.retainAll((java.util.Collection<java.lang.String>) strSet60);
        java.lang.String str64 = java.util.Locale.lookupTag(languageRangeList31, (java.util.Collection<java.lang.String>) strSet53);
        boolean boolean65 = calendar0.before((java.lang.Object) languageRangeList31);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.set((int) 'u', 70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=0,YEAR=117,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=0,DAY_OF_YEAR=15,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=-1,MINUTE=0,SECOND=-1,MILLISECOND=411,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(languageRangeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(languageRangeList31);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(languageRangeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.parse("37920100", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime11 = property9.addNoWrapToCopy((int) '4');
        org.joda.time.LocalTime localTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.plus(readableDuration17);
        org.joda.time.DateTime dateTime20 = dateTime15.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime15.withMonthOfYear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime15.minus(readablePeriod23);
        long long25 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalTime localTime26 = property9.withMaximumValue();
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime29 = localTime26.withSecondOfMinute(631);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 631 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 632L + "'", long25 == 632L);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("gregory");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"gregory\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateMidnight dateMidnight5 = dateTime2.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime2.withMonthOfYear(632);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 632 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateMidnight5);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = locale19.getScript();
        java.util.Calendar calendar21 = dateTime8.toCalendar(locale19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime8);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusMillis((int) 'u');
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone26);
        org.joda.time.LocalDate.Property property28 = localDate27.weekOfWeekyear();
        java.lang.String str29 = localDate27.toString();
        org.joda.time.LocalDate localDate31 = localDate27.withWeekOfWeekyear(3);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = localDateTime22.compareTo((org.joda.time.ReadablePartial) localDate27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970-01-01" + "'", str29, "1970-01-01");
        org.junit.Assert.assertNotNull(localDate31);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.DateTime dateTime13 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime17 = dateTime10.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType4.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.centuryOfEra();
        org.joda.time.DurationField durationField22 = chronology18.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(5, 37214189, (int) (byte) 100, 6, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37214189 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37920000 + "'", int12 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("53");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) '#', (int) (short) 100, 8, 52, 37920097, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(52, 2, 15, 1980, 3, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1980 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.parse("1", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime.Property property7 = dateTime2.minuteOfHour();
        org.joda.time.DateTime dateTime8 = property7.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = property7.setCopy("DateTimeField[millisOfDay]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[millisOfDay]\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 0, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime dateTime15 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime19 = dateTime12.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType6.getField(chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.weekyear();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.centuryOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 0, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime26.toMutableDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime26.minus((long) '#');
        org.joda.time.DateTime dateTime32 = dateTime26.withDayOfWeek(4);
        org.joda.time.LocalDate localDate33 = dateTime26.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDate localDate35 = localDate33.plus(readablePeriod34);
        org.joda.time.LocalDate.Property property36 = localDate35.weekyear();
        org.joda.time.LocalDate localDate37 = property36.withMinimumValue();
        org.joda.time.LocalDate.Property property38 = localDate37.yearOfEra();
        long long40 = chronology20.set((org.joda.time.ReadablePartial) localDate37, (long) 11);
        org.joda.time.DurationField durationField41 = chronology20.months();
        org.joda.time.DateTimeField dateTimeField42 = chronology20.year();
        java.lang.String str43 = chronology20.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(32772, 3, (-1), (int) (short) -1, 20, 0, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37920000 + "'", int14 == 37920000);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-9223372016611199989L) + "'", long40 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ISOChronology[+10:32]" + "'", str43, "ISOChronology[+10:32]");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime10 = instant8.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(2);
        int int14 = dateTimeZone12.getOffsetFromLocal((long) 53);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime16 = instant8.toDateTime(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (short) 0, 37214189);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37214189 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.plus(readableDuration14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTime13.toString("DateTimeField[hourOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale4.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet10 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str11 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap12);
        java.lang.String[] strArray22 = new java.lang.String[] { "1970-01-01", "millisOfDay", "", "minuteOfDay", "South Korea", "1970-01-01", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("");
        java.lang.String str33 = locale32.getScript();
        java.lang.String str34 = locale29.getDisplayLanguage(locale32);
        java.util.Set<java.lang.String> strSet35 = locale29.getUnicodeLocaleAttributes();
        java.lang.String str36 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strSet35);
        boolean boolean37 = strSet23.removeAll((java.util.Collection<java.lang.String>) strSet35);
        java.lang.String[] strArray41 = new java.lang.String[] { "1", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        boolean boolean44 = strSet42.isEmpty();
        boolean boolean45 = strSet35.retainAll((java.util.Collection<java.lang.String>) strSet42);
        java.lang.String str46 = java.util.Locale.lookupTag(languageRangeList13, (java.util.Collection<java.lang.String>) strSet35);
        java.util.Spliterator<java.lang.String> strSpliterator47 = strSet35.spliterator();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strSpliterator47);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        int int3 = property2.getMaximumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = property2.setCopy("eras");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"eras\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.weekyear();
        org.joda.time.LocalDateTime localDateTime23 = property22.getLocalDateTime();
        int int24 = property22.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime25 = property22.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField26 = property22.getField();
        org.joda.time.LocalDateTime localDateTime27 = property22.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType29.getField(chronology30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone33);
        org.joda.time.LocalDate.Property property35 = localDate34.weekOfWeekyear();
        int[] intArray39 = new int[] { 7, 100, (short) 10 };
        int int40 = dateTimeField31.getMinimumValue((org.joda.time.ReadablePartial) localDate34, intArray39);
        long long43 = dateTimeField31.addWrapField((long) 32, 2022);
        java.util.Locale locale45 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale46 = java.util.Locale.UK;
        java.lang.String str47 = locale45.getDisplayName(locale46);
        int int48 = dateTimeField31.getMaximumTextLength(locale46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = localDateTime27.toString("2022-02-21T01:05:23.500", locale46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[7, 100, 10]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2054L + "'", long43 == 2054L);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("weekOfWeekyear");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0, locale2);
        boolean boolean4 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455508600,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=28,MILLISECOND=610,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime5.withMillisOfSecond(37920);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37920 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 37920000 + "'", int7 == 37920000);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(6, 37920197, (-1), 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37920197 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(4);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime5.toMutableDateTime(chronology6);
        org.joda.time.DateTime dateTime9 = dateTime5.minus((long) '#');
        org.joda.time.DateTime dateTime11 = dateTime5.withDayOfWeek(4);
        org.joda.time.LocalDate localDate12 = dateTime5.toLocalDate();
        boolean boolean14 = localDate12.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate16 = localDate12.plusYears(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone18);
        org.joda.time.LocalDate.Property property20 = localDate19.weekOfWeekyear();
        org.joda.time.LocalDate localDate21 = property20.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime24.toMutableDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime24.minus((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime24.withDayOfWeek(4);
        org.joda.time.LocalDate localDate31 = dateTime24.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDate localDate33 = localDate31.plus(readablePeriod32);
        org.joda.time.LocalDate.Property property34 = localDate33.weekyear();
        org.joda.time.LocalDate localDate35 = localDate21.withFields((org.joda.time.ReadablePartial) localDate33);
        int int36 = localDate16.compareTo((org.joda.time.ReadablePartial) localDate35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localDate16.toDateTimeAtCurrentTime(dateTimeZone37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = localDateTime2.isBefore((org.joda.time.ReadablePartial) localDate16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(365, 99, 20, 69, 11, 10, 5420956);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        int int20 = localDateTime19.getEra();
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withMillisOfDay((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime4 = localTime1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime9 = localTime6.withFields((org.joda.time.ReadablePartial) localTime8);
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime6);
        int int11 = localTime6.getHourOfDay();
        org.joda.time.LocalTime localTime13 = localTime6.plusMinutes(1970);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType14.getField(chronology28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withField(dateTimeFieldType31, 5);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.minusHours(23);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.dayOfYear();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.minusWeeks((int) (byte) 10);
        org.joda.time.Chronology chronology41 = localDateTime40.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            int int42 = localTime6.compareTo((org.joda.time.ReadablePartial) localDateTime40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37920000 + "'", int22 == 37920000);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(chronology41);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone4);
        org.joda.time.LocalDate.Property property6 = localDate5.weekOfWeekyear();
        int[] intArray10 = new int[] { 7, 100, (short) 10 };
        int int11 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localDate5, intArray10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTime dateTime22 = dateTime17.withWeekOfWeekyear((int) (short) 10);
        int int23 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime25 = dateTime22.minus((long) 100);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime25.plus(readableDuration26);
        org.joda.time.DateTime dateTime28 = localDate5.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        boolean boolean30 = dateTime28.isBefore(0L);
        org.joda.time.DateTime.Property property31 = dateTime28.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = dateTime28.withDayOfWeek(5423123);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5423123 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[7, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 37920000 + "'", int23 == 37920000);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        int int7 = calendar0.getGreatestMinimum(0);
        java.util.Date date9 = new java.util.Date((long) (byte) -1);
        int int10 = date9.getDate();
        boolean boolean11 = calendar0.after((java.lang.Object) int10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = calendar0.getActualMaximum((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455509118,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=29,MILLISECOND=128,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate9.plus(readablePeriod10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.DurationField durationField13 = property12.getLeapDurationField();
        java.util.Locale locale18 = new java.util.Locale("Greenwich Mean Time", "ISOChronology[+10:32]", "en_CA");
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType19.getField(chronology20);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        int int25 = dateTimeField21.getMinimumValue((org.joda.time.ReadablePartial) localTime23);
        boolean boolean26 = dateTimeField21.isSupported();
        long long29 = dateTimeField21.add((long) 631, 1645455491851L);
        java.util.Locale locale31 = new java.util.Locale("37920001");
        int int32 = dateTimeField21.getMaximumShortTextLength(locale31);
        java.lang.String str33 = locale18.getDisplayLanguage(locale31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = property12.setCopy("GMT", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"GMT\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertEquals(locale18.toString(), "greenwich mean time_ISOCHRONOLOGY[+10:32]_en_CA");
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1645455492482L + "'", long29 == 1645455492482L);
        org.junit.Assert.assertEquals(locale31.toString(), "37920001");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "greenwich mean time" + "'", str33, "greenwich mean time");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.util.Date date1 = new java.util.Date((long) (byte) -1);
        date1.setTime((long) ' ');
        date1.setYear((int) 'u');
        int int6 = date1.getTimezoneOffset();
        date1.setSeconds(86399999);
        java.lang.String str9 = date1.toString();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Fri Sep 27 23:59:59 GMT 2019");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Fri Sep 27 23:59:59 GMT 2019" + "'", str9, "Fri Sep 27 23:59:59 GMT 2019");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.DateTime dateTime13 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime17 = dateTime10.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType4.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.halfdayOfDay();
        org.joda.time.DurationField durationField22 = chronology18.hours();
        org.joda.time.DurationField durationField23 = chronology18.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter24 = dateTimeFormatter3.withChronology(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant25 = org.joda.time.Instant.parse("+00:00", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37920000 + "'", int12 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeFormatter24);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(37920, 11, 2, (int) (byte) 100, 7, 5415578, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = locale19.getScript();
        java.util.Calendar calendar21 = dateTime8.toCalendar(locale19);
        java.util.TimeZone timeZone22 = calendar21.getTimeZone();
        java.lang.String str23 = timeZone22.getID();
        java.util.Locale locale24 = java.util.Locale.CHINA;
        java.lang.String str26 = locale24.getExtension('a');
        java.lang.String str27 = locale24.getDisplayScript();
        java.lang.String str28 = timeZone22.getDisplayName(locale24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone22);
// flaky:         org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+10:32");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "GMT+10:32" + "'", str23, "GMT+10:32");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "GMT+10:32" + "'", str28, "GMT+10:32");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime10 = property8.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime14 = dateTime10.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay15 = dateTime10.toYearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        org.joda.time.DateTime.Property property20 = dateTime19.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime19.plus(readableDuration21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int24 = dateTime22.get(dateTimeFieldType23);
        org.joda.time.DateTime dateTime25 = dateTime22.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime29 = dateTime22.toDateTime(dateTimeZone28);
        org.joda.time.Chronology chronology30 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType16.getField(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.weekyear();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.centuryOfEra();
        org.joda.time.MutableDateTime mutableDateTime34 = dateTime10.toMutableDateTime(chronology30);
        org.joda.time.DateTimeField dateTimeField35 = chronology30.millisOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology30.hourOfHalfday();
        org.joda.time.LocalDate localDate37 = org.joda.time.LocalDate.now(chronology30);
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(16, 1970, 5416138, 7, 631, chronology30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 631 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(yearMonthDay15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37920000 + "'", int24 == 37920000);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(localDate37);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.DateTime dateTime10 = dateTime7.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime14 = dateTime7.toDateTime(dateTimeZone13);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType1.getField(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.weekyear();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.centuryOfEra();
        org.joda.time.DurationField durationField19 = chronology15.years();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.yearOfCentury();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(632L, chronology15);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime24.toMutableDateTime(chronology25);
        org.joda.time.DateTime dateTime28 = dateTime24.minus((long) '#');
        org.joda.time.DateTime dateTime30 = dateTime24.withDayOfWeek(4);
        org.joda.time.LocalDate localDate31 = dateTime24.toLocalDate();
        org.joda.time.LocalDate localDate33 = localDate31.minusDays(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property35 = localDate33.property(dateTimeFieldType34);
        java.lang.String str36 = dateTimeFieldType34.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate38 = localDate21.withField(dateTimeFieldType34, 69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37920000 + "'", int9 == 37920000);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "era" + "'", str36, "era");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone4);
        org.joda.time.LocalDate.Property property6 = localDate5.weekOfWeekyear();
        int[] intArray10 = new int[] { 7, 100, (short) 10 };
        int int11 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localDate5, intArray10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType12.getField(chronology13);
        long long17 = dateTimeField14.getDifferenceAsLong((long) (short) 10, (long) ' ');
        long long19 = dateTimeField14.roundHalfCeiling((long) '4');
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) 0, chronology21);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = dateTime22.toMutableDateTime(chronology23);
        org.joda.time.DateTime dateTime26 = dateTime22.minus((long) '#');
        org.joda.time.DateTime dateTime28 = dateTime22.withDayOfWeek(4);
        org.joda.time.LocalDate localDate29 = dateTime22.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.LocalDate localDate31 = localDate29.plus(readablePeriod30);
        org.joda.time.LocalDate.Property property32 = localDate31.weekyear();
        org.joda.time.LocalDate localDate33 = property32.roundFloorCopy();
        org.joda.time.LocalDate localDate34 = property32.withMaximumValue();
        int int35 = localDate34.getWeekyear();
        int int36 = dateTimeField14.getMaximumValue((org.joda.time.ReadablePartial) localDate34);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType37.getField(chronology38);
        boolean boolean41 = dateTimeField39.isLeap((long) 9);
        boolean boolean42 = dateTimeField39.isSupported();
        java.util.Locale locale44 = java.util.Locale.ITALY;
        java.lang.String str45 = dateTimeField39.getAsText(9, locale44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localDate34, locale44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[7, 100, 10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-22L) + "'", long17 == (-22L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 292278993 + "'", int35 == 292278993);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 86399999 + "'", int36 == 86399999);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "9" + "'", str45, "9");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add(53, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455509917,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=29,MILLISECOND=927,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate(16, (-292275054), 8);
        java.util.Calendar.Builder builder8 = builder0.setDate(20, (int) 'u', 37920197);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder11 = builder0.setWeekDefinition(53, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.plus(readableDuration26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int29 = dateTime27.get(dateTimeFieldType28);
        org.joda.time.DateTime dateTime30 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime34 = dateTime27.toDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.DurationField durationField36 = chronology35.seconds();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) 0, chronology38);
        org.joda.time.Chronology chronology40 = null;
        org.joda.time.MutableDateTime mutableDateTime41 = dateTime39.toMutableDateTime(chronology40);
        org.joda.time.DateTime dateTime43 = dateTime39.minus((long) '#');
        org.joda.time.DateTime dateTime45 = dateTime39.withDayOfWeek(4);
        org.joda.time.LocalDate localDate46 = dateTime39.toLocalDate();
        boolean boolean48 = localDate46.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate50 = localDate46.plusYears(0);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone52);
        org.joda.time.LocalDate.Property property54 = localDate53.weekOfWeekyear();
        org.joda.time.LocalDate localDate55 = property54.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) 0, chronology57);
        org.joda.time.Chronology chronology59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = dateTime58.toMutableDateTime(chronology59);
        org.joda.time.DateTime dateTime62 = dateTime58.minus((long) '#');
        org.joda.time.DateTime dateTime64 = dateTime58.withDayOfWeek(4);
        org.joda.time.LocalDate localDate65 = dateTime58.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.LocalDate localDate67 = localDate65.plus(readablePeriod66);
        org.joda.time.LocalDate.Property property68 = localDate67.weekyear();
        org.joda.time.LocalDate localDate69 = localDate55.withFields((org.joda.time.ReadablePartial) localDate67);
        int int70 = localDate50.compareTo((org.joda.time.ReadablePartial) localDate69);
        org.joda.time.LocalDate localDate72 = localDate50.minusWeeks(19);
        long long74 = chronology35.set((org.joda.time.ReadablePartial) localDate50, 32L);
        // The following exception was thrown during execution in test generation
        try {
            int int75 = localDateTime21.compareTo((org.joda.time.ReadablePartial) localDate50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 37920000 + "'", int29 == 37920000);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertNotNull(localDate67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localDate69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(localDate72);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 32L + "'", long74 == 32L);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.util.Date date1 = new java.util.Date((long) (byte) -1);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) date1, chronology2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime3.withSecondOfMinute(37919900);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37919900 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT 1970");
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime.Property property7 = dateTime2.minuteOfHour();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTime dateTime15 = dateTime10.withWeekOfWeekyear((int) (short) 10);
        long long16 = property7.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType17.getField(chronology18);
        boolean boolean20 = dateTimeField19.isLenient();
        long long22 = dateTimeField19.roundCeiling((long) 5);
        java.lang.String str24 = dateTimeField19.getAsText(32L);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 0, chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime27.toMutableDateTime(chronology28);
        org.joda.time.DateTime dateTime31 = dateTime27.minus((long) '#');
        org.joda.time.DateTime dateTime33 = dateTime27.withDayOfWeek(4);
        org.joda.time.LocalDate localDate34 = dateTime27.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate36 = localDate34.plus(readablePeriod35);
        org.joda.time.LocalDate.Property property37 = localDate36.weekyear();
        int int38 = localDate36.size();
        java.util.Locale locale41 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale42 = java.util.Locale.UK;
        java.lang.String str43 = locale41.getDisplayName(locale42);
        java.lang.String str44 = dateTimeField19.getAsShortText((org.joda.time.ReadablePartial) localDate36, 53, locale41);
        java.lang.String str45 = property7.getAsShortText(locale41);
        java.lang.String str46 = property7.getAsString();
        org.joda.time.DateTime dateTime47 = property7.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime49 = dateTime47.withSecondOfMinute((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5L + "'", long22 == 5L);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "37920032" + "'", str24, "37920032");
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "53" + "'", str44, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "32" + "'", str45, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "32" + "'", str46, "32");
        org.junit.Assert.assertNotNull(dateTime47);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        int int4 = dateTime2.getMillisOfSecond();
        org.joda.time.DateTime dateTime6 = dateTime2.plusYears(6);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime9 = dateTime2.withFieldAdded(durationFieldType7, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone11);
        org.joda.time.LocalDate.Property property13 = localDate12.weekOfWeekyear();
        org.joda.time.LocalDate localDate14 = property13.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        boolean boolean23 = localDate14.equals((java.lang.Object) dateTime20);
        int int24 = localDate14.getWeekyear();
        org.joda.time.Chronology chronology25 = localDate14.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.centuryOfEra();
        org.joda.time.DurationField durationField27 = durationFieldType7.getField(chronology25);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37920000 + "'", int22 == 37920000);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.plusWeeks((int) (short) 100);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.plusDays(4);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minus(readableDuration29);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = localDateTime30.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        long long8 = dateTimeField2.roundCeiling(1L);
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("");
        java.lang.String str13 = locale10.getDisplayLanguage(locale12);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet16 = locale15.getUnicodeLocaleAttributes();
        java.lang.String str17 = locale10.getDisplayVariant(locale15);
        int int18 = dateTimeField2.getMaximumTextLength(locale10);
        long long21 = dateTimeField2.getDifferenceAsLong((long) (byte) -1, (long) 70);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 0, chronology24);
        org.joda.time.DateTime.Property property26 = dateTime25.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime28 = dateTime25.plus(readableDuration27);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int30 = dateTime28.get(dateTimeFieldType29);
        org.joda.time.DateTime dateTime31 = dateTime28.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime35 = dateTime28.toDateTime(dateTimeZone34);
        org.joda.time.Chronology chronology36 = dateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = dateTimeFieldType22.getField(chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.weekyear();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.centuryOfEra();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) 0, chronology41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.MutableDateTime mutableDateTime44 = dateTime42.toMutableDateTime(chronology43);
        org.joda.time.DateTime dateTime46 = dateTime42.minus((long) '#');
        org.joda.time.DateTime dateTime48 = dateTime42.withDayOfWeek(4);
        org.joda.time.LocalDate localDate49 = dateTime42.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDate localDate51 = localDate49.plus(readablePeriod50);
        org.joda.time.LocalDate.Property property52 = localDate51.weekyear();
        org.joda.time.LocalDate localDate53 = property52.withMinimumValue();
        org.joda.time.LocalDate.Property property54 = localDate53.yearOfEra();
        long long56 = chronology36.set((org.joda.time.ReadablePartial) localDate53, (long) 11);
        org.joda.time.LocalDate.Property property57 = localDate53.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime((long) 0, chronology61);
        org.joda.time.DateTime.Property property63 = dateTime62.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.DateTime dateTime65 = dateTime62.plus(readableDuration64);
        org.joda.time.DateTimeFieldType dateTimeFieldType66 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int67 = dateTime65.get(dateTimeFieldType66);
        org.joda.time.DateTime dateTime68 = dateTime65.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime72 = dateTime65.toDateTime(dateTimeZone71);
        org.joda.time.Chronology chronology73 = dateTime72.getChronology();
        org.joda.time.DateTimeField dateTimeField74 = dateTimeFieldType59.getField(chronology73);
        org.joda.time.DateTimeField dateTimeField75 = chronology73.weekyear();
        org.joda.time.DateTimeField dateTimeField76 = chronology73.centuryOfEra();
        org.joda.time.Chronology chronology78 = null;
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) 0, chronology78);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutableDateTime mutableDateTime81 = dateTime79.toMutableDateTime(chronology80);
        org.joda.time.DateTime dateTime83 = dateTime79.minus((long) '#');
        org.joda.time.DateTime dateTime85 = dateTime79.withDayOfWeek(4);
        org.joda.time.LocalDate localDate86 = dateTime79.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        org.joda.time.LocalDate localDate88 = localDate86.plus(readablePeriod87);
        org.joda.time.LocalDate.Property property89 = localDate88.weekyear();
        org.joda.time.LocalDate localDate90 = property89.withMinimumValue();
        org.joda.time.LocalDate.Property property91 = localDate90.yearOfEra();
        long long93 = chronology73.set((org.joda.time.ReadablePartial) localDate90, (long) 11);
        int[] intArray94 = localDate90.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray96 = dateTimeField2.add((org.joda.time.ReadablePartial) localDate53, 9, intArray94, 32772);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-71L) + "'", long21 == (-71L));
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 37920000 + "'", int30 == 37920000);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(mutableDateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-9223372016611199989L) + "'", long56 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTimeFieldType66);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 37920000 + "'", int67 == 37920000);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertNotNull(dateTimeField76);
        org.junit.Assert.assertNotNull(mutableDateTime81);
        org.junit.Assert.assertNotNull(dateTime83);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(localDate86);
        org.junit.Assert.assertNotNull(localDate88);
        org.junit.Assert.assertNotNull(property89);
        org.junit.Assert.assertNotNull(localDate90);
        org.junit.Assert.assertNotNull(property91);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + (-9223372016611199989L) + "'", long93 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray94), "[-292275054, 1, 6]");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        calendar0.set(4, 14);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar0.getActualMinimum(121);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 121");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=14,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=30,MILLISECOND=228,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int22 = dateTime20.get(dateTimeFieldType21);
        org.joda.time.DateTime dateTime23 = dateTime20.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime27 = dateTime20.toDateTime(dateTimeZone26);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType14.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.weekyear();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.halfdayOfDay();
        org.joda.time.DurationField durationField32 = chronology28.hours();
        org.joda.time.DateTime dateTime33 = dateTime10.toDateTime(chronology28);
        org.joda.time.DurationField durationField34 = chronology28.weekyears();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology36 = chronology28.withZone(dateTimeZone35);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = chronology36.getDateTimeMillis(632L, 32769, 292278993, 4, 5421637);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37920000 + "'", int22 == 37920000);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        int int22 = localDateTime21.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfEra(11);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.minus(readableDuration25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plus(readablePeriod27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusYears(31);
        java.lang.String str31 = localDateTime28.toString();
        java.util.Date date32 = localDateTime28.toDate();
        date32.setSeconds(37919900);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2022-02-21T01:05:30.347" + "'", str31, "2022-02-21T01:05:30.347");
        org.junit.Assert.assertNotNull(date32);
// flaky:         org.junit.Assert.assertEquals(date32.toString(), "Fri May 05 22:23:20 GMT 2023");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        boolean boolean3 = dateTimeField2.isLenient();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType4.getField(chronology5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        int int10 = dateTimeField6.getMinimumValue((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.LocalTime localTime12 = localTime8.plusMinutes((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField14 = localTime8.getField((int) (short) 0);
        java.util.Locale locale17 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleAttributes();
        java.lang.String str19 = locale17.getVariant();
        java.lang.String str20 = dateTimeField2.getAsShortText((org.joda.time.ReadablePartial) localTime8, (int) (short) 1, locale17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = dateTimeField2.getType();
        org.joda.time.DurationField durationField22 = dateTimeField2.getDurationField();
        int int24 = dateTimeField2.getMinimumValue((long) ' ');
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1" + "'", str20, "1");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, (long) 121, 5420956);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTimeFormatter2.parseDateTime("+10:32");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale5);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone10);
        int int12 = localDate11.getDayOfMonth();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) 0, chronology14);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime15.toMutableDateTime(chronology16);
        org.joda.time.DateTime dateTime19 = dateTime15.minus((long) '#');
        org.joda.time.DateTime dateTime21 = dateTime15.withDayOfWeek(4);
        boolean boolean23 = dateTime15.equals((java.lang.Object) "eras");
        int int24 = dateTime15.getWeekyear();
        org.joda.time.DateTime dateTime25 = localDate11.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime27 = dateTime25.plusMinutes((int) 'u');
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) 0, chronology29);
        int int31 = dateTime30.getSecondOfMinute();
        org.joda.time.DateTime dateTime33 = dateTime30.withYear(10);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime36.toMutableDateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime36.minus((long) '#');
        org.joda.time.DateTime dateTime42 = dateTime36.withDayOfWeek(4);
        boolean boolean44 = dateTime36.equals((java.lang.Object) "eras");
        boolean boolean45 = dateTime30.isEqual((org.joda.time.ReadableInstant) dateTime36);
        int int46 = dateTime30.getSecondOfDay();
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) 0, chronology48);
        org.joda.time.DateTime.Property property50 = dateTime49.yearOfCentury();
        org.joda.time.DateTime dateTime52 = property50.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime56 = dateTime52.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.YearMonthDay yearMonthDay57 = dateTime52.toYearMonthDay();
        boolean boolean58 = dateTime30.isEqual((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.DateTime dateTime60 = dateTime30.withWeekOfWeekyear((int) ' ');
        int int61 = dateTime25.compareTo((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.MutableDateTime mutableDateTime62 = dateTime25.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int65 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime62, "1969-12-25", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1970 + "'", int24 == 1970);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 37920 + "'", int46 == 37920);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(yearMonthDay57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime62);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime5 = property3.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime9 = dateTime5.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfMonth(2);
        java.util.Locale locale12 = java.util.Locale.FRANCE;
        java.util.Calendar calendar13 = dateTime9.toCalendar(locale12);
        org.joda.time.LocalDateTime localDateTime14 = dateTime9.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMinuteOfHour(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=-61133702400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=32,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("java.util.GregorianCalendar[time=1645455484256,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=4,MILLISECOND=256,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.util.GregorianCalendar[time...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        calendar0.setWeekDate((-1), 3, 4);
        int int8 = calendar0.getLeastMaximum(3);
        long long9 = calendar0.getTimeInMillis();
        int int10 = calendar0.getWeeksInWeekYear();
        calendar0.set(1, (int) (byte) -1, 99, 5423123, 32);
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Locale.setDefault(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap21 = calendar0.getDisplayNames(37919999, 5416138, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=1,MONTH=-1,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=99,DAY_OF_YEAR=15,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=5423123,MINUTE=32,SECOND=30,MILLISECOND=666,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 50 + "'", int8 == 50);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-62197664489344L) + "'", long9 == (-62197664489344L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        org.joda.time.DateTime dateTime10 = dateTime6.minus((long) '#');
        org.joda.time.DateTime dateTime12 = dateTime6.withDayOfWeek(4);
        org.joda.time.LocalDate localDate13 = dateTime6.toLocalDate();
        org.joda.time.LocalDate localDate15 = localDate13.minusDays(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property17 = localDate15.property(dateTimeFieldType16);
        org.joda.time.LocalDate.Property property18 = localDate15.yearOfCentury();
        org.joda.time.LocalDate.Property property19 = localDate15.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localTime3.get(dateTimeFieldType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType2.getField(chronology3);
        org.joda.time.LocalTime localTime6 = localTime1.withField(dateTimeFieldType2, (int) (short) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localTime1.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime1.withMinuteOfHour(5419344);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5419344 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(4);
        int int3 = localDateTime2.getMillisOfSecond();
        org.junit.Assert.assertNotNull(localDateTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 889 + "'", int3 == 889);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        org.joda.time.LocalTime localTime25 = localTime20.withField(dateTimeFieldType21, (int) (short) 10);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeField18.getAsText((org.joda.time.ReadablePartial) localTime20, 6, locale27);
        long long30 = dateTimeField18.roundCeiling(101L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "6" + "'", str28, "6");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1680000L + "'", long30 == 1680000L);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime12 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime9.toDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType3.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withChronology(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime25 = dateTimeFormatter23.parseLocalTime("Property[dayOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        boolean boolean10 = dateTime2.equals((java.lang.Object) "eras");
        int int11 = dateTime2.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.DateTime.Property property18 = dateTime17.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTime dateTime20 = dateTime17.plus(readableDuration19);
        org.joda.time.DateTime dateTime22 = dateTime17.withWeekOfWeekyear((int) (short) 10);
        int int23 = dateTimeZone14.getOffset((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        java.lang.String str26 = dateTimeZone14.getShortName(126000005L);
        long long28 = dateTimeZone14.convertUTCToLocal((-37919977L));
        long long31 = dateTimeZone14.adjustOffset((long) 7, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) int11, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1970 + "'", int11 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 37920000 + "'", int23 == 37920000);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+10:32" + "'", str26, "+10:32");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 23L + "'", long28 == 23L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 7L + "'", long31 == 7L);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale4.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet10 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str11 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList13 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap12);
        java.lang.String[] strArray22 = new java.lang.String[] { "1970-01-01", "millisOfDay", "", "minuteOfDay", "South Korea", "1970-01-01", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        java.util.Locale.LanguageRange[] languageRangeArray25 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList26 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList26, languageRangeArray25);
        java.util.Locale locale29 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleAttributes();
        java.util.Locale locale32 = java.util.Locale.forLanguageTag("");
        java.lang.String str33 = locale32.getScript();
        java.lang.String str34 = locale29.getDisplayLanguage(locale32);
        java.util.Set<java.lang.String> strSet35 = locale29.getUnicodeLocaleAttributes();
        java.lang.String str36 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList26, (java.util.Collection<java.lang.String>) strSet35);
        boolean boolean37 = strSet23.removeAll((java.util.Collection<java.lang.String>) strSet35);
        java.lang.String[] strArray41 = new java.lang.String[] { "1", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        boolean boolean44 = strSet42.isEmpty();
        boolean boolean45 = strSet35.retainAll((java.util.Collection<java.lang.String>) strSet42);
        java.lang.String str46 = java.util.Locale.lookupTag(languageRangeList13, (java.util.Collection<java.lang.String>) strSet35);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap47 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList48 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList13, strMap47);
        java.util.Locale.LanguageRange languageRange50 = new java.util.Locale.LanguageRange("GMT");
        java.util.Locale.LanguageRange languageRange52 = new java.util.Locale.LanguageRange("eras");
        java.lang.String str53 = languageRange52.getRange();
        java.util.Locale.LanguageRange languageRange55 = new java.util.Locale.LanguageRange("eras");
        java.lang.String str56 = languageRange55.getRange();
        java.util.Locale.LanguageRange languageRange58 = new java.util.Locale.LanguageRange("eras");
        java.util.Locale.LanguageRange[] languageRangeArray59 = new java.util.Locale.LanguageRange[] { languageRange50, languageRange52, languageRange55, languageRange58 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList60 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList60, languageRangeArray59);
        java.util.Locale locale63 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleAttributes();
        java.util.Locale locale66 = java.util.Locale.forLanguageTag("");
        java.lang.String str67 = locale66.getScript();
        java.lang.String str68 = locale63.getDisplayLanguage(locale66);
        java.util.Set<java.lang.String> strSet69 = locale63.getUnicodeLocaleAttributes();
        java.lang.String str70 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList60, (java.util.Collection<java.lang.String>) strSet69);
        java.util.List<java.lang.String> strList71 = java.util.Locale.filterTags(languageRangeList48, (java.util.Collection<java.lang.String>) strSet69);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(languageRangeList13);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(languageRangeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(languageRangeList48);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "eras" + "'", str53, "eras");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "eras" + "'", str56, "eras");
        org.junit.Assert.assertNotNull(languageRangeArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "");
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(strList71);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.Chronology chronology9 = dateTime2.getChronology();
        org.joda.time.TimeOfDay timeOfDay10 = dateTime2.toTimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = timeOfDay10.getFieldType(21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.util.Locale locale2 = new java.util.Locale("2022-02-21T01:05:23.500", "");
        java.lang.String str3 = locale2.getLanguage();
        java.lang.Object obj4 = locale2.clone();
        org.junit.Assert.assertEquals(locale2.toString(), "2022-02-21t01:05:23.500");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-21t01:05:23.500" + "'", str3, "2022-02-21t01:05:23.500");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "2022-02-21t01:05:23.500");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "2022-02-21t01:05:23.500");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "2022-02-21t01:05:23.500");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.lang.StringBuffer stringBuffer0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        int int7 = dateTime6.getDayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        int int9 = dateTime6.get(dateTimeFieldType8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime15 = dateTime12.plus(readableDuration14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int17 = dateTime15.get(dateTimeFieldType16);
        org.joda.time.DateTime dateTime18 = dateTime15.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime20 = dateTime15.withYear(11);
        boolean boolean21 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime.Property property22 = dateTime15.hourOfDay();
        int int23 = property22.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 70 + "'", int9 == 70);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 37920000 + "'", int17 == 37920000);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        long long5 = dateTimeField2.getDifferenceAsLong((long) (short) 10, (long) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 37920197, dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 0, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int18 = dateTime16.get(dateTimeFieldType17);
        org.joda.time.DateTime dateTime19 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime23 = dateTime16.toDateTime(dateTimeZone22);
        org.joda.time.Chronology chronology24 = dateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType10.getField(chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.weekyear();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.clockhourOfDay();
        int int28 = dateTimeField27.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType29.getField(chronology30);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        int int35 = dateTimeField31.getMinimumValue((org.joda.time.ReadablePartial) localTime33);
        org.joda.time.LocalTime localTime37 = localTime33.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property38 = localTime37.minuteOfHour();
        org.joda.time.LocalTime localTime40 = property38.addNoWrapToCopy((int) '4');
        org.joda.time.LocalTime localTime41 = property38.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 0, chronology43);
        org.joda.time.DateTime.Property property45 = dateTime44.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.DateTime dateTime47 = dateTime44.plus(readableDuration46);
        org.joda.time.DateTime dateTime49 = dateTime44.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime51 = dateTime44.withMonthOfYear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.DateTime dateTime53 = dateTime44.minus(readablePeriod52);
        long long54 = property38.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime53);
        java.lang.String str55 = property38.getAsShortText();
        org.joda.time.LocalTime localTime56 = property38.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTimeField dateTimeField59 = dateTimeFieldType57.getField(chronology58);
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        int int63 = dateTimeField59.getMinimumValue((org.joda.time.ReadablePartial) localTime61);
        org.joda.time.LocalTime localTime65 = localTime61.plusMinutes((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField67 = localTime61.getField((int) (short) 0);
        int int69 = dateTimeField67.getMinimumValue((long) 9);
        org.joda.time.ReadablePartial readablePartial70 = null;
        int[] intArray76 = new int[] { 32770, 9, 23, (byte) 10, 16 };
        int int77 = dateTimeField67.getMinimumValue(readablePartial70, intArray76);
        int int78 = dateTimeField27.getMinimumValue((org.joda.time.ReadablePartial) localTime56, intArray76);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray80 = dateTimeField2.addWrapPartial((org.joda.time.ReadablePartial) localDate8, 1, intArray76, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-22L) + "'", long5 == (-22L));
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37920000 + "'", int18 == 37920000);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 24 + "'", int28 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 632L + "'", long54 == 632L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "32" + "'", str55, "32");
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[32770, 24, 23, 10, 16]");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.plusMinutes((int) (short) 100);
        java.lang.String str5 = localTime4.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 0, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime12 = dateTime9.plus(readableDuration11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime dateTime15 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime19 = dateTime12.toDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = dateTimeFieldType6.getField(chronology20);
        boolean boolean22 = localTime4.isSupported(dateTimeFieldType6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = localTime4.withMinuteOfHour(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12:12:00.097" + "'", str5, "12:12:00.097");
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37920000 + "'", int14 == 37920000);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        calendar0.set(3, 53);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.clear(30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=53,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=31,MILLISECOND=382,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withHourOfDay(4);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plus(readableDuration21);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) 0, chronology26);
        org.joda.time.DateTime.Property property28 = dateTime27.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime27.plus(readableDuration29);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int32 = dateTime30.get(dateTimeFieldType31);
        org.joda.time.DateTime dateTime33 = dateTime30.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime37 = dateTime30.toDateTime(dateTimeZone36);
        org.joda.time.Chronology chronology38 = dateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = dateTimeFieldType24.getField(chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.weekyear();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.centuryOfEra();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 0, chronology43);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = dateTime44.toMutableDateTime(chronology45);
        org.joda.time.DateTime dateTime48 = dateTime44.minus((long) '#');
        org.joda.time.DateTime dateTime50 = dateTime44.withDayOfWeek(4);
        org.joda.time.LocalDate localDate51 = dateTime44.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.LocalDate localDate53 = localDate51.plus(readablePeriod52);
        org.joda.time.LocalDate.Property property54 = localDate53.weekyear();
        org.joda.time.LocalDate localDate55 = property54.withMinimumValue();
        org.joda.time.LocalDate.Property property56 = localDate55.yearOfEra();
        long long58 = chronology38.set((org.joda.time.ReadablePartial) localDate55, (long) 11);
        int[] intArray59 = localDate55.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray61 = dateTimeField17.addWrapPartial((org.joda.time.ReadablePartial) localDateTime22, 5427565, intArray59, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5427565");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 37920000 + "'", int32 == 37920000);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-9223372016611199989L) + "'", long58 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[-292275054, 1, 6]");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(0);
        calendar0.setFirstDayOfWeek((int) (short) 0);
        java.lang.String str5 = calendar0.getCalendarType();
        int int6 = calendar0.getFirstDayOfWeek();
        calendar0.set(1, 37919999, (int) '4', 1, 12);
        boolean boolean13 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=0,minimalDaysInFirstWeek=4,ERA=1,YEAR=1,MONTH=37919999,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=52,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=1,MINUTE=12,SECOND=31,MILLISECOND=430,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) 0, chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.DateTime dateTime7 = dateTime4.plus(readableDuration6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int9 = dateTime7.get(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime1.property(dateTimeFieldType8);
        java.lang.String str11 = property10.getName();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.lang.String str13 = property10.getAsShortText(locale12);
        org.joda.time.LocalTime localTime14 = property10.getLocalTime();
        org.joda.time.LocalTime localTime15 = property10.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = localTime15.withMillisOfSecond(37920197);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37920197 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37920000 + "'", int9 == 37920000);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "millisOfDay" + "'", str11, "millisOfDay");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37920001" + "'", str13, "37920001");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale4.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet10 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str11 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet10);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        boolean boolean16 = strSet14.equals((java.lang.Object) "gregory");
        java.lang.String str17 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = strSet14.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        int int3 = dateTime2.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime2.withYear(10);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime8.toMutableDateTime(chronology9);
        org.joda.time.DateTime dateTime12 = dateTime8.minus((long) '#');
        org.joda.time.DateTime dateTime14 = dateTime8.withDayOfWeek(4);
        boolean boolean16 = dateTime8.equals((java.lang.Object) "eras");
        boolean boolean17 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime8);
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("");
        java.lang.String str20 = locale19.getScript();
        java.util.Calendar calendar21 = dateTime8.toCalendar(locale19);
        java.util.TimeZone timeZone22 = calendar21.getTimeZone();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 0, chronology24);
        int int26 = dateTime25.getSecondOfMinute();
        org.joda.time.DateTime dateTime28 = dateTime25.withYear(10);
        org.joda.time.DateTime dateTime30 = dateTime25.withWeekyear((int) (byte) 10);
        org.joda.time.DateTime.Property property31 = dateTime25.millisOfSecond();
        org.joda.time.DateTime dateTime33 = dateTime25.plusMillis((int) (byte) 10);
        boolean boolean34 = calendar21.before((java.lang.Object) dateTime33);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 0, chronology36);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = dateTime37.toMutableDateTime(chronology38);
        org.joda.time.DateTime dateTime41 = dateTime37.minus((long) '#');
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime37.toMutableDateTime();
        int int43 = dateTime37.getMonthOfYear();
        org.joda.time.DateTime dateTime45 = dateTime37.plus((long) 1970);
        boolean boolean46 = calendar21.equals((java.lang.Object) 1970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(calendar21);
        org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "GMT+10:32");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime12 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime9.toDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType3.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withChronology(chronology17);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withChronology(chronology24);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = dateTimeFormatter2.parseMillis("70");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withZoneUTC();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        long long7 = instant6.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer5, (org.joda.time.ReadableInstant) instant6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(instant6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1645455511714L + "'", long7 == 1645455511714L);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        boolean boolean11 = localDate9.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate13 = localDate9.plusYears(10);
        org.joda.time.LocalDate localDate15 = localDate13.withCenturyOfEra(70);
        org.joda.time.Chronology chronology16 = localDate13.getChronology();
        org.joda.time.LocalDate localDate18 = localDate13.plusWeeks(1980);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = localDate18.withField(dateTimeFieldType19, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(durationFieldType20);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyear();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType21.getField(chronology22);
        org.joda.time.LocalTime localTime25 = localTime20.withField(dateTimeFieldType21, (int) (short) 10);
        java.util.Locale locale27 = null;
        java.lang.String str28 = dateTimeField18.getAsText((org.joda.time.ReadablePartial) localTime20, 6, locale27);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = dateTimeField18.set(0L, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "6" + "'", str28, "6");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.Chronology chronology9 = dateTime2.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime2.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime12 = dateTime2.minusSeconds((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withEra(5423123);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5423123 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        int int22 = localDateTime21.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfEra(11);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.minus(readableDuration25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plus(readablePeriod27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.minusYears(31);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.withPeriodAdded(readablePeriod31, 5420956);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime35 = localDateTime28.withDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour(5429188);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5429188 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime10 = dateTime7.plus(readableDuration9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int12 = dateTime10.get(dateTimeFieldType11);
        org.joda.time.DateTime dateTime13 = dateTime10.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime17 = dateTime10.toDateTime(dateTimeZone16);
        org.joda.time.Chronology chronology18 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType4.getField(chronology18);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withField(dateTimeFieldType21, 5);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusHours(23);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusMillis((int) '#');
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
        org.joda.time.LocalDateTime localDateTime29 = property28.getLocalDateTime();
        org.joda.time.LocalDateTime localDateTime31 = property28.addToCopy(0L);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withMillisOfDay((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = localTime3.compareTo((org.joda.time.ReadablePartial) localDateTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37920000 + "'", int12 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime5.toDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = chronology13.getDateTimeMillis(12, 631, 32, 70, 100, 121, 30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 37920000 + "'", int7 == 37920000);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) 0, chronology7);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.DateTime dateTime11 = property9.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime15 = dateTime11.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime17 = dateTime15.withDayOfMonth(2);
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Calendar calendar19 = dateTime15.toCalendar(locale18);
        int int20 = calendar0.compareTo(calendar19);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455512091,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=32,MILLISECOND=101,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar19);
        org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=-61133702400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=32,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(632, 37919999, 631, 32, 2022, 5423123);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime4 = localTime1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 0, chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime10.plus(readableDuration12);
        org.joda.time.DateTime dateTime15 = dateTime10.withWeekOfWeekyear((int) (short) 10);
        int int16 = dateTimeZone7.getOffset((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) localTime3, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 100);
        org.joda.time.DateTime dateTime20 = localTime17.toDateTimeToday(dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.plus(readablePeriod21);
        org.joda.time.format.DateTimePrinter dateTimePrinter23 = null;
        org.joda.time.format.DateTimeParser dateTimeParser24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter23, dateTimeParser24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dateTime20.toString(dateTimeFormatter25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37920000 + "'", int16 == 37920000);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.minusDays(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property13 = localDate11.property(dateTimeFieldType12);
        int int14 = property13.getMaximumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = property13.addToCopy(14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) 0, chronology23);
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime24.plus(readableDuration26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int29 = dateTime27.get(dateTimeFieldType28);
        org.joda.time.DateTime dateTime30 = dateTime27.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime34 = dateTime27.toDateTime(dateTimeZone33);
        org.joda.time.Chronology chronology35 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = dateTimeFieldType21.getField(chronology35);
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(chronology35);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withField(dateTimeFieldType38, 5);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.monthOfYear();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusMillis(86399999);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean45 = localDateTime40.isSupported(dateTimeFieldType44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime47 = localDateTime19.withField(dateTimeFieldType44, 37231208);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37231208 for halfdayOfDay must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 37920000 + "'", int29 == 37920000);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        int int1 = org.joda.time.format.FormatUtils.calculateDigitCount(1645455495846L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeFormatter2.parseMillis("Fri Sep 27 23:59:59 GMT 2019");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.withMaximumValue();
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) 0, chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime7.toMutableDateTime(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime7.minus((long) '#');
        org.joda.time.DateTime dateTime13 = dateTime7.withDayOfWeek(4);
        org.joda.time.LocalDate localDate14 = dateTime7.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDate localDate16 = localDate14.plus(readablePeriod15);
        org.joda.time.LocalDate.Property property17 = localDate16.weekyear();
        org.joda.time.LocalDate localDate18 = property17.roundFloorCopy();
        org.joda.time.DurationField durationField19 = property17.getDurationField();
        org.joda.time.LocalDate localDate20 = property17.withMaximumValue();
        org.joda.time.LocalDate localDate21 = property17.roundHalfEvenCopy();
        java.lang.String str22 = property17.getAsString();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 0, chronology25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime26.toMutableDateTime(chronology27);
        org.joda.time.DateTime dateTime30 = dateTime26.minus((long) '#');
        org.joda.time.DateTime.Property property31 = dateTime26.minuteOfHour();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 0, chronology33);
        org.joda.time.DateTime.Property property35 = dateTime34.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTime dateTime37 = dateTime34.plus(readableDuration36);
        org.joda.time.DateTime dateTime39 = dateTime34.withWeekOfWeekyear((int) (short) 10);
        long long40 = property31.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType41.getField(chronology42);
        boolean boolean44 = dateTimeField43.isLenient();
        long long46 = dateTimeField43.roundCeiling((long) 5);
        java.lang.String str48 = dateTimeField43.getAsText(32L);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) 0, chronology50);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.MutableDateTime mutableDateTime53 = dateTime51.toMutableDateTime(chronology52);
        org.joda.time.DateTime dateTime55 = dateTime51.minus((long) '#');
        org.joda.time.DateTime dateTime57 = dateTime51.withDayOfWeek(4);
        org.joda.time.LocalDate localDate58 = dateTime51.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDate localDate60 = localDate58.plus(readablePeriod59);
        org.joda.time.LocalDate.Property property61 = localDate60.weekyear();
        int int62 = localDate60.size();
        java.util.Locale locale65 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale66 = java.util.Locale.UK;
        java.lang.String str67 = locale65.getDisplayName(locale66);
        java.lang.String str68 = dateTimeField43.getAsShortText((org.joda.time.ReadablePartial) localDate60, 53, locale65);
        java.lang.String str69 = property31.getAsShortText(locale65);
        org.joda.time.LocalDate localDate70 = property17.setCopy("1", locale65);
        // The following exception was thrown during execution in test generation
        try {
            int int71 = localTime3.compareTo((org.joda.time.ReadablePartial) localDate70);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970" + "'", str22, "1970");
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 5L + "'", long46 == 5L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "37920032" + "'", str48, "37920032");
        org.junit.Assert.assertNotNull(mutableDateTime53);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "53" + "'", str68, "53");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "32" + "'", str69, "32");
        org.junit.Assert.assertNotNull(localDate70);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTimeField dateTimeField2 = dateTimeFieldType0.getField(chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        int int6 = dateTimeField2.getMinimumValue((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 0, chronology11);
        int int13 = dateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime15 = dateTime12.withYear(10);
        org.joda.time.DateTime dateTime17 = dateTime12.withWeekyear((int) (byte) 10);
        long long18 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) 0, chronology20);
        org.joda.time.DateTime.Property property22 = dateTime21.yearOfCentury();
        org.joda.time.DateTime dateTime24 = property22.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime25 = property22.roundFloorCopy();
        boolean boolean27 = dateTime25.isEqual((long) 1);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.DateTime dateTime29 = dateTime25.minus(readablePeriod28);
        boolean boolean30 = dateTime17.isBefore((org.joda.time.ReadableInstant) dateTime29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = dateTime29.withWeekOfWeekyear(5429188);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5429188 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1030851992L + "'", long18 == 1030851992L);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.minusDays(7);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.LocalDate.Property property13 = localDate11.property(dateTimeFieldType12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 0, chronology15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime16.toMutableDateTime(chronology17);
        org.joda.time.DateTime dateTime20 = dateTime16.minus((long) '#');
        org.joda.time.DateTime dateTime22 = dateTime16.withDayOfWeek(4);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime26 = dateTime22.withZone(dateTimeZone25);
        org.joda.time.Interval interval27 = localDate11.toInterval(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType29.getField(chronology30);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone33);
        org.joda.time.LocalDate.Property property35 = localDate34.weekOfWeekyear();
        int[] intArray39 = new int[] { 7, 100, (short) 10 };
        int int40 = dateTimeField31.getMinimumValue((org.joda.time.ReadablePartial) localDate34, intArray39);
        long long43 = dateTimeField31.addWrapField((long) 32, 2022);
        java.util.Locale locale45 = java.util.Locale.forLanguageTag("");
        java.util.Locale locale46 = java.util.Locale.UK;
        java.lang.String str47 = locale45.getDisplayName(locale46);
        int int48 = dateTimeField31.getMaximumTextLength(locale46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = localDate11.toString("4 Aug 2518 00:11:08 GMT", locale46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[7, 100, 10]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 2054L + "'", long43 == 2054L);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime3.toMutableDateTime(chronology4);
        org.joda.time.DateTime dateTime7 = dateTime3.minus((long) '#');
        org.joda.time.DateTime dateTime9 = dateTime3.withDayOfWeek(4);
        org.joda.time.Chronology chronology10 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType0.getField(chronology10);
        org.joda.time.DurationField durationField12 = dateTimeField11.getRangeDurationField();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNull(durationField12);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime4 = localTime1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime9 = localTime6.withFields((org.joda.time.ReadablePartial) localTime8);
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime3.minus(readablePeriod11);
        org.joda.time.LocalTime localTime14 = localTime12.minusSeconds(7);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalTime localTime17 = localTime14.withPeriodAdded(readablePeriod15, 5416138);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = localTime17.withField(dateTimeFieldType18, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        calendar0.setWeekDate((-1), 3, 4);
        int int8 = calendar0.getLeastMaximum(3);
        long long9 = calendar0.getTimeInMillis();
        int int10 = calendar0.getWeeksInWeekYear();
        calendar0.set(1, (int) (byte) -1, 99, 5423123, 32);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) 0, chronology18);
        int int20 = dateTime19.getSecondOfMinute();
        org.joda.time.DateTime dateTime22 = dateTime19.withYear(10);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) 0, chronology24);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime25.toMutableDateTime(chronology26);
        org.joda.time.DateTime dateTime29 = dateTime25.minus((long) '#');
        org.joda.time.DateTime dateTime31 = dateTime25.withDayOfWeek(4);
        boolean boolean33 = dateTime25.equals((java.lang.Object) "eras");
        boolean boolean34 = dateTime19.isEqual((org.joda.time.ReadableInstant) dateTime25);
        java.util.Locale locale36 = java.util.Locale.forLanguageTag("");
        java.lang.String str37 = locale36.getScript();
        java.util.Calendar calendar38 = dateTime25.toCalendar(locale36);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime25);
        org.joda.time.DateTime dateTime41 = dateTime25.minusDays((int) (byte) 1);
        org.joda.time.DateTime dateTime43 = dateTime25.withDayOfYear((int) 'a');
        boolean boolean44 = calendar0.equals((java.lang.Object) dateTime25);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=0,YEAR=1,MONTH=-1,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=99,DAY_OF_YEAR=15,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=5423123,MINUTE=32,SECOND=32,MILLISECOND=587,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 51 + "'", int8 == 51);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-62197664487423L) + "'", long9 == (-62197664487423L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.DateTime dateTime4 = property3.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) property3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.lang.Object obj3 = null;
        boolean boolean4 = calendar0.before(obj3);
        java.lang.String str5 = calendar0.getCalendarType();
        int int7 = calendar0.getGreatestMinimum(0);
        calendar0.set(365, 0, 0, 1970, (int) (byte) 10);
        calendar0.setLenient(true);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(1980, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-50641796967373,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=10,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=365,MONTH=2,WEEK_OF_YEAR=12,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=82,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=2,HOUR_OF_DAY=2,MINUTE=10,SECOND=32,MILLISECOND=637,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        java.util.Locale locale5 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleAttributes();
        java.lang.String str7 = locale5.getVariant();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withLocale(locale5);
        java.lang.StringBuffer stringBuffer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer9, 1645455495940L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        int int4 = localDate2.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField6 = localDate2.getField(0);
        org.joda.time.DateTime dateTime7 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 0, chronology10);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.plus(readableDuration13);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int16 = dateTime14.get(dateTimeFieldType15);
        org.joda.time.DateTime dateTime17 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime21 = dateTime14.toDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology22 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType8.getField(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.weekyear();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.centuryOfEra();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) 0, chronology27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime28.toMutableDateTime(chronology29);
        org.joda.time.DateTime dateTime32 = dateTime28.minus((long) '#');
        org.joda.time.DateTime dateTime34 = dateTime28.withDayOfWeek(4);
        org.joda.time.LocalDate localDate35 = dateTime28.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.LocalDate localDate37 = localDate35.plus(readablePeriod36);
        org.joda.time.LocalDate.Property property38 = localDate37.weekyear();
        org.joda.time.LocalDate localDate39 = property38.withMinimumValue();
        org.joda.time.LocalDate.Property property40 = localDate39.yearOfEra();
        long long42 = chronology22.set((org.joda.time.ReadablePartial) localDate39, (long) 11);
        org.joda.time.DurationField durationField43 = chronology22.months();
        org.joda.time.DateTimeField dateTimeField44 = chronology22.year();
        java.lang.String str45 = chronology22.toString();
        org.joda.time.DurationField durationField46 = chronology22.days();
        org.joda.time.DateTime dateTime47 = dateTime7.withChronology(chronology22);
        org.joda.time.ReadablePeriod readablePeriod48 = null;
        org.joda.time.DateTime dateTime49 = dateTime7.minus(readablePeriod48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37920000 + "'", int16 == 37920000);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-9223372016611199989L) + "'", long42 == (-9223372016611199989L));
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ISOChronology[+10:32]" + "'", str45, "ISOChronology[+10:32]");
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime49);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("South Korea");
        timeZone4.setID("South Korea");
        calendar0.setTimeZone(timeZone4);
        calendar0.set((int) (byte) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add((-292275054), 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"South Korea\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=10,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=58,SECOND=32,MILLISECOND=857,ZONE_OFFSET=10,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("53");
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minusDays(50);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusDays(631);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withSecondOfMinute((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withWeekOfWeekyear((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 0, chronology2);
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.plus(readableDuration5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int8 = dateTime6.get(dateTimeFieldType7);
        org.joda.time.DateTime dateTime9 = dateTime6.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime13 = dateTime6.toDateTime(dateTimeZone12);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType0.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withField(dateTimeFieldType17, 5);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusHours(23);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.minusMillis((int) '#');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withSecondOfMinute((int) (byte) 10);
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        java.util.Locale locale28 = locale27.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = localDateTime23.toString("1970-01-01T10:32:00.000+10:32", locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37920000 + "'", int8 == 37920000);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone1);
        int int3 = localDate2.getDayOfMonth();
        int int4 = localDate2.getCenturyOfEra();
        org.joda.time.DateTimeField dateTimeField6 = localDate2.getField(0);
        org.joda.time.DateTime dateTime7 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 0, chronology12);
        org.joda.time.DateTime.Property property14 = dateTime13.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.plus(readableDuration15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int18 = dateTime16.get(dateTimeFieldType17);
        org.joda.time.DateTime dateTime19 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime23 = dateTime16.toDateTime(dateTimeZone22);
        org.joda.time.Chronology chronology24 = dateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType10.getField(chronology24);
        java.lang.String str26 = dateTimeFieldType10.getName();
        int int27 = instant8.get(dateTimeFieldType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property28 = localDate2.property(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37920000 + "'", int18 == 37920000);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "minuteOfDay" + "'", str26, "minuteOfDay");
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 898 + "'", int27 == 898);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleAttributes();
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.lang.String str5 = locale4.getScript();
        java.lang.String str6 = locale1.getDisplayLanguage(locale4);
        java.lang.String str7 = locale1.getScript();
        java.lang.String str8 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(21);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) 0, chronology4);
        org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime5.plus(readableDuration7);
        org.joda.time.DateTime dateTime10 = dateTime5.withWeekOfWeekyear((int) (short) 10);
        int int11 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.minus((long) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.withYearOfCentury((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime15.withEra((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = dateTime2.toMutableDateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime2.minus((long) '#');
        org.joda.time.DateTime dateTime8 = dateTime2.withDayOfWeek(4);
        org.joda.time.LocalDate localDate9 = dateTime2.toLocalDate();
        int int10 = localDate9.getYearOfEra();
        org.joda.time.LocalDate.Property property11 = localDate9.dayOfYear();
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = property11.setCopy("", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.tz.NameProvider nameProvider0 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleAttributes();
        java.lang.String str6 = nameProvider0.getName(locale2, "+00:00:00.100", "53");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 0, chronology8);
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime12 = property10.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime16 = dateTime12.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime18 = dateTime16.withDayOfMonth(2);
        java.util.Locale locale19 = java.util.Locale.FRANCE;
        java.util.Calendar calendar20 = dateTime16.toCalendar(locale19);
        java.lang.String str23 = nameProvider0.getShortName(locale19, "DateTimeField[hourOfDay]", "DateTimeField[millisOfDay]");
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
        org.junit.Assert.assertNotNull(nameProvider0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=-61133702400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=32,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("TW");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"TW\" is malformed at \"W\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale4 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet5 = locale4.getUnicodeLocaleAttributes();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        java.lang.String str8 = locale7.getScript();
        java.lang.String str9 = locale4.getDisplayLanguage(locale7);
        java.util.Set<java.lang.String> strSet10 = locale4.getUnicodeLocaleAttributes();
        java.lang.String str11 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet10);
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleAttributes();
        boolean boolean16 = strSet14.equals((java.lang.Object) "gregory");
        java.lang.String str17 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet14);
        java.util.Set<java.lang.String> strSet18 = org.joda.time.DateTimeZone.getAvailableIDs();
        boolean boolean19 = strSet14.removeAll((java.util.Collection<java.lang.String>) strSet18);
        java.util.stream.Stream<java.lang.String> strStream20 = strSet18.stream();
        java.util.stream.Stream<java.lang.String> strStream21 = strSet18.parallelStream();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType22.getField(chronology23);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        int int28 = dateTimeField24.getMinimumValue((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.LocalTime localTime30 = localTime26.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property31 = localTime30.minuteOfHour();
        org.joda.time.LocalTime localTime33 = property31.addNoWrapToCopy((int) '4');
        org.joda.time.LocalTime localTime34 = property31.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) 0, chronology36);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateTime dateTime40 = dateTime37.plus(readableDuration39);
        org.joda.time.DateTime dateTime42 = dateTime37.withWeekOfWeekyear((int) (short) 10);
        org.joda.time.DateTime dateTime44 = dateTime37.withMonthOfYear((int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.DateTime dateTime46 = dateTime37.minus(readablePeriod45);
        long long47 = property31.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime46);
        org.joda.time.LocalTime localTime48 = property31.withMaximumValue();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) 0, chronology50);
        org.joda.time.DateTime.Property property52 = dateTime51.yearOfCentury();
        org.joda.time.DateTime dateTime54 = property52.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTime dateTime58 = dateTime54.withDate((int) ' ', (int) (byte) 10, 1);
        org.joda.time.DateTime dateTime60 = dateTime58.withDayOfMonth(2);
        java.util.Locale locale61 = java.util.Locale.FRANCE;
        java.util.Calendar calendar62 = dateTime58.toCalendar(locale61);
        org.joda.time.LocalDateTime localDateTime63 = dateTime58.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime(dateTimeZone64);
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime68 = localTime65.withFields((org.joda.time.ReadablePartial) localTime67);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(dateTimeZone69);
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime((long) 'a');
        org.joda.time.LocalTime localTime73 = localTime70.withFields((org.joda.time.ReadablePartial) localTime72);
        int int74 = localTime67.compareTo((org.joda.time.ReadablePartial) localTime70);
        int int75 = localTime70.getHourOfDay();
        org.joda.time.base.AbstractPartial[] abstractPartialArray76 = new org.joda.time.base.AbstractPartial[] { localTime48, localDateTime63, localTime70 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.base.AbstractPartial[] abstractPartialArray77 = strSet18.toArray(abstractPartialArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 632L + "'", long47 == 632L);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar62);
        org.junit.Assert.assertEquals(calendar62.toString(), "java.util.GregorianCalendar[time=-61133702400000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=32,MONTH=9,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=277,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=32,SECOND=0,MILLISECOND=0,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(abstractPartialArray76);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMaximum(11);
        int int4 = calendar0.getActualMinimum(3);
        boolean boolean5 = calendar0.isWeekDateSupported();
        int int6 = calendar0.getWeeksInWeekYear();
        int int8 = calendar0.getActualMaximum(6);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        java.util.TimeZone timeZone10 = calendar0.getTimeZone();
        java.lang.String str11 = timeZone10.getDisplayName();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455513457,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT+10:32\",offset=37920000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=30,SECOND=33,MILLISECOND=457,ZONE_OFFSET=37920000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 365 + "'", int8 == 365);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(timeZone10);
// flaky:         org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+10:32");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "GMT+10:32" + "'", str11, "GMT+10:32");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("South Korea");
        int int2 = timeZone1.getRawOffset();
        java.util.TimeZone.setDefault(timeZone1);
        java.util.Date date5 = new java.util.Date((long) (byte) -1);
        date5.setTime((long) ' ');
        date5.setYear((int) 'u');
        int int10 = date5.getTimezoneOffset();
        boolean boolean11 = timeZone1.inDaylightTime(date5);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals(date5.toString(), "Sun Jan 01 00:00:00 GMT 2017");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) 0, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.plus(readableDuration4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int7 = dateTime5.get(dateTimeFieldType6);
        org.joda.time.DateTime dateTime8 = dateTime5.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime12 = dateTime5.toDateTime(dateTimeZone11);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.seconds();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) 0, chronology16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime17.toMutableDateTime(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime17.minus((long) '#');
        org.joda.time.DateTime dateTime23 = dateTime17.withDayOfWeek(4);
        org.joda.time.LocalDate localDate24 = dateTime17.toLocalDate();
        boolean boolean26 = localDate24.equals((java.lang.Object) 37920000);
        org.joda.time.LocalDate localDate28 = localDate24.plusYears(0);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) (byte) 0, dateTimeZone30);
        org.joda.time.LocalDate.Property property32 = localDate31.weekOfWeekyear();
        org.joda.time.LocalDate localDate33 = property32.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) 0, chronology35);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = dateTime36.toMutableDateTime(chronology37);
        org.joda.time.DateTime dateTime40 = dateTime36.minus((long) '#');
        org.joda.time.DateTime dateTime42 = dateTime36.withDayOfWeek(4);
        org.joda.time.LocalDate localDate43 = dateTime36.toLocalDate();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDate localDate45 = localDate43.plus(readablePeriod44);
        org.joda.time.LocalDate.Property property46 = localDate45.weekyear();
        org.joda.time.LocalDate localDate47 = localDate33.withFields((org.joda.time.ReadablePartial) localDate45);
        int int48 = localDate28.compareTo((org.joda.time.ReadablePartial) localDate47);
        org.joda.time.LocalDate localDate50 = localDate28.minusWeeks(19);
        long long52 = chronology13.set((org.joda.time.ReadablePartial) localDate28, 32L);
        org.joda.time.ReadablePartial readablePartial53 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long55 = chronology13.set(readablePartial53, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 37920000 + "'", int7 == 37920000);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 32L + "'", long52 == 32L);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) 0, chronology5);
        org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime9 = dateTime6.plus(readableDuration8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.millisOfDay();
        int int11 = dateTime9.get(dateTimeFieldType10);
        org.joda.time.DateTime dateTime12 = dateTime9.withTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (int) ' ');
        org.joda.time.DateTime dateTime16 = dateTime9.toDateTime(dateTimeZone15);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = dateTimeFieldType3.getField(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyear();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.halfdayOfDay();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.weeks();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withChronology(chronology17);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withChronology(chronology24);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 889);
        java.io.Writer writer28 = null;
        org.joda.time.ReadablePartial readablePartial29 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter27.printTo(writer28, readablePartial29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37920000 + "'", int11 == 37920000);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
    }
}
