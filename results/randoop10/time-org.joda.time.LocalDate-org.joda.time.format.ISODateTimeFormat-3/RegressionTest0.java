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
        int int0 = org.joda.time.YearMonthDay.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = dateTimeFormatter0.parseDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) timeOfDay4, readablePartial6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.months();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.months();
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.months();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.months();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.months();
        org.joda.time.DurationFieldType[] durationFieldTypeArray6 = new org.joda.time.DurationFieldType[] { durationFieldType0, durationFieldType1, durationFieldType2, durationFieldType3, durationFieldType4, durationFieldType5 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.forFields(durationFieldTypeArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [months, months, months, months, months]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(durationFieldTypeArray6);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateTime1.toString("PT1M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localDate6.toString("", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 UTC 1899");
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("PT1M");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT1M\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate6.withYearOfCentury(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 UTC 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) dateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTime7.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekOfWeekyear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(1, (int) (short) -1, 4, (int) (short) 0, 100, (int) (short) 0, (-1), chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = timeOfDay3.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period(0, (int) (byte) 1, 100, (int) '#', 45, (int) (short) 10, 3, (int) (short) 1, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        int int0 = org.joda.time.YearMonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("45");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = localTime9.toString("hi!", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = dateTimeFormatter0.parseLocalTime("45");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"45\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) '4', 1899, (int) (byte) 10, 44, (int) '#', chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy("45");
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property7.setCopy("00", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 UTC 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(47, 16, 47, 100, (int) (byte) 1, 1, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(7, (-1), (int) ' ', 1899, 16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1899 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((long) (-1), chronology9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDate6.compareTo((org.joda.time.ReadablePartial) timeOfDay10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 UTC 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate6.get(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 UTC 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) property2, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        java.util.Locale locale15 = java.util.Locale.forLanguageTag("PT1M");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTime10.toString("hi!", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
        org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
        java.lang.StringBuffer stringBuffer2 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime.Property property5 = dateTime4.secondOfMinute();
        org.joda.time.DateTime dateTime7 = dateTime4.withYearOfCentury(16);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer2, (org.joda.time.ReadableInstant) dateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeParser1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = dateMidnight3.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((int) (short) 100, 16, 44, (int) (short) 0, 1, 16, (int) '4', chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str9 = locale6.getDisplayVariant(locale8);
        java.util.Set<java.lang.String> strSet10 = locale8.getUnicodeLocaleAttributes();
        boolean boolean11 = date5.equals((java.lang.Object) locale8);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 UTC 1899");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField15 = yearMonthDay9.getField((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        boolean boolean2 = dateTimeFormatter1.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter1.withDefaultYear(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.parse("00", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"00\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        java.lang.Class<?> wildcardClass1 = dateTimeFormatter0.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("2022-02-21T00:52:52.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T00:52:52.000Z\" is malformed at \"-02-21T00:52:52.000Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate6.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str1 = dateTimeFieldType0.getName();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "minuteOfHour" + "'", str1, "minuteOfHour");
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 1899, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime9 = localDate5.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.Interval interval14 = yearMonthDay10.toInterval(dateTimeZone12);
        org.joda.time.MutableInterval mutableInterval15 = interval14.toMutableInterval();
        org.joda.time.Interval interval17 = interval14.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) dateTimeFieldType0, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.016" + "'", str13, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime0.withFieldAdded(durationFieldType1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'years' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(durationFieldType1);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeOfDay4.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale6 = java.util.Locale.KOREAN;
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str9 = locale6.getDisplayVariant(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = calendar3.getDisplayName(8, 16, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455230670,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=50,MILLISECOND=686,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withHourOfDay(3);
        int int12 = dateTime11.getSecondOfMinute();
        int int13 = dateTime11.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 1899, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str26 = dateTimeZone25.getID();
        org.joda.time.Interval interval27 = yearMonthDay23.toInterval(dateTimeZone25);
        org.joda.time.MutableInterval mutableInterval28 = interval27.toMutableInterval();
        org.joda.time.Interval interval30 = interval27.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.DateTime dateTime32 = dateTime11.toDateTime(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay((java.lang.Object) property7, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 53 + "'", int13 == 53);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.016" + "'", str26, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(mutableInterval28);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        // The following exception was thrown during execution in test generation
        try {
            calendar3.add(21, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455231027,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=51,MILLISECOND=43,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay8 = timeOfDay4.withFieldAdded(durationFieldType6, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        int int6 = localDate4.getValue((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate4.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType11 = period6.getFieldType(21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTime3.toString("PT0S", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 51 + "'", int4 == 51);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        java.lang.String str2 = localTime0.toString(dateTimeFormatter1);
        org.joda.time.LocalTime localTime4 = localTime0.minusSeconds((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period14 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime0, (org.joda.time.ReadablePartial) localDate9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = property7.setCopy((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(1899, (int) (short) -1, (int) (byte) 1, (int) '4', (int) '#', chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.016" + "'", str17, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.Period period4 = new org.joda.time.Period((int) (short) 1, (int) (byte) 1, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = period4.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        org.joda.time.Period period6 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        java.lang.String str9 = period8.toString();
        org.joda.time.Period period10 = period6.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.Period period12 = period10.plusMillis(100);
        org.joda.time.Period period13 = period10.negated();
        org.joda.time.Period period15 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        java.lang.String str18 = period17.toString();
        org.joda.time.Period period19 = period15.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period19.plusMillis(100);
        boolean boolean22 = period13.equals((java.lang.Object) period21);
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period24 = period13.withFields((org.joda.time.ReadablePeriod) mutablePeriod23);
        mutablePeriod23.setYears((int) '#');
        boolean boolean27 = calendar3.equals((java.lang.Object) mutablePeriod23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455232476,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=52,MILLISECOND=492,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT1M" + "'", str9, "PT1M");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT1M" + "'", str18, "PT1M");
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.LocalDate.Property property8 = localDate6.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField10 = localDate6.getField(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32769");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("45", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=45");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) '4', chronology10);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.secondOfMinute();
        int[] intArray14 = new int[] { 21 };
        int int15 = dateTimeField7.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay11, intArray14);
        boolean boolean16 = dateTimeField7.isLenient();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 10, chronology18);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.plus((long) 45);
        org.joda.time.DateMidnight.Property property27 = dateMidnight24.weekyear();
        org.joda.time.DateTimeField dateTimeField28 = property27.getField();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(0, (int) '4', chronology31);
        org.joda.time.TimeOfDay.Property property33 = timeOfDay32.secondOfMinute();
        int[] intArray35 = new int[] { 21 };
        int int36 = dateTimeField28.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay32, intArray35);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str40 = dateTimeZone39.getID();
        java.util.Locale locale42 = java.util.Locale.KOREAN;
        java.util.Locale locale44 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str45 = locale42.getDisplayVariant(locale44);
        java.lang.String str46 = dateTimeZone39.getName((long) 5, locale42);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray47 = dateTimeField7.set((org.joda.time.ReadablePartial) localDateTime19, 45, intArray35, "45", locale42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 45");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[21]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.016" + "'", str23, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[21]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 292278993 + "'", int36 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00:00.016" + "'", str40, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00:00.016" + "'", str46, "+00:00:00.016");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        int int6 = dateTimeZone4.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1899, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.Interval interval16 = yearMonthDay12.toInterval(dateTimeZone14);
        org.joda.time.MutableInterval mutableInterval17 = interval16.toMutableInterval();
        org.joda.time.Interval interval19 = interval16.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(53, 3172000, 53, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3172000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.016" + "'", str15, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(mutableInterval17);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(3172000, 21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3172000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        java.lang.String str6 = date5.toString();
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Fri Mar 10 01:35:00 GMT+00:00 1899" + "'", str6, "Fri Mar 10 01:35:00 GMT+00:00 1899");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        long long6 = java.util.Date.UTC((int) (byte) 100, (int) '4', 44, (int) '4', 3172000, 45);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1277592045000L + "'", long6 == 1277592045000L);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str10 = dateTimeZone9.getID();
        org.joda.time.DateMidnight dateMidnight11 = org.joda.time.DateMidnight.now(dateTimeZone9);
        int int13 = dateTimeZone9.getOffset((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((java.lang.Object) property7, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00:00.016" + "'", str10, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTime.Property property10 = dateTime7.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime7.withMonthOfYear(16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
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
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("00");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.withEra(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight1);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period7 = period5.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.months();
        int int9 = period7.get(durationFieldType8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Locale[] localeArray13 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList14 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList14, localeArray13);
        java.util.List<java.util.Locale> localeList16 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, (java.util.Collection<java.util.Locale>) localeList14);
        boolean boolean17 = localeList16.isEmpty();
        localeList16.clear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) '4', chronology21);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.plusMinutes(1899);
        boolean boolean25 = localeList16.remove((java.lang.Object) timeOfDay22);
        boolean boolean26 = period7.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localeList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        boolean boolean11 = dateTime8.isBefore((org.joda.time.ReadableInstant) dateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime10.withDate((int) (short) 0, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType5, chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(45, (int) (short) 0, 0, (int) (byte) -1, chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.016" + "'", str18, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(mutableInterval20);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = yearMonthDay9.getFieldType(21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Fri Mar 10 01:35:00 GMT+00:00 1899");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Fri Mar 10 01:35:00 GMT+00:00 1899' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        org.joda.time.Chronology chronology2 = dateTimeFormatter1.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.parse("2022-02-21T00:52:52.000Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T00:52:52.000Z\" is malformed at \"22-02-21T00:52:52.000Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNull(chronology2);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        java.lang.StringBuffer stringBuffer2 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = timeOfDay7.getFields();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = timeOfDay7.toDateTimeToday(dateTimeZone9);
        org.joda.time.DateTime.Property property11 = dateTime10.monthOfYear();
        org.joda.time.DateTime dateTime13 = dateTime10.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer2, (org.joda.time.ReadableInstant) dateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        java.util.Date date9 = dateTime8.toDate();
        java.lang.Object obj10 = date9.clone();
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Thu Feb 15 00:52:52 GMT+00:00 1022");
        org.junit.Assert.assertNotNull(obj10);
// flaky:         org.junit.Assert.assertEquals(obj10.toString(), "Thu Feb 15 00:52:52 GMT+00:00 1022");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "Thu Feb 15 00:52:52 GMT+00:00 1022");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "Thu Feb 15 00:52:52 GMT+00:00 1022");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        long long13 = durationField10.subtract(31795199984L, (int) '#');
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1073174400016L) + "'", long13 == (-1073174400016L));
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeField7.set((long) 1, "");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusMonths(4);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withFieldAdded(durationFieldType7, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1899, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Interval interval15 = yearMonthDay11.toInterval(dateTimeZone13);
        org.joda.time.MutableInterval mutableInterval16 = interval15.toMutableInterval();
        org.joda.time.Interval interval18 = interval15.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType1, chronology19);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod20.addHours((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.016" + "'", str14, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(mutableInterval16);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.plusMinutes(1899);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.LocalDate localDate12 = localDate10.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone15 = dateTimeZone14.toTimeZone();
        org.joda.time.DateTime dateTime16 = localDate10.toDateTimeAtCurrentTime(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay3, (org.joda.time.ReadablePartial) localDate10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        int int13 = dateTime10.getWeekOfWeekyear();
        org.joda.time.LocalTime localTime14 = dateTime10.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType16 = localTime14.getFieldType(1899);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1899");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        int int0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 1899, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str21 = dateTimeZone20.getID();
        org.joda.time.Interval interval22 = yearMonthDay18.toInterval(dateTimeZone20);
        org.joda.time.MutableInterval mutableInterval23 = interval22.toMutableInterval();
        org.joda.time.Interval interval25 = interval22.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology26.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((java.lang.Object) dateTimeZone5, dateTimeZone27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.016" + "'", str21, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(mutableInterval23);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(50, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) (-1), chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = timeOfDay2.withSecondOfMinute(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((int) 'a');
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 10, chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withWeekOfWeekyear((int) ' ');
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withYear((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime26.plusMinutes(4);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.DateMidnight dateMidnight37 = org.joda.time.DateMidnight.now(dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.plus((long) 45);
        org.joda.time.DateMidnight.Property property40 = dateMidnight37.weekyear();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.TimeOfDay timeOfDay45 = new org.joda.time.TimeOfDay(0, (int) '4', chronology44);
        org.joda.time.TimeOfDay.Property property46 = timeOfDay45.secondOfMinute();
        int[] intArray48 = new int[] { 21 };
        int int49 = dateTimeField41.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay45, intArray48);
        java.util.Locale locale51 = java.util.Locale.KOREAN;
        java.util.Locale locale53 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str54 = locale51.getDisplayVariant(locale53);
        java.util.Set<java.lang.String> strSet55 = locale53.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray56 = dateTimeField19.set((org.joda.time.ReadablePartial) localDateTime30, 7, intArray48, "45", locale53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.016" + "'", str36, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[21]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 292278993 + "'", int49 == 292278993);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(strSet55);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.TimeZone.setDefault(timeZone2);
        boolean boolean5 = timeZone2.useDaylightTime();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455238414,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=58,MILLISECOND=430,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDateTime();
        java.lang.Appendable appendable1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        java.lang.String str4 = localTime2.toString(dateTimeFormatter3);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadablePartial) localTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str4, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy("45");
        org.joda.time.LocalDate localDate10 = property7.withMaximumValue();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate10.withFieldAdded(durationFieldType11, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("00");
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plusDays((int) (short) -1);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.era();
        org.joda.time.DateMidnight dateMidnight5 = property4.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = property4.addToCopy(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateMidnight5);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        int int6 = dateTime3.getEra();
        int int7 = dateTime3.getEra();
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 58 + "'", int4 == 58);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = timeOfDay3.getFieldType(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = timeOfDay3.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.plusMinutes(1899);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay3.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str9 = dateTimeZone8.getID();
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str14 = locale11.getDisplayVariant(locale13);
        java.lang.String str15 = dateTimeZone8.getName((long) 5, locale11);
        java.lang.String str16 = locale11.getDisplayScript();
        int int17 = property6.getMaximumTextLength(locale11);
        int int18 = property6.getMaximumValue();
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00:00.016" + "'", str9, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.016" + "'", str15, "+00:00:00.016");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 999 + "'", int18 == 999);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2022-02-21T00:52:52.000Z", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-21t00:52:52.000z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.TimeZone.setDefault(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.016' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withMonthOfYear((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime9 = property8.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) property8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale[] localeArray4 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList5 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList5, localeArray4);
        java.util.List<java.util.Locale> localeList7 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList5);
        boolean boolean8 = localeList7.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strSet0.retainAll((java.util.Collection<java.util.Locale>) localeList7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(localeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localeList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTime1.toString("T00:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        java.lang.String str4 = property2.getAsShortText();
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Locale[] localeArray9 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList10 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList10, localeArray9);
        java.util.List<java.util.Locale> localeList12 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList10);
        boolean boolean13 = localeList12.isEmpty();
        localeList12.clear();
        java.util.stream.Stream<java.util.Locale> localeStream15 = localeList12.parallelStream();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale16.getDisplayName();
        java.lang.String str18 = locale16.getScript();
        boolean boolean19 = localeList12.add(locale16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = property2.setCopy("minuteOfHour", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"minuteOfHour\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localeStream15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Korean (South Korea)" + "'", str17, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setMonthOfYear((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: 00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        boolean boolean9 = dateTimeField7.isLeap((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondFraction();
        java.lang.Appendable appendable1 = null;
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 10, chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour(0);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 10, chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.plusMillis(3);
        org.joda.time.LocalDateTime.Property property18 = localDateTime14.centuryOfEra();
        int int19 = localDateTime14.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType20.getDurationType();
        org.joda.time.LocalDateTime.Property property22 = localDateTime14.property(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime24 = property22.setCopy("00");
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadablePartial) localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfCeilingCopy();
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale[] localeArray11 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList12 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList12, localeArray11);
        java.util.List<java.util.Locale> localeList14 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList12);
        boolean boolean15 = localeList14.isEmpty();
        localeList14.clear();
        java.util.stream.Stream<java.util.Locale> localeStream17 = localeList14.parallelStream();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale18.getDisplayName();
        java.lang.String str20 = locale18.getScript();
        boolean boolean21 = localeList14.add(locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = property5.setCopy("Korean (South Korea)", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Korean (South Korea)\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localeStream17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean (South Korea)" + "'", str19, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.LocalDate.Property property8 = localDate6.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) localDate6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((int) (short) 100, 54, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(0);
        org.joda.time.LocalTime.Property property12 = localTime9.millisOfSecond();
        org.joda.time.LocalTime localTime14 = property12.addWrapFieldToCopy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localTime14.getValue(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32769");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.LocalDate localDate11 = localDate9.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = localDate9.toDateTimeAtCurrentTime(dateTimeZone13);
        int int17 = dateTimeZone13.getOffsetFromLocal((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((int) (byte) 1, (int) 'u', (int) (short) 1, 52, 45, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=????????t000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("1", (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=52.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) '4', chronology10);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.secondOfMinute();
        int[] intArray14 = new int[] { 21 };
        int int15 = dateTimeField7.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay11, intArray14);
        boolean boolean16 = dateTimeField7.isLenient();
        java.util.Locale locale19 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField7.set((long) 50, "", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[21]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(0, (int) '4', chronology9);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = timeOfDay10.getFieldType(1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDate4.get(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        calendar3.setTimeInMillis(31556952000L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = calendar3.isSet(59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 59");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=31556952000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1971,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=49,SECOND=12,MILLISECOND=16,ZONE_OFFSET=16,DST_OFFSET=0]");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(4, (int) ' ', (int) '#');
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusSeconds(3172001);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((int) (short) -1, (int) (short) 1, 16, chronology9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = timeOfDay3.isBefore((org.joda.time.ReadablePartial) localDate10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        boolean boolean1 = dateTimeFormatter0.isParser();
        java.io.Writer writer2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime6.add(readableDuration7, 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime6.dayOfWeek();
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime6.secondOfDay();
        org.joda.time.MutableDateTime mutableDateTime13 = property11.addWrapField((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer2, (org.joda.time.ReadableInstant) mutableDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.plusMinutes(1899);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.lang.String str7 = timeOfDay3.toString(dateTimeFormatter6);
        java.lang.Appendable appendable8 = null;
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = timeOfDay13.getFields();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = timeOfDay13.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTime.Property property17 = dateTime16.monthOfYear();
        org.joda.time.DateTime dateTime19 = dateTime16.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(chronology20);
        int int22 = dateTime19.getWeekOfWeekyear();
        org.joda.time.LocalTime localTime23 = dateTime19.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable8, (org.joda.time.ReadableInstant) dateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00" + "'", str7, "00");
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(localTime23);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy("46");
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) localDate15, 1, locale17);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay24.minusSeconds(3);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str29 = dateTimeZone28.getID();
        java.util.Locale locale31 = java.util.Locale.KOREAN;
        java.util.Locale locale33 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str34 = locale31.getDisplayVariant(locale33);
        java.lang.String str35 = dateTimeZone28.getName((long) 5, locale31);
        java.lang.String str36 = locale31.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) timeOfDay26, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekOfWeekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Korean (South Korea)" + "'", str18, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.016" + "'", str29, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00:00.016" + "'", str35, "+00:00:00.016");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        int int13 = dateTime10.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        org.joda.time.DateTime dateTime17 = dateTime10.withFieldAdded(durationFieldType15, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTime17.toString("DurationField[weekyears]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: u");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.plusMinutes(1899);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.lang.String str7 = timeOfDay3.toString(dateTimeFormatter6);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        java.lang.String str12 = period11.toString();
        org.joda.time.Period period13 = period9.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay3.minus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period20.plusMillis(100);
        org.joda.time.Period period23 = period20.negated();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay3.plus((org.joda.time.ReadablePeriod) period23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType26 = timeOfDay3.getFieldType(12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00" + "'", str7, "00");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT1M" + "'", str12, "PT1M");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT1M" + "'", str19, "PT1M");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(timeOfDay24);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay9.dayOfMonth();
        java.util.Locale locale16 = java.util.Locale.KOREAN;
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str19 = locale16.getDisplayVariant(locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay20 = property14.setCopy("DateTimeField[weekyear]", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[weekyear]\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(4, (int) ' ', (int) '#');
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay12.minusSeconds(3172001);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = localDate6.isAfter((org.joda.time.ReadablePartial) timeOfDay14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(timeOfDay14);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod();
        java.lang.String str2 = mutablePeriod1.toString();
        mutablePeriod1.setPeriod(0L);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Duration duration22 = interval21.toDuration();
        java.lang.String str23 = duration22.toString();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 1899, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime32 = localDate28.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.Interval interval37 = yearMonthDay33.toInterval(dateTimeZone35);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        org.joda.time.Interval interval40 = interval37.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = chronology41.getZone();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.monthOfYear();
        org.joda.time.Period period45 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period47 = org.joda.time.Period.minutes(1);
        java.lang.String str48 = period47.toString();
        org.joda.time.Period period49 = period45.withFields((org.joda.time.ReadablePeriod) period47);
        org.joda.time.Period period51 = period49.plusMillis(100);
        org.joda.time.Period period52 = period49.negated();
        org.joda.time.Period period54 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period56 = org.joda.time.Period.minutes(1);
        java.lang.String str57 = period56.toString();
        org.joda.time.Period period58 = period54.withFields((org.joda.time.ReadablePeriod) period56);
        org.joda.time.Period period60 = period58.plusMillis(100);
        boolean boolean61 = period52.equals((java.lang.Object) period60);
        long long64 = chronology41.add((org.joda.time.ReadablePeriod) period52, 31556952000L, (int) '4');
        mutablePeriod1.setPeriod((org.joda.time.ReadableDuration) duration22, chronology41);
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod(0L, chronology41);
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.getDefault();
        int int70 = dateTimeZone68.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate71 = new org.joda.time.LocalDate((long) 1899, dateTimeZone68);
        org.joda.time.LocalDate localDate73 = localDate71.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone75 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone76 = dateTimeZone75.toTimeZone();
        org.joda.time.DateTime dateTime77 = localDate71.toDateTimeAtCurrentTime(dateTimeZone75);
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str80 = dateTimeZone79.getID();
        org.joda.time.DateMidnight dateMidnight81 = org.joda.time.DateMidnight.now(dateTimeZone79);
        org.joda.time.DateMidnight dateMidnight83 = dateMidnight81.plus((long) 45);
        org.joda.time.DateMidnight.Property property84 = dateMidnight81.weekyear();
        org.joda.time.DateTimeField dateTimeField85 = property84.getField();
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.TimeOfDay timeOfDay89 = new org.joda.time.TimeOfDay(0, (int) '4', chronology88);
        org.joda.time.TimeOfDay.Property property90 = timeOfDay89.secondOfMinute();
        int[] intArray92 = new int[] { 21 };
        int int93 = dateTimeField85.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay89, intArray92);
        // The following exception was thrown during execution in test generation
        try {
            chronology41.validate((org.joda.time.ReadablePartial) localDate71, intArray92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PT0S" + "'", str2, "PT0S");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.016" + "'", str17, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT1645487967.215S" + "'", str23, "PT1645487967.215S");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.016" + "'", str36, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "PT1M" + "'", str48, "PT1M");
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "PT1M" + "'", str57, "PT1M");
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 31553832000L + "'", long64 == 31553832000L);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(localDate73);
        org.junit.Assert.assertNotNull(dateTimeZone75);
        org.junit.Assert.assertNotNull(timeZone76);
        org.junit.Assert.assertEquals(timeZone76.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertNotNull(dateTimeZone79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "+00:00:00.016" + "'", str80, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight81);
        org.junit.Assert.assertNotNull(dateMidnight83);
        org.junit.Assert.assertNotNull(property84);
        org.junit.Assert.assertNotNull(dateTimeField85);
        org.junit.Assert.assertNotNull(property90);
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[21]");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 292278993 + "'", int93 == 292278993);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(timeZone8);
        int int10 = calendar9.getWeekYear();
        java.lang.String str11 = calendar9.getCalendarType();
        int int12 = calendar3.compareTo(calendar9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455242574,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=2,MILLISECOND=590,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645455242575,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=2,MILLISECOND=591,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "gregory" + "'", str11, "gregory");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusMillis(3);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime18 = property16.setCopy("10");
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = localDateTime18.isEqual((org.joda.time.ReadablePartial) localTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.lang.String[] strArray9 = new java.lang.String[] { "+00:00:00.016", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000", "46", "hi!", "45", "00", "45", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        strSet10.clear();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period15 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        java.lang.String str18 = period17.toString();
        org.joda.time.Period period19 = period15.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period19.plusMillis(100);
        org.joda.time.LocalTime localTime22 = localTime13.minus((org.joda.time.ReadablePeriod) period19);
        boolean boolean23 = strSet10.equals((java.lang.Object) period19);
        java.lang.Object[] objArray24 = strSet10.toArray();
        boolean boolean25 = strSet10.isEmpty();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT1M" + "'", str18, "PT1M");
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period7 = period5.plusMillis(100);
        org.joda.time.Period period8 = period5.negated();
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.plusMillis(100);
        boolean boolean17 = period8.equals((java.lang.Object) period16);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period19 = period8.withFields((org.joda.time.ReadablePeriod) mutablePeriod18);
        mutablePeriod18.setYears((int) '#');
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.months();
        mutablePeriod18.add(durationFieldType22, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = mutablePeriod18.getValue(58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 58");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT1M" + "'", str13, "PT1M");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType22);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "fr_FR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "fr_FR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "fr_FR");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 1899, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str21 = dateTimeZone20.getID();
        org.joda.time.Interval interval22 = yearMonthDay18.toInterval(dateTimeZone20);
        org.joda.time.MutableInterval mutableInterval23 = interval22.toMutableInterval();
        org.joda.time.Interval interval25 = interval22.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology26.getZone();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((java.lang.Object) property8, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.016" + "'", str21, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(mutableInterval23);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        boolean boolean15 = dateTime10.equals((java.lang.Object) dateMidnight14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.era();
        java.util.Locale locale18 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight19 = property16.setCopy("", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.016" + "'", str13, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime3.withYearOfCentury(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.io.Writer writer1 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(0, (int) '4', chronology4);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.plusMinutes(1899);
        org.joda.time.TimeOfDay.Property property8 = timeOfDay5.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay5.plusSeconds(11);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadablePartial) timeOfDay10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        boolean boolean12 = mutableDateTime3.isEqualNow();
        org.joda.time.ReadableInstant readableInstant13 = null;
        mutableDateTime3.setMillis(readableInstant13);
        boolean boolean16 = mutableDateTime3.isAfter((long) 52);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        java.lang.String str2 = localTime0.toString(dateTimeFormatter1);
        org.joda.time.LocalTime localTime4 = localTime0.minusSeconds((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = org.joda.time.format.ISODateTimeFormat.tTime();
        java.lang.String str6 = localTime0.toString(dateTimeFormatter5);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(writer7, (long) 44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str2, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "T00:00:00.000" + "'", str6, "T00:00:00.000");
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        java.lang.String str11 = localDateTime10.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withDayOfYear(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.010" + "'", str11, "1970-01-01T00:00:00.010");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        int int1 = mutablePeriod0.getDays();
        mutablePeriod0.setHours((int) 'a');
        mutablePeriod0.add(0, 7, 1970, 52, (int) (short) 100, (int) (short) 0, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval13 = new org.joda.time.Interval((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-21T03:54:01.425Z", (double) 3172000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=3172000.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 1899, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.Interval interval17 = yearMonthDay13.toInterval(dateTimeZone15);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Interval interval20 = interval17.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology21.getZone();
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((java.lang.Object) dateTime3, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime3.withMillisOfDay((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTime3.withDayOfYear(1899);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1899 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.016" + "'", str16, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = yearMonthDay9.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = yearMonthDay9.getField(3172000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 3172000");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(dateMidnight14);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.TimeZone.setDefault(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((java.lang.Object) timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.SimpleTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        int int10 = localTime9.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime9.withMillisOfSecond(3172001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3172001 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        int int8 = property7.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property7 = timeOfDay4.property(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(54, (int) (short) -1, 3172000, 22, 45);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        org.joda.time.DateTime.Property property5 = dateTime3.millisOfDay();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = durationField6.getValue((-2234643900016L), 1645455242370L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -2234643900016");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(0);
        org.joda.time.LocalTime.Property property12 = localTime9.millisOfSecond();
        org.joda.time.LocalTime localTime14 = property12.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime15 = property12.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = localTime15.withField(dateTimeFieldType16, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinute();
        java.lang.Appendable appendable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (long) 47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.Date date3 = new java.util.Date((int) (short) 10, (int) (short) 100, (int) '#');
        int int4 = date3.getMinutes();
        date3.setMonth(10);
        org.junit.Assert.assertEquals(date3.toString(), "Mon Nov 04 00:00:00 GMT+00:00 1918");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.millis();
        org.joda.time.DurationField durationField22 = chronology17.hours();
        int int24 = durationField22.getValue((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            calendar3.setWeekDate((int) (byte) 1, 3172001, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455245440,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=5,MILLISECOND=456,ZONE_OFFSET=16,DST_OFFSET=0]");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        java.lang.String str8 = period7.toString();
        org.joda.time.Period period9 = period5.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) (short) 100);
        mutableDateTime3.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = period14.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period20 = period18.plusMillis(100);
        org.joda.time.Period period21 = period18.negated();
        org.joda.time.Period period23 = period21.withMillis(1899);
        org.joda.time.Period period25 = period23.plusMillis(0);
        mutableDateTime3.add((org.joda.time.ReadablePeriod) period23);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setTime(21, 3172001, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3172001 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT1M" + "'", str8, "PT1M");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT1M" + "'", str17, "PT1M");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        long long11 = durationField10.getUnitMillis();
        long long14 = durationField10.add((long) (short) -1, (long) 100);
        java.lang.String str15 = durationField10.getName();
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 31556952000L + "'", long11 == 31556952000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3155846399999L + "'", long14 == 3155846399999L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "weekyears" + "'", str15, "weekyears");
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime3, readableDuration12);
        mutableDateTime3.setMillisOfDay(10);
        mutableDateTime3.setDayOfYear(5);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime3.copy();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 10, chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMinuteOfHour(0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long) 10, chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.withFields((org.joda.time.ReadablePartial) localDateTime26);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfDay();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.plusMillis(3);
        org.joda.time.LocalDateTime.Property property35 = localDateTime31.centuryOfEra();
        int int36 = localDateTime31.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType38 = dateTimeFieldType37.getDurationType();
        org.joda.time.LocalDateTime.Property property39 = localDateTime31.property(dateTimeFieldType37);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime18.set(dateTimeFieldType37, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        org.joda.time.TimeOfDay timeOfDay5 = dateTime4.toTimeOfDay();
        int int6 = timeOfDay5.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(timeOfDay5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(536468184000L, periodType1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        int int6 = dateTimeZone4.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1899, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.Interval interval16 = yearMonthDay12.toInterval(dateTimeZone14);
        org.joda.time.MutableInterval mutableInterval17 = interval16.toMutableInterval();
        org.joda.time.Interval interval19 = interval16.withStartMillis((long) 32769);
        org.joda.time.Duration duration20 = interval19.toDuration();
        org.joda.time.Period period21 = interval19.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.mergePeriod((org.joda.time.ReadablePeriod) period21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.016" + "'", str15, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(mutableInterval17);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(period21);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 1899, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime9 = localDate5.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.Interval interval14 = yearMonthDay10.toInterval(dateTimeZone12);
        org.joda.time.MutableInterval mutableInterval15 = interval14.toMutableInterval();
        org.joda.time.Interval interval17 = interval14.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology18.getZone();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.monthOfYear();
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DurationField durationField22 = chronology18.millis();
        org.joda.time.DurationField durationField23 = chronology18.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) 46, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.016" + "'", str13, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        mutableDateTime3.addDays(1899);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = timeOfDay14.getFields();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = timeOfDay14.toDateTimeToday(dateTimeZone16);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period25 = period19.normalizedStandard(periodType24);
        org.joda.time.Period period26 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateTime17, periodType24);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateTime dateTime28 = dateTime17.withChronology(chronology27);
        mutableDateTime3.setTime((org.joda.time.ReadableInstant) dateTime28);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setDate((int) (byte) 0, 0, 21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT1M" + "'", str22, "PT1M");
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) '4', chronology10);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.secondOfMinute();
        int[] intArray14 = new int[] { 21 };
        int int15 = dateTimeField7.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay11, intArray14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay19 = timeOfDay11.withFieldAdded(durationFieldType17, 3172000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[21]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = dateTimeFormatter0.parseMutableDateTime("DateTimeField[weekyear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"DateTimeField[weekyear]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        calendar3.setMinimalDaysInFirstWeek((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar3.getActualMinimum((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455246722,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=6,MILLISECOND=738,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder2 = builder0.setCalendarType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeZone2.getOffset(12, (int) '4', (int) 'u', 45, 22, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.withPeriodAdded((org.joda.time.ReadablePeriod) period11, 17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay15 = yearMonthDay9.withMonthOfYear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.setWeekDefinition((int) (byte) 10, 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        int int9 = dateTime8.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime3.dayOfWeek();
        org.joda.time.MutableDateTime mutableDateTime9 = property7.add((int) ' ');
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 10, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime18 = property16.withMaximumValue();
        int[] intArray23 = new int[] { 52, 18, 50 };
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = dateTimeField10.set((org.joda.time.ReadablePartial) localDateTime18, 7, intArray23, "gregory", locale25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"gregory\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 18, 50]");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        long long11 = durationField10.getUnitMillis();
        long long12 = durationField10.getUnitMillis();
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 31556952000L + "'", long11 == 31556952000L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 31556952000L + "'", long12 == 31556952000L);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        java.time.Instant instant6 = date5.toInstant();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1899, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.Interval interval20 = yearMonthDay16.toInterval(dateTimeZone18);
        org.joda.time.MutableInterval mutableInterval21 = interval20.toMutableInterval();
        org.joda.time.Interval interval23 = interval20.withStartMillis((long) 32769);
        org.joda.time.Duration duration24 = interval23.toDuration();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str27 = dateTimeZone26.getID();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType30.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray32 = new org.joda.time.DurationFieldType[] { durationFieldType31 };
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.forFields(durationFieldTypeArray32);
        org.joda.time.Period period34 = new org.joda.time.Period((long) ' ', periodType33);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration24, (org.joda.time.ReadableInstant) dateTime28, periodType33);
        org.joda.time.PeriodType periodType36 = periodType33.withMinutesRemoved();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        int int40 = dateTimeZone38.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 1899, dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.getDefault();
        int int44 = dateTimeZone42.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime45 = localDate41.toDateTimeAtCurrentTime(dateTimeZone42);
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay(dateTimeZone42);
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str49 = dateTimeZone48.getID();
        org.joda.time.Interval interval50 = yearMonthDay46.toInterval(dateTimeZone48);
        org.joda.time.MutableInterval mutableInterval51 = interval50.toMutableInterval();
        org.joda.time.Interval interval53 = interval50.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology54 = interval53.getChronology();
        org.joda.time.DateTimeZone dateTimeZone55 = chronology54.getZone();
        org.joda.time.DateTimeField dateTimeField56 = chronology54.monthOfYear();
        org.joda.time.Period period58 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period60 = org.joda.time.Period.minutes(1);
        java.lang.String str61 = period60.toString();
        org.joda.time.Period period62 = period58.withFields((org.joda.time.ReadablePeriod) period60);
        org.joda.time.Period period64 = period62.plusMillis(100);
        org.joda.time.Period period65 = period62.negated();
        org.joda.time.Period period67 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period69 = org.joda.time.Period.minutes(1);
        java.lang.String str70 = period69.toString();
        org.joda.time.Period period71 = period67.withFields((org.joda.time.ReadablePeriod) period69);
        org.joda.time.Period period73 = period71.plusMillis(100);
        boolean boolean74 = period65.equals((java.lang.Object) period73);
        long long77 = chronology54.add((org.joda.time.ReadablePeriod) period65, 31556952000L, (int) '4');
        org.joda.time.DateTimeField dateTimeField78 = chronology54.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period79 = new org.joda.time.Period((java.lang.Object) instant6, periodType33, chronology54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.time.Instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.016" + "'", str19, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(mutableInterval21);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+00:00:00.016" + "'", str27, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(durationFieldTypeArray32);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "+00:00:00.016" + "'", str49, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(mutableInterval51);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PT1M" + "'", str61, "PT1M");
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "PT1M" + "'", str70, "PT1M");
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 31553832000L + "'", long77 == 31553832000L);
        org.junit.Assert.assertNotNull(dateTimeField78);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("Fri Mar 10 01:35:00 GMT+00:00 1899", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.DateMidnight dateMidnight13 = org.joda.time.DateMidnight.now(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType14.getDurationType();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight13.withField(dateTimeFieldType14, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property18 = yearMonthDay9.property(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(dateMidnight17);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str4 = dateTimeZone3.getID();
        org.joda.time.DateMidnight dateMidnight5 = org.joda.time.DateMidnight.now(dateTimeZone3);
        org.joda.time.ReadableInstant readableInstant6 = null;
        boolean boolean7 = dateMidnight5.isBefore(readableInstant6);
        int int8 = dateMidnight5.getYearOfCentury();
        org.joda.time.DateMidnight.Property property9 = dateMidnight5.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadableInstant) dateMidnight5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.016" + "'", str4, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        java.lang.String str5 = calendar3.getCalendarType();
        // The following exception was thrown during execution in test generation
        try {
            calendar3.roll(32, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455247912,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=7,MILLISECOND=928,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.List<java.util.Locale> localeList6 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime17 = timeOfDay15.toDateTimeToday(dateTimeZone16);
        mutableDateTime10.setZoneRetainFields(dateTimeZone16);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) localeList6, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.ArrayList");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeList6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.millis();
        org.joda.time.DateTimeField dateTimeField22 = chronology17.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = dateTimeField22.set((long) (-1), 46);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 10, chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMinuteOfHour(0);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 10, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withFields((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getDurationType();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withFieldAdded(durationFieldType22, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime26 = localTime0.withFieldAdded(durationFieldType22, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        date5.setTime((-1L));
        java.util.Date date14 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        int int15 = date14.getSeconds();
        boolean boolean16 = date5.after(date14);
        int int17 = date5.getMonth();
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.fromDateFields(date5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate18.withEra((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals(date14.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        java.lang.String[] strArray8 = new java.lang.String[] { "2022-02-21T00:52:52.000Z", "Korean (South Korea)", "1970", "hi!", "1970", "45", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000", "PT0S" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.util.Locale[] localeArray14 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.List<java.util.Locale> localeList17 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.stream.Stream<java.util.Locale> localeStream18 = localeList17.parallelStream();
        boolean boolean19 = strSet9.retainAll((java.util.Collection<java.util.Locale>) localeList17);
        boolean boolean20 = localeList17.isEmpty();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localeList17);
        org.junit.Assert.assertNotNull(localeStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        java.util.Date date9 = dateTime8.toDate();
        java.lang.String str10 = date9.toLocaleString();
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Feb 15 00:52:52 GMT+00:00 1022");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Feb 15, 1022 12:52:52 AM" + "'", str10, "Feb 15, 1022 12:52:52 AM");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        java.lang.String str11 = durationField10.toString();
        long long14 = durationField10.add((long) 1970, (int) (short) 10);
        java.util.Date date20 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.fromDateFields(date20);
        org.joda.time.LocalDate.Property property22 = localDate21.weekOfWeekyear();
        org.joda.time.LocalDate localDate24 = property22.setCopy(10);
        org.joda.time.DurationField durationField25 = property22.getRangeDurationField();
        int int26 = durationField10.compareTo(durationField25);
        org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearWeekDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = new org.joda.time.Period((java.lang.Object) durationField25, periodType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DurationField[weekyears]" + "'", str11, "DurationField[weekyears]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 315705601970L + "'", long14 == 315705601970L);
        org.junit.Assert.assertEquals(date20.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(periodType27);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) '4', chronology10);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.secondOfMinute();
        int[] intArray14 = new int[] { 21 };
        int int15 = dateTimeField7.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay11, intArray14);
        long long17 = dateTimeField7.roundCeiling(10L);
        long long19 = dateTimeField7.roundHalfCeiling(31795199984L);
        long long22 = dateTimeField7.add(31795199984L, (long) (byte) 0);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long) 10, chronology24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withMinuteOfHour(0);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((long) 10, chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime27.withFields((org.joda.time.ReadablePartial) localDateTime30);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime35.plusMillis(3);
        org.joda.time.LocalDateTime.Property property39 = localDateTime35.centuryOfEra();
        int int40 = localDateTime35.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime35.minusSeconds(17);
        int[] intArray44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray46 = dateTimeField7.add((org.joda.time.ReadablePartial) localDateTime42, (int) (short) -1, intArray44, 654);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[21]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 31795199984L + "'", long17 == 31795199984L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 31795199984L + "'", long19 == 31795199984L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 31795199984L + "'", long22 == 31795199984L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertNotNull(localDateTime42);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = property1.addCopy((long) 47);
        org.joda.time.LocalTime localTime5 = localTime3.minusSeconds(7);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.years();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(536468184000L, periodType1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        int int6 = dateTimeZone4.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1899, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.Interval interval16 = yearMonthDay12.toInterval(dateTimeZone14);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.Interval interval18 = interval16.toInterval();
        org.joda.time.Interval interval19 = interval16.toInterval();
        mutablePeriod2.add((org.joda.time.ReadableInterval) interval16);
        int int21 = mutablePeriod2.getMonths();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.016" + "'", str15, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        calendar3.setMinimalDaysInFirstWeek((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar3);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone10 = dateTimeZone9.toTimeZone();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone10);
        int int12 = calendar11.getWeekYear();
        java.lang.String str13 = calendar11.getCalendarType();
        int int14 = calendar3.compareTo(calendar11);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455249436,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=9,MILLISECOND=452,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455249436,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=9,MILLISECOND=452,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gregory" + "'", str13, "gregory");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.Interval interval15 = interval13.toInterval();
        org.joda.time.Interval interval16 = interval13.toInterval();
        org.joda.time.MutableInterval mutableInterval17 = interval13.toMutableInterval();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        java.lang.String str23 = dateTimeZone19.getName((long) (-1));
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(dateTimeZone19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) interval13, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Interval");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(mutableInterval17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.016" + "'", str20, "+00:00:00.016");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.016" + "'", str23, "+00:00:00.016");
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.parse("00");
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        boolean boolean10 = dateMidnight2.equals((java.lang.Object) 1899);
        int int11 = dateMidnight2.getDayOfWeek();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Period period13 = new org.joda.time.Period(readableInstant0, (org.joda.time.ReadableInstant) dateMidnight2, periodType12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 10, chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withMinuteOfHour(0);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 10, chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime18.withFields((org.joda.time.ReadablePartial) localDateTime21);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getDurationType();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.withFieldAdded(durationFieldType26, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = period13.withField(durationFieldType26, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate6.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay9.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay16 = property14.addWrapFieldToCopy(10);
        java.util.Locale locale21 = new java.util.Locale("DurationField[weekyears]", "10", "DurationField[weekyears]");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay22 = property14.setCopy("46", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(yearMonthDay16);
        org.junit.Assert.assertEquals(locale21.toString(), "durationfield[weekyears]_10_DurationField[weekyears]");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusMillis(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalDateTime.Property property17 = localDateTime12.property(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.minusSeconds(1899);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.TimeZone.setDefault(timeZone2);
        boolean boolean5 = timeZone2.observesDaylightTime();
        java.lang.String str6 = timeZone2.getDisplayName();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455250429,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=10,MILLISECOND=445,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GMT+00:00" + "'", str6, "GMT+00:00");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfEra(6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localDateTime14.getValue(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 50");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.minus(315705601970L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour(3172000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3172000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 16, dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval8 = new org.joda.time.Interval(536468184000L, (long) 654, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1899, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.Interval interval19 = yearMonthDay15.toInterval(dateTimeZone17);
        org.joda.time.MutableInterval mutableInterval20 = interval19.toMutableInterval();
        org.joda.time.Interval interval22 = interval19.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime3.toDateTime(chronology23);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = chronology23.getDateTimeMillis((long) 2022, 1, (int) (byte) 1, 17, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54 + "'", int5 == 54);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.016" + "'", str18, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(mutableInterval20);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalTime localTime11 = localTime0.minusHours((-1));
        int int12 = localTime0.getHourOfDay();
        int int13 = localTime0.getMillisOfDay();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        java.lang.String str10 = dateTime8.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = dateTime8.toDateTime(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime14.withDate(17, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-21T00:52:52.000Z" + "'", str10, "2022-02-21T00:52:52.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property7.setCopy("PT0S");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0S\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        int int8 = dateTimeField7.getMinimumValue();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray16 = new int[] { 'u', 6, (byte) 10, 10, 53, 1899 };
        int int17 = dateTimeField7.getMinimumValue(readablePartial9, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField7.add((long) 6, 315705601970L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 315705601970");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-292275054) + "'", int8 == (-292275054));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[117, 6, 10, 10, 53, 1899]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-292275054) + "'", int17 == (-292275054));
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        java.util.Locale locale12 = java.util.Locale.CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDate4.toString("weekyears", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh");
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        int int6 = date5.getSeconds();
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 1899, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.Interval interval21 = yearMonthDay17.toInterval(dateTimeZone19);
        org.joda.time.Interval interval22 = yearMonthDay17.toInterval();
        org.joda.time.Period period24 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period26 = org.joda.time.Period.minutes(1);
        java.lang.String str27 = period26.toString();
        org.joda.time.Period period28 = period24.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay17.plus((org.joda.time.ReadablePeriod) period24);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 1899, dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        int int37 = dateTimeZone35.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime38 = localDate34.toDateTimeAtCurrentTime(dateTimeZone35);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str42 = dateTimeZone41.getID();
        org.joda.time.Interval interval43 = yearMonthDay39.toInterval(dateTimeZone41);
        org.joda.time.MutableInterval mutableInterval44 = interval43.toMutableInterval();
        org.joda.time.Interval interval46 = interval43.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.DateTimeZone dateTimeZone48 = chronology47.getZone();
        org.joda.time.DateTimeField dateTimeField49 = chronology47.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay50 = yearMonthDay29.withChronologyRetainFields(chronology47);
        org.joda.time.DateTimeField dateTimeField51 = chronology47.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period52 = new org.joda.time.Period((java.lang.Object) date5, chronology47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.016" + "'", str20, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT1M" + "'", str27, "PT1M");
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.016" + "'", str42, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(mutableInterval44);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(yearMonthDay50);
        org.junit.Assert.assertNotNull(dateTimeField51);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate6.withDayOfMonth(535);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 535 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        int int10 = localDate4.get(dateTimeFieldType9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 10, chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMinuteOfHour(0);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long) 10, chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfDay();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.plusMillis(3);
        org.joda.time.LocalDateTime.Property property27 = localDateTime23.centuryOfEra();
        int int28 = localDateTime23.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType30 = dateTimeFieldType29.getDurationType();
        org.joda.time.LocalDateTime.Property property31 = localDateTime23.property(dateTimeFieldType29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property32 = localDate4.property(dateTimeFieldType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = dateTimeFormatter0.parseLocalTime("PT1645487967.215S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PT1645487967.215S\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        calendar3.set(0, 52, (int) '#', 10, 0, 9);
        // The following exception was thrown during execution in test generation
        try {
            calendar3.setWeekDate((int) (short) -1, 17, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 58");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=52,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=35,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=10,MINUTE=0,SECOND=9,MILLISECOND=442,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy("46");
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) localDate15, 1, locale17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 1899, dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean30 = localDate24.isSupported(dateTimeFieldType29);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = localDate15.get(dateTimeFieldType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Korean (South Korea)" + "'", str18, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1899, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval12 = new org.joda.time.Interval(315705601970L, (long) 2022, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        boolean boolean2 = dateTimeFormatter1.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter1.withDefaultYear(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.parse("UTC", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        // The following exception was thrown during execution in test generation
        try {
            calendar3.setWeekDate(4, 58, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455253170,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=13,MILLISECOND=186,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 1899, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime17 = localDate13.toDateTimeAtCurrentTime(dateTimeZone14);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str21 = dateTimeZone20.getID();
        org.joda.time.Interval interval22 = yearMonthDay18.toInterval(dateTimeZone20);
        org.joda.time.MutableInterval mutableInterval23 = interval22.toMutableInterval();
        org.joda.time.Interval interval25 = interval22.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology26.getZone();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.monthOfYear();
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        java.lang.String str33 = period32.toString();
        org.joda.time.Period period34 = period30.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period36 = period34.plusMillis(100);
        org.joda.time.Period period37 = period34.negated();
        org.joda.time.Period period39 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period41 = org.joda.time.Period.minutes(1);
        java.lang.String str42 = period41.toString();
        org.joda.time.Period period43 = period39.withFields((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Period period45 = period43.plusMillis(100);
        boolean boolean46 = period37.equals((java.lang.Object) period45);
        long long49 = chronology26.add((org.joda.time.ReadablePeriod) period37, 31556952000L, (int) '4');
        org.joda.time.DateTimeField dateTimeField50 = chronology26.dayOfYear();
        org.joda.time.Period period51 = new org.joda.time.Period((long) 2, (long) 4, periodType8, chronology26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((-292275054), 10, 895, (int) ' ', (int) 'x', 2, chronology26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00:00.016" + "'", str21, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(mutableInterval23);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT1M" + "'", str33, "PT1M");
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PT1M" + "'", str42, "PT1M");
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 31553832000L + "'", long49 == 31553832000L);
        org.junit.Assert.assertNotNull(dateTimeField50);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 16, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property8.setCopy("00:00:00.000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"00:00:00.000\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 1899, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.Interval interval17 = yearMonthDay13.toInterval(dateTimeZone15);
        org.joda.time.Interval interval18 = yearMonthDay13.toInterval();
        org.joda.time.Chronology chronology19 = yearMonthDay13.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((int) 'a', 16, 0, 0, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.016" + "'", str16, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.clockhourOfDay();
        org.joda.time.Chronology chronology24 = chronology22.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((int) ' ', (int) '4', (int) '4', 1970, 19, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.016" + "'", str17, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period7 = period3.minusSeconds((int) (short) 100);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        java.lang.String str12 = period11.toString();
        org.joda.time.Period period13 = period9.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period15 = period9.normalizedStandard(periodType14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period7.withPeriodType(periodType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT1M" + "'", str12, "PT1M");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone3 = dateTimeZone2.toTimeZone();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone3);
        java.util.Calendar.Builder builder5 = builder0.setTimeZone(timeZone3);
        java.util.Date date11 = new java.util.Date(12, 18, (int) '#', (int) '4', 11);
        boolean boolean12 = timeZone3.inDaylightTime(date11);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455253665,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=13,MILLISECOND=681,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(date11.toString(), "Wed Aug 06 04:11:00 GMT+00:00 1913");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.Interval interval24 = yearMonthDay20.toInterval(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone22);
        org.joda.time.DateTime dateTime26 = localDate7.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 10, dateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = dateTime27.withEra((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date6.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.016" + "'", str23, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1899, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.Interval interval20 = yearMonthDay16.toInterval(dateTimeZone18);
        org.joda.time.Interval interval21 = yearMonthDay16.toInterval();
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(1);
        java.lang.String str26 = period25.toString();
        org.joda.time.Period period27 = period23.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.YearMonthDay yearMonthDay28 = yearMonthDay16.plus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        int int32 = dateTimeZone30.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((long) 1899, dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.getDefault();
        int int36 = dateTimeZone34.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime37 = localDate33.toDateTimeAtCurrentTime(dateTimeZone34);
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str41 = dateTimeZone40.getID();
        org.joda.time.Interval interval42 = yearMonthDay38.toInterval(dateTimeZone40);
        org.joda.time.MutableInterval mutableInterval43 = interval42.toMutableInterval();
        org.joda.time.Interval interval45 = interval42.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology46 = interval45.getChronology();
        org.joda.time.DateTimeZone dateTimeZone47 = chronology46.getZone();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay49 = yearMonthDay28.withChronologyRetainFields(chronology46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime(0, 32772, 0, 15, 16, 45, 46, chronology46);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.016" + "'", str19, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT1M" + "'", str26, "PT1M");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00:00.016" + "'", str41, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(mutableInterval43);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(yearMonthDay49);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        calendar3.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = calendar3.isSet(292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 292278993");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withSecondOfMinute((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        calendar3.setTimeInMillis(31556952000L);
        // The following exception was thrown during execution in test generation
        try {
            calendar3.add(2022, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=31556952000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1971,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=49,SECOND=12,MILLISECOND=16,ZONE_OFFSET=16,DST_OFFSET=0]");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusMillis(3);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.centuryOfEra();
        int int17 = localDateTime12.getMillisOfDay();
        org.joda.time.LocalDateTime.Property property18 = localDateTime12.dayOfWeek();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(0, (int) '4', chronology21);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay22.plusMinutes(1899);
        org.joda.time.TimeOfDay.Property property25 = timeOfDay22.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay22.plusSeconds(11);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = property18.compareTo((org.joda.time.ReadablePartial) timeOfDay27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(timeOfDay27);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod();
        mutablePeriod11.addWeeks((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, (int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDateTime4.getValue(292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 292278993");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 10, chronology1);
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod2.setPeriod((long) 0, chronology4);
        mutablePeriod2.addSeconds((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.setValue(52, 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(292278993, 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(5, (int) (byte) 100, 1970, 52);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray10 = timeOfDay9.getFields();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = timeOfDay9.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTime.Property property13 = dateTime12.monthOfYear();
        org.joda.time.DateTime dateTime15 = dateTime12.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = dateTime15.toDateTime(chronology16);
        int int18 = dateTime15.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getDurationType();
        org.joda.time.DateTime dateTime22 = dateTime15.withFieldAdded(durationFieldType20, (int) (byte) 1);
        int int23 = dateTime15.getMillisOfDay();
        org.joda.time.Duration duration24 = mutablePeriod4.toDurationTo((org.joda.time.ReadableInstant) dateTime15);
        int int25 = dateTime15.getSecondOfMinute();
        org.junit.Assert.assertNotNull(dateTimeFieldArray10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3172001 + "'", int23 == 3172001);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy("45");
        org.joda.time.LocalDate localDate11 = localDate9.minusDays((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate9.withYearOfCentury(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.MutableInterval mutableInterval19 = interval18.toMutableInterval();
        org.joda.time.Interval interval21 = interval18.withStartMillis((long) 32769);
        org.joda.time.Duration duration22 = interval21.toDuration();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str25 = dateTimeZone24.getID();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType28.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray30 = new org.joda.time.DurationFieldType[] { durationFieldType29 };
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.forFields(durationFieldTypeArray30);
        org.joda.time.Period period32 = new org.joda.time.Period((long) ' ', periodType31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateTime26, periodType31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.DateMidnight dateMidnight37 = org.joda.time.DateMidnight.now(dateTimeZone35);
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration22, (org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        int int42 = dateTimeZone40.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 1899, dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        int int46 = dateTimeZone44.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime47 = localDate43.toDateTimeAtCurrentTime(dateTimeZone44);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str51 = dateTimeZone50.getID();
        org.joda.time.Interval interval52 = yearMonthDay48.toInterval(dateTimeZone50);
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.Interval interval54 = interval38.withChronology(chronology53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((int) (byte) 1, 16, 53, 12, 1, chronology53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 16 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.016" + "'", str17, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(mutableInterval19);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(duration22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00:00.016" + "'", str25, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(durationFieldTypeArray30);
        org.junit.Assert.assertNotNull(periodType31);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.016" + "'", str36, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.016" + "'", str51, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(interval54);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        java.lang.String str8 = period7.toString();
        org.joda.time.Period period9 = period5.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) (short) 100);
        mutableDateTime3.add((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period14 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        java.lang.String str17 = period16.toString();
        org.joda.time.Period period18 = period14.withFields((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period20 = period18.plusMillis(100);
        org.joda.time.Period period21 = period18.negated();
        org.joda.time.Period period23 = period21.withMillis(1899);
        org.joda.time.Period period25 = period23.plusMillis(0);
        mutableDateTime3.add((org.joda.time.ReadablePeriod) period23);
        org.joda.time.DateTime dateTime27 = mutableDateTime3.toDateTime();
        mutableDateTime3.setWeekyear(1970);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime3.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime32 = property30.set("P0D");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"P0D\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT1M" + "'", str8, "PT1M");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT1M" + "'", str17, "PT1M");
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        boolean boolean12 = mutableDateTime3.isEqualNow();
        org.joda.time.DateTimeField dateTimeField13 = mutableDateTime3.getRoundingField();
        mutableDateTime3.addSeconds(0);
        int int16 = mutableDateTime3.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        int int10 = localDate4.get(dateTimeFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate4.withDayOfWeek(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 16, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfCentury(0);
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = timeOfDay12.toDateTimeToday(dateTimeZone13);
        org.joda.time.TimeOfDay.Property property15 = timeOfDay12.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay16 = property15.withMaximumValue();
        int int17 = timeOfDay16.getHourOfDay();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay16.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = localDateTime7.isAfter((org.joda.time.ReadablePartial) timeOfDay16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.Interval interval15 = interval13.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval17 = interval15.withEndMillis(31795199984L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(interval15);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1899, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 32772, (long) (byte) 1, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        boolean boolean12 = dateTime7.isAfter((long) '#');
        java.lang.String str13 = dateTime7.toString();
        org.joda.time.DateTime dateTime15 = dateTime7.minusSeconds(292278993);
        org.joda.time.DateTime dateTime17 = dateTime7.withMillis((long) 16);
        int int18 = dateTime17.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-21T00:52:52.000Z" + "'", str13, "2022-02-21T00:52:52.000Z");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Duration duration17 = interval16.toDuration();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray25 = new org.joda.time.DurationFieldType[] { durationFieldType24 };
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.forFields(durationFieldTypeArray25);
        org.joda.time.Period period27 = new org.joda.time.Period((long) ' ', periodType26);
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration17, (org.joda.time.ReadableInstant) dateTime21, periodType26);
        boolean boolean29 = dateTime21.isEqualNow();
        org.joda.time.DateTime.Property property30 = dateTime21.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 1899, dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.getDefault();
        int int38 = dateTimeZone36.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime39 = localDate35.toDateTimeAtCurrentTime(dateTimeZone36);
        org.joda.time.YearMonthDay yearMonthDay40 = new org.joda.time.YearMonthDay(dateTimeZone36);
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str43 = dateTimeZone42.getID();
        org.joda.time.Interval interval44 = yearMonthDay40.toInterval(dateTimeZone42);
        org.joda.time.MutableInterval mutableInterval45 = interval44.toMutableInterval();
        org.joda.time.Interval interval47 = interval44.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology48 = interval47.getChronology();
        org.joda.time.DateTimeZone dateTimeZone49 = chronology48.getZone();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.monthOfYear();
        org.joda.time.Period period52 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period54 = org.joda.time.Period.minutes(1);
        java.lang.String str55 = period54.toString();
        org.joda.time.Period period56 = period52.withFields((org.joda.time.ReadablePeriod) period54);
        org.joda.time.Period period58 = period56.plusMillis(100);
        org.joda.time.Period period59 = period56.negated();
        org.joda.time.Period period61 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period63 = org.joda.time.Period.minutes(1);
        java.lang.String str64 = period63.toString();
        org.joda.time.Period period65 = period61.withFields((org.joda.time.ReadablePeriod) period63);
        org.joda.time.Period period67 = period65.plusMillis(100);
        boolean boolean68 = period59.equals((java.lang.Object) period67);
        long long71 = chronology48.add((org.joda.time.ReadablePeriod) period59, 31556952000L, (int) '4');
        org.joda.time.DateTimeField dateTimeField72 = chronology48.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((java.lang.Object) property30, chronology48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.016" + "'", str20, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(durationFieldTypeArray25);
        org.junit.Assert.assertNotNull(periodType26);
// flaky:         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00:00.016" + "'", str43, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(mutableInterval45);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PT1M" + "'", str55, "PT1M");
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "PT1M" + "'", str64, "PT1M");
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 31553832000L + "'", long71 == 31553832000L);
        org.junit.Assert.assertNotNull(dateTimeField72);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("PT1645487967.215S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=pt1645487967.215s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.TimeZone.setDefault(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone2.getOffset(32, 10, 59, 32772, 32772, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusMillis(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalDateTime.Property property17 = localDateTime12.property(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = property17.setCopy(3172000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3172000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 1899, dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((java.lang.Object) property11, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy("45");
        org.joda.time.LocalDate localDate11 = property7.addToCopy((int) '4');
        org.joda.time.tz.NameProvider nameProvider13 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Date date19 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.fromDateFields(date19);
        org.joda.time.LocalDate.Property property21 = localDate20.weekOfWeekyear();
        org.joda.time.LocalDate localDate23 = property21.setCopy(10);
        java.util.Locale locale24 = java.util.Locale.KOREAN;
        java.util.Locale locale25 = java.util.Locale.KOREAN;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = property21.getAsText(locale24);
        java.lang.String str30 = nameProvider13.getName(locale24, "gregory", "2022-02-21T03:54:01.425Z");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate31 = property7.setCopy("Fri Mar 10 01:35:00 GMT+00:00 1899", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Fri Mar 10 01:35:00 GMT+00:00 1899\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(nameProvider13);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10" + "'", str27, "10");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.Interval interval15 = interval13.toInterval();
        org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType17 = periodType16.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 1899, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime26 = localDate22.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str30 = dateTimeZone29.getID();
        org.joda.time.Interval interval31 = yearMonthDay27.toInterval(dateTimeZone29);
        org.joda.time.MutableInterval mutableInterval32 = interval31.toMutableInterval();
        org.joda.time.Interval interval34 = interval31.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.DateTimeZone dateTimeZone36 = chronology35.getZone();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.monthOfYear();
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DurationField durationField39 = chronology35.millis();
        org.joda.time.DateTimeField dateTimeField40 = chronology35.dayOfMonth();
        org.joda.time.Period period41 = new org.joda.time.Period((java.lang.Object) interval13, periodType17, chronology35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period43 = period41.withWeeks(11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.016" + "'", str30, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(mutableInterval32);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.util.Date date6 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromDateFields(date6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.Interval interval24 = yearMonthDay20.toInterval(dateTimeZone22);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (byte) -1, dateTimeZone22);
        org.joda.time.DateTime dateTime26 = localDate7.toDateTimeAtCurrentTime(dateTimeZone22);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 10, dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((java.lang.Object) dateTimeZone22, dateTimeZone28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date6.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.016" + "'", str23, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.io.IOException iOException1 = new java.io.IOException("45");
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException: 45" + "'", str2, "java.io.IOException: 45");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withOffsetParsed();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer2, (long) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        java.lang.String str11 = durationField10.toString();
        long long14 = durationField10.add((long) 1970, (int) (short) 10);
        java.util.Date date20 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.fromDateFields(date20);
        org.joda.time.LocalDate.Property property22 = localDate21.weekOfWeekyear();
        org.joda.time.LocalDate localDate24 = property22.setCopy(10);
        org.joda.time.DurationField durationField25 = property22.getRangeDurationField();
        int int26 = durationField10.compareTo(durationField25);
        long long29 = durationField10.subtract((long) 8, (long) 7);
        boolean boolean30 = durationField10.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long33 = durationField10.add((long) 2022, (-220751999992L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -220751999992");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DurationField[weekyears]" + "'", str11, "DurationField[weekyears]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 315705601970L + "'", long14 == 315705601970L);
        org.junit.Assert.assertEquals(date20.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-220751999992L) + "'", long29 == (-220751999992L));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy("46");
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.lang.String str18 = locale17.getDisplayName();
        java.lang.String str19 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) localDate15, 1, locale17);
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = dateTimeField10.getMaximumValue(readablePartial20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Korean (South Korea)" + "'", str18, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("T00:00:00.000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"T00:00:00.000\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("46", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=46");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(21);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        int int0 = org.joda.time.YearMonthDay.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.parse("UTC", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.util.Date date1 = new java.util.Date(0L);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromDateFields(date1);
        java.lang.String str3 = date1.toString();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Thu Jan 01 00:00:00 GMT+00:00 1970" + "'", str3, "Thu Jan 01 00:00:00 GMT+00:00 1970");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime10.getFieldType(19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 19");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.plusMinutes(1899);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.lang.String str7 = timeOfDay3.toString(dateTimeFormatter6);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        java.lang.String str12 = period11.toString();
        org.joda.time.Period period13 = period9.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay3.minus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.Period period22 = period20.plusMillis(100);
        org.joda.time.Period period23 = period20.negated();
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay3.plus((org.joda.time.ReadablePeriod) period23);
        org.joda.time.TimeOfDay timeOfDay26 = timeOfDay3.plusSeconds((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = timeOfDay26.get(dateTimeFieldType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdayOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00" + "'", str7, "00");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT1M" + "'", str12, "PT1M");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT1M" + "'", str19, "PT1M");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusMillis(3);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.centuryOfEra();
        int int17 = localDateTime12.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        org.joda.time.LocalDateTime.Property property20 = localDateTime12.property(dateTimeFieldType18);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray21 = localDateTime12.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = localDateTime12.withDate(12, 18, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 18 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray21);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        java.lang.String str12 = period11.toString();
        org.joda.time.Period period13 = period9.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period15 = period9.normalizedStandard(periodType14);
        org.joda.time.PeriodType periodType16 = periodType14.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = new org.joda.time.Period(54, 26, 8, 59, 18, 1899, (int) ' ', 1, periodType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT1M" + "'", str12, "PT1M");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("GMT+00:00", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GMT+00:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear(1970);
        java.util.Date date17 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        int int18 = date17.getSeconds();
        org.joda.time.TimeOfDay timeOfDay19 = org.joda.time.TimeOfDay.fromDateFields(date17);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromDateFields(date17);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(1);
        java.lang.String str26 = period25.toString();
        org.joda.time.Period period27 = period23.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period27.plusMillis(100);
        org.joda.time.Period period30 = period27.negated();
        org.joda.time.Period period32 = period30.withMillis(1899);
        org.joda.time.Minutes minutes33 = period30.toStandardMinutes();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.Period period35 = period30.minus(readablePeriod34);
        boolean boolean36 = property21.equals((java.lang.Object) readablePeriod34);
        org.joda.time.LocalTime localTime37 = property21.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            int int38 = localDate9.compareTo((org.joda.time.ReadablePartial) localTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT1M" + "'", str26, "PT1M");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(minutes33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(localTime37);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((java.lang.Object) locale0, periodType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.Period period1 = org.joda.time.Period.months(17);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        java.util.Date date12 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.fromDateFields(date12);
        org.joda.time.LocalDate.Property property14 = localDate13.weekOfWeekyear();
        org.joda.time.LocalDate localDate16 = property14.setCopy(10);
        org.joda.time.LocalDate localDate18 = localDate16.withWeekyear(1970);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDate localDate20 = localDate18.minus(readablePeriod19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) timeOfDay4, (org.joda.time.ReadablePartial) localDate20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(100, 6, 1900);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1900 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1899, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Interval interval15 = yearMonthDay11.toInterval(dateTimeZone13);
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        long long20 = chronology16.add((long) 18, (long) 6, 58);
        org.joda.time.MutableDateTime mutableDateTime21 = org.joda.time.MutableDateTime.now(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(9, (int) 'u', chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.016" + "'", str14, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 366L + "'", long20 == 366L);
        org.junit.Assert.assertNotNull(mutableDateTime21);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("\uae08", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"???\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period7 = period1.normalizedStandard(periodType6);
        org.joda.time.PeriodType periodType8 = periodType6.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType10 = periodType6.getFieldType(292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 292278993");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime9 = property8.withMinimumValue();
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.util.Locale locale12 = java.util.Locale.KOREAN;
        java.lang.String str13 = locale11.getDisplayVariant(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTime9.toString("weekyears", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        java.lang.String str10 = dateTime8.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = dateTime8.toDateTime(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime21 = timeOfDay19.toDateTimeToday(dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.minus((long) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property25 = dateTime21.property(dateTimeFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTime8.withField(dateTimeFieldType24, 50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-21T00:52:52.000Z" + "'", str10, "2022-02-21T00:52:52.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=etc/utc");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfEra(6);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusHours((int) (byte) 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((int) (short) -1, (int) (short) 1, 16, chronology3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfDay();
        boolean boolean6 = localDate4.isSupported(dateTimeFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate4.withDayOfWeek(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(7, (int) ' ', 535, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 535 for secondOfMinute must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("YearDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.Locale locale0 = java.util.Locale.PRC;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        int int4 = dateTimeZone2.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 1899, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime9 = localDate5.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.Interval interval14 = yearMonthDay10.toInterval(dateTimeZone12);
        org.joda.time.MutableInterval mutableInterval15 = interval14.toMutableInterval();
        org.joda.time.Interval interval17 = interval14.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DateTimeZone dateTimeZone19 = chronology18.getZone();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.hourOfDay();
        boolean boolean21 = locale0.equals((java.lang.Object) chronology18);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.016" + "'", str13, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(mutableInterval15);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.time();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.parse("T00:00:00.000", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"T00:00:00.000\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear(1970);
        org.joda.time.Period period15 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        java.lang.String str18 = period17.toString();
        org.joda.time.Period period19 = period15.withFields((org.joda.time.ReadablePeriod) period17);
        org.joda.time.Period period21 = period19.plusMillis(100);
        org.joda.time.Period period22 = period19.negated();
        int int23 = period22.getMillis();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 1899, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime32 = localDate28.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.Interval interval37 = yearMonthDay33.toInterval(dateTimeZone35);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        org.joda.time.Interval interval40 = interval37.withStartMillis((long) 32769);
        org.joda.time.Duration duration41 = interval40.toDuration();
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str44 = dateTimeZone43.getID();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(dateTimeZone43);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType48 = dateTimeFieldType47.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray49 = new org.joda.time.DurationFieldType[] { durationFieldType48 };
        org.joda.time.PeriodType periodType50 = org.joda.time.PeriodType.forFields(durationFieldTypeArray49);
        org.joda.time.Period period51 = new org.joda.time.Period((long) ' ', periodType50);
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration41, (org.joda.time.ReadableInstant) dateTime45, periodType50);
        org.joda.time.Period period53 = period22.normalizedStandard(periodType50);
        org.joda.time.Period period54 = new org.joda.time.Period((long) 5, (-259200016L), periodType50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate56 = localDate11.withPeriodAdded((org.joda.time.ReadablePeriod) period54, 292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows an int: -4320 * 292278993");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT1M" + "'", str18, "PT1M");
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.016" + "'", str36, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(duration41);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "+00:00:00.016" + "'", str44, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(durationFieldType48);
        org.junit.Assert.assertNotNull(durationFieldTypeArray49);
        org.junit.Assert.assertNotNull(periodType50);
        org.junit.Assert.assertNotNull(period53);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period7 = period5.plusMillis(100);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.months();
        int int9 = period7.get(durationFieldType8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) durationFieldType8, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 1899, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.Interval interval23 = yearMonthDay19.toInterval(dateTimeZone21);
        org.joda.time.MutableInterval mutableInterval24 = interval23.toMutableInterval();
        org.joda.time.Interval interval26 = interval23.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.DateTimeZone dateTimeZone28 = chronology27.getZone();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.monthOfYear();
        org.joda.time.Period period31 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period33 = org.joda.time.Period.minutes(1);
        java.lang.String str34 = period33.toString();
        org.joda.time.Period period35 = period31.withFields((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period37 = period35.plusMillis(100);
        org.joda.time.Period period38 = period35.negated();
        org.joda.time.Period period40 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period42 = org.joda.time.Period.minutes(1);
        java.lang.String str43 = period42.toString();
        org.joda.time.Period period44 = period40.withFields((org.joda.time.ReadablePeriod) period42);
        org.joda.time.Period period46 = period44.plusMillis(100);
        boolean boolean47 = period38.equals((java.lang.Object) period46);
        long long50 = chronology27.add((org.joda.time.ReadablePeriod) period38, 31556952000L, (int) '4');
        org.joda.time.DateTimeField dateTimeField51 = chronology27.dayOfYear();
        org.joda.time.Period period52 = new org.joda.time.Period((long) 2, (long) 4, periodType9, chronology27);
        java.lang.String str53 = chronology27.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(999, 3172000, 6, 292278993, 45, 654, 1, chronology27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.016" + "'", str22, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(mutableInterval24);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PT1M" + "'", str34, "PT1M");
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertNotNull(period42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "PT1M" + "'", str43, "PT1M");
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 31553832000L + "'", long50 == 31553832000L);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ISOChronology[+00:00:00.016]" + "'", str53, "ISOChronology[+00:00:00.016]");
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
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
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1899, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str34 = dateTimeZone33.getID();
        org.joda.time.Interval interval35 = yearMonthDay31.toInterval(dateTimeZone33);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.Interval interval38 = interval35.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay21.withChronologyRetainFields(chronology39);
        int int43 = yearMonthDay21.size();
        int int44 = yearMonthDay21.getYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT1M" + "'", str19, "PT1M");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.016" + "'", str34, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(mutableInterval36);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2022 + "'", int44 == 2022);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusDays(8);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfEra(18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withYearOfCentury((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        java.util.Locale locale14 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = timeZone2.getDisplayName(true, (int) (byte) 100, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455262116,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=22,MILLISECOND=132,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese (Taiwan)" + "'", str10, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455262116,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=22,MILLISECOND=132,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        calendar3.setMinimalDaysInFirstWeek((int) (short) 1);
        java.lang.Object obj7 = calendar3.clone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455262142,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=22,MILLISECOND=158,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "java.util.GregorianCalendar[time=1645455262142,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=22,MILLISECOND=158,ZONE_OFFSET=16,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "java.util.GregorianCalendar[time=1645455262142,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=22,MILLISECOND=158,ZONE_OFFSET=16,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "java.util.GregorianCalendar[time=1645455262142,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=22,MILLISECOND=158,ZONE_OFFSET=16,DST_OFFSET=0]");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray6 = timeOfDay5.getFields();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = timeOfDay5.toDateTimeToday(dateTimeZone7);
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period16 = period10.normalizedStandard(periodType15);
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateTime8, periodType15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime8.withChronology(chronology18);
        org.joda.time.DateTime dateTime21 = dateTime19.minus((long) (byte) 100);
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        java.util.Locale locale25 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str26 = locale23.getDisplayVariant(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dateTime21.toString("2022-02-21T14:54:17.223Z", locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT1M" + "'", str13, "PT1M");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekOfWeekyear((int) ' ');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (short) -1);
        int int9 = localDateTime8.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 16, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.dayOfWeek();
        org.joda.time.Chronology chronology19 = localDateTime15.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) localDateTime8, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        int int4 = calendar3.getWeekYear();
        calendar3.setMinimalDaysInFirstWeek((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar3.getGreatestMinimum(59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 59");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455262730,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=22,MILLISECOND=746,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        boolean boolean12 = mutableDateTime3.isEqualNow();
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray18 = timeOfDay17.getFields();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTime.Property property21 = dateTime20.monthOfYear();
        boolean boolean22 = mutableDateTime3.isBefore((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime3.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime24 = property23.getMutableDateTime();
        java.util.Locale.LanguageRange[] languageRangeArray26 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList27 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList27, languageRangeArray26);
        java.util.Locale[] localeArray29 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList30 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList30, localeArray29);
        java.util.List<java.util.Locale> localeList32 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList27, (java.util.Collection<java.util.Locale>) localeList30);
        boolean boolean33 = localeList32.isEmpty();
        localeList32.clear();
        java.util.stream.Stream<java.util.Locale> localeStream35 = localeList32.parallelStream();
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.lang.String str37 = locale36.getDisplayName();
        java.lang.String str38 = locale36.getScript();
        boolean boolean39 = localeList32.add(locale36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime40 = property23.set("PT0S", locale36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0S\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldArray18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(languageRangeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(localeStream35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Korean (South Korea)" + "'", str37, "Korean (South Korea)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.withSecondOfMinute(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(59);
        java.lang.Appendable appendable3 = null;
        java.util.Date date9 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromDateFields(date9);
        org.joda.time.LocalDate.Property property11 = localDate10.weekOfWeekyear();
        org.joda.time.LocalDate localDate13 = property11.setCopy("46");
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, (org.joda.time.ReadablePartial) localDate13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("Thu Jan 01 00:00:00 GMT+00:00 1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=thujan0100:00:00gmt+00:001970");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1899, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str34 = dateTimeZone33.getID();
        org.joda.time.Interval interval35 = yearMonthDay31.toInterval(dateTimeZone33);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.Interval interval38 = interval35.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay21.withChronologyRetainFields(chronology39);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now(chronology39);
        org.joda.time.LocalDate.Property property44 = localDate43.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate46 = localDate43.withDayOfWeek((-1901));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1901 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT1M" + "'", str19, "PT1M");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.016" + "'", str34, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(mutableInterval36);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(property44);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy("46");
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtMidnight();
        int int11 = localDate9.getWeekyear();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 10, chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMinuteOfHour(0);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) 10, chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withFields((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withField(dateTimeFieldType23, 1899);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = localDate9.withField(dateTimeFieldType23, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1899 + "'", int11 == 1899);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period7 = period5.plusMillis(100);
        org.joda.time.Period period8 = period5.negated();
        int int9 = period5.getDays();
        org.joda.time.Period period11 = period5.minusHours((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = period11.getFieldType(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(17, (int) (byte) 100, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(4, (int) ' ', (int) '#');
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.minusSeconds(3172001);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay7 = timeOfDay3.withHourOfDay((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1899, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Interval interval15 = yearMonthDay11.toInterval(dateTimeZone13);
        org.joda.time.Chronology chronology16 = interval15.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval18 = new org.joda.time.Interval(47L, (long) (-1901), chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.016" + "'", str14, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        int int10 = dateTime9.getMinuteOfDay();
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Chronology chronology14 = interval13.getChronology();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) 10, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMinuteOfHour(0);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 10, chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.withFields((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfDay();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.plusMillis(3);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withMillisOfDay((int) (byte) 1);
        org.joda.time.Chronology chronology33 = localDateTime30.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight((java.lang.Object) chronology14, chronology33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.plusMinutes(1899);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.lang.String str7 = timeOfDay3.toString(dateTimeFormatter6);
        org.joda.time.Period period9 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        java.lang.String str12 = period11.toString();
        org.joda.time.Period period13 = period9.withFields((org.joda.time.ReadablePeriod) period11);
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay3.minus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType16 = periodType15.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period17 = new org.joda.time.Period((java.lang.Object) timeOfDay14, periodType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.TimeOfDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00" + "'", str7, "00");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PT1M" + "'", str12, "PT1M");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Chronology chronology15 = yearMonthDay9.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfHalfday();
        long long19 = dateTimeField16.addWrapField((long) 59, 53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period((java.lang.Object) 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 18000059L + "'", long19 == 18000059L);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.dateOptionalTimeParser();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.parse("58", dateTimeFormatter2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.parse("minuteOfHour", dateTimeFormatter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minuteOfHour\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateOptionalTimeParser();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("58", dateTimeFormatter1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTimeFormatter1.parseDateTime("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"????????T000000\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        int int6 = date5.getSeconds();
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.fromDateFields(date5);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromDateFields(date5);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Period period11 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period13 = org.joda.time.Period.minutes(1);
        java.lang.String str14 = period13.toString();
        org.joda.time.Period period15 = period11.withFields((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Period period17 = period15.plusMillis(100);
        org.joda.time.Period period18 = period15.negated();
        org.joda.time.Period period20 = period18.withMillis(1899);
        org.joda.time.Minutes minutes21 = period18.toStandardMinutes();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.Period period23 = period18.minus(readablePeriod22);
        boolean boolean24 = property9.equals((java.lang.Object) readablePeriod22);
        org.joda.time.LocalTime localTime25 = property9.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = property9.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PT1M" + "'", str14, "PT1M");
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
        org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
        int int2 = dateTimeParser1.estimateParsedLength();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeParser1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(100, 53, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        boolean boolean15 = dateTime10.equals((java.lang.Object) dateMidnight14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTime10.toString("Korean (South Korea)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.016" + "'", str13, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinute();
        org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer2, (long) (-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeParser1);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        java.util.Date date9 = localDate6.toDate();
        java.lang.String str10 = date9.toGMTString();
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 10 00:00:00 GMT+00:00 1899");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "9 Mar 1899 23:59:59 GMT" + "'", str10, "9 Mar 1899 23:59:59 GMT");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.DurationField durationField10 = property7.getRangeDurationField();
        java.lang.String str11 = durationField10.toString();
        long long14 = durationField10.add((long) 1970, (int) (short) 10);
        java.util.Date date20 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.fromDateFields(date20);
        org.joda.time.LocalDate.Property property22 = localDate21.weekOfWeekyear();
        org.joda.time.LocalDate localDate24 = property22.setCopy(10);
        org.joda.time.DurationField durationField25 = property22.getRangeDurationField();
        int int26 = durationField10.compareTo(durationField25);
        long long29 = durationField10.subtract((long) 8, (long) 7);
        long long31 = durationField10.getValueAsLong((long) 2022);
        long long34 = durationField10.getMillis((int) (byte) -1, (long) 32769);
        long long37 = durationField10.subtract((long) 895, (long) (byte) -1);
        long long39 = durationField10.getMillis((long) (byte) -1);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DurationField[weekyears]" + "'", str11, "DurationField[weekyears]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 315705601970L + "'", long14 == 315705601970L);
        org.junit.Assert.assertEquals(date20.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-220751999992L) + "'", long29 == (-220751999992L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-31449600000L) + "'", long34 == (-31449600000L));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32054400895L + "'", long37 == 32054400895L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-31556952000L) + "'", long39 == (-31556952000L));
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.ISODateTimeFormat.basicDateTimeNoMillis();
        java.lang.String str7 = localTime5.toString(dateTimeFormatter6);
        org.joda.time.LocalTime localTime9 = localTime5.minusSeconds((int) (short) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.ISODateTimeFormat.tTime();
        java.lang.String str11 = localTime5.toString(dateTimeFormatter10);
        java.lang.String str12 = localTime5.toString();
        boolean boolean13 = timeOfDay4.isBefore((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay16 = timeOfDay4.withFieldAdded(durationFieldType14, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'months' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "T00:00:00.000" + "'", str11, "T00:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00:00:00.000" + "'", str12, "00:00:00.000");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(durationFieldType14);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.plusMinutes(1899);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay3.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay7 = property6.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeField8.set((long) (short) 10, "weekyearOfCentury");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"weekyearOfCentury\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1899, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str34 = dateTimeZone33.getID();
        org.joda.time.Interval interval35 = yearMonthDay31.toInterval(dateTimeZone33);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.Interval interval38 = interval35.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay21.withChronologyRetainFields(chronology39);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now(chronology39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType45 = localDate43.getFieldType(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT1M" + "'", str19, "PT1M");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.016" + "'", str34, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(mutableInterval36);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(localDate43);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(0, 22, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setHourOfDay(535);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 535 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        int int7 = dateTime6.getEra();
        org.joda.time.DateTime.Property property8 = dateTime6.dayOfYear();
        org.joda.time.DateTime.Property property9 = dateTime6.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime6.withHourOfDay(44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime.Property property1 = localTime0.minuteOfHour();
        org.joda.time.LocalTime localTime3 = localTime0.plusSeconds(5);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(0, (int) '4', chronology6);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = timeOfDay7.getFieldType(1);
        java.lang.String str10 = dateTimeFieldType9.toString();
        int int11 = localTime0.get(dateTimeFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localTime0.getValue(47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 47");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "minuteOfHour" + "'", str10, "minuteOfHour");
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 54 + "'", int11 == 54);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
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
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.LocalDate.Property property11 = localDate4.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate4.withDayOfWeek(952);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 952 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period7 = period5.plusMillis(100);
        org.joda.time.Period period8 = period5.negated();
        int int9 = period5.getDays();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = period5.withFieldAdded(durationFieldType11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight5.yearOfEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 10, chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withWeekOfWeekyear((int) ' ');
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withYear((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusMinutes(4);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusYears((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str24 = dateTimeZone23.getID();
        java.util.Locale locale26 = java.util.Locale.KOREAN;
        java.util.Locale locale28 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str29 = locale26.getDisplayVariant(locale28);
        java.lang.String str30 = dateTimeZone23.getName((long) 5, locale26);
        java.lang.String str31 = localDateTime20.toString("1970", locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight32 = property6.setCopy("secondOfMinute", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"secondOfMinute\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.016" + "'", str24, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.016" + "'", str30, "+00:00:00.016");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970" + "'", str31, "1970");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) '4', chronology10);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.secondOfMinute();
        int[] intArray14 = new int[] { 21 };
        int int15 = dateTimeField7.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay11, intArray14);
        long long17 = dateTimeField7.roundCeiling(10L);
        long long20 = dateTimeField7.getDifferenceAsLong(36L, (-16L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[21]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 31795199984L + "'", long17 == 31795199984L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy("45");
        org.joda.time.LocalDate localDate11 = property7.addToCopy((int) '4');
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.months();
        org.joda.time.PeriodType periodType14 = periodType13.withDaysRemoved();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 2, periodType14);
        org.joda.time.LocalDate localDate17 = localDate11.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod15, 53);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = mutablePeriod15.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        int int12 = mutableDateTime3.getYear();
        mutableDateTime3.addWeekyears(15);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(952, (-292275054), 999, 0, 3172001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3172001 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getName((long) (-1));
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        java.lang.String str8 = dateTimeZone1.getName(10L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00:00.016" + "'", str5, "+00:00:00.016");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00:00.016" + "'", str8, "+00:00:00.016");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        java.time.Instant instant6 = date5.toInstant();
        java.util.Date date7 = java.util.Date.from(instant6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval8 = new org.joda.time.Interval((java.lang.Object) instant6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.time.Instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.Period period7 = period5.plusMillis(100);
        org.joda.time.Period period8 = period5.negated();
        org.joda.time.Period period10 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period12 = org.joda.time.Period.minutes(1);
        java.lang.String str13 = period12.toString();
        org.joda.time.Period period14 = period10.withFields((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Period period16 = period14.plusMillis(100);
        boolean boolean17 = period8.equals((java.lang.Object) period16);
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod();
        org.joda.time.Period period19 = period8.withFields((org.joda.time.ReadablePeriod) mutablePeriod18);
        mutablePeriod18.addWeeks(8);
        int int23 = mutablePeriod18.getValue(6);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod18.setValue(22, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT1M" + "'", str13, "PT1M");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy("45");
        org.joda.time.LocalDate localDate10 = property7.withMaximumValue();
        org.joda.time.LocalDate.Property property11 = localDate10.centuryOfEra();
        int int12 = localDate10.getYear();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDate10.getValue(18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 18");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1899 + "'", int12 == 1899);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(0);
        org.joda.time.LocalTime.Property property12 = localTime9.millisOfSecond();
        org.joda.time.LocalTime localTime13 = property12.roundCeilingCopy();
        org.joda.time.DateTime dateTime14 = localTime13.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime14.withDayOfWeek(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        int int6 = dateTimeZone4.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1899, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.Interval interval16 = yearMonthDay12.toInterval(dateTimeZone14);
        org.joda.time.Interval interval17 = yearMonthDay12.toInterval();
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        java.lang.String str22 = period21.toString();
        org.joda.time.Period period23 = period19.withFields((org.joda.time.ReadablePeriod) period21);
        org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay12.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 1899, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        int int32 = dateTimeZone30.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str37 = dateTimeZone36.getID();
        org.joda.time.Interval interval38 = yearMonthDay34.toInterval(dateTimeZone36);
        org.joda.time.MutableInterval mutableInterval39 = interval38.toMutableInterval();
        org.joda.time.Interval interval41 = interval38.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology42.getZone();
        org.joda.time.DateTimeField dateTimeField44 = chronology42.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay24.withChronologyRetainFields(chronology42);
        org.joda.time.DateTimeField dateTimeField46 = chronology42.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField47 = chronology42.secondOfDay();
        org.joda.time.Period period49 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period51 = org.joda.time.Period.minutes(1);
        java.lang.String str52 = period51.toString();
        org.joda.time.Period period53 = period49.withFields((org.joda.time.ReadablePeriod) period51);
        org.joda.time.Period period55 = period53.plusMillis(100);
        org.joda.time.Period period56 = period53.negated();
        org.joda.time.Period period58 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period60 = org.joda.time.Period.minutes(1);
        java.lang.String str61 = period60.toString();
        org.joda.time.Period period62 = period58.withFields((org.joda.time.ReadablePeriod) period60);
        org.joda.time.Period period64 = period62.plusMillis(100);
        boolean boolean65 = period56.equals((java.lang.Object) period64);
        org.joda.time.Period period66 = period56.normalizedStandard();
        int[] intArray69 = chronology42.get((org.joda.time.ReadablePeriod) period66, (long) '#', 31795199984L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay70 = new org.joda.time.YearMonthDay(26, 58, (int) 'x', chronology42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.016" + "'", str15, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PT1M" + "'", str22, "PT1M");
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.016" + "'", str37, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(mutableInterval39);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "PT1M" + "'", str52, "PT1M");
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PT1M" + "'", str61, "PT1M");
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 0, 0, 2, 23, 59, 59, 949]");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusMillis(3);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.centuryOfEra();
        int int17 = localDateTime12.getHourOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        org.joda.time.LocalDateTime.Property property20 = localDateTime12.property(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime22 = property20.addToCopy((-31449600000L));
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.plusMinutes(1899);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay3.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay7 = property6.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str12 = locale9.getDisplayVariant(locale11);
        int int13 = property6.getMaximumShortTextLength(locale9);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(dateTimeZone16);
        int int20 = dateTimeZone16.getOffset((long) 1);
        java.util.Locale locale22 = java.util.Locale.PRC;
        java.lang.String str23 = dateTimeZone16.getShortName(31553832000L, locale22);
        long long26 = dateTimeZone16.convertLocalToUTC((long) 32770, false);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) 5, dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) int13, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.016" + "'", str17, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.016" + "'", str23, "+00:00:00.016");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32754L + "'", long26 == 32754L);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1899, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Interval interval15 = yearMonthDay11.toInterval(dateTimeZone13);
        org.joda.time.MutableInterval mutableInterval16 = interval15.toMutableInterval();
        org.joda.time.Interval interval18 = interval15.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology19 = interval18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology19.getZone();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval23 = new org.joda.time.Interval((long) '#', (-220751999992L), chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.016" + "'", str14, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(mutableInterval16);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DateTime.Property property11 = dateTime10.secondOfMinute();
        boolean boolean12 = localDate4.equals((java.lang.Object) dateTime10);
        int int13 = localDate4.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField15 = localDate4.getField(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 15");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        java.util.Locale locale8 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight9 = property6.setCopy("1970-08-06T00:00:00.010", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-08-06T00:00:00.010\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(0, 20, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 16, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfWeek();
        org.joda.time.Chronology chronology9 = localDateTime5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology9.getDateTimeMillis((int) (byte) 0, 0, (int) (byte) -1, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) period16);
        int int22 = yearMonthDay9.size();
        org.joda.time.Interval interval23 = yearMonthDay9.toInterval();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = org.joda.time.format.ISODateTimeFormat.dateOptionalTimeParser();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.parse("58", dateTimeFormatter25);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str29 = dateTimeZone28.getID();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(dateTimeZone28);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime33 = dateTime30.withField(dateTimeFieldType31, 44);
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType31.getRangeDurationType();
        java.lang.String str35 = dateTimeFieldType31.toString();
        boolean boolean36 = localTime26.isSupported(dateTimeFieldType31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property37 = yearMonthDay9.property(dateTimeFieldType31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT1M" + "'", str19, "PT1M");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00:00.016" + "'", str29, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "weekyearOfCentury" + "'", str35, "weekyearOfCentury");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
        int int1 = mutablePeriod0.getDays();
        mutablePeriod0.setHours((int) 'a');
        mutablePeriod0.add(0, 7, 1970, 52, (int) (short) 100, (int) (short) 0, (int) (short) 1, (int) (byte) -1);
        int int13 = mutablePeriod0.getMinutes();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod();
        mutablePeriod11.addWeeks((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime4.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, (int) 'u');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMinutes((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDateTime15.getValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        long long6 = java.util.Date.UTC(100, 535, (int) '4', (int) (byte) 100, 3172001, 9);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2548708869000L + "'", long6 == 2548708869000L);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        int int6 = dateTimeZone4.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1899, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtCurrentTime(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str15 = dateTimeZone14.getID();
        org.joda.time.Interval interval16 = yearMonthDay12.toInterval(dateTimeZone14);
        org.joda.time.MutableInterval mutableInterval17 = interval16.toMutableInterval();
        org.joda.time.Interval interval19 = interval16.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology20.getZone();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.monthOfYear();
        org.joda.time.Period period24 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period26 = org.joda.time.Period.minutes(1);
        java.lang.String str27 = period26.toString();
        org.joda.time.Period period28 = period24.withFields((org.joda.time.ReadablePeriod) period26);
        org.joda.time.Period period30 = period28.plusMillis(100);
        org.joda.time.Period period31 = period28.negated();
        org.joda.time.Period period33 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period35 = org.joda.time.Period.minutes(1);
        java.lang.String str36 = period35.toString();
        org.joda.time.Period period37 = period33.withFields((org.joda.time.ReadablePeriod) period35);
        org.joda.time.Period period39 = period37.plusMillis(100);
        boolean boolean40 = period31.equals((java.lang.Object) period39);
        long long43 = chronology20.add((org.joda.time.ReadablePeriod) period31, 31556952000L, (int) '4');
        org.joda.time.DateTimeField dateTimeField44 = chronology20.dayOfYear();
        org.joda.time.Period period45 = new org.joda.time.Period((long) 2, (long) 4, periodType2, chronology20);
        java.lang.String str46 = chronology20.toString();
        org.joda.time.DateTimeZone dateTimeZone48 = org.joda.time.DateTimeZone.getDefault();
        int int50 = dateTimeZone48.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone48);
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long) 16, dateTimeZone48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((java.lang.Object) str46, dateTimeZone48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ISOChronology[+00:00:00.016]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00:00.016" + "'", str15, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(mutableInterval17);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PT1M" + "'", str27, "PT1M");
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT1M" + "'", str36, "PT1M");
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 31553832000L + "'", long43 == 31553832000L);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ISOChronology[+00:00:00.016]" + "'", str46, "ISOChronology[+00:00:00.016]");
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay9.dayOfMonth();
        java.lang.String str15 = property14.getAsText();
        org.joda.time.DateTimeField dateTimeField16 = property14.getField();
        java.util.Locale locale18 = java.util.Locale.KOREAN;
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str21 = locale18.getDisplayVariant(locale20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay22 = property14.setCopy("00:00:00.000", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"00:00:00.000\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "21" + "'", str15, "21");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 10, chronology1);
        org.joda.time.Chronology chronology4 = null;
        mutablePeriod2.setPeriod((long) 0, chronology4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        mutablePeriod2.setPeriod(readableDuration6);
        int int8 = mutablePeriod2.getWeeks();
        mutablePeriod2.add((long) 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) 2022);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plusWeeks(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withYearOfCentury((-1901));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1901 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        org.joda.time.TimeOfDay timeOfDay5 = dateTime4.toTimeOfDay();
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeOfDay5.toString("secondOfMinute", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.withHourOfDay(3);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1899, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.Interval interval20 = yearMonthDay16.toInterval(dateTimeZone18);
        org.joda.time.MutableInterval mutableInterval21 = interval20.toMutableInterval();
        org.joda.time.Interval interval23 = interval20.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone25 = chronology24.getZone();
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((java.lang.Object) dateTime6, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime6.withMillisOfDay((int) (byte) 10);
        org.joda.time.Chronology chronology29 = dateTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight((-292275054), 99, 27, chronology29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.016" + "'", str19, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(mutableInterval21);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 16, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.millisOfSecond();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = property9.setCopy("ISOChronology[+00:00:00.016]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[+00:00:00.016]\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        boolean boolean16 = calendar11.isLenient();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455271885,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=31,MILLISECOND=901,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese (Taiwan)" + "'", str10, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455271885,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=31,MILLISECOND=901,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1899, dateTimeZone8);
        java.lang.String str13 = dateTimeZone8.getShortName((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((int) (short) 100, 58, 0, 3172000, (int) '#', 22, (int) 'a', dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3172000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Period period5 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period7 = org.joda.time.Period.minutes(1);
        java.lang.String str8 = period7.toString();
        org.joda.time.Period period9 = period5.withFields((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period11 = period7.minusSeconds((int) (short) 100);
        mutableDateTime3.add((org.joda.time.ReadablePeriod) period7);
        mutableDateTime3.addWeekyears(0);
        mutableDateTime3.addHours(2);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime3.year();
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime24 = timeOfDay22.toDateTimeToday(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime24.minus((long) (short) 0);
        org.joda.time.DateTime dateTime27 = dateTime26.toDateTimeISO();
        org.joda.time.DateTime dateTime29 = dateTime27.minus(315705601970L);
        org.joda.time.DateTime.Property property30 = dateTime27.era();
        org.joda.time.LocalTime localTime31 = dateTime27.toLocalTime();
        long long32 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTime.Property property33 = dateTime27.monthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT1M" + "'", str8, "PT1M");
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = period21.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.Period period27 = period25.plusMillis(100);
        org.joda.time.Period period28 = period25.negated();
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        java.lang.String str33 = period32.toString();
        org.joda.time.Period period34 = period30.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Period period36 = period34.plusMillis(100);
        boolean boolean37 = period28.equals((java.lang.Object) period36);
        long long40 = chronology17.add((org.joda.time.ReadablePeriod) period28, 31556952000L, (int) '4');
        org.joda.time.DateTimeField dateTimeField41 = chronology17.dayOfYear();
        java.lang.String str42 = dateTimeField41.getName();
        long long44 = dateTimeField41.roundHalfCeiling((long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT1M" + "'", str24, "PT1M");
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT1M" + "'", str33, "PT1M");
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 31553832000L + "'", long40 == 31553832000L);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "dayOfYear" + "'", str42, "dayOfYear");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-16L) + "'", long44 == (-16L));
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.util.Locale locale11 = java.util.Locale.KOREAN;
        java.lang.String str12 = locale10.getDisplayVariant(locale11);
        java.lang.String str13 = property7.getAsText(locale10);
        org.joda.time.LocalDate localDate14 = property7.getLocalDate();
        org.joda.time.LocalDate localDate15 = property7.roundHalfFloorCopy();
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        int int8 = dateTimeZone6.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1899, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        int int12 = dateTimeZone10.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str17 = dateTimeZone16.getID();
        org.joda.time.Interval interval18 = yearMonthDay14.toInterval(dateTimeZone16);
        org.joda.time.Interval interval19 = yearMonthDay14.toInterval();
        org.joda.time.Period period21 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        java.lang.String str24 = period23.toString();
        org.joda.time.Period period25 = period21.withFields((org.joda.time.ReadablePeriod) period23);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay14.plus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.getDefault();
        int int30 = dateTimeZone28.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 1899, dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        int int34 = dateTimeZone32.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime35 = localDate31.toDateTimeAtCurrentTime(dateTimeZone32);
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str39 = dateTimeZone38.getID();
        org.joda.time.Interval interval40 = yearMonthDay36.toInterval(dateTimeZone38);
        org.joda.time.MutableInterval mutableInterval41 = interval40.toMutableInterval();
        org.joda.time.Interval interval43 = interval40.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology44 = interval43.getChronology();
        org.joda.time.DateTimeZone dateTimeZone45 = chronology44.getZone();
        org.joda.time.DateTimeField dateTimeField46 = chronology44.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay26.withChronologyRetainFields(chronology44);
        org.joda.time.DateMidnight dateMidnight48 = yearMonthDay26.toDateMidnight();
        int int49 = yearMonthDay26.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            int int50 = localDateTime2.compareTo((org.joda.time.ReadablePartial) yearMonthDay26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00:00.016" + "'", str17, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT1M" + "'", str24, "PT1M");
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "+00:00:00.016" + "'", str39, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(mutableInterval41);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 21 + "'", int49 == 21);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekOfWeekyear((int) ' ');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusMinutes(4);
        int int11 = localDateTime6.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withEra(7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        calendar3.setTimeInMillis(31556952000L);
        java.util.Date date11 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.fromDateFields(date11);
        date11.setTime((-1L));
        java.util.Date date20 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        int int21 = date20.getSeconds();
        boolean boolean22 = date11.after(date20);
        calendar3.setTime(date20);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = calendar3.getActualMinimum((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=-2234643900016,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1899,MONTH=2,WEEK_OF_YEAR=10,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=69,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=35,SECOND=0,MILLISECOND=0,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertEquals(date20.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.util.Locale locale2 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getUnicodeLocaleType("eras");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: eras");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.plus((long) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        int int13 = dateTimeZone11.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 1899, dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str22 = dateTimeZone21.getID();
        org.joda.time.Interval interval23 = yearMonthDay19.toInterval(dateTimeZone21);
        org.joda.time.MutableInterval mutableInterval24 = interval23.toMutableInterval();
        org.joda.time.Interval interval26 = interval23.withStartMillis((long) 32769);
        org.joda.time.Duration duration27 = interval26.toDuration();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str30 = dateTimeZone29.getID();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(dateTimeZone29);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType33.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray35 = new org.joda.time.DurationFieldType[] { durationFieldType34 };
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.forFields(durationFieldTypeArray35);
        org.joda.time.Period period37 = new org.joda.time.Period((long) ' ', periodType36);
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration27, (org.joda.time.ReadableInstant) dateTime31, periodType36);
        org.joda.time.PeriodType periodType39 = periodType36.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod40 = new org.joda.time.MutablePeriod((java.lang.Object) '4', periodType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.016" + "'", str22, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(mutableInterval24);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.016" + "'", str30, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(durationFieldTypeArray35);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertNotNull(periodType39);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        java.util.Date date9 = localDate6.toDate();
        date9.setDate((int) (short) 10);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Fri Mar 10 00:00:00 GMT+00:00 1899");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        long long6 = java.util.Date.UTC(18, 11, (int) 'u', 8, 4, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1602086161000L) + "'", long6 == (-1602086161000L));
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        int int0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, (-1901));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1901");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((int) (byte) 100, 3, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 1899, dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        int int15 = dateTimeZone13.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str20 = dateTimeZone19.getID();
        org.joda.time.Interval interval21 = yearMonthDay17.toInterval(dateTimeZone19);
        org.joda.time.Chronology chronology22 = interval21.getChronology();
        org.joda.time.Interval interval23 = interval21.toInterval();
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType25 = periodType24.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.Interval interval39 = yearMonthDay35.toInterval(dateTimeZone37);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Interval interval42 = interval39.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology43.getZone();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.monthOfYear();
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(chronology43);
        org.joda.time.DurationField durationField47 = chronology43.millis();
        org.joda.time.DateTimeField dateTimeField48 = chronology43.dayOfMonth();
        org.joda.time.Period period49 = new org.joda.time.Period((java.lang.Object) interval21, periodType25, chronology43);
        org.joda.time.PeriodType periodType50 = periodType25.withYearsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod(7, (int) (short) 0, 53660892, (int) (short) -1, (int) 'x', 32769, (-1), 999, periodType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00:00.016" + "'", str20, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.016" + "'", str38, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(mutableInterval40);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(periodType50);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        int int7 = localDate6.getWeekyear();
        org.joda.time.LocalDate.Property property8 = localDate6.monthOfYear();
        org.joda.time.LocalDate localDate10 = property8.addToCopy(21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate10.withDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1899 + "'", int7 == 1899);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod();
        int int4 = mutablePeriod3.getDays();
        java.util.Date date12 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.fromDateFields(date12);
        org.joda.time.LocalDate.Property property14 = localDate13.weekOfWeekyear();
        org.joda.time.LocalDate localDate16 = property14.setCopy("45");
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime23 = dateTime20.withField(dateTimeFieldType21, 44);
        boolean boolean24 = localDate16.isSupported(dateTimeFieldType21);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.getDefault();
        int int28 = dateTimeZone26.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 1899, dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.getDefault();
        int int32 = dateTimeZone30.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime33 = localDate29.toDateTimeAtCurrentTime(dateTimeZone30);
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(dateTimeZone30);
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str37 = dateTimeZone36.getID();
        org.joda.time.Interval interval38 = yearMonthDay34.toInterval(dateTimeZone36);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        long long43 = chronology39.add((long) 18, (long) 6, 58);
        boolean boolean44 = dateTimeFieldType21.isSupported(chronology39);
        mutablePeriod3.setPeriod((long) 32, (long) 53, chronology39);
        org.joda.time.DateTimeField dateTimeField46 = chronology39.minuteOfHour();
        org.joda.time.DurationField durationField47 = chronology39.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(46, 27, (int) (byte) 100, chronology39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 27 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals(date12.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.016" + "'", str19, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00:00.016" + "'", str37, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 366L + "'", long43 == 366L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(durationField47);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withDurationAdded(readableDuration11, (int) (byte) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 10, chronology15);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime4.plus((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime4.plusHours(3172001);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.util.Date date1 = new java.util.Date(0L);
        java.lang.Object obj2 = date1.clone();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "Thu Jan 01 00:00:00 GMT+00:00 1970");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.List<java.util.Locale> localeList6 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        boolean boolean7 = localeList6.isEmpty();
        java.util.stream.Stream<java.util.Locale> localeStream8 = localeList6.stream();
        java.util.stream.Stream<java.util.Locale> localeStream9 = localeList6.stream();
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod();
        mutablePeriod10.setMonths((int) (short) 10);
        int int13 = mutablePeriod10.getDays();
        java.lang.Object obj14 = mutablePeriod10.clone();
        boolean boolean15 = localeList6.equals((java.lang.Object) mutablePeriod10);
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod();
        java.lang.String str17 = mutablePeriod16.toString();
        mutablePeriod16.setPeriod(0L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        int int23 = dateTimeZone21.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 1899, dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtCurrentTime(dateTimeZone25);
        org.joda.time.YearMonthDay yearMonthDay29 = new org.joda.time.YearMonthDay(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str32 = dateTimeZone31.getID();
        org.joda.time.Interval interval33 = yearMonthDay29.toInterval(dateTimeZone31);
        org.joda.time.MutableInterval mutableInterval34 = interval33.toMutableInterval();
        org.joda.time.Interval interval36 = interval33.withStartMillis((long) 32769);
        org.joda.time.Duration duration37 = interval36.toDuration();
        java.lang.String str38 = duration37.toString();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.getDefault();
        int int42 = dateTimeZone40.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 1899, dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.getDefault();
        int int46 = dateTimeZone44.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime47 = localDate43.toDateTimeAtCurrentTime(dateTimeZone44);
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str51 = dateTimeZone50.getID();
        org.joda.time.Interval interval52 = yearMonthDay48.toInterval(dateTimeZone50);
        org.joda.time.MutableInterval mutableInterval53 = interval52.toMutableInterval();
        org.joda.time.Interval interval55 = interval52.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology56 = interval55.getChronology();
        org.joda.time.DateTimeZone dateTimeZone57 = chronology56.getZone();
        org.joda.time.DateTimeField dateTimeField58 = chronology56.monthOfYear();
        org.joda.time.Period period60 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period62 = org.joda.time.Period.minutes(1);
        java.lang.String str63 = period62.toString();
        org.joda.time.Period period64 = period60.withFields((org.joda.time.ReadablePeriod) period62);
        org.joda.time.Period period66 = period64.plusMillis(100);
        org.joda.time.Period period67 = period64.negated();
        org.joda.time.Period period69 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period71 = org.joda.time.Period.minutes(1);
        java.lang.String str72 = period71.toString();
        org.joda.time.Period period73 = period69.withFields((org.joda.time.ReadablePeriod) period71);
        org.joda.time.Period period75 = period73.plusMillis(100);
        boolean boolean76 = period67.equals((java.lang.Object) period75);
        long long79 = chronology56.add((org.joda.time.ReadablePeriod) period67, 31556952000L, (int) '4');
        mutablePeriod16.setPeriod((org.joda.time.ReadableDuration) duration37, chronology56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime81 = new org.joda.time.LocalTime((java.lang.Object) localeList6, chronology56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.ArrayList");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(localeStream8);
        org.junit.Assert.assertNotNull(localeStream9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "P10M");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "P10M");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "P10M");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0S" + "'", str17, "PT0S");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.016" + "'", str32, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(mutableInterval34);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT1645487967.215S" + "'", str38, "PT1645487967.215S");
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "+00:00:00.016" + "'", str51, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(mutableInterval53);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTimeField58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PT1M" + "'", str63, "PT1M");
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertNotNull(period67);
        org.junit.Assert.assertNotNull(period69);
        org.junit.Assert.assertNotNull(period71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PT1M" + "'", str72, "PT1M");
        org.junit.Assert.assertNotNull(period73);
        org.junit.Assert.assertNotNull(period75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + long79 + "' != '" + 31553832000L + "'", long79 == 31553832000L);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2022-02-21T16:55:26.907Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T16:55:26.907Z\" is malformed at \"22-02-21T16:55:26.907Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minus((long) (short) 0);
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime8.getZone();
        java.lang.String str11 = dateTimeZone10.getID();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone10);
        boolean boolean14 = dateTimeZone10.isStandardOffset(9223309869549175808L);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Etc/UTC" + "'", str11, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        int int5 = dateTimeZone3.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1899, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        int int9 = dateTimeZone7.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Interval interval15 = yearMonthDay11.toInterval(dateTimeZone13);
        org.joda.time.Interval interval16 = yearMonthDay11.toInterval();
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period20 = org.joda.time.Period.minutes(1);
        java.lang.String str21 = period20.toString();
        org.joda.time.Period period22 = period18.withFields((org.joda.time.ReadablePeriod) period20);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay11.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 1899, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime32 = localDate28.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.Interval interval37 = yearMonthDay33.toInterval(dateTimeZone35);
        org.joda.time.MutableInterval mutableInterval38 = interval37.toMutableInterval();
        org.joda.time.Interval interval40 = interval37.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = chronology41.getZone();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay44 = yearMonthDay23.withChronologyRetainFields(chronology41);
        org.joda.time.DateTimeField dateTimeField45 = chronology41.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval46 = new org.joda.time.Interval((long) (-1), (long) (-1901), chronology41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00:00.016" + "'", str14, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PT1M" + "'", str21, "PT1M");
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.016" + "'", str36, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(mutableInterval38);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(yearMonthDay44);
        org.junit.Assert.assertNotNull(dateTimeField45);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime7.withField(dateTimeFieldType8, 44);
        org.joda.time.DateTime dateTime12 = dateTime10.withWeekyear((int) (byte) 100);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray18 = timeOfDay17.getFields();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = timeOfDay17.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTime.Property property21 = dateTime20.monthOfYear();
        org.joda.time.DateTime dateTime23 = dateTime20.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.toDateTime(chronology24);
        int int26 = dateTime23.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getDurationType();
        org.joda.time.DateTime dateTime30 = dateTime23.withFieldAdded(durationFieldType28, (int) (byte) 1);
        int int31 = dateTime23.getMillisOfDay();
        org.joda.time.PeriodType periodType32 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableInstant) dateTime23, periodType32);
        boolean boolean34 = calendar3.after((java.lang.Object) dateTime23);
        java.util.TimeZone timeZone35 = calendar3.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int37 = calendar3.getActualMinimum(1722);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1722");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455274950,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=34,MILLISECOND=966,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00:00.016" + "'", str6, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldArray18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3172001 + "'", int31 == 3172001);
        org.junit.Assert.assertNotNull(periodType32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(2022, 0, 400, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) '4', chronology10);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.secondOfMinute();
        int[] intArray14 = new int[] { 21 };
        int int15 = dateTimeField7.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay11, intArray14);
        long long17 = dateTimeField7.roundCeiling(10L);
        long long19 = dateTimeField7.roundFloor((long) 3);
        java.lang.String str20 = dateTimeField7.toString();
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.lang.String str23 = dateTimeField7.getAsText(0, locale22);
        int int25 = dateTimeField7.getMaximumValue(1645488000000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[21]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 31795199984L + "'", long17 == 31795199984L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-259200016L) + "'", long19 == (-259200016L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DateTimeField[weekyear]" + "'", str20, "DateTimeField[weekyear]");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 292278993 + "'", int25 == 292278993);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.Period period1 = org.joda.time.Period.months(3);
        org.joda.time.Period period3 = period1.minusMonths((int) (short) 0);
        org.joda.time.Period period5 = period1.plusMonths((int) (short) -1);
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod();
        java.lang.String str8 = mutablePeriod7.toString();
        mutablePeriod7.setPeriod(0L);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 1899, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        int int18 = dateTimeZone16.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtCurrentTime(dateTimeZone16);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str23 = dateTimeZone22.getID();
        org.joda.time.Interval interval24 = yearMonthDay20.toInterval(dateTimeZone22);
        org.joda.time.MutableInterval mutableInterval25 = interval24.toMutableInterval();
        org.joda.time.Interval interval27 = interval24.withStartMillis((long) 32769);
        org.joda.time.Duration duration28 = interval27.toDuration();
        java.lang.String str29 = duration28.toString();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 1899, dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.getDefault();
        int int37 = dateTimeZone35.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime38 = localDate34.toDateTimeAtCurrentTime(dateTimeZone35);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str42 = dateTimeZone41.getID();
        org.joda.time.Interval interval43 = yearMonthDay39.toInterval(dateTimeZone41);
        org.joda.time.MutableInterval mutableInterval44 = interval43.toMutableInterval();
        org.joda.time.Interval interval46 = interval43.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology47 = interval46.getChronology();
        org.joda.time.DateTimeZone dateTimeZone48 = chronology47.getZone();
        org.joda.time.DateTimeField dateTimeField49 = chronology47.monthOfYear();
        org.joda.time.Period period51 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period53 = org.joda.time.Period.minutes(1);
        java.lang.String str54 = period53.toString();
        org.joda.time.Period period55 = period51.withFields((org.joda.time.ReadablePeriod) period53);
        org.joda.time.Period period57 = period55.plusMillis(100);
        org.joda.time.Period period58 = period55.negated();
        org.joda.time.Period period60 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period62 = org.joda.time.Period.minutes(1);
        java.lang.String str63 = period62.toString();
        org.joda.time.Period period64 = period60.withFields((org.joda.time.ReadablePeriod) period62);
        org.joda.time.Period period66 = period64.plusMillis(100);
        boolean boolean67 = period58.equals((java.lang.Object) period66);
        long long70 = chronology47.add((org.joda.time.ReadablePeriod) period58, 31556952000L, (int) '4');
        mutablePeriod7.setPeriod((org.joda.time.ReadableDuration) duration28, chronology47);
        org.joda.time.PeriodType periodType72 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.Period period73 = new org.joda.time.Period(readableInstant6, (org.joda.time.ReadableDuration) duration28, periodType72);
        org.joda.time.PeriodType periodType74 = periodType72.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period75 = period1.withPeriodType(periodType72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PT0S" + "'", str8, "PT0S");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00:00.016" + "'", str23, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(mutableInterval25);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(duration28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PT1645487967.215S" + "'", str29, "PT1645487967.215S");
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "+00:00:00.016" + "'", str42, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(mutableInterval44);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PT1M" + "'", str54, "PT1M");
        org.junit.Assert.assertNotNull(period55);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "PT1M" + "'", str63, "PT1M");
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(period66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 31553832000L + "'", long70 == 31553832000L);
        org.junit.Assert.assertNotNull(periodType72);
        org.junit.Assert.assertNotNull(periodType74);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDate();
        java.io.Writer writer1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str4 = dateTimeZone3.getID();
        org.joda.time.DateMidnight dateMidnight5 = org.joda.time.DateMidnight.now(dateTimeZone3);
        org.joda.time.ReadableInstant readableInstant6 = null;
        boolean boolean7 = dateMidnight5.isBefore(readableInstant6);
        int int8 = dateMidnight5.getYearOfCentury();
        org.joda.time.DateMidnight.Property property9 = dateMidnight5.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadableInstant) dateMidnight5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.016" + "'", str4, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime dateTime3 = dateTime1.withHourOfDay(3);
        int int4 = dateTime3.getSecondOfMinute();
        int int5 = dateTime3.getMinuteOfHour();
        int int6 = dateTime3.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime3.withSecondOfMinute(3172001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3172001 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54 + "'", int5 == 54);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((java.lang.Object) "1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) '4', chronology10);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.secondOfMinute();
        int[] intArray14 = new int[] { 21 };
        int int15 = dateTimeField7.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay11, intArray14);
        java.lang.String str17 = dateTimeField7.getAsText((long) 3172000);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 1899, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime26 = localDate22.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str30 = dateTimeZone29.getID();
        org.joda.time.Interval interval31 = yearMonthDay27.toInterval(dateTimeZone29);
        org.joda.time.YearMonthDay.Property property32 = yearMonthDay27.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay33 = property32.getYearMonthDay();
        int int34 = yearMonthDay33.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.DateMidnight dateMidnight39 = org.joda.time.DateMidnight.now(dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.plus((long) 45);
        org.joda.time.DateMidnight.Property property42 = dateMidnight39.weekyear();
        org.joda.time.DateTimeField dateTimeField43 = property42.getField();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.TimeOfDay timeOfDay47 = new org.joda.time.TimeOfDay(0, (int) '4', chronology46);
        org.joda.time.TimeOfDay.Property property48 = timeOfDay47.secondOfMinute();
        int[] intArray50 = new int[] { 21 };
        int int51 = dateTimeField43.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay47, intArray50);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray53 = dateTimeField7.add((org.joda.time.ReadablePartial) yearMonthDay33, 535, intArray50, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 535");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[21]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970" + "'", str17, "1970");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.016" + "'", str30, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 21 + "'", int34 == 21);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.016" + "'", str38, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[21]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 292278993 + "'", int51 == 292278993);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 1899, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        int int11 = dateTimeZone9.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.Interval interval17 = yearMonthDay13.toInterval(dateTimeZone15);
        org.joda.time.MutableInterval mutableInterval18 = interval17.toMutableInterval();
        org.joda.time.Interval interval20 = interval17.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((int) (byte) -1, 58, 50, 35, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.016" + "'", str16, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(mutableInterval18);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(15, 3, 22, 32, 952, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod();
        java.lang.String str4 = mutablePeriod3.toString();
        mutablePeriod3.setPeriod(0L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1899, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.Interval interval20 = yearMonthDay16.toInterval(dateTimeZone18);
        org.joda.time.MutableInterval mutableInterval21 = interval20.toMutableInterval();
        org.joda.time.Interval interval23 = interval20.withStartMillis((long) 32769);
        org.joda.time.Duration duration24 = interval23.toDuration();
        java.lang.String str25 = duration24.toString();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.Interval interval39 = yearMonthDay35.toInterval(dateTimeZone37);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Interval interval42 = interval39.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology43.getZone();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.monthOfYear();
        org.joda.time.Period period47 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(1);
        java.lang.String str50 = period49.toString();
        org.joda.time.Period period51 = period47.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Period period53 = period51.plusMillis(100);
        org.joda.time.Period period54 = period51.negated();
        org.joda.time.Period period56 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period58 = org.joda.time.Period.minutes(1);
        java.lang.String str59 = period58.toString();
        org.joda.time.Period period60 = period56.withFields((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Period period62 = period60.plusMillis(100);
        boolean boolean63 = period54.equals((java.lang.Object) period62);
        long long66 = chronology43.add((org.joda.time.ReadablePeriod) period54, 31556952000L, (int) '4');
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration24, chronology43);
        org.joda.time.DateTimeField dateTimeField68 = chronology43.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay(9, 29, 1722, chronology43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 29 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.016" + "'", str19, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(mutableInterval21);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT1645487967.215S" + "'", str25, "PT1645487967.215S");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.016" + "'", str38, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(mutableInterval40);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT1M" + "'", str50, "PT1M");
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PT1M" + "'", str59, "PT1M");
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 31553832000L + "'", long66 == 31553832000L);
        org.junit.Assert.assertNotNull(dateTimeField68);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.LocalDate localDate6 = localDate4.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone9 = dateTimeZone8.toTimeZone();
        org.joda.time.DateTime dateTime10 = localDate4.toDateTimeAtCurrentTime(dateTimeZone8);
        int int11 = dateTime10.getMinuteOfHour();
        org.joda.time.Instant instant12 = dateTime10.toInstant();
        org.joda.time.DateTime dateTime14 = dateTime10.minusMonths((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 54 + "'", int11 == 54);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod();
        java.lang.String str4 = mutablePeriod3.toString();
        mutablePeriod3.setPeriod(0L);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.getDefault();
        int int10 = dateTimeZone8.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1899, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        int int14 = dateTimeZone12.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str19 = dateTimeZone18.getID();
        org.joda.time.Interval interval20 = yearMonthDay16.toInterval(dateTimeZone18);
        org.joda.time.MutableInterval mutableInterval21 = interval20.toMutableInterval();
        org.joda.time.Interval interval23 = interval20.withStartMillis((long) 32769);
        org.joda.time.Duration duration24 = interval23.toDuration();
        java.lang.String str25 = duration24.toString();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 1899, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.getDefault();
        int int33 = dateTimeZone31.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtCurrentTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str38 = dateTimeZone37.getID();
        org.joda.time.Interval interval39 = yearMonthDay35.toInterval(dateTimeZone37);
        org.joda.time.MutableInterval mutableInterval40 = interval39.toMutableInterval();
        org.joda.time.Interval interval42 = interval39.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology43 = interval42.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = chronology43.getZone();
        org.joda.time.DateTimeField dateTimeField45 = chronology43.monthOfYear();
        org.joda.time.Period period47 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period49 = org.joda.time.Period.minutes(1);
        java.lang.String str50 = period49.toString();
        org.joda.time.Period period51 = period47.withFields((org.joda.time.ReadablePeriod) period49);
        org.joda.time.Period period53 = period51.plusMillis(100);
        org.joda.time.Period period54 = period51.negated();
        org.joda.time.Period period56 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period58 = org.joda.time.Period.minutes(1);
        java.lang.String str59 = period58.toString();
        org.joda.time.Period period60 = period56.withFields((org.joda.time.ReadablePeriod) period58);
        org.joda.time.Period period62 = period60.plusMillis(100);
        boolean boolean63 = period54.equals((java.lang.Object) period62);
        long long66 = chronology43.add((org.joda.time.ReadablePeriod) period54, 31556952000L, (int) '4');
        mutablePeriod3.setPeriod((org.joda.time.ReadableDuration) duration24, chronology43);
        org.joda.time.DateTimeField dateTimeField68 = chronology43.weekyear();
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay(chronology43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay70 = new org.joda.time.TimeOfDay(47, 952, 32769, chronology43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT0S" + "'", str4, "PT0S");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.016" + "'", str19, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(mutableInterval21);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT1645487967.215S" + "'", str25, "PT1645487967.215S");
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00:00.016" + "'", str38, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(mutableInterval40);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PT1M" + "'", str50, "PT1M");
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PT1M" + "'", str59, "PT1M");
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(period62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 31553832000L + "'", long66 == 31553832000L);
        org.junit.Assert.assertNotNull(dateTimeField68);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(400, 0, 292278993, 0, 0, 32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.plusMinutes(1899);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay3.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay3.plusSeconds(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField10 = timeOfDay8.getField(53660892);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53660892");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay8);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("46", (double) 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=59.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(0, (int) '4', chronology10);
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.secondOfMinute();
        int[] intArray14 = new int[] { 21 };
        int int15 = dateTimeField7.getMaximumValue((org.joda.time.ReadablePartial) timeOfDay11, intArray14);
        boolean boolean16 = dateTimeField7.isLenient();
        boolean boolean18 = dateTimeField7.isLeap(10L);
        int int21 = dateTimeField7.getDifference((long) 5, (long) 952);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[21]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 292278993 + "'", int15 == 292278993);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) '4', chronology2);
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay3.plusMinutes(1899);
        org.joda.time.TimeOfDay.Property property6 = timeOfDay3.millisOfSecond();
        org.joda.time.TimeOfDay timeOfDay7 = property6.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField8 = property6.getField();
        java.util.Locale locale9 = java.util.Locale.KOREAN;
        java.util.Locale locale10 = java.util.Locale.KOREAN;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        java.util.Locale.setDefault(locale9);
        java.lang.String str13 = property6.getAsShortText(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay15 = property6.setCopy(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        org.joda.time.Chronology chronology16 = interval14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.halfdayOfDay();
        long long19 = dateTimeField17.roundHalfCeiling((long) 46);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Chronology chronology15 = interval14.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology15.getDateTimeMillis(46, (int) (short) 10, 7, 59, 59, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy(10);
        org.joda.time.LocalDate localDate11 = localDate9.withWeekyear(1970);
        org.joda.time.LocalDate localDate13 = localDate11.withWeekyear(53);
        org.joda.time.LocalDate localDate15 = localDate11.withWeekyear(17);
        int int16 = localDate11.getWeekyear();
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.minusMillis(895);
        java.util.Date date8 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromDateFields(date8);
        int int10 = localDate9.getWeekyear();
        org.joda.time.LocalDate.Property property11 = localDate9.monthOfYear();
        org.joda.time.LocalDate.Property property12 = localDate9.centuryOfEra();
        org.joda.time.LocalDate localDate13 = property12.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localTime2.compareTo((org.joda.time.ReadablePartial) localDate13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals(date8.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1899 + "'", int10 == 1899);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType9 = periodType8.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((int) (byte) 0, 10, 292278993, 895, (int) 'a', 1, (int) (byte) -1, 654, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (short) 1);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.Period period4 = new org.joda.time.Period(12, 16, 14, (int) '#');
        org.joda.time.Period period6 = period4.multipliedBy(53);
        java.lang.String str7 = period4.toString();
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT12H16M14.035S" + "'", str7, "PT12H16M14.035S");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.MutableInterval mutableInterval14 = interval13.toMutableInterval();
        org.joda.time.Interval interval16 = interval13.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.monthOfYear();
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DurationField durationField21 = chronology17.millis();
        org.joda.time.DurationField durationField22 = chronology17.hours();
        long long25 = durationField22.subtract(9223309869549175808L, 46);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(mutableInterval14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9223309869383575808L + "'", long25 == 9223309869383575808L);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        boolean boolean12 = dateTime7.isAfter((long) '#');
        java.lang.String str13 = dateTime7.toString();
        org.joda.time.DateTime dateTime15 = dateTime7.minusSeconds(292278993);
        long long16 = dateTime15.getMillis();
        int int17 = dateTime15.getYear();
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-21T00:52:52.000Z" + "'", str13, "2022-02-21T00:52:52.000Z");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1353125779000L + "'", long16 == 1353125779000L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2012 + "'", int17 == 2012);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTimeToday(dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.monthOfYear();
        org.joda.time.DateTime dateTime17 = dateTime14.minusMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime19 = dateTime14.withSecondOfMinute(16);
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = timeOfDay24.toDateTimeToday(dateTimeZone25);
        int int28 = dateTimeZone25.getOffset((long) 1);
        org.joda.time.DateTime dateTime29 = dateTime19.withZoneRetainFields(dateTimeZone25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(21, (int) '#', (int) 'x', 32769, 5, 654, (-1), dateTimeZone25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.io.IOException iOException2 = new java.io.IOException("45");
        java.lang.Throwable[] throwableArray3 = iOException2.getSuppressed();
        java.io.IOException iOException4 = new java.io.IOException("10", (java.lang.Throwable) iOException2);
        java.lang.String str5 = iOException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.io.IOException: 45" + "'", str5, "java.io.IOException: 45");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime11 = timeOfDay9.toDateTimeToday(dateTimeZone10);
        mutableDateTime4.setZoneRetainFields(dateTimeZone10);
        boolean boolean13 = mutableDateTime4.isEqualNow();
        org.joda.time.DateTimeField dateTimeField14 = mutableDateTime4.getRoundingField();
        org.joda.time.Interval interval15 = new org.joda.time.Interval(readablePeriod0, (org.joda.time.ReadableInstant) mutableDateTime4);
        mutableDateTime4.setSecondOfDay(54);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        int int20 = dateTimeZone18.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.Period period23 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period25 = org.joda.time.Period.minutes(1);
        java.lang.String str26 = period25.toString();
        org.joda.time.Period period27 = period23.withFields((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period29 = period25.minusSeconds((int) (short) 100);
        mutableDateTime21.add((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period34 = org.joda.time.Period.minutes(1);
        java.lang.String str35 = period34.toString();
        org.joda.time.Period period36 = period32.withFields((org.joda.time.ReadablePeriod) period34);
        org.joda.time.Period period38 = period36.plusMillis(100);
        org.joda.time.Period period39 = period36.negated();
        org.joda.time.Period period41 = period39.withMillis(1899);
        org.joda.time.Period period43 = period41.plusMillis(0);
        mutableDateTime21.add((org.joda.time.ReadablePeriod) period41);
        org.joda.time.DateTime dateTime45 = mutableDateTime21.toDateTime();
        mutableDateTime21.setWeekyear(1970);
        org.joda.time.DateTimeField dateTimeField48 = mutableDateTime21.getRoundingField();
        org.joda.time.TimeOfDay timeOfDay53 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray54 = timeOfDay53.getFields();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = timeOfDay53.toDateTimeToday(dateTimeZone55);
        org.joda.time.DateTime.Property property57 = dateTime56.monthOfYear();
        org.joda.time.DateTime dateTime59 = dateTime56.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str62 = dateTimeZone61.getID();
        org.joda.time.DateMidnight dateMidnight63 = org.joda.time.DateMidnight.now(dateTimeZone61);
        boolean boolean64 = dateTime59.equals((java.lang.Object) dateMidnight63);
        org.joda.time.DateMidnight dateMidnight66 = dateMidnight63.plusMonths(10);
        org.joda.time.DateMidnight.Property property67 = dateMidnight66.dayOfYear();
        org.joda.time.DateMidnight.Property property68 = dateMidnight66.yearOfEra();
        org.joda.time.DateMidnight.Property property69 = dateMidnight66.dayOfYear();
        org.joda.time.DateMidnight dateMidnight70 = property69.roundHalfEvenCopy();
        int int71 = mutableDateTime21.compareTo((org.joda.time.ReadableInstant) dateMidnight70);
        mutableDateTime4.setMillis((org.joda.time.ReadableInstant) dateMidnight70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight74 = dateMidnight70.withDayOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT1M" + "'", str26, "PT1M");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT1M" + "'", str35, "PT1M");
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeFieldArray54);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "+00:00:00.016" + "'", str62, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateMidnight66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(dateMidnight70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("00");
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plusDays((int) (short) -1);
        org.joda.time.DateMidnight.Property property4 = dateMidnight3.era();
        org.joda.time.DateMidnight dateMidnight5 = property4.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight7 = property4.addWrapFieldToCopy(654);
        org.junit.Assert.assertNotNull(dateMidnight1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight7);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        org.joda.time.DateTime dateTime4 = dateTime1.withYearOfCentury(16);
        org.joda.time.TimeOfDay timeOfDay5 = dateTime4.toTimeOfDay();
        int int6 = timeOfDay5.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeOfDay5.getValue(3172001);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3172001");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(timeOfDay5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 629 + "'", int6 == 629);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period6 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period8 = org.joda.time.Period.minutes(1);
        java.lang.String str9 = period8.toString();
        org.joda.time.Period period10 = period6.withFields((org.joda.time.ReadablePeriod) period8);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period12 = period6.normalizedStandard(periodType11);
        org.joda.time.PeriodType periodType13 = periodType11.withSecondsRemoved();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 1899, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str26 = dateTimeZone25.getID();
        org.joda.time.Interval interval27 = yearMonthDay23.toInterval(dateTimeZone25);
        org.joda.time.Interval interval28 = yearMonthDay23.toInterval();
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period32 = org.joda.time.Period.minutes(1);
        java.lang.String str33 = period32.toString();
        org.joda.time.Period period34 = period30.withFields((org.joda.time.ReadablePeriod) period32);
        org.joda.time.YearMonthDay yearMonthDay35 = yearMonthDay23.plus((org.joda.time.ReadablePeriod) period30);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.getDefault();
        int int39 = dateTimeZone37.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 1899, dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        int int43 = dateTimeZone41.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime44 = localDate40.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str48 = dateTimeZone47.getID();
        org.joda.time.Interval interval49 = yearMonthDay45.toInterval(dateTimeZone47);
        org.joda.time.MutableInterval mutableInterval50 = interval49.toMutableInterval();
        org.joda.time.Interval interval52 = interval49.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology53 = interval52.getChronology();
        org.joda.time.DateTimeZone dateTimeZone54 = chronology53.getZone();
        org.joda.time.DateTimeField dateTimeField55 = chronology53.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay35.withChronologyRetainFields(chronology53);
        org.joda.time.LocalDate localDate57 = org.joda.time.LocalDate.now(chronology53);
        org.joda.time.MutableDateTime mutableDateTime58 = new org.joda.time.MutableDateTime(chronology53);
        org.joda.time.DateTimeField dateTimeField59 = chronology53.minuteOfDay();
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((long) 54, 16L, periodType11, chronology53);
        org.joda.time.Chronology chronology61 = chronology53.withUTC();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) 3172000, (long) 14, periodType2, chronology53);
        org.joda.time.PeriodType periodType65 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.DateTimeZone dateTimeZone67 = org.joda.time.DateTimeZone.getDefault();
        int int69 = dateTimeZone67.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) 1899, dateTimeZone67);
        org.joda.time.DateTimeZone dateTimeZone71 = org.joda.time.DateTimeZone.getDefault();
        int int73 = dateTimeZone71.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime74 = localDate70.toDateTimeAtCurrentTime(dateTimeZone71);
        org.joda.time.YearMonthDay yearMonthDay75 = new org.joda.time.YearMonthDay(dateTimeZone71);
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str78 = dateTimeZone77.getID();
        org.joda.time.Interval interval79 = yearMonthDay75.toInterval(dateTimeZone77);
        org.joda.time.MutableInterval mutableInterval80 = interval79.toMutableInterval();
        org.joda.time.Interval interval82 = interval79.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology83 = interval82.getChronology();
        org.joda.time.MutablePeriod mutablePeriod84 = new org.joda.time.MutablePeriod((long) (byte) -1, periodType65, chronology83);
        org.joda.time.LocalDate localDate85 = org.joda.time.LocalDate.now(chronology83);
        mutablePeriod62.add((long) 46, chronology83);
        org.joda.time.DurationFieldType durationFieldType87 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod62.add(durationFieldType87, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'null'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT1M" + "'", str9, "PT1M");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.016" + "'", str26, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "PT1M" + "'", str33, "PT1M");
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(yearMonthDay35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00:00.016" + "'", str48, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(mutableInterval50);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(yearMonthDay56);
        org.junit.Assert.assertNotNull(localDate57);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(periodType65);
        org.junit.Assert.assertNotNull(dateTimeZone67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "+00:00:00.016" + "'", str78, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval79);
        org.junit.Assert.assertNotNull(mutableInterval80);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertNotNull(localDate85);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.plus((long) 45);
        org.joda.time.DateMidnight.Property property6 = dateMidnight3.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        int int8 = dateTimeField7.getMinimumValue();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray16 = new int[] { 'u', 6, (byte) 10, 10, 53, 1899 };
        int int17 = dateTimeField7.getMinimumValue(readablePartial9, intArray16);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 1899, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime26 = localDate22.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str30 = dateTimeZone29.getID();
        org.joda.time.Interval interval31 = yearMonthDay27.toInterval(dateTimeZone29);
        org.joda.time.Interval interval32 = yearMonthDay27.toInterval();
        org.joda.time.Period period34 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period36 = org.joda.time.Period.minutes(1);
        java.lang.String str37 = period36.toString();
        org.joda.time.Period period38 = period34.withFields((org.joda.time.ReadablePeriod) period36);
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay27.plus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.getDefault();
        int int43 = dateTimeZone41.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 1899, dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.getDefault();
        int int47 = dateTimeZone45.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime48 = localDate44.toDateTimeAtCurrentTime(dateTimeZone45);
        org.joda.time.YearMonthDay yearMonthDay49 = new org.joda.time.YearMonthDay(dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str52 = dateTimeZone51.getID();
        org.joda.time.Interval interval53 = yearMonthDay49.toInterval(dateTimeZone51);
        org.joda.time.MutableInterval mutableInterval54 = interval53.toMutableInterval();
        org.joda.time.Interval interval56 = interval53.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology57 = interval56.getChronology();
        org.joda.time.DateTimeZone dateTimeZone58 = chronology57.getZone();
        org.joda.time.DateTimeField dateTimeField59 = chronology57.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay60 = yearMonthDay39.withChronologyRetainFields(chronology57);
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str63 = dateTimeZone62.getID();
        java.util.Locale locale65 = java.util.Locale.KOREAN;
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str68 = locale65.getDisplayVariant(locale67);
        java.lang.String str69 = dateTimeZone62.getName((long) 5, locale65);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str70 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) yearMonthDay39, locale65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+00:00:00.016" + "'", str2, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-292275054) + "'", int8 == (-292275054));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[117, 6, 10, 10, 53, 1899]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-292275054) + "'", int17 == (-292275054));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00:00.016" + "'", str30, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "PT1M" + "'", str37, "PT1M");
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00:00.016" + "'", str52, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertNotNull(mutableInterval54);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTimeField59);
        org.junit.Assert.assertNotNull(yearMonthDay60);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "+00:00:00.016" + "'", str63, "+00:00:00.016");
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "+00:00:00.016" + "'", str69, "+00:00:00.016");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.lang.String[] strArray10 = new java.lang.String[] { "2022-02-21T00:52:52.000Z", "Korean (South Korea)", "1970", "hi!", "1970", "45", "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000", "PT0S" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.util.Locale.LanguageRange[] languageRangeArray13 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList14 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList14, languageRangeArray13);
        java.util.Locale[] localeArray16 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList17 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList17, localeArray16);
        java.util.List<java.util.Locale> localeList19 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList14, (java.util.Collection<java.util.Locale>) localeList17);
        java.util.stream.Stream<java.util.Locale> localeStream20 = localeList19.parallelStream();
        boolean boolean21 = strSet11.retainAll((java.util.Collection<java.util.Locale>) localeList19);
        boolean boolean22 = calendar1.equals((java.lang.Object) strSet11);
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(languageRangeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localeList19);
        org.junit.Assert.assertNotNull(localeStream20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone6);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.fromCalendarFields(calendar7);
        int int9 = calendar3.compareTo(calendar7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455278890,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=38,MILLISECOND=906,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455278890,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=38,MILLISECOND=906,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.toDateTime(chronology11);
        org.joda.time.DateTime dateTime14 = dateTime10.plusMonths(58);
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTimeISO();
        org.joda.time.Period period17 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period19 = org.joda.time.Period.minutes(1);
        java.lang.String str20 = period19.toString();
        org.joda.time.Period period21 = period17.withFields((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Period period23 = period21.plusMillis(100);
        org.joda.time.Period period24 = period21.negated();
        org.joda.time.Period period26 = period24.withMillis(1899);
        org.joda.time.Minutes minutes27 = period24.toStandardMinutes();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.Period period29 = period24.minus(readablePeriod28);
        org.joda.time.DateTime dateTime31 = dateTime15.withPeriodAdded((org.joda.time.ReadablePeriod) period29, 1970);
        java.util.Locale locale33 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = dateTime15.toString("", locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT1M" + "'", str20, "PT1M");
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(minutes27);
        org.junit.Assert.assertNotNull(period29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_CA");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(27, (int) (short) 1, 1899);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1899 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long) 16, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfCentury(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfWeek();
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property9.setCopy("weekyearOfCentury");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"weekyearOfCentury\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Period period2 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period4 = org.joda.time.Period.minutes(1);
        java.lang.String str5 = period4.toString();
        org.joda.time.Period period6 = period2.withFields((org.joda.time.ReadablePeriod) period4);
        org.joda.time.Period period8 = period6.plusMillis(100);
        org.joda.time.LocalTime localTime9 = localTime0.minus((org.joda.time.ReadablePeriod) period6);
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(0);
        org.joda.time.LocalTime.Property property12 = localTime9.millisOfSecond();
        org.joda.time.LocalTime localTime14 = property12.addWrapFieldToCopy((int) (short) 1);
        org.joda.time.LocalTime localTime15 = property12.withMinimumValue();
        org.joda.time.LocalTime localTime17 = property12.setCopy(654);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = property12.setCopy("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdT000000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"????????T000000\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT1M" + "'", str5, "PT1M");
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime1.withDayOfMonth(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        int int6 = dateTimeZone4.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1899, dateTimeZone4);
        org.joda.time.LocalDate localDate9 = localDate7.plusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTime dateTime13 = localDate7.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str16 = dateTimeZone15.getID();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(dateTimeZone15);
        java.lang.String str19 = dateTimeZone15.getName((long) (-1));
        org.joda.time.Interval interval20 = localDate7.toInterval(dateTimeZone15);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay(dateTimeZone15);
        long long23 = dateTimeZone15.nextTransition(10L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(32770, 29, 0, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 29 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00:00.016" + "'", str16, "+00:00:00.016");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00:00.016" + "'", str19, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(10);
        org.joda.time.DateTime.Property property9 = dateTime6.dayOfMonth();
        org.joda.time.DateTime dateTime11 = dateTime6.plusMonths(8);
        org.joda.time.DateTime dateTime12 = dateTime11.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime11.withField(dateTimeFieldType13, 53660892);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53660892 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod();
        int int3 = mutablePeriod2.getDays();
        java.util.Date date11 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.fromDateFields(date11);
        org.joda.time.LocalDate.Property property13 = localDate12.weekOfWeekyear();
        org.joda.time.LocalDate localDate15 = property13.setCopy("45");
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str18 = dateTimeZone17.getID();
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime22 = dateTime19.withField(dateTimeFieldType20, 44);
        boolean boolean23 = localDate15.isSupported(dateTimeFieldType20);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        int int27 = dateTimeZone25.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 1899, dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.getDefault();
        int int31 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime32 = localDate28.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str36 = dateTimeZone35.getID();
        org.joda.time.Interval interval37 = yearMonthDay33.toInterval(dateTimeZone35);
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        long long42 = chronology38.add((long) 18, (long) 6, 58);
        boolean boolean43 = dateTimeFieldType20.isSupported(chronology38);
        mutablePeriod2.setPeriod((long) 32, (long) 53, chronology38);
        org.joda.time.DateTimeField dateTimeField45 = chronology38.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay46 = new org.joda.time.TimeOfDay((int) (byte) 10, 32770, chronology38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00:00.016" + "'", str18, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00:00.016" + "'", str36, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 366L + "'", long42 == 366L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(dateTimeField45);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(54);
        org.joda.time.Period period2 = period1.normalizedStandard();
        int int3 = period2.getWeeks();
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.withDayOfMonth((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusMillis(3);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMillisOfDay((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withMinuteOfHour(9);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusMillis(0);
        int int22 = localDateTime17.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withHourOfDay((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("1970", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.Object obj1 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("java.io.IOException: 45");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.io.IOException: 45\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray5 = timeOfDay4.getFields();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = timeOfDay4.toDateTimeToday(dateTimeZone6);
        org.joda.time.DateTime.Property property8 = dateTime7.monthOfYear();
        org.joda.time.DateTime dateTime10 = dateTime7.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str13 = dateTimeZone12.getID();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        boolean boolean15 = dateTime10.equals((java.lang.Object) dateMidnight14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.plusMonths(10);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight14.withCenturyOfEra(17);
        int int20 = dateMidnight14.getMillisOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = dateMidnight14.toMutableDateTime();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight14.plusYears((int) 'u');
        int int24 = dateMidnight14.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldArray5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00:00.016" + "'", str13, "+00:00:00.016");
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = timeOfDay4.toDateTimeToday(dateTimeZone5);
        org.joda.time.TimeOfDay.Property property7 = timeOfDay4.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay8 = property7.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property7.getFieldType();
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.parse("0");
        // The following exception was thrown during execution in test generation
        try {
            int int12 = property7.compareTo((org.joda.time.ReadablePartial) localDate11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.util.Date date5 = new java.util.Date((int) (byte) -1, (-1), 100, (int) (byte) 1, (int) '#');
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date5);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        org.joda.time.LocalDate localDate9 = property7.setCopy("45");
        org.joda.time.LocalDate localDate10 = property7.withMaximumValue();
        org.joda.time.LocalDate.Property property11 = localDate10.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property11.setCopy("292278993");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 01:35:00 GMT+00:00 1899");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.Period period1 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period3 = org.joda.time.Period.minutes(1);
        java.lang.String str4 = period3.toString();
        org.joda.time.Period period5 = period1.withFields((org.joda.time.ReadablePeriod) period3);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearDay();
        org.joda.time.Period period7 = period1.normalizedStandard(periodType6);
        org.joda.time.format.PeriodFormatter periodFormatter8 = null;
        java.lang.String str9 = period7.toString(periodFormatter8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = period7.plusSeconds(58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PT1M" + "'", str4, "PT1M");
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0D" + "'", str9, "P0D");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
        org.joda.time.LocalTime localTime3 = localTime1.plusSeconds(7);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay8.secondOfMinute();
        org.joda.time.LocalTime localTime12 = localTime1.withFields((org.joda.time.ReadablePartial) timeOfDay8);
        org.joda.time.TimeOfDay.Property property13 = timeOfDay8.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        int int17 = dateTimeZone15.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 1899, dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        int int21 = dateTimeZone19.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str26 = dateTimeZone25.getID();
        org.joda.time.Interval interval27 = yearMonthDay23.toInterval(dateTimeZone25);
        org.joda.time.MutableInterval mutableInterval28 = interval27.toMutableInterval();
        org.joda.time.Interval interval30 = interval27.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.DateTimeZone dateTimeZone32 = chronology31.getZone();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.hourOfHalfday();
        org.joda.time.DurationField durationField35 = chronology31.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period36 = new org.joda.time.Period((java.lang.Object) timeOfDay8, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.TimeOfDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00:00.016" + "'", str26, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(mutableInterval28);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        java.lang.String str5 = calendar3.getCalendarType();
        int int6 = calendar3.getFirstDayOfWeek();
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap10 = calendar3.getDisplayNames(32769, 0, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455280461,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=40,MILLISECOND=477,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gregory" + "'", str5, "gregory");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration4 = null;
        mutableDateTime3.add(readableDuration4, 0);
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = timeOfDay11.toDateTimeToday(dateTimeZone13);
        org.joda.time.DateTime.Property property15 = dateTime14.monthOfYear();
        org.joda.time.DateTime dateTime17 = dateTime14.minusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime(chronology18);
        int int20 = dateTime17.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType21.getDurationType();
        org.joda.time.DateTime dateTime24 = dateTime17.withFieldAdded(durationFieldType22, (int) (byte) 1);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMillis((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone27 = dateTime26.getZone();
        long long31 = dateTimeZone27.convertLocalToUTC(31556952000L, false, (-1L));
        long long34 = dateTimeZone27.convertLocalToUTC(9223309869549175808L, false);
        mutableDateTime3.setZone(dateTimeZone27);
        mutableDateTime3.add((long) 'x');
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 31556952000L + "'", long31 == 31556952000L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9223309869549175808L + "'", long34 == 9223309869549175808L);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(20, 29, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 29 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        int int2 = dateTimeZone0.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((int) (short) 0, (int) '4', (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = timeOfDay8.toDateTimeToday(dateTimeZone9);
        mutableDateTime3.setZoneRetainFields(dateTimeZone9);
        boolean boolean12 = mutableDateTime3.isEqualNow();
        org.joda.time.DateTimeField dateTimeField13 = mutableDateTime3.getRoundingField();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        int int16 = dateTimeZone14.getStandardOffset((long) 100);
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration18 = null;
        mutableDateTime17.add(readableDuration18, 0);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime17.dayOfWeek();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime17.secondOfDay();
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.PeriodType periodType24 = periodType23.withWeeksRemoved();
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) mutableDateTime3, (org.joda.time.ReadableInstant) mutableDateTime17, periodType23);
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime17.toMutableDateTime();
        org.joda.time.Period period28 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period30 = org.joda.time.Period.minutes(1);
        java.lang.String str31 = period30.toString();
        org.joda.time.Period period32 = period28.withFields((org.joda.time.ReadablePeriod) period30);
        org.joda.time.Period period34 = period32.plusMillis(100);
        org.joda.time.Period period35 = period32.negated();
        int int36 = period35.getMillis();
        org.joda.time.Period period38 = period35.minusDays(32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime17, (org.joda.time.ReadablePeriod) period38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PT1M" + "'", str31, "PT1M");
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(period38);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMinuteOfHour(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 10, chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withMinuteOfHour(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withFields((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.plusMillis(3);
        org.joda.time.LocalDateTime.Property property16 = localDateTime12.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime18 = property16.withMinimumValue();
        java.lang.String str19 = property16.toString();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[centuryOfEra]" + "'", str19, "Property[centuryOfEra]");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale[] localeArray3 = new java.util.Locale[] {};
        java.util.ArrayList<java.util.Locale> localeList4 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList4, localeArray3);
        java.util.List<java.util.Locale> localeList6 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList4);
        java.util.stream.Stream<java.util.Locale> localeStream7 = localeList6.parallelStream();
        localeList6.clear();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(localeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localeList6);
        org.junit.Assert.assertNotNull(localeStream7);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        boolean boolean1 = dateTimeFormatter0.isParser();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer2, (long) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        int int3 = dateTimeZone1.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1899, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        int int7 = dateTimeZone5.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime8 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str12 = dateTimeZone11.getID();
        org.joda.time.Interval interval13 = yearMonthDay9.toInterval(dateTimeZone11);
        org.joda.time.Interval interval14 = yearMonthDay9.toInterval();
        org.joda.time.Period period16 = org.joda.time.Period.minutes(1);
        org.joda.time.Period period18 = org.joda.time.Period.minutes(1);
        java.lang.String str19 = period18.toString();
        org.joda.time.Period period20 = period16.withFields((org.joda.time.ReadablePeriod) period18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay9.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        int int25 = dateTimeZone23.getStandardOffset((long) 100);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 1899, dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        int int29 = dateTimeZone27.getStandardOffset((long) 100);
        org.joda.time.DateTime dateTime30 = localDate26.toDateTimeAtCurrentTime(dateTimeZone27);
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.lang.String str34 = dateTimeZone33.getID();
        org.joda.time.Interval interval35 = yearMonthDay31.toInterval(dateTimeZone33);
        org.joda.time.MutableInterval mutableInterval36 = interval35.toMutableInterval();
        org.joda.time.Interval interval38 = interval35.withStartMillis((long) 32769);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone40 = chronology39.getZone();
        org.joda.time.DateTimeField dateTimeField41 = chronology39.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay42 = yearMonthDay21.withChronologyRetainFields(chronology39);
        org.joda.time.DateMidnight dateMidnight43 = yearMonthDay21.toDateMidnight();
        int int44 = yearMonthDay21.getDayOfMonth();
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay21.withFieldAdded(durationFieldType45, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minutes' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00:00.016" + "'", str12, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT1M" + "'", str19, "PT1M");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.016" + "'", str34, "+00:00:00.016");
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(mutableInterval36);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(yearMonthDay42);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 21 + "'", int44 == 21);
        org.junit.Assert.assertNotNull(durationFieldType45);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.DateTime.Property property2 = dateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object) str3, periodType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"41\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "41" + "'", str3, "41");
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("PT1M");
        java.lang.String str8 = locale5.getDisplayVariant(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.lang.String str10 = locale4.getDisplayName(locale7);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone2, locale4);
        int int13 = calendar11.getMaximum((int) (short) 0);
        calendar11.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = calendar11.getActualMinimum(535);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 535");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455281113,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=41,MILLISECOND=129,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Chinese (Taiwan)" + "'", str10, "Chinese (Taiwan)");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455281113,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=41,MILLISECOND=129,ZONE_OFFSET=16,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(16);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar3.getMaximum(99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455281142,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+00:00:00.016,offset=16,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=41,MILLISECOND=158,ZONE_OFFSET=16,DST_OFFSET=0]");
    }
}
